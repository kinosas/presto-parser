package com.facebook.presto.type;// Generated from TypeCalculation.g4 by ANTLR 4.6

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TypeCalculationParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, PLUS=4, MINUS=5, ASTERISK=6, SLASH=7, NULL=8, 
		MIN=9, MAX=10, IDENTIFIER=11, INTEGER_VALUE=12, WS=13;
	public static final int
		RULE_typeCalculation = 0, RULE_expression = 1, RULE_binaryFunctionName = 2;
	public static final String[] ruleNames = {
		"typeCalculation", "expression", "binaryFunctionName"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "','", "')'", "'+'", "'-'", "'*'", "'/'", "'NULL'", "'MIN'", 
		"'MAX'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "PLUS", "MINUS", "ASTERISK", "SLASH", "NULL", 
		"MIN", "MAX", "IDENTIFIER", "INTEGER_VALUE", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TypeCalculation.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TypeCalculationParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TypeCalculationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TypeCalculationParser.EOF, 0); }
		public TypeCalculationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCalculation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeCalculationListener ) ((TypeCalculationListener)listener).enterTypeCalculation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeCalculationListener ) ((TypeCalculationListener)listener).exitTypeCalculation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeCalculationVisitor) return ((TypeCalculationVisitor<? extends T>)visitor).visitTypeCalculation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeCalculationContext typeCalculation() throws RecognitionException {
		TypeCalculationContext _localctx = new TypeCalculationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_typeCalculation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			expression(0);
			setState(7);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinaryFunctionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public BinaryFunctionNameContext binaryFunctionName() {
			return getRuleContext(BinaryFunctionNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinaryFunctionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeCalculationListener ) ((TypeCalculationListener)listener).enterBinaryFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeCalculationListener ) ((TypeCalculationListener)listener).exitBinaryFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeCalculationVisitor) return ((TypeCalculationVisitor<? extends T>)visitor).visitBinaryFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeCalculationParser.IDENTIFIER, 0); }
		public IdentifierContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeCalculationListener ) ((TypeCalculationListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeCalculationListener ) ((TypeCalculationListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeCalculationVisitor) return ((TypeCalculationVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullLiteralContext extends ExpressionContext {
		public TerminalNode NULL() { return getToken(TypeCalculationParser.NULL, 0); }
		public NullLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeCalculationListener ) ((TypeCalculationListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeCalculationListener ) ((TypeCalculationListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeCalculationVisitor) return ((TypeCalculationVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeCalculationListener ) ((TypeCalculationListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeCalculationListener ) ((TypeCalculationListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeCalculationVisitor) return ((TypeCalculationVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(TypeCalculationParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(TypeCalculationParser.SLASH, 0); }
		public TerminalNode PLUS() { return getToken(TypeCalculationParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TypeCalculationParser.MINUS, 0); }
		public ArithmeticBinaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeCalculationListener ) ((TypeCalculationListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeCalculationListener ) ((TypeCalculationListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeCalculationVisitor) return ((TypeCalculationVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ExpressionContext {
		public TerminalNode INTEGER_VALUE() { return getToken(TypeCalculationParser.INTEGER_VALUE, 0); }
		public NumericLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeCalculationListener ) ((TypeCalculationListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeCalculationListener ) ((TypeCalculationListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeCalculationVisitor) return ((TypeCalculationVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ExpressionContext {
		public Token operator;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(TypeCalculationParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(TypeCalculationParser.PLUS, 0); }
		public ArithmeticUnaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeCalculationListener ) ((TypeCalculationListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeCalculationListener ) ((TypeCalculationListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeCalculationVisitor) return ((TypeCalculationVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				{
				_localctx = new NullLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(10);
				match(NULL);
				}
				break;
			case INTEGER_VALUE:
				{
				_localctx = new NumericLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(11);
				match(INTEGER_VALUE);
				}
				break;
			case MIN:
			case MAX:
				{
				_localctx = new BinaryFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(12);
				binaryFunctionName();
				setState(13);
				match(T__0);
				setState(14);
				((BinaryFunctionContext)_localctx).left = expression(0);
				setState(15);
				match(T__1);
				setState(16);
				((BinaryFunctionContext)_localctx).right = expression(0);
				setState(17);
				match(T__2);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(19);
				match(IDENTIFIER);
				}
				break;
			case T__0:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(20);
				match(T__0);
				setState(21);
				expression(0);
				setState(22);
				match(T__2);
				}
				break;
			case PLUS:
			case MINUS:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(25);
				expression(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(36);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(34);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(28);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(29);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ASTERISK || _la==SLASH) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(30);
						((ArithmeticBinaryContext)_localctx).right = expression(3);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(31);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(32);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(33);
						((ArithmeticBinaryContext)_localctx).right = expression(2);
						}
						break;
					}
					} 
				}
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BinaryFunctionNameContext extends ParserRuleContext {
		public Token name;
		public TerminalNode MAX() { return getToken(TypeCalculationParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(TypeCalculationParser.MIN, 0); }
		public BinaryFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeCalculationListener ) ((TypeCalculationListener)listener).enterBinaryFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeCalculationListener ) ((TypeCalculationListener)listener).exitBinaryFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeCalculationVisitor) return ((TypeCalculationVisitor<? extends T>)visitor).visitBinaryFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryFunctionNameContext binaryFunctionName() throws RecognitionException {
		BinaryFunctionNameContext _localctx = new BinaryFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_binaryFunctionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			((BinaryFunctionNameContext)_localctx).name = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==MIN || _la==MAX) ) {
				((BinaryFunctionNameContext)_localctx).name = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17,\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\35\n\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3%\n\3\f\3\16"+
		"\3(\13\3\3\4\3\4\3\4\2\3\4\5\2\4\6\2\5\3\2\6\7\3\2\b\t\3\2\13\f/\2\b\3"+
		"\2\2\2\4\34\3\2\2\2\6)\3\2\2\2\b\t\5\4\3\2\t\n\7\2\2\3\n\3\3\2\2\2\13"+
		"\f\b\3\1\2\f\35\7\n\2\2\r\35\7\16\2\2\16\17\5\6\4\2\17\20\7\3\2\2\20\21"+
		"\5\4\3\2\21\22\7\4\2\2\22\23\5\4\3\2\23\24\7\5\2\2\24\35\3\2\2\2\25\35"+
		"\7\r\2\2\26\27\7\3\2\2\27\30\5\4\3\2\30\31\7\5\2\2\31\35\3\2\2\2\32\33"+
		"\t\2\2\2\33\35\5\4\3\5\34\13\3\2\2\2\34\r\3\2\2\2\34\16\3\2\2\2\34\25"+
		"\3\2\2\2\34\26\3\2\2\2\34\32\3\2\2\2\35&\3\2\2\2\36\37\f\4\2\2\37 \t\3"+
		"\2\2 %\5\4\3\5!\"\f\3\2\2\"#\t\2\2\2#%\5\4\3\4$\36\3\2\2\2$!\3\2\2\2%"+
		"(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\5\3\2\2\2(&\3\2\2\2)*\t\4\2\2*\7\3\2"+
		"\2\2\5\34$&";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}