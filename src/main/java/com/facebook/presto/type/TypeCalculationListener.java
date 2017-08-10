package com.facebook.presto.type;// Generated from TypeCalculation.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TypeCalculationParser}.
 */
public interface TypeCalculationListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TypeCalculationParser#typeCalculation}.
	 * @param ctx the parse tree
	 */
	void enterTypeCalculation(TypeCalculationParser.TypeCalculationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeCalculationParser#typeCalculation}.
	 * @param ctx the parse tree
	 */
	void exitTypeCalculation(TypeCalculationParser.TypeCalculationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryFunction}
	 * labeled alternative in {@link TypeCalculationParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryFunction(TypeCalculationParser.BinaryFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryFunction}
	 * labeled alternative in {@link TypeCalculationParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryFunction(TypeCalculationParser.BinaryFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link TypeCalculationParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(TypeCalculationParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link TypeCalculationParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(TypeCalculationParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link TypeCalculationParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(TypeCalculationParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link TypeCalculationParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(TypeCalculationParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link TypeCalculationParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(TypeCalculationParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link TypeCalculationParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(TypeCalculationParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link TypeCalculationParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(TypeCalculationParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link TypeCalculationParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(TypeCalculationParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link TypeCalculationParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(TypeCalculationParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link TypeCalculationParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(TypeCalculationParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link TypeCalculationParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(TypeCalculationParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link TypeCalculationParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(TypeCalculationParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeCalculationParser#binaryFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterBinaryFunctionName(TypeCalculationParser.BinaryFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeCalculationParser#binaryFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitBinaryFunctionName(TypeCalculationParser.BinaryFunctionNameContext ctx);
}