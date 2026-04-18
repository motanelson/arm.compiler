arm assembler compiler


java -jar antlr-4.9.2-complete.jar -visitor arm.g4


javac --release 25 -cp .:antlr-4.9.2-complete.jar *.java



java -cp .:antlr-4.9.2-complete.jar ArmAssembler my.s


file output.elf


ls -l output.elf


