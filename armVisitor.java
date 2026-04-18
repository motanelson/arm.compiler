// Generated from arm.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link armParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface armVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link armParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(armParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MovInstruction}
	 * labeled alternative in {@link armParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovInstruction(armParser.MovInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddInstruction}
	 * labeled alternative in {@link armParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddInstruction(armParser.AddInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubInstruction}
	 * labeled alternative in {@link armParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubInstruction(armParser.SubInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulInstruction}
	 * labeled alternative in {@link armParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulInstruction(armParser.MulInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompareInstruction}
	 * labeled alternative in {@link armParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareInstruction(armParser.CompareInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BranchInstruction}
	 * labeled alternative in {@link armParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranchInstruction(armParser.BranchInstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link armParser#movInstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovInstr(armParser.MovInstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link armParser#addInstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddInstr(armParser.AddInstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link armParser#subInstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubInstr(armParser.SubInstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link armParser#mulInstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulInstr(armParser.MulInstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link armParser#cmpInstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpInstr(armParser.CmpInstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link armParser#bInstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBInstr(armParser.BInstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link armParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(armParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link armParser#immediate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImmediate(armParser.ImmediateContext ctx);
}