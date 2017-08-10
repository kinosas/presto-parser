package com.facebook.presto.type;// Generated from TypeCalculation.g4 by ANTLR 4.6

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TypeCalculationLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, PLUS=4, MINUS=5, ASTERISK=6, SLASH=7, NULL=8, 
		MIN=9, MAX=10, IDENTIFIER=11, INTEGER_VALUE=12, WS=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "PLUS", "MINUS", "ASTERISK", "SLASH", "NULL", 
		"MIN", "MAX", "IDENTIFIER", "INTEGER_VALUE", "DIGIT", "LETTER", "WS"
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


	public TypeCalculationLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TypeCalculation.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17X\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\f\3\f\5\f?\n\f\3\f\3\f\3\f\7\fD\n\f\f\f\16\f"+
		"G\13\f\3\r\6\rJ\n\r\r\r\16\rK\3\16\3\16\3\17\3\17\3\20\6\20S\n\20\r\20"+
		"\16\20T\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\2\35\2\37\17\3\2\4\4\2C\\c|\5\2\13\f\17\17\"\"[\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13)\3\2"+
		"\2\2\r+\3\2\2\2\17-\3\2\2\2\21/\3\2\2\2\23\64\3\2\2\2\258\3\2\2\2\27>"+
		"\3\2\2\2\31I\3\2\2\2\33M\3\2\2\2\35O\3\2\2\2\37R\3\2\2\2!\"\7*\2\2\"\4"+
		"\3\2\2\2#$\7.\2\2$\6\3\2\2\2%&\7+\2\2&\b\3\2\2\2\'(\7-\2\2(\n\3\2\2\2"+
		")*\7/\2\2*\f\3\2\2\2+,\7,\2\2,\16\3\2\2\2-.\7\61\2\2.\20\3\2\2\2/\60\7"+
		"P\2\2\60\61\7W\2\2\61\62\7N\2\2\62\63\7N\2\2\63\22\3\2\2\2\64\65\7O\2"+
		"\2\65\66\7K\2\2\66\67\7P\2\2\67\24\3\2\2\289\7O\2\29:\7C\2\2:;\7Z\2\2"+
		";\26\3\2\2\2<?\5\35\17\2=?\7a\2\2><\3\2\2\2>=\3\2\2\2?E\3\2\2\2@D\5\35"+
		"\17\2AD\5\33\16\2BD\7a\2\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2DG\3\2\2\2EC\3"+
		"\2\2\2EF\3\2\2\2F\30\3\2\2\2GE\3\2\2\2HJ\5\33\16\2IH\3\2\2\2JK\3\2\2\2"+
		"KI\3\2\2\2KL\3\2\2\2L\32\3\2\2\2MN\4\62;\2N\34\3\2\2\2OP\t\2\2\2P\36\3"+
		"\2\2\2QS\t\3\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\b"+
		"\20\2\2W \3\2\2\2\b\2>CEKT\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}