package com.facebook.presto.type;// Generated from TypeCalculation.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TypeCalculationParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TypeCalculationVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TypeCalculationParser#typeCalculation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCalculation(TypeCalculationParser.TypeCalculationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryFunction}
	 * labeled alternative in {@link TypeCalculationParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryFunction(TypeCalculationParser.BinaryFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link TypeCalculationParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(TypeCalculationParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link TypeCalculationParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(TypeCalculationParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link TypeCalculationParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(TypeCalculationParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link TypeCalculationParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBinary(TypeCalculationParser.ArithmeticBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link TypeCalculationParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(TypeCalculationParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link TypeCalculationParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticUnary(TypeCalculationParser.ArithmeticUnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeCalculationParser#binaryFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryFunctionName(TypeCalculationParser.BinaryFunctionNameContext ctx);
}