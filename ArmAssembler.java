import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.util.*;

public class ArmAssembler {

    static class Instruction {
        String op;
        String[] args;
        int address;
    }

    static Map<String, Integer> labels = new HashMap<>();
    static List<Instruction> instructions = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("Uso: java ArmAssembler file.s");
            return;
        }

        List<String> lines = Files.readAllLines(Path.of(args[0]));

        firstPass(lines);
        byte[] code = secondPass();

        byte[] elf = buildELF(code);

        Files.write(Path.of("output.elf"), elf);
        System.out.println("ELF gerado: output.elf");
    }

    // -------------------------
    // PASS 1 - labels
    // -------------------------
    static void firstPass(List<String> lines) {
        int addr = 0;

        for (String line : lines) {
            line = clean(line);
            if (line.isEmpty()) continue;

            if (line.endsWith(":")) {
                String label = line.substring(0, line.length() - 1);
                labels.put(label, addr);
            } else {
                Instruction inst = parse(line);
                inst.address = addr;
                instructions.add(inst);
                addr += 4;
            }
        }
    }

    // -------------------------
    // PASS 2 - encoding
    // -------------------------
    static byte[] secondPass() {
        ByteBuffer buf = ByteBuffer.allocate(instructions.size() * 4);
        buf.order(ByteOrder.LITTLE_ENDIAN);

        for (Instruction inst : instructions) {
            int encoded = encode(inst);
            buf.putInt(encoded);
        }

        return buf.array();
    }

    // -------------------------
    // Encoding ARM (subset)
    // -------------------------
    static int encode(Instruction i) {
        switch (i.op) {
            case "MOV":
                return encodeMOV(i);
            case "ADD":
                return encodeADD(i);
            case "SUB":
                return encodeSUB(i);
            case "CMP":
                return encodeCMP(i);
            case "B":
                return encodeB(i);
        }
        throw new RuntimeException("Instrucao desconhecida: " + i.op);
    }

    static int reg(String r) {
        return Integer.parseInt(r.substring(1));
    }

    static boolean isImm(String s) {
        return s.startsWith("#");
    }

    static int imm(String s) {
        return Integer.parseInt(s.substring(1));
    }

    // MOV Rd, operand
    static int encodeMOV(Instruction i) {
        int rd = reg(i.args[0]);

        if (isImm(i.args[1])) {
            int imm = imm(i.args[1]);
            return 0xE3A00000 | (rd << 12) | imm;
        } else {
            int rm = reg(i.args[1]);
            return 0xE1A00000 | (rd << 12) | rm;
        }
    }

    // ADD Rd, Rn, op2
    static int encodeADD(Instruction i) {
        int rd = reg(i.args[0]);
        int rn = reg(i.args[1]);

        if (isImm(i.args[2])) {
            int imm = imm(i.args[2]);
            return 0xE2800000 | (rn << 16) | (rd << 12) | imm;
        } else {
            int rm = reg(i.args[2]);
            return 0xE0800000 | (rn << 16) | (rd << 12) | rm;
        }
    }

    static int encodeSUB(Instruction i) {
        int rd = reg(i.args[0]);
        int rn = reg(i.args[1]);

        if (isImm(i.args[2])) {
            int imm = imm(i.args[2]);
            return 0xE2400000 | (rn << 16) | (rd << 12) | imm;
        } else {
            int rm = reg(i.args[2]);
            return 0xE0400000 | (rn << 16) | (rd << 12) | rm;
        }
    }

    static int encodeCMP(Instruction i) {
        int rn = reg(i.args[0]);

        if (isImm(i.args[1])) {
            int imm = imm(i.args[1]);
            return 0xE3500000 | (rn << 16) | imm;
        } else {
            int rm = reg(i.args[1]);
            return 0xE1500000 | (rn << 16) | rm;
        }
    }

    static int encodeB(Instruction i) {
        String label = i.args[0];
        int target = labels.get(label);

        int pc = i.address + 8;
        int offset = (target - pc) >> 2;

        return 0xEA000000 | (offset & 0x00FFFFFF);
    }

    // -------------------------
    // ELF builder
    // -------------------------
    static byte[] buildELF(byte[] code) {
        int entry = 0x10000;

        ByteBuffer buf = ByteBuffer.allocate(52 + 32 + code.length);
        buf.order(ByteOrder.LITTLE_ENDIAN);

        // ELF Header
        buf.put(new byte[]{
            0x7F, 'E', 'L', 'F',
            1, 1, 1, 0
        });
        buf.put(new byte[8]);

        buf.putShort((short) 2); // EXEC
        buf.putShort((short) 40); // ARM
        buf.putInt(1);

        buf.putInt(entry);
        buf.putInt(52);
        buf.putInt(0);
        buf.putInt(0);

        buf.putShort((short) 52);
        buf.putShort((short) 32);
        buf.putShort((short) 1);
        buf.putShort((short) 0);
        buf.putShort((short) 0);
        buf.putShort((short) 0);

        // Program Header
        buf.putInt(1); // LOAD
        buf.putInt(0);
        buf.putInt(entry);
        buf.putInt(entry);
        buf.putInt(code.length);
        buf.putInt(code.length);
        buf.putInt(5); // RX
        buf.putInt(0x1000);

        buf.put(code);

        return buf.array();
    }

    // -------------------------
    // Parser simples
    // -------------------------
    static Instruction parse(String line) {
        line = line.replace(",", " ");
        String[] parts = line.split("\\s+");

        Instruction i = new Instruction();
        i.op = parts[0];
        i.args = Arrays.copyOfRange(parts, 1, parts.length);

        return i;
    }

    static String clean(String l) {
        int c = l.indexOf('@');
        if (c != -1) l = l.substring(0, c);
        return l.trim();
    }
}
