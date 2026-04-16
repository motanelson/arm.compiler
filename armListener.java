// Generated from arm.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link armParser}.
 */
public interface armListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link armParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(armParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link armParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(armParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MovInstruction}
	 * labeled alternative in {@link armParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterMovInstruction(armParser.MovInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MovInstruction}
	 * labeled alternative in {@link armParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitMovInstruction(armParser.MovInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddInstruction}
	 * labeled alternative in {@link armParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAddInstruction(armParser.AddInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddInstruction}
	 * labeled alternative in {@link armParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAddInstruction(armParser.AddInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubInstruction}
	 * labeled alternative in {@link armParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterSubInstruction(armParser.SubInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubInstruction}
	 * labeled alternative in {@link armParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitSubInstruction(armParser.SubInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulInstruction}
	 * labeled alternative in {@link armParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterMulInstruction(armParser.MulInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulInstruction}
	 * labeled alternative in {@link armParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitMulInstruction(armParser.MulInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareInstruction}
	 * labeled alternative in {@link armParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterCompareInstruction(armParser.CompareInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareInstruction}
	 * labeled alternative in {@link armParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitCompareInstruction(armParser.CompareInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BranchInstruction}
	 * labeled alternative in {@link armParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterBranchInstruction(armParser.BranchInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BranchInstruction}
	 * labeled alternative in {@link armParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitBranchInstruction(armParser.BranchInstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link armParser#movInstr}.
	 * @param ctx the parse tree
	 */
	void enterMovInstr(armParser.MovInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link armParser#movInstr}.
	 * @param ctx the parse tree
	 */
	void exitMovInstr(armParser.MovInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link armParser#addInstr}.
	 * @param ctx the parse tree
	 */
	void enterAddInstr(armParser.AddInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link armParser#addInstr}.
	 * @param ctx the parse tree
	 */
	void exitAddInstr(armParser.AddInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link armParser#subInstr}.
	 * @param ctx the parse tree
	 */
	void enterSubInstr(armParser.SubInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link armParser#subInstr}.
	 * @param ctx the parse tree
	 */
	void exitSubInstr(armParser.SubInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link armParser#mulInstr}.
	 * @param ctx the parse tree
	 */
	void enterMulInstr(armParser.MulInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link armParser#mulInstr}.
	 * @param ctx the parse tree
	 */
	void exitMulInstr(armParser.MulInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link armParser#cmpInstr}.
	 * @param ctx the parse tree
	 */
	void enterCmpInstr(armParser.CmpInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link armParser#cmpInstr}.
	 * @param ctx the parse tree
	 */
	void exitCmpInstr(armParser.CmpInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link armParser#bInstr}.
	 * @param ctx the parse tree
	 */
	void enterBInstr(armParser.BInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link armParser#bInstr}.
	 * @param ctx the parse tree
	 */
	void exitBInstr(armParser.BInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link armParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(armParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link armParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(armParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link armParser#immediate}.
	 * @param ctx the parse tree
	 */
	void enterImmediate(armParser.ImmediateContext ctx);
	/**
	 * Exit a parse tree produced by {@link armParser#immediate}.
	 * @param ctx the parse tree
	 */
	void exitImmediate(armParser.ImmediateContext ctx);
}