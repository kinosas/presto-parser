package com.facebook.presto.sql.parser;// Generated from SqlBase.g4 by ANTLR 4.6

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ADD=10, ALL=11, ALTER=12, ANALYZE=13, AND=14, ANY=15, ARRAY=16, AS=17, 
		ASC=18, AT=19, BERNOULLI=20, BETWEEN=21, BY=22, CALL=23, CASCADE=24, CASE=25, 
		CAST=26, CATALOGS=27, COALESCE=28, COLUMN=29, COLUMNS=30, COMMENT=31, 
		COMMIT=32, COMMITTED=33, CONSTRAINT=34, CREATE=35, CROSS=36, CUBE=37, 
		CURRENT=38, CURRENT_DATE=39, CURRENT_TIME=40, CURRENT_TIMESTAMP=41, DATA=42, 
		DATE=43, DAY=44, DEALLOCATE=45, DELETE=46, DESC=47, DESCRIBE=48, DISTINCT=49, 
		DISTRIBUTED=50, DROP=51, ELSE=52, END=53, ESCAPE=54, EXCEPT=55, EXCLUDING=56, 
		EXECUTE=57, EXISTS=58, EXPLAIN=59, EXTRACT=60, FALSE=61, FILTER=62, FIRST=63, 
		FOLLOWING=64, FOR=65, FORMAT=66, FROM=67, FULL=68, FUNCTIONS=69, GRANT=70, 
		GRANTS=71, GRAPHVIZ=72, GROUP=73, GROUPING=74, HAVING=75, HOUR=76, IF=77, 
		IN=78, INCLUDING=79, INNER=80, INPUT=81, INSERT=82, INTEGER=83, INTERSECT=84, 
		INTERVAL=85, INTO=86, IS=87, ISOLATION=88, JOIN=89, LAST=90, LATERAL=91, 
		LEFT=92, LEVEL=93, LIKE=94, LIMIT=95, LOCALTIME=96, LOCALTIMESTAMP=97, 
		LOGICAL=98, MAP=99, MINUTE=100, MONTH=101, NATURAL=102, NFC=103, NFD=104, 
		NFKC=105, NFKD=106, NO=107, NORMALIZE=108, NOT=109, NULL=110, NULLIF=111, 
		NULLS=112, ON=113, ONLY=114, OPTION=115, OR=116, ORDER=117, ORDINALITY=118, 
		OUTER=119, OUTPUT=120, OVER=121, PARTITION=122, PARTITIONS=123, POSITION=124, 
		PRECEDING=125, PREPARE=126, PRIVILEGES=127, PROPERTIES=128, PUBLIC=129, 
		RANGE=130, READ=131, RECURSIVE=132, RENAME=133, REPEATABLE=134, REPLACE=135, 
		RESET=136, RESTRICT=137, REVOKE=138, RIGHT=139, ROLLBACK=140, ROLLUP=141, 
		ROW=142, ROWS=143, SCHEMA=144, SCHEMAS=145, SECOND=146, SELECT=147, SERIALIZABLE=148, 
		SESSION=149, SET=150, SETS=151, SHOW=152, SMALLINT=153, SOME=154, START=155, 
		STATS=156, SUBSTRING=157, SYSTEM=158, TABLE=159, TABLES=160, TABLESAMPLE=161, 
		TEXT=162, THEN=163, TIME=164, TIMESTAMP=165, TINYINT=166, TO=167, TRANSACTION=168, 
		TRUE=169, TRY_CAST=170, TYPE=171, UESCAPE=172, UNBOUNDED=173, UNCOMMITTED=174, 
		UNION=175, UNNEST=176, USE=177, USING=178, VALIDATE=179, VALUES=180, VERBOSE=181, 
		VIEW=182, WHEN=183, WHERE=184, WITH=185, WORK=186, WRITE=187, YEAR=188, 
		ZONE=189, EQ=190, NEQ=191, LT=192, LTE=193, GT=194, GTE=195, PLUS=196, 
		MINUS=197, ASTERISK=198, SLASH=199, PERCENT=200, CONCAT=201, STRING=202, 
		UNICODE_STRING=203, BINARY_LITERAL=204, INTEGER_VALUE=205, DECIMAL_VALUE=206, 
		IDENTIFIER=207, DIGIT_IDENTIFIER=208, QUOTED_IDENTIFIER=209, BACKQUOTED_IDENTIFIER=210, 
		TIME_WITH_TIME_ZONE=211, TIMESTAMP_WITH_TIME_ZONE=212, DOUBLE_PRECISION=213, 
		SIMPLE_COMMENT=214, BRACKETED_COMMENT=215, WS=216, UNRECOGNIZED=217, DELIMITER=218;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_statement = 2, 
		RULE_query = 3, RULE_with = 4, RULE_tableElement = 5, RULE_columnDefinition = 6, 
		RULE_likeClause = 7, RULE_tableProperties = 8, RULE_tableProperty = 9, 
		RULE_queryNoWith = 10, RULE_queryTerm = 11, RULE_queryPrimary = 12, RULE_sortItem = 13, 
		RULE_querySpecification = 14, RULE_groupBy = 15, RULE_groupingElement = 16, 
		RULE_groupingExpressions = 17, RULE_groupingSet = 18, RULE_namedQuery = 19, 
		RULE_setQuantifier = 20, RULE_selectItem = 21, RULE_relation = 22, RULE_joinType = 23, 
		RULE_joinCriteria = 24, RULE_sampledRelation = 25, RULE_sampleType = 26, 
		RULE_aliasedRelation = 27, RULE_columnAliases = 28, RULE_relationPrimary = 29, 
		RULE_expression = 30, RULE_booleanExpression = 31, RULE_predicated = 32, 
		RULE_predicate = 33, RULE_valueExpression = 34, RULE_primaryExpression = 35, 
		RULE_string = 36, RULE_timeZoneSpecifier = 37, RULE_comparisonOperator = 38, 
		RULE_comparisonQuantifier = 39, RULE_booleanValue = 40, RULE_interval = 41, 
		RULE_intervalField = 42, RULE_normalForm = 43, RULE_type = 44, RULE_typeParameter = 45, 
		RULE_baseType = 46, RULE_whenClause = 47, RULE_filter = 48, RULE_over = 49, 
		RULE_windowFrame = 50, RULE_frameBound = 51, RULE_explainOption = 52, 
		RULE_transactionMode = 53, RULE_levelOfIsolation = 54, RULE_callArgument = 55, 
		RULE_privilege = 56, RULE_qualifiedName = 57, RULE_identifier = 58, RULE_quotedIdentifier = 59, 
		RULE_number = 60, RULE_nonReserved = 61;
	public static final String[] ruleNames = {
		"singleStatement", "singleExpression", "statement", "query", "with", "tableElement", 
		"columnDefinition", "likeClause", "tableProperties", "tableProperty", 
		"queryNoWith", "queryTerm", "queryPrimary", "sortItem", "querySpecification", 
		"groupBy", "groupingElement", "groupingExpressions", "groupingSet", "namedQuery", 
		"setQuantifier", "selectItem", "relation", "joinType", "joinCriteria", 
		"sampledRelation", "sampleType", "aliasedRelation", "columnAliases", "relationPrimary", 
		"expression", "booleanExpression", "predicated", "predicate", "valueExpression", 
		"primaryExpression", "string", "timeZoneSpecifier", "comparisonOperator", 
		"comparisonQuantifier", "booleanValue", "interval", "intervalField", "normalForm", 
		"type", "typeParameter", "baseType", "whenClause", "filter", "over", "windowFrame", 
		"frameBound", "explainOption", "transactionMode", "levelOfIsolation", 
		"callArgument", "privilege", "qualifiedName", "identifier", "quotedIdentifier", 
		"number", "nonReserved"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'('", "')'", "','", "'?'", "'->'", "'['", "']'", "'=>'", 
		"'ADD'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", "'ANY'", "'ARRAY'", 
		"'AS'", "'ASC'", "'AT'", "'BERNOULLI'", "'BETWEEN'", "'BY'", "'CALL'", 
		"'CASCADE'", "'CASE'", "'CAST'", "'CATALOGS'", "'COALESCE'", "'COLUMN'", 
		"'COLUMNS'", "'COMMENT'", "'COMMIT'", "'COMMITTED'", "'CONSTRAINT'", "'CREATE'", 
		"'CROSS'", "'CUBE'", "'CURRENT'", "'CURRENT_DATE'", "'CURRENT_TIME'", 
		"'CURRENT_TIMESTAMP'", "'DATA'", "'DATE'", "'DAY'", "'DEALLOCATE'", "'DELETE'", 
		"'DESC'", "'DESCRIBE'", "'DISTINCT'", "'DISTRIBUTED'", "'DROP'", "'ELSE'", 
		"'END'", "'ESCAPE'", "'EXCEPT'", "'EXCLUDING'", "'EXECUTE'", "'EXISTS'", 
		"'EXPLAIN'", "'EXTRACT'", "'FALSE'", "'FILTER'", "'FIRST'", "'FOLLOWING'", 
		"'FOR'", "'FORMAT'", "'FROM'", "'FULL'", "'FUNCTIONS'", "'GRANT'", "'GRANTS'", 
		"'GRAPHVIZ'", "'GROUP'", "'GROUPING'", "'HAVING'", "'HOUR'", "'IF'", "'IN'", 
		"'INCLUDING'", "'INNER'", "'INPUT'", "'INSERT'", "'INTEGER'", "'INTERSECT'", 
		"'INTERVAL'", "'INTO'", "'IS'", "'ISOLATION'", "'JOIN'", "'LAST'", "'LATERAL'", 
		"'LEFT'", "'LEVEL'", "'LIKE'", "'LIMIT'", "'LOCALTIME'", "'LOCALTIMESTAMP'", 
		"'LOGICAL'", "'MAP'", "'MINUTE'", "'MONTH'", "'NATURAL'", "'NFC'", "'NFD'", 
		"'NFKC'", "'NFKD'", "'NO'", "'NORMALIZE'", "'NOT'", "'NULL'", "'NULLIF'", 
		"'NULLS'", "'ON'", "'ONLY'", "'OPTION'", "'OR'", "'ORDER'", "'ORDINALITY'", 
		"'OUTER'", "'OUTPUT'", "'OVER'", "'PARTITION'", "'PARTITIONS'", "'POSITION'", 
		"'PRECEDING'", "'PREPARE'", "'PRIVILEGES'", "'PROPERTIES'", "'PUBLIC'", 
		"'RANGE'", "'READ'", "'RECURSIVE'", "'RENAME'", "'REPEATABLE'", "'REPLACE'", 
		"'RESET'", "'RESTRICT'", "'REVOKE'", "'RIGHT'", "'ROLLBACK'", "'ROLLUP'", 
		"'ROW'", "'ROWS'", "'SCHEMA'", "'SCHEMAS'", "'SECOND'", "'SELECT'", "'SERIALIZABLE'", 
		"'SESSION'", "'SET'", "'SETS'", "'SHOW'", "'SMALLINT'", "'SOME'", "'START'", 
		"'STATS'", "'SUBSTRING'", "'SYSTEM'", "'TABLE'", "'TABLES'", "'TABLESAMPLE'", 
		"'TEXT'", "'THEN'", "'TIME'", "'TIMESTAMP'", "'TINYINT'", "'TO'", "'TRANSACTION'", 
		"'TRUE'", "'TRY_CAST'", "'TYPE'", "'UESCAPE'", "'UNBOUNDED'", "'UNCOMMITTED'", 
		"'UNION'", "'UNNEST'", "'USE'", "'USING'", "'VALIDATE'", "'VALUES'", "'VERBOSE'", 
		"'VIEW'", "'WHEN'", "'WHERE'", "'WITH'", "'WORK'", "'WRITE'", "'YEAR'", 
		"'ZONE'", "'='", null, "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "ADD", "ALL", 
		"ALTER", "ANALYZE", "AND", "ANY", "ARRAY", "AS", "ASC", "AT", "BERNOULLI", 
		"BETWEEN", "BY", "CALL", "CASCADE", "CASE", "CAST", "CATALOGS", "COALESCE", 
		"COLUMN", "COLUMNS", "COMMENT", "COMMIT", "COMMITTED", "CONSTRAINT", "CREATE", 
		"CROSS", "CUBE", "CURRENT", "CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", 
		"DATA", "DATE", "DAY", "DEALLOCATE", "DELETE", "DESC", "DESCRIBE", "DISTINCT", 
		"DISTRIBUTED", "DROP", "ELSE", "END", "ESCAPE", "EXCEPT", "EXCLUDING", 
		"EXECUTE", "EXISTS", "EXPLAIN", "EXTRACT", "FALSE", "FILTER", "FIRST", 
		"FOLLOWING", "FOR", "FORMAT", "FROM", "FULL", "FUNCTIONS", "GRANT", "GRANTS", 
		"GRAPHVIZ", "GROUP", "GROUPING", "HAVING", "HOUR", "IF", "IN", "INCLUDING", 
		"INNER", "INPUT", "INSERT", "INTEGER", "INTERSECT", "INTERVAL", "INTO", 
		"IS", "ISOLATION", "JOIN", "LAST", "LATERAL", "LEFT", "LEVEL", "LIKE", 
		"LIMIT", "LOCALTIME", "LOCALTIMESTAMP", "LOGICAL", "MAP", "MINUTE", "MONTH", 
		"NATURAL", "NFC", "NFD", "NFKC", "NFKD", "NO", "NORMALIZE", "NOT", "NULL", 
		"NULLIF", "NULLS", "ON", "ONLY", "OPTION", "OR", "ORDER", "ORDINALITY", 
		"OUTER", "OUTPUT", "OVER", "PARTITION", "PARTITIONS", "POSITION", "PRECEDING", 
		"PREPARE", "PRIVILEGES", "PROPERTIES", "PUBLIC", "RANGE", "READ", "RECURSIVE", 
		"RENAME", "REPEATABLE", "REPLACE", "RESET", "RESTRICT", "REVOKE", "RIGHT", 
		"ROLLBACK", "ROLLUP", "ROW", "ROWS", "SCHEMA", "SCHEMAS", "SECOND", "SELECT", 
		"SERIALIZABLE", "SESSION", "SET", "SETS", "SHOW", "SMALLINT", "SOME", 
		"START", "STATS", "SUBSTRING", "SYSTEM", "TABLE", "TABLES", "TABLESAMPLE", 
		"TEXT", "THEN", "TIME", "TIMESTAMP", "TINYINT", "TO", "TRANSACTION", "TRUE", 
		"TRY_CAST", "TYPE", "UESCAPE", "UNBOUNDED", "UNCOMMITTED", "UNION", "UNNEST", 
		"USE", "USING", "VALIDATE", "VALUES", "VERBOSE", "VIEW", "WHEN", "WHERE", 
		"WITH", "WORK", "WRITE", "YEAR", "ZONE", "EQ", "NEQ", "LT", "LTE", "GT", 
		"GTE", "PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "CONCAT", "STRING", 
		"UNICODE_STRING", "BINARY_LITERAL", "INTEGER_VALUE", "DECIMAL_VALUE", 
		"IDENTIFIER", "DIGIT_IDENTIFIER", "QUOTED_IDENTIFIER", "BACKQUOTED_IDENTIFIER", 
		"TIME_WITH_TIME_ZONE", "TIMESTAMP_WITH_TIME_ZONE", "DOUBLE_PRECISION", 
		"SIMPLE_COMMENT", "BRACKETED_COMMENT", "WS", "UNRECOGNIZED", "DELIMITER"
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
	public String getGrammarFileName() { return "SqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			statement();
			setState(125);
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

	public static class SingleExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			expression();
			setState(128);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode VERBOSE() { return getToken(SqlBaseParser.VERBOSE, 0); }
		public List<ExplainOptionContext> explainOption() {
			return getRuleContexts(ExplainOptionContext.class);
		}
		public ExplainOptionContext explainOption(int i) {
			return getRuleContext(ExplainOptionContext.class,i);
		}
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrepareContext extends StatementContext {
		public TerminalNode PREPARE() { return getToken(SqlBaseParser.PREPARE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public PrepareContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrepare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrepare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrepare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<TableElementContext> tableElement() {
			return getRuleContexts(TableElementContext.class);
		}
		public TableElementContext tableElement(int i) {
			return getRuleContext(TableElementContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StartTransactionContext extends StatementContext {
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public List<TransactionModeContext> transactionMode() {
			return getRuleContexts(TransactionModeContext.class);
		}
		public TransactionModeContext transactionMode(int i) {
			return getRuleContext(TransactionModeContext.class,i);
		}
		public StartTransactionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStartTransaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStartTransaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStartTransaction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableAsSelectContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<TerminalNode> WITH() { return getTokens(SqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SqlBaseParser.WITH, i);
		}
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public CreateTableAsSelectContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableAsSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableAsSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableAsSelect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public IdentifierContext schema;
		public IdentifierContext catalog;
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowStatsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode STATS() { return getToken(SqlBaseParser.STATS, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public ShowStatsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowStats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowStats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowStats(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeallocateContext extends StatementContext {
		public TerminalNode DEALLOCATE() { return getToken(SqlBaseParser.DEALLOCATE, 0); }
		public TerminalNode PREPARE() { return getToken(SqlBaseParser.PREPARE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeallocateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDeallocate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDeallocate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDeallocate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public QualifiedNameContext from;
		public QualifiedNameContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommitContext extends StatementContext {
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode WORK() { return getToken(SqlBaseParser.WORK, 0); }
		public CommitContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCommit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCommit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCommit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RevokeContext extends StatementContext {
		public IdentifierContext grantee;
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrivilegeContext> privilege() {
			return getRuleContexts(PrivilegeContext.class);
		}
		public PrivilegeContext privilege(int i) {
			return getRuleContext(PrivilegeContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public RevokeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRevoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRevoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRevoke(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowPartitionsContext extends StatementContext {
		public Token limit;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public QualifiedNameContext column;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public DropColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteContext extends StatementContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public DeleteContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public StringContext pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeInputContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode INPUT() { return getToken(SqlBaseParser.INPUT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DescribeInputContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowStatsForQueryContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode STATS() { return getToken(SqlBaseParser.STATS, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public ShowStatsForQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowStatsForQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowStatsForQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowStatsForQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCatalogsContext extends StatementContext {
		public StringContext pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ShowCatalogsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCatalogs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCatalogs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCatalogs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public IdentifierContext from;
		public IdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public RenameColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetSessionContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowSchemasContext extends StatementContext {
		public StringContext pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ShowSchemasContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowSchemas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowSchemas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowSchemas(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RollbackContext extends StatementContext {
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode WORK() { return getToken(SqlBaseParser.WORK, 0); }
		public RollbackContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRollback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRollback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRollback(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public ColumnDefinitionContext column;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public AddColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetSessionContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ResetSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResetSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResetSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResetSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoContext extends StatementContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public InsertIntoContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertInto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertInto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertInto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowSessionContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public ShowSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateSchemaContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public CreateSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExecuteContext extends StatementContext {
		public TerminalNode EXECUTE() { return getToken(SqlBaseParser.EXECUTE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExecuteContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExecute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallContext extends StatementContext {
		public TerminalNode CALL() { return getToken(SqlBaseParser.CALL, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<CallArgumentContext> callArgument() {
			return getRuleContexts(CallArgumentContext.class);
		}
		public CallArgumentContext callArgument(int i) {
			return getRuleContext(CallArgumentContext.class,i);
		}
		public CallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameSchemaContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RenameSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowGrantsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode GRANTS() { return getToken(SqlBaseParser.GRANTS, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public ShowGrantsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowGrants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowGrants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowGrants(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeOutputContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode OUTPUT() { return getToken(SqlBaseParser.OUTPUT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DescribeOutputContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeOutput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropSchemaContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public DropSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GrantContext extends StatementContext {
		public IdentifierContext grantee;
		public List<TerminalNode> GRANT() { return getTokens(SqlBaseParser.GRANT); }
		public TerminalNode GRANT(int i) {
			return getToken(SqlBaseParser.GRANT, i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrivilegeContext> privilege() {
			return getRuleContexts(PrivilegeContext.class);
		}
		public PrivilegeContext privilege(int i) {
			return getRuleContext(PrivilegeContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public GrantContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGrant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGrant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGrant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateViewContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				query();
				}
				break;
			case 2:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(USE);
				setState(132);
				((UseContext)_localctx).schema = identifier();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				match(USE);
				setState(134);
				((UseContext)_localctx).catalog = identifier();
				setState(135);
				match(T__0);
				setState(136);
				((UseContext)_localctx).schema = identifier();
				}
				break;
			case 4:
				_localctx = new CreateSchemaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				match(CREATE);
				setState(139);
				match(SCHEMA);
				setState(143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(140);
					match(IF);
					setState(141);
					match(NOT);
					setState(142);
					match(EXISTS);
					}
					break;
				}
				setState(145);
				qualifiedName();
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(146);
					match(WITH);
					setState(147);
					tableProperties();
					}
				}

				}
				break;
			case 5:
				_localctx = new DropSchemaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				match(DROP);
				setState(151);
				match(SCHEMA);
				setState(154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(152);
					match(IF);
					setState(153);
					match(EXISTS);
					}
					break;
				}
				setState(156);
				qualifiedName();
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(157);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 6:
				_localctx = new RenameSchemaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				match(ALTER);
				setState(161);
				match(SCHEMA);
				setState(162);
				qualifiedName();
				setState(163);
				match(RENAME);
				setState(164);
				match(TO);
				setState(165);
				identifier();
				}
				break;
			case 7:
				_localctx = new CreateTableAsSelectContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(167);
				match(CREATE);
				setState(168);
				match(TABLE);
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(169);
					match(IF);
					setState(170);
					match(NOT);
					setState(171);
					match(EXISTS);
					}
					break;
				}
				setState(174);
				qualifiedName();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(175);
					columnAliases();
					}
				}

				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(178);
					match(COMMENT);
					setState(179);
					string();
					}
				}

				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(182);
					match(WITH);
					setState(183);
					tableProperties();
					}
				}

				setState(186);
				match(AS);
				setState(192);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(187);
					query();
					}
					break;
				case 2:
					{
					setState(188);
					match(T__1);
					setState(189);
					query();
					setState(190);
					match(T__2);
					}
					break;
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(194);
					match(WITH);
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(195);
						match(NO);
						}
					}

					setState(198);
					match(DATA);
					}
				}

				}
				break;
			case 8:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(201);
				match(CREATE);
				setState(202);
				match(TABLE);
				setState(206);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(203);
					match(IF);
					setState(204);
					match(NOT);
					setState(205);
					match(EXISTS);
					}
					break;
				}
				setState(208);
				qualifiedName();
				setState(209);
				match(T__1);
				setState(210);
				tableElement();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(211);
					match(T__3);
					setState(212);
					tableElement();
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(218);
				match(T__2);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(219);
					match(COMMENT);
					setState(220);
					string();
					}
				}

				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(223);
					match(WITH);
					setState(224);
					tableProperties();
					}
				}

				}
				break;
			case 9:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(227);
				match(DROP);
				setState(228);
				match(TABLE);
				setState(231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(229);
					match(IF);
					setState(230);
					match(EXISTS);
					}
					break;
				}
				setState(233);
				qualifiedName();
				}
				break;
			case 10:
				_localctx = new InsertIntoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(234);
				match(INSERT);
				setState(235);
				match(INTO);
				setState(236);
				qualifiedName();
				setState(238);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(237);
					columnAliases();
					}
					break;
				}
				setState(240);
				query();
				}
				break;
			case 11:
				_localctx = new DeleteContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(242);
				match(DELETE);
				setState(243);
				match(FROM);
				setState(244);
				qualifiedName();
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(245);
					match(WHERE);
					setState(246);
					booleanExpression(0);
					}
				}

				}
				break;
			case 12:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(249);
				match(ALTER);
				setState(250);
				match(TABLE);
				setState(251);
				((RenameTableContext)_localctx).from = qualifiedName();
				setState(252);
				match(RENAME);
				setState(253);
				match(TO);
				setState(254);
				((RenameTableContext)_localctx).to = qualifiedName();
				}
				break;
			case 13:
				_localctx = new RenameColumnContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(256);
				match(ALTER);
				setState(257);
				match(TABLE);
				setState(258);
				((RenameColumnContext)_localctx).tableName = qualifiedName();
				setState(259);
				match(RENAME);
				setState(260);
				match(COLUMN);
				setState(261);
				((RenameColumnContext)_localctx).from = identifier();
				setState(262);
				match(TO);
				setState(263);
				((RenameColumnContext)_localctx).to = identifier();
				}
				break;
			case 14:
				_localctx = new DropColumnContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(265);
				match(ALTER);
				setState(266);
				match(TABLE);
				setState(267);
				((DropColumnContext)_localctx).tableName = qualifiedName();
				setState(268);
				match(DROP);
				setState(269);
				match(COLUMN);
				setState(270);
				((DropColumnContext)_localctx).column = qualifiedName();
				}
				break;
			case 15:
				_localctx = new AddColumnContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(272);
				match(ALTER);
				setState(273);
				match(TABLE);
				setState(274);
				((AddColumnContext)_localctx).tableName = qualifiedName();
				setState(275);
				match(ADD);
				setState(276);
				match(COLUMN);
				setState(277);
				((AddColumnContext)_localctx).column = columnDefinition();
				}
				break;
			case 16:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(279);
				match(CREATE);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(280);
					match(OR);
					setState(281);
					match(REPLACE);
					}
				}

				setState(284);
				match(VIEW);
				setState(285);
				qualifiedName();
				setState(286);
				match(AS);
				setState(287);
				query();
				}
				break;
			case 17:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(289);
				match(DROP);
				setState(290);
				match(VIEW);
				setState(293);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(291);
					match(IF);
					setState(292);
					match(EXISTS);
					}
					break;
				}
				setState(295);
				qualifiedName();
				}
				break;
			case 18:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(296);
				match(CALL);
				setState(297);
				qualifiedName();
				setState(298);
				match(T__1);
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COALESCE) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXTRACT) | (1L << FALSE) | (1L << FILTER) | (1L << FIRST))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTEGER - 64)) | (1L << (INTERVAL - 64)) | (1L << (ISOLATION - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (ONLY - 64)) | (1L << (OPTION - 64)) | (1L << (ORDINALITY - 64)) | (1L << (OUTPUT - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (PARTITIONS - 64)) | (1L << (POSITION - 64)) | (1L << (PRECEDING - 64)) | (1L << (PRIVILEGES - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PROPERTIES - 128)) | (1L << (PUBLIC - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SMALLINT - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TINYINT - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNCOMMITTED - 128)) | (1L << (USE - 128)) | (1L << (VALIDATE - 128)) | (1L << (VERBOSE - 128)) | (1L << (VIEW - 128)) | (1L << (WORK - 128)) | (1L << (WRITE - 128)) | (1L << (YEAR - 128)) | (1L << (ZONE - 128)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (PLUS - 196)) | (1L << (MINUS - 196)) | (1L << (STRING - 196)) | (1L << (UNICODE_STRING - 196)) | (1L << (BINARY_LITERAL - 196)) | (1L << (INTEGER_VALUE - 196)) | (1L << (DECIMAL_VALUE - 196)) | (1L << (IDENTIFIER - 196)) | (1L << (DIGIT_IDENTIFIER - 196)) | (1L << (QUOTED_IDENTIFIER - 196)) | (1L << (BACKQUOTED_IDENTIFIER - 196)) | (1L << (DOUBLE_PRECISION - 196)))) != 0)) {
					{
					setState(299);
					callArgument();
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(300);
						match(T__3);
						setState(301);
						callArgument();
						}
						}
						setState(306);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(309);
				match(T__2);
				}
				break;
			case 19:
				_localctx = new GrantContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(311);
				match(GRANT);
				setState(322);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(312);
					privilege();
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(313);
						match(T__3);
						setState(314);
						privilege();
						}
						}
						setState(319);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(320);
					match(ALL);
					setState(321);
					match(PRIVILEGES);
					}
					break;
				}
				setState(324);
				match(ON);
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(325);
					match(TABLE);
					}
				}

				setState(328);
				qualifiedName();
				setState(329);
				match(TO);
				setState(330);
				((GrantContext)_localctx).grantee = identifier();
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(331);
					match(WITH);
					setState(332);
					match(GRANT);
					setState(333);
					match(OPTION);
					}
				}

				}
				break;
			case 20:
				_localctx = new RevokeContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(336);
				match(REVOKE);
				setState(340);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(337);
					match(GRANT);
					setState(338);
					match(OPTION);
					setState(339);
					match(FOR);
					}
					break;
				}
				setState(352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(342);
					privilege();
					setState(347);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(343);
						match(T__3);
						setState(344);
						privilege();
						}
						}
						setState(349);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(350);
					match(ALL);
					setState(351);
					match(PRIVILEGES);
					}
					break;
				}
				setState(354);
				match(ON);
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(355);
					match(TABLE);
					}
				}

				setState(358);
				qualifiedName();
				setState(359);
				match(FROM);
				setState(360);
				((RevokeContext)_localctx).grantee = identifier();
				}
				break;
			case 21:
				_localctx = new ShowGrantsContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(362);
				match(SHOW);
				setState(363);
				match(GRANTS);
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(364);
					match(ON);
					setState(366);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TABLE) {
						{
						setState(365);
						match(TABLE);
						}
					}

					setState(368);
					qualifiedName();
					}
				}

				}
				break;
			case 22:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(371);
				match(EXPLAIN);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ANALYZE) {
					{
					setState(372);
					match(ANALYZE);
					}
				}

				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VERBOSE) {
					{
					setState(375);
					match(VERBOSE);
					}
				}

				setState(389);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(378);
					match(T__1);
					setState(379);
					explainOption();
					setState(384);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(380);
						match(T__3);
						setState(381);
						explainOption();
						}
						}
						setState(386);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(387);
					match(T__2);
					}
					break;
				}
				setState(391);
				statement();
				}
				break;
			case 23:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(392);
				match(SHOW);
				setState(393);
				match(CREATE);
				setState(394);
				match(TABLE);
				setState(395);
				qualifiedName();
				}
				break;
			case 24:
				_localctx = new ShowCreateViewContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(396);
				match(SHOW);
				setState(397);
				match(CREATE);
				setState(398);
				match(VIEW);
				setState(399);
				qualifiedName();
				}
				break;
			case 25:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(400);
				match(SHOW);
				setState(401);
				match(TABLES);
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(402);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(403);
					qualifiedName();
					}
				}

				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(406);
					match(LIKE);
					setState(407);
					((ShowTablesContext)_localctx).pattern = string();
					}
				}

				}
				break;
			case 26:
				_localctx = new ShowSchemasContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(410);
				match(SHOW);
				setState(411);
				match(SCHEMAS);
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(412);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(413);
					identifier();
					}
				}

				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(416);
					match(LIKE);
					setState(417);
					((ShowSchemasContext)_localctx).pattern = string();
					}
				}

				}
				break;
			case 27:
				_localctx = new ShowCatalogsContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(420);
				match(SHOW);
				setState(421);
				match(CATALOGS);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(422);
					match(LIKE);
					setState(423);
					((ShowCatalogsContext)_localctx).pattern = string();
					}
				}

				}
				break;
			case 28:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(426);
				match(SHOW);
				setState(427);
				match(COLUMNS);
				setState(428);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(429);
				qualifiedName();
				}
				break;
			case 29:
				_localctx = new ShowStatsContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(430);
				match(SHOW);
				setState(431);
				match(STATS);
				setState(432);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==ON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(433);
				qualifiedName();
				}
				break;
			case 30:
				_localctx = new ShowStatsForQueryContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(434);
				match(SHOW);
				setState(435);
				match(STATS);
				setState(436);
				match(FOR);
				setState(437);
				match(T__1);
				setState(438);
				querySpecification();
				setState(439);
				match(T__2);
				}
				break;
			case 31:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(441);
				match(DESCRIBE);
				setState(442);
				qualifiedName();
				}
				break;
			case 32:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(443);
				match(DESC);
				setState(444);
				qualifiedName();
				}
				break;
			case 33:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(445);
				match(SHOW);
				setState(446);
				match(FUNCTIONS);
				}
				break;
			case 34:
				_localctx = new ShowSessionContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(447);
				match(SHOW);
				setState(448);
				match(SESSION);
				}
				break;
			case 35:
				_localctx = new SetSessionContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(449);
				match(SET);
				setState(450);
				match(SESSION);
				setState(451);
				qualifiedName();
				setState(452);
				match(EQ);
				setState(453);
				expression();
				}
				break;
			case 36:
				_localctx = new ResetSessionContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(455);
				match(RESET);
				setState(456);
				match(SESSION);
				setState(457);
				qualifiedName();
				}
				break;
			case 37:
				_localctx = new StartTransactionContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(458);
				match(START);
				setState(459);
				match(TRANSACTION);
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ISOLATION || _la==READ) {
					{
					setState(460);
					transactionMode();
					setState(465);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(461);
						match(T__3);
						setState(462);
						transactionMode();
						}
						}
						setState(467);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 38:
				_localctx = new CommitContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(470);
				match(COMMIT);
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(471);
					match(WORK);
					}
				}

				}
				break;
			case 39:
				_localctx = new RollbackContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(474);
				match(ROLLBACK);
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(475);
					match(WORK);
					}
				}

				}
				break;
			case 40:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(478);
				match(SHOW);
				setState(479);
				match(PARTITIONS);
				setState(480);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(481);
				qualifiedName();
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(482);
					match(WHERE);
					setState(483);
					booleanExpression(0);
					}
				}

				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(486);
					match(ORDER);
					setState(487);
					match(BY);
					setState(488);
					sortItem();
					setState(493);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(489);
						match(T__3);
						setState(490);
						sortItem();
						}
						}
						setState(495);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(498);
					match(LIMIT);
					setState(499);
					((ShowPartitionsContext)_localctx).limit = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==INTEGER_VALUE) ) {
						((ShowPartitionsContext)_localctx).limit = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 41:
				_localctx = new PrepareContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(502);
				match(PREPARE);
				setState(503);
				identifier();
				setState(504);
				match(FROM);
				setState(505);
				statement();
				}
				break;
			case 42:
				_localctx = new DeallocateContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(507);
				match(DEALLOCATE);
				setState(508);
				match(PREPARE);
				setState(509);
				identifier();
				}
				break;
			case 43:
				_localctx = new ExecuteContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(510);
				match(EXECUTE);
				setState(511);
				identifier();
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(512);
					match(USING);
					setState(513);
					expression();
					setState(518);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(514);
						match(T__3);
						setState(515);
						expression();
						}
						}
						setState(520);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 44:
				_localctx = new DescribeInputContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(523);
				match(DESCRIBE);
				setState(524);
				match(INPUT);
				setState(525);
				identifier();
				}
				break;
			case 45:
				_localctx = new DescribeOutputContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(526);
				match(DESCRIBE);
				setState(527);
				match(OUTPUT);
				setState(528);
				identifier();
				}
				break;
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

	public static class QueryContext extends ParserRuleContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public WithContext with() {
			return getRuleContext(WithContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(531);
				with();
				}
			}

			setState(534);
			queryNoWith();
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

	public static class WithContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public TerminalNode RECURSIVE() { return getToken(SqlBaseParser.RECURSIVE, 0); }
		public WithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithContext with() throws RecognitionException {
		WithContext _localctx = new WithContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_with);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(WITH);
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(537);
				match(RECURSIVE);
				}
			}

			setState(540);
			namedQuery();
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(541);
				match(T__3);
				setState(542);
				namedQuery();
				}
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TableElementContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public LikeClauseContext likeClause() {
			return getRuleContext(LikeClauseContext.class,0);
		}
		public TableElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableElementContext tableElement() throws RecognitionException {
		TableElementContext _localctx = new TableElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tableElement);
		try {
			setState(550);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CATALOGS:
			case COALESCE:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DATA:
			case DATE:
			case DAY:
			case DESC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXPLAIN:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case INCLUDING:
			case INPUT:
			case INTEGER:
			case INTERVAL:
			case ISOLATION:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case PUBLIC:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESTRICT:
			case REVOKE:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SMALLINT:
			case SOME:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TINYINT:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				columnDefinition();
				}
				break;
			case LIKE:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				likeClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			identifier();
			setState(553);
			type(0);
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(554);
				match(COMMENT);
				setState(555);
				string();
				}
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

	public static class LikeClauseContext extends ParserRuleContext {
		public Token optionType;
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode INCLUDING() { return getToken(SqlBaseParser.INCLUDING, 0); }
		public TerminalNode EXCLUDING() { return getToken(SqlBaseParser.EXCLUDING, 0); }
		public LikeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLikeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLikeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLikeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikeClauseContext likeClause() throws RecognitionException {
		LikeClauseContext _localctx = new LikeClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_likeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(LIKE);
			setState(559);
			qualifiedName();
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLUDING || _la==INCLUDING) {
				{
				setState(560);
				((LikeClauseContext)_localctx).optionType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EXCLUDING || _la==INCLUDING) ) {
					((LikeClauseContext)_localctx).optionType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(561);
				match(PROPERTIES);
				}
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

	public static class TablePropertiesContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertiesContext tableProperties() throws RecognitionException {
		TablePropertiesContext _localctx = new TablePropertiesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tableProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(T__1);
			setState(565);
			tableProperty();
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(566);
				match(T__3);
				setState(567);
				tableProperty();
				}
				}
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(573);
			match(T__2);
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

	public static class TablePropertyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tableProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			identifier();
			setState(576);
			match(EQ);
			setState(577);
			expression();
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

	public static class QueryNoWithContext extends ParserRuleContext {
		public Token limit;
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryNoWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryNoWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryNoWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_queryNoWith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			queryTerm(0);
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(580);
				match(ORDER);
				setState(581);
				match(BY);
				setState(582);
				sortItem();
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(583);
					match(T__3);
					setState(584);
					sortItem();
					}
					}
					setState(589);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(592);
				match(LIMIT);
				setState(593);
				((QueryNoWithContext)_localctx).limit = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==INTEGER_VALUE) ) {
					((QueryNoWithContext)_localctx).limit = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(597);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(613);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(611);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(599);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(600);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(602);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(601);
							setQuantifier();
							}
						}

						setState(604);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(605);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(606);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(608);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(607);
							setQuantifier();
							}
						}

						setState(610);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(615);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableContext extends QueryPrimaryContext {
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InlineTableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_queryPrimary);
		try {
			int _alt;
			setState(632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(616);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
				match(TABLE);
				setState(618);
				qualifiedName();
				}
				break;
			case VALUES:
				_localctx = new InlineTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(619);
				match(VALUES);
				setState(620);
				expression();
				setState(625);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(621);
						match(T__3);
						setState(622);
						expression();
						}
						} 
					}
					setState(627);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				}
				break;
			case T__1:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(628);
				match(T__1);
				setState(629);
				queryNoWith();
				setState(630);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrdering;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			expression();
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(635);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(638);
				match(NULLS);
				setState(639);
				((SortItemContext)_localctx).nullOrdering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrdering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class QuerySpecificationContext extends ParserRuleContext {
		public BooleanExpressionContext where;
		public BooleanExpressionContext having;
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public GroupByContext groupBy() {
			return getRuleContext(GroupByContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_querySpecification);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			match(SELECT);
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(643);
				setQuantifier();
				}
				break;
			}
			setState(646);
			selectItem();
			setState(651);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(647);
					match(T__3);
					setState(648);
					selectItem();
					}
					} 
				}
				setState(653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(654);
				match(FROM);
				setState(655);
				relation(0);
				setState(660);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(656);
						match(T__3);
						setState(657);
						relation(0);
						}
						} 
					}
					setState(662);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				}
				break;
			}
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(665);
				match(WHERE);
				setState(666);
				((QuerySpecificationContext)_localctx).where = booleanExpression(0);
				}
				break;
			}
			setState(672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(669);
				match(GROUP);
				setState(670);
				match(BY);
				setState(671);
				groupBy();
				}
				break;
			}
			setState(676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(674);
				match(HAVING);
				setState(675);
				((QuerySpecificationContext)_localctx).having = booleanExpression(0);
				}
				break;
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

	public static class GroupByContext extends ParserRuleContext {
		public List<GroupingElementContext> groupingElement() {
			return getRuleContexts(GroupingElementContext.class);
		}
		public GroupingElementContext groupingElement(int i) {
			return getRuleContext(GroupingElementContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public GroupByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByContext groupBy() throws RecognitionException {
		GroupByContext _localctx = new GroupByContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_groupBy);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(678);
				setQuantifier();
				}
				break;
			}
			setState(681);
			groupingElement();
			setState(686);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(682);
					match(T__3);
					setState(683);
					groupingElement();
					}
					} 
				}
				setState(688);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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

	public static class GroupingElementContext extends ParserRuleContext {
		public GroupingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingElement; }
	 
		public GroupingElementContext() { }
		public void copyFrom(GroupingElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleGroupingSetsContext extends GroupingElementContext {
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public MultipleGroupingSetsContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultipleGroupingSets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultipleGroupingSets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultipleGroupingSets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleGroupingSetContext extends GroupingElementContext {
		public GroupingExpressionsContext groupingExpressions() {
			return getRuleContext(GroupingExpressionsContext.class,0);
		}
		public SingleGroupingSetContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CubeContext extends GroupingElementContext {
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public CubeContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCube(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCube(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCube(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RollupContext extends GroupingElementContext {
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public RollupContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRollup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRollup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRollup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingElementContext groupingElement() throws RecognitionException {
		GroupingElementContext _localctx = new GroupingElementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_groupingElement);
		int _la;
		try {
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				_localctx = new SingleGroupingSetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				groupingExpressions();
				}
				break;
			case 2:
				_localctx = new RollupContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				match(ROLLUP);
				setState(691);
				match(T__1);
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COALESCE) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXPLAIN) | (1L << FILTER) | (1L << FIRST))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTEGER - 64)) | (1L << (INTERVAL - 64)) | (1L << (ISOLATION - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (ONLY - 64)) | (1L << (OPTION - 64)) | (1L << (ORDINALITY - 64)) | (1L << (OUTPUT - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (PARTITIONS - 64)) | (1L << (POSITION - 64)) | (1L << (PRECEDING - 64)) | (1L << (PRIVILEGES - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PROPERTIES - 128)) | (1L << (PUBLIC - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SMALLINT - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TINYINT - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNCOMMITTED - 128)) | (1L << (USE - 128)) | (1L << (VALIDATE - 128)) | (1L << (VERBOSE - 128)) | (1L << (VIEW - 128)) | (1L << (WORK - 128)) | (1L << (WRITE - 128)) | (1L << (YEAR - 128)) | (1L << (ZONE - 128)))) != 0) || ((((_la - 207)) & ~0x3f) == 0 && ((1L << (_la - 207)) & ((1L << (IDENTIFIER - 207)) | (1L << (DIGIT_IDENTIFIER - 207)) | (1L << (QUOTED_IDENTIFIER - 207)) | (1L << (BACKQUOTED_IDENTIFIER - 207)))) != 0)) {
					{
					setState(692);
					qualifiedName();
					setState(697);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(693);
						match(T__3);
						setState(694);
						qualifiedName();
						}
						}
						setState(699);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(702);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new CubeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(703);
				match(CUBE);
				setState(704);
				match(T__1);
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COALESCE) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXPLAIN) | (1L << FILTER) | (1L << FIRST))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTEGER - 64)) | (1L << (INTERVAL - 64)) | (1L << (ISOLATION - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (ONLY - 64)) | (1L << (OPTION - 64)) | (1L << (ORDINALITY - 64)) | (1L << (OUTPUT - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (PARTITIONS - 64)) | (1L << (POSITION - 64)) | (1L << (PRECEDING - 64)) | (1L << (PRIVILEGES - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PROPERTIES - 128)) | (1L << (PUBLIC - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SMALLINT - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TINYINT - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNCOMMITTED - 128)) | (1L << (USE - 128)) | (1L << (VALIDATE - 128)) | (1L << (VERBOSE - 128)) | (1L << (VIEW - 128)) | (1L << (WORK - 128)) | (1L << (WRITE - 128)) | (1L << (YEAR - 128)) | (1L << (ZONE - 128)))) != 0) || ((((_la - 207)) & ~0x3f) == 0 && ((1L << (_la - 207)) & ((1L << (IDENTIFIER - 207)) | (1L << (DIGIT_IDENTIFIER - 207)) | (1L << (QUOTED_IDENTIFIER - 207)) | (1L << (BACKQUOTED_IDENTIFIER - 207)))) != 0)) {
					{
					setState(705);
					qualifiedName();
					setState(710);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(706);
						match(T__3);
						setState(707);
						qualifiedName();
						}
						}
						setState(712);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(715);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new MultipleGroupingSetsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(716);
				match(GROUPING);
				setState(717);
				match(SETS);
				setState(718);
				match(T__1);
				setState(719);
				groupingSet();
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(720);
					match(T__3);
					setState(721);
					groupingSet();
					}
					}
					setState(726);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(727);
				match(T__2);
				}
				break;
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

	public static class GroupingExpressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingExpressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingExpressionsContext groupingExpressions() throws RecognitionException {
		GroupingExpressionsContext _localctx = new GroupingExpressionsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_groupingExpressions);
		int _la;
		try {
			setState(744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				match(T__1);
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COALESCE) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXTRACT) | (1L << FALSE) | (1L << FILTER) | (1L << FIRST))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTEGER - 64)) | (1L << (INTERVAL - 64)) | (1L << (ISOLATION - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (ONLY - 64)) | (1L << (OPTION - 64)) | (1L << (ORDINALITY - 64)) | (1L << (OUTPUT - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (PARTITIONS - 64)) | (1L << (POSITION - 64)) | (1L << (PRECEDING - 64)) | (1L << (PRIVILEGES - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PROPERTIES - 128)) | (1L << (PUBLIC - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SMALLINT - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TINYINT - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNCOMMITTED - 128)) | (1L << (USE - 128)) | (1L << (VALIDATE - 128)) | (1L << (VERBOSE - 128)) | (1L << (VIEW - 128)) | (1L << (WORK - 128)) | (1L << (WRITE - 128)) | (1L << (YEAR - 128)) | (1L << (ZONE - 128)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (PLUS - 196)) | (1L << (MINUS - 196)) | (1L << (STRING - 196)) | (1L << (UNICODE_STRING - 196)) | (1L << (BINARY_LITERAL - 196)) | (1L << (INTEGER_VALUE - 196)) | (1L << (DECIMAL_VALUE - 196)) | (1L << (IDENTIFIER - 196)) | (1L << (DIGIT_IDENTIFIER - 196)) | (1L << (QUOTED_IDENTIFIER - 196)) | (1L << (BACKQUOTED_IDENTIFIER - 196)) | (1L << (DOUBLE_PRECISION - 196)))) != 0)) {
					{
					setState(732);
					expression();
					setState(737);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(733);
						match(T__3);
						setState(734);
						expression();
						}
						}
						setState(739);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(742);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				expression();
				}
				break;
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

	public static class GroupingSetContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_groupingSet);
		int _la;
		try {
			setState(759);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(746);
				match(T__1);
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COALESCE) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXPLAIN) | (1L << FILTER) | (1L << FIRST))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTEGER - 64)) | (1L << (INTERVAL - 64)) | (1L << (ISOLATION - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (ONLY - 64)) | (1L << (OPTION - 64)) | (1L << (ORDINALITY - 64)) | (1L << (OUTPUT - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (PARTITIONS - 64)) | (1L << (POSITION - 64)) | (1L << (PRECEDING - 64)) | (1L << (PRIVILEGES - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PROPERTIES - 128)) | (1L << (PUBLIC - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SMALLINT - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TINYINT - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNCOMMITTED - 128)) | (1L << (USE - 128)) | (1L << (VALIDATE - 128)) | (1L << (VERBOSE - 128)) | (1L << (VIEW - 128)) | (1L << (WORK - 128)) | (1L << (WRITE - 128)) | (1L << (YEAR - 128)) | (1L << (ZONE - 128)))) != 0) || ((((_la - 207)) & ~0x3f) == 0 && ((1L << (_la - 207)) & ((1L << (IDENTIFIER - 207)) | (1L << (DIGIT_IDENTIFIER - 207)) | (1L << (QUOTED_IDENTIFIER - 207)) | (1L << (BACKQUOTED_IDENTIFIER - 207)))) != 0)) {
					{
					setState(747);
					qualifiedName();
					setState(752);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(748);
						match(T__3);
						setState(749);
						qualifiedName();
						}
						}
						setState(754);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(757);
				match(T__2);
				}
				break;
			case ADD:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CATALOGS:
			case COALESCE:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DATA:
			case DATE:
			case DAY:
			case DESC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXPLAIN:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case INCLUDING:
			case INPUT:
			case INTEGER:
			case INTERVAL:
			case ISOLATION:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case PUBLIC:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESTRICT:
			case REVOKE:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SMALLINT:
			case SOME:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TINYINT:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(758);
				qualifiedName();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NamedQueryContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			((NamedQueryContext)_localctx).name = identifier();
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(762);
				columnAliases();
				}
			}

			setState(765);
			match(AS);
			setState(766);
			match(T__1);
			setState(767);
			query();
			setState(768);
			match(T__2);
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

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
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

	public static class SelectItemContext extends ParserRuleContext {
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
	 
		public SelectItemContext() { }
		public void copyFrom(SelectItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectAllContext extends SelectItemContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public SelectAllContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSelectAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSelectAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSelectAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectSingleContext extends SelectItemContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public SelectSingleContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSelectSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSelectSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSelectSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_selectItem);
		int _la;
		try {
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				_localctx = new SelectSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(772);
				expression();
				setState(777);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(774);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(773);
						match(AS);
						}
					}

					setState(776);
					identifier();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(779);
				qualifiedName();
				setState(780);
				match(T__0);
				setState(781);
				match(ASTERISK);
				}
				break;
			case 3:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(783);
				match(ASTERISK);
				}
				break;
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

	public static class RelationContext extends ParserRuleContext {
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	 
		public RelationContext() { }
		public void copyFrom(RelationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationDefaultContext extends RelationContext {
		public SampledRelationContext sampledRelation() {
			return getRuleContext(SampledRelationContext.class,0);
		}
		public RelationDefaultContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRelationDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRelationDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRelationDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinRelationContext extends RelationContext {
		public RelationContext left;
		public SampledRelationContext right;
		public RelationContext rightRelation;
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public SampledRelationContext sampledRelation() {
			return getRuleContext(SampledRelationContext.class,0);
		}
		public JoinRelationContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		return relation(0);
	}

	private RelationContext relation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationContext _localctx = new RelationContext(_ctx, _parentState);
		RelationContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_relation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelationDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(787);
			sampledRelation();
			}
			_ctx.stop = _input.LT(-1);
			setState(807);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JoinRelationContext(new RelationContext(_parentctx, _parentState));
					((JoinRelationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_relation);
					setState(789);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(803);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CROSS:
						{
						setState(790);
						match(CROSS);
						setState(791);
						match(JOIN);
						setState(792);
						((JoinRelationContext)_localctx).right = sampledRelation();
						}
						break;
					case FULL:
					case INNER:
					case JOIN:
					case LEFT:
					case RIGHT:
						{
						setState(793);
						joinType();
						setState(794);
						match(JOIN);
						setState(795);
						((JoinRelationContext)_localctx).rightRelation = relation(0);
						setState(796);
						joinCriteria();
						}
						break;
					case NATURAL:
						{
						setState(798);
						match(NATURAL);
						setState(799);
						joinType();
						setState(800);
						match(JOIN);
						setState(801);
						((JoinRelationContext)_localctx).right = sampledRelation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(809);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
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

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_joinType);
		int _la;
		try {
			setState(825);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
			case JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(810);
					match(INNER);
					}
				}

				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(813);
				match(LEFT);
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(814);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(817);
				match(RIGHT);
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(818);
					match(OUTER);
					}
				}

				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(821);
				match(FULL);
				setState(823);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(822);
					match(OUTER);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_joinCriteria);
		int _la;
		try {
			setState(841);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(827);
				match(ON);
				setState(828);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(829);
				match(USING);
				setState(830);
				match(T__1);
				setState(831);
				identifier();
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(832);
					match(T__3);
					setState(833);
					identifier();
					}
					}
					setState(838);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(839);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SampledRelationContext extends ParserRuleContext {
		public ExpressionContext percentage;
		public AliasedRelationContext aliasedRelation() {
			return getRuleContext(AliasedRelationContext.class,0);
		}
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public SampleTypeContext sampleType() {
			return getRuleContext(SampleTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampledRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampledRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampledRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampledRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampledRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampledRelationContext sampledRelation() throws RecognitionException {
		SampledRelationContext _localctx = new SampledRelationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sampledRelation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			aliasedRelation();
			setState(850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(844);
				match(TABLESAMPLE);
				setState(845);
				sampleType();
				setState(846);
				match(T__1);
				setState(847);
				((SampledRelationContext)_localctx).percentage = expression();
				setState(848);
				match(T__2);
				}
				break;
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

	public static class SampleTypeContext extends ParserRuleContext {
		public TerminalNode BERNOULLI() { return getToken(SqlBaseParser.BERNOULLI, 0); }
		public TerminalNode SYSTEM() { return getToken(SqlBaseParser.SYSTEM, 0); }
		public SampleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleTypeContext sampleType() throws RecognitionException {
		SampleTypeContext _localctx = new SampleTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sampleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			_la = _input.LA(1);
			if ( !(_la==BERNOULLI || _la==SYSTEM) ) {
			_errHandler.recoverInline(this);
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

	public static class AliasedRelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public AliasedRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasedRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasedRelationContext aliasedRelation() throws RecognitionException {
		AliasedRelationContext _localctx = new AliasedRelationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_aliasedRelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			relationPrimary();
			setState(862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(855);
					match(AS);
					}
				}

				setState(858);
				identifier();
				setState(860);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(859);
					columnAliases();
					}
					break;
				}
				}
				break;
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

	public static class ColumnAliasesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ColumnAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAliases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnAliases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnAliases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnAliases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAliasesContext columnAliases() throws RecognitionException {
		ColumnAliasesContext _localctx = new ColumnAliasesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_columnAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			match(T__1);
			setState(865);
			identifier();
			setState(870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(866);
				match(T__3);
				setState(867);
				identifier();
				}
				}
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(873);
			match(T__2);
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

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryRelationContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public ParenthesizedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnestContext extends RelationPrimaryContext {
		public TerminalNode UNNEST() { return getToken(SqlBaseParser.UNNEST, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode ORDINALITY() { return getToken(SqlBaseParser.ORDINALITY, 0); }
		public UnnestContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnnest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnnest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnnest(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LateralContext extends RelationPrimaryContext {
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public LateralContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLateral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLateral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLateral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_relationPrimary);
		int _la;
		try {
			setState(904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(875);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new SubqueryRelationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(876);
				match(T__1);
				setState(877);
				query();
				setState(878);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new UnnestContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(880);
				match(UNNEST);
				setState(881);
				match(T__1);
				setState(882);
				expression();
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(883);
					match(T__3);
					setState(884);
					expression();
					}
					}
					setState(889);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(890);
				match(T__2);
				setState(893);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(891);
					match(WITH);
					setState(892);
					match(ORDINALITY);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new LateralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(895);
				match(LATERAL);
				setState(896);
				match(T__1);
				setState(897);
				query();
				setState(898);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new ParenthesizedRelationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(900);
				match(T__1);
				setState(901);
				relation(0);
				setState(902);
				match(T__2);
				}
				break;
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
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			booleanExpression(0);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanDefaultContext extends BooleanExpressionContext {
		public PredicatedContext predicated() {
			return getRuleContext(PredicatedContext.class,0);
		}
		public BooleanDefaultContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__4:
			case ADD:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CASE:
			case CAST:
			case CATALOGS:
			case COALESCE:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case DATA:
			case DATE:
			case DAY:
			case DESC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXISTS:
			case EXPLAIN:
			case EXTRACT:
			case FALSE:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPING:
			case HOUR:
			case IF:
			case INCLUDING:
			case INPUT:
			case INTEGER:
			case INTERVAL:
			case ISOLATION:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NORMALIZE:
			case NULL:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case PUBLIC:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESTRICT:
			case REVOKE:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SMALLINT:
			case SOME:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TINYINT:
			case TO:
			case TRANSACTION:
			case TRUE:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case PLUS:
			case MINUS:
			case STRING:
			case UNICODE_STRING:
			case BINARY_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case DOUBLE_PRECISION:
				{
				_localctx = new BooleanDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(909);
				predicated();
				}
				break;
			case NOT:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(910);
				match(NOT);
				setState(911);
				booleanExpression(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(922);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(920);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(914);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(915);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(916);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(917);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(918);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(919);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(924);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
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

	public static class PredicatedContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicatedContext predicated() throws RecognitionException {
		PredicatedContext _localctx = new PredicatedContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_predicated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			((PredicatedContext)_localctx).valueExpression = valueExpression(0);
			setState(927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(926);
				predicate(((PredicatedContext)_localctx).valueExpression);
				}
				break;
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

	public static class PredicateContext extends ParserRuleContext {
		public ParserRuleContext value;
		public PredicateContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PredicateContext(ParserRuleContext parent, int invokingState, ParserRuleContext value) {
			super(parent, invokingState);
			this.value = value;
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class ComparisonContext extends PredicateContext {
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ComparisonContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LikeContext extends PredicateContext {
		public ValueExpressionContext pattern;
		public ValueExpressionContext escape;
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public LikeContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InSubqueryContext extends PredicateContext {
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public InSubqueryContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DistinctFromContext extends PredicateContext {
		public ValueExpressionContext right;
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public DistinctFromContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDistinctFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDistinctFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDistinctFrom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InListContext extends PredicateContext {
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public InListContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullPredicateContext extends PredicateContext {
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public NullPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BetweenContext extends PredicateContext {
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BetweenContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBetween(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuantifiedComparisonContext extends PredicateContext {
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ComparisonQuantifierContext comparisonQuantifier() {
			return getRuleContext(ComparisonQuantifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public QuantifiedComparisonContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuantifiedComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuantifiedComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuantifiedComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate(ParserRuleContext value) throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState(), value);
		enterRule(_localctx, 66, RULE_predicate);
		int _la;
		try {
			setState(990);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				_localctx = new ComparisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(929);
				comparisonOperator();
				setState(930);
				((ComparisonContext)_localctx).right = valueExpression(0);
				}
				break;
			case 2:
				_localctx = new QuantifiedComparisonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(932);
				comparisonOperator();
				setState(933);
				comparisonQuantifier();
				setState(934);
				match(T__1);
				setState(935);
				query();
				setState(936);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new BetweenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(938);
					match(NOT);
					}
				}

				setState(941);
				match(BETWEEN);
				setState(942);
				((BetweenContext)_localctx).lower = valueExpression(0);
				setState(943);
				match(AND);
				setState(944);
				((BetweenContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 4:
				_localctx = new InListContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(946);
					match(NOT);
					}
				}

				setState(949);
				match(IN);
				setState(950);
				match(T__1);
				setState(951);
				expression();
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(952);
					match(T__3);
					setState(953);
					expression();
					}
					}
					setState(958);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(959);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new InSubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(961);
					match(NOT);
					}
				}

				setState(964);
				match(IN);
				setState(965);
				match(T__1);
				setState(966);
				query();
				setState(967);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new LikeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(969);
					match(NOT);
					}
				}

				setState(972);
				match(LIKE);
				setState(973);
				((LikeContext)_localctx).pattern = valueExpression(0);
				setState(976);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(974);
					match(ESCAPE);
					setState(975);
					((LikeContext)_localctx).escape = valueExpression(0);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new NullPredicateContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(978);
				match(IS);
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(979);
					match(NOT);
					}
				}

				setState(982);
				match(NULL);
				}
				break;
			case 8:
				_localctx = new DistinctFromContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(983);
				match(IS);
				setState(985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(984);
					match(NOT);
					}
				}

				setState(987);
				match(DISTINCT);
				setState(988);
				match(FROM);
				setState(989);
				((DistinctFromContext)_localctx).right = valueExpression(0);
				}
				break;
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

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatenationContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public TerminalNode CONCAT() { return getToken(SqlBaseParser.CONCAT, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ConcatenationContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConcatenation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConcatenation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConcatenation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtTimeZoneContext extends ValueExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TimeZoneSpecifierContext timeZoneSpecifier() {
			return getRuleContext(TimeZoneSpecifierContext.class,0);
		}
		public AtTimeZoneContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAtTimeZone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAtTimeZone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAtTimeZone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__4:
			case ADD:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CASE:
			case CAST:
			case CATALOGS:
			case COALESCE:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case DATA:
			case DATE:
			case DAY:
			case DESC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXISTS:
			case EXPLAIN:
			case EXTRACT:
			case FALSE:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPING:
			case HOUR:
			case IF:
			case INCLUDING:
			case INPUT:
			case INTEGER:
			case INTERVAL:
			case ISOLATION:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NORMALIZE:
			case NULL:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case PUBLIC:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESTRICT:
			case REVOKE:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SMALLINT:
			case SOME:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TINYINT:
			case TO:
			case TRANSACTION:
			case TRUE:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case STRING:
			case UNICODE_STRING:
			case BINARY_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case DOUBLE_PRECISION:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(993);
				primaryExpression(0);
				}
				break;
			case PLUS:
			case MINUS:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(994);
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
				setState(995);
				valueExpression(4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1012);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1010);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(998);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(999);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (ASTERISK - 198)) | (1L << (SLASH - 198)) | (1L << (PERCENT - 198)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1000);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1001);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1002);
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
						setState(1003);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 3:
						{
						_localctx = new ConcatenationContext(new ValueExpressionContext(_parentctx, _parentState));
						((ConcatenationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1004);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1005);
						match(CONCAT);
						setState(1006);
						((ConcatenationContext)_localctx).right = valueExpression(2);
						}
						break;
					case 4:
						{
						_localctx = new AtTimeZoneContext(new ValueExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1007);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1008);
						match(AT);
						setState(1009);
						timeZoneSpecifier();
						}
						break;
					}
					} 
				}
				setState(1014);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode DOUBLE_PRECISION() { return getToken(SqlBaseParser.DOUBLE_PRECISION, 0); }
		public TypeConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecialDateTimeFunctionContext extends PrimaryExpressionContext {
		public Token name;
		public Token precision;
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode LOCALTIME() { return getToken(SqlBaseParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(SqlBaseParser.LOCALTIMESTAMP, 0); }
		public SpecialDateTimeFunctionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSpecialDateTimeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSpecialDateTimeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSpecialDateTimeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstringContext extends PrimaryExpressionContext {
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParameterContext extends PrimaryExpressionContext {
		public ParameterContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalizeContext extends PrimaryExpressionContext {
		public TerminalNode NORMALIZE() { return getToken(SqlBaseParser.NORMALIZE, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public NormalFormContext normalForm() {
			return getRuleContext(NormalFormContext.class,0);
		}
		public NormalizeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNormalize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNormalize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNormalize(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends PrimaryExpressionContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends PrimaryExpressionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends PrimaryExpressionContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullLiteralContext extends PrimaryExpressionContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryLiteralContext extends PrimaryExpressionContext {
		public TerminalNode BINARY_LITERAL() { return getToken(SqlBaseParser.BINARY_LITERAL, 0); }
		public BinaryLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBinaryLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBinaryLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBinaryLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends PrimaryExpressionContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayConstructorContext extends PrimaryExpressionContext {
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArrayConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArrayConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArrayConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public OverContext over() {
			return getRuleContext(OverContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends PrimaryExpressionContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GroupingOperationContext extends PrimaryExpressionContext {
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public GroupingOperationContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				_localctx = new NullLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1016);
				match(NULL);
				}
				break;
			case 2:
				{
				_localctx = new IntervalLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1017);
				interval();
				}
				break;
			case 3:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1018);
				identifier();
				setState(1019);
				string();
				}
				break;
			case 4:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1021);
				match(DOUBLE_PRECISION);
				setState(1022);
				string();
				}
				break;
			case 5:
				{
				_localctx = new NumericLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1023);
				number();
				}
				break;
			case 6:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1024);
				booleanValue();
				}
				break;
			case 7:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1025);
				string();
				}
				break;
			case 8:
				{
				_localctx = new BinaryLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1026);
				match(BINARY_LITERAL);
				}
				break;
			case 9:
				{
				_localctx = new ParameterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1027);
				match(T__4);
				}
				break;
			case 10:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1028);
				match(POSITION);
				setState(1029);
				match(T__1);
				setState(1030);
				valueExpression(0);
				setState(1031);
				match(IN);
				setState(1032);
				valueExpression(0);
				setState(1033);
				match(T__2);
				}
				break;
			case 11:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1035);
				match(T__1);
				setState(1036);
				expression();
				setState(1039); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1037);
					match(T__3);
					setState(1038);
					expression();
					}
					}
					setState(1041); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(1043);
				match(T__2);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1045);
				match(ROW);
				setState(1046);
				match(T__1);
				setState(1047);
				expression();
				setState(1052);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1048);
					match(T__3);
					setState(1049);
					expression();
					}
					}
					setState(1054);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1055);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1057);
				qualifiedName();
				setState(1058);
				match(T__1);
				setState(1059);
				match(ASTERISK);
				setState(1060);
				match(T__2);
				setState(1062);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1061);
					filter();
					}
					break;
				}
				setState(1065);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1064);
					over();
					}
					break;
				}
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1067);
				qualifiedName();
				setState(1068);
				match(T__1);
				setState(1080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COALESCE) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXTRACT) | (1L << FALSE) | (1L << FILTER) | (1L << FIRST))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTEGER - 64)) | (1L << (INTERVAL - 64)) | (1L << (ISOLATION - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (ONLY - 64)) | (1L << (OPTION - 64)) | (1L << (ORDINALITY - 64)) | (1L << (OUTPUT - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (PARTITIONS - 64)) | (1L << (POSITION - 64)) | (1L << (PRECEDING - 64)) | (1L << (PRIVILEGES - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PROPERTIES - 128)) | (1L << (PUBLIC - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SMALLINT - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TINYINT - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNCOMMITTED - 128)) | (1L << (USE - 128)) | (1L << (VALIDATE - 128)) | (1L << (VERBOSE - 128)) | (1L << (VIEW - 128)) | (1L << (WORK - 128)) | (1L << (WRITE - 128)) | (1L << (YEAR - 128)) | (1L << (ZONE - 128)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (PLUS - 196)) | (1L << (MINUS - 196)) | (1L << (STRING - 196)) | (1L << (UNICODE_STRING - 196)) | (1L << (BINARY_LITERAL - 196)) | (1L << (INTEGER_VALUE - 196)) | (1L << (DECIMAL_VALUE - 196)) | (1L << (IDENTIFIER - 196)) | (1L << (DIGIT_IDENTIFIER - 196)) | (1L << (QUOTED_IDENTIFIER - 196)) | (1L << (BACKQUOTED_IDENTIFIER - 196)) | (1L << (DOUBLE_PRECISION - 196)))) != 0)) {
					{
					setState(1070);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
					case 1:
						{
						setState(1069);
						setQuantifier();
						}
						break;
					}
					setState(1072);
					expression();
					setState(1077);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1073);
						match(T__3);
						setState(1074);
						expression();
						}
						}
						setState(1079);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1082);
				match(T__2);
				setState(1084);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1083);
					filter();
					}
					break;
				}
				setState(1087);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1086);
					over();
					}
					break;
				}
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1089);
				identifier();
				setState(1090);
				match(T__5);
				setState(1091);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1093);
				match(T__1);
				setState(1094);
				identifier();
				setState(1099);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1095);
					match(T__3);
					setState(1096);
					identifier();
					}
					}
					setState(1101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1102);
				match(T__2);
				setState(1103);
				match(T__5);
				setState(1104);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1106);
				match(T__1);
				setState(1107);
				query();
				setState(1108);
				match(T__2);
				}
				break;
			case 18:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1110);
				match(EXISTS);
				setState(1111);
				match(T__1);
				setState(1112);
				query();
				setState(1113);
				match(T__2);
				}
				break;
			case 19:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1115);
				match(CASE);
				setState(1116);
				valueExpression(0);
				setState(1118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1117);
					whenClause();
					}
					}
					setState(1120); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1122);
					match(ELSE);
					setState(1123);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1126);
				match(END);
				}
				break;
			case 20:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1128);
				match(CASE);
				setState(1130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1129);
					whenClause();
					}
					}
					setState(1132); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1134);
					match(ELSE);
					setState(1135);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1138);
				match(END);
				}
				break;
			case 21:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1140);
				match(CAST);
				setState(1141);
				match(T__1);
				setState(1142);
				expression();
				setState(1143);
				match(AS);
				setState(1144);
				type(0);
				setState(1145);
				match(T__2);
				}
				break;
			case 22:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1147);
				match(TRY_CAST);
				setState(1148);
				match(T__1);
				setState(1149);
				expression();
				setState(1150);
				match(AS);
				setState(1151);
				type(0);
				setState(1152);
				match(T__2);
				}
				break;
			case 23:
				{
				_localctx = new ArrayConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1154);
				match(ARRAY);
				setState(1155);
				match(T__6);
				setState(1164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COALESCE) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXTRACT) | (1L << FALSE) | (1L << FILTER) | (1L << FIRST))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTEGER - 64)) | (1L << (INTERVAL - 64)) | (1L << (ISOLATION - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (ONLY - 64)) | (1L << (OPTION - 64)) | (1L << (ORDINALITY - 64)) | (1L << (OUTPUT - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (PARTITIONS - 64)) | (1L << (POSITION - 64)) | (1L << (PRECEDING - 64)) | (1L << (PRIVILEGES - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PROPERTIES - 128)) | (1L << (PUBLIC - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SMALLINT - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TINYINT - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNCOMMITTED - 128)) | (1L << (USE - 128)) | (1L << (VALIDATE - 128)) | (1L << (VERBOSE - 128)) | (1L << (VIEW - 128)) | (1L << (WORK - 128)) | (1L << (WRITE - 128)) | (1L << (YEAR - 128)) | (1L << (ZONE - 128)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (PLUS - 196)) | (1L << (MINUS - 196)) | (1L << (STRING - 196)) | (1L << (UNICODE_STRING - 196)) | (1L << (BINARY_LITERAL - 196)) | (1L << (INTEGER_VALUE - 196)) | (1L << (DECIMAL_VALUE - 196)) | (1L << (IDENTIFIER - 196)) | (1L << (DIGIT_IDENTIFIER - 196)) | (1L << (QUOTED_IDENTIFIER - 196)) | (1L << (BACKQUOTED_IDENTIFIER - 196)) | (1L << (DOUBLE_PRECISION - 196)))) != 0)) {
					{
					setState(1156);
					expression();
					setState(1161);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1157);
						match(T__3);
						setState(1158);
						expression();
						}
						}
						setState(1163);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1166);
				match(T__7);
				}
				break;
			case 24:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1167);
				identifier();
				}
				break;
			case 25:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1168);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_DATE);
				}
				break;
			case 26:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1169);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_TIME);
				setState(1173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1170);
					match(T__1);
					setState(1171);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1172);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 27:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1175);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_TIMESTAMP);
				setState(1179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1176);
					match(T__1);
					setState(1177);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1178);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 28:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1181);
				((SpecialDateTimeFunctionContext)_localctx).name = match(LOCALTIME);
				setState(1185);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1182);
					match(T__1);
					setState(1183);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1184);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 29:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1187);
				((SpecialDateTimeFunctionContext)_localctx).name = match(LOCALTIMESTAMP);
				setState(1191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1188);
					match(T__1);
					setState(1189);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1190);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 30:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1193);
				match(SUBSTRING);
				setState(1194);
				match(T__1);
				setState(1195);
				valueExpression(0);
				setState(1196);
				match(FROM);
				setState(1197);
				valueExpression(0);
				setState(1200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1198);
					match(FOR);
					setState(1199);
					valueExpression(0);
					}
				}

				setState(1202);
				match(T__2);
				}
				break;
			case 31:
				{
				_localctx = new NormalizeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1204);
				match(NORMALIZE);
				setState(1205);
				match(T__1);
				setState(1206);
				valueExpression(0);
				setState(1209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(1207);
					match(T__3);
					setState(1208);
					normalForm();
					}
				}

				setState(1211);
				match(T__2);
				}
				break;
			case 32:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1213);
				match(EXTRACT);
				setState(1214);
				match(T__1);
				setState(1215);
				identifier();
				setState(1216);
				match(FROM);
				setState(1217);
				valueExpression(0);
				setState(1218);
				match(T__2);
				}
				break;
			case 33:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1220);
				match(T__1);
				setState(1221);
				expression();
				setState(1222);
				match(T__2);
				}
				break;
			case 34:
				{
				_localctx = new GroupingOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1224);
				match(GROUPING);
				setState(1225);
				match(T__1);
				setState(1234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COALESCE) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXPLAIN) | (1L << FILTER) | (1L << FIRST))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTEGER - 64)) | (1L << (INTERVAL - 64)) | (1L << (ISOLATION - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (ONLY - 64)) | (1L << (OPTION - 64)) | (1L << (ORDINALITY - 64)) | (1L << (OUTPUT - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (PARTITIONS - 64)) | (1L << (POSITION - 64)) | (1L << (PRECEDING - 64)) | (1L << (PRIVILEGES - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PROPERTIES - 128)) | (1L << (PUBLIC - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SMALLINT - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TINYINT - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNCOMMITTED - 128)) | (1L << (USE - 128)) | (1L << (VALIDATE - 128)) | (1L << (VERBOSE - 128)) | (1L << (VIEW - 128)) | (1L << (WORK - 128)) | (1L << (WRITE - 128)) | (1L << (YEAR - 128)) | (1L << (ZONE - 128)))) != 0) || ((((_la - 207)) & ~0x3f) == 0 && ((1L << (_la - 207)) & ((1L << (IDENTIFIER - 207)) | (1L << (DIGIT_IDENTIFIER - 207)) | (1L << (QUOTED_IDENTIFIER - 207)) | (1L << (BACKQUOTED_IDENTIFIER - 207)))) != 0)) {
					{
					setState(1226);
					qualifiedName();
					setState(1231);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1227);
						match(T__3);
						setState(1228);
						qualifiedName();
						}
						}
						setState(1233);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1236);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1247);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1239);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1240);
						match(T__6);
						setState(1241);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(1242);
						match(T__7);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1244);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1245);
						match(T__0);
						setState(1246);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(1251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
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

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnicodeStringLiteralContext extends StringContext {
		public TerminalNode UNICODE_STRING() { return getToken(SqlBaseParser.UNICODE_STRING, 0); }
		public TerminalNode UESCAPE() { return getToken(SqlBaseParser.UESCAPE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public UnicodeStringLiteralContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnicodeStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnicodeStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnicodeStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BasicStringLiteralContext extends StringContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public BasicStringLiteralContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBasicStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBasicStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBasicStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_string);
		try {
			setState(1258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new BasicStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1252);
				match(STRING);
				}
				break;
			case UNICODE_STRING:
				_localctx = new UnicodeStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1253);
				match(UNICODE_STRING);
				setState(1256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1254);
					match(UESCAPE);
					setState(1255);
					match(STRING);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TimeZoneSpecifierContext extends ParserRuleContext {
		public TimeZoneSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeZoneSpecifier; }
	 
		public TimeZoneSpecifierContext() { }
		public void copyFrom(TimeZoneSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TimeZoneIntervalContext extends TimeZoneSpecifierContext {
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TimeZoneIntervalContext(TimeZoneSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTimeZoneInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTimeZoneInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTimeZoneInterval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimeZoneStringContext extends TimeZoneSpecifierContext {
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TimeZoneStringContext(TimeZoneSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTimeZoneString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTimeZoneString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTimeZoneString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeZoneSpecifierContext timeZoneSpecifier() throws RecognitionException {
		TimeZoneSpecifierContext _localctx = new TimeZoneSpecifierContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_timeZoneSpecifier);
		try {
			setState(1266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				_localctx = new TimeZoneIntervalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1260);
				match(TIME);
				setState(1261);
				match(ZONE);
				setState(1262);
				interval();
				}
				break;
			case 2:
				_localctx = new TimeZoneStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1263);
				match(TIME);
				setState(1264);
				match(ZONE);
				setState(1265);
				string();
				}
				break;
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			_la = _input.LA(1);
			if ( !(((((_la - 190)) & ~0x3f) == 0 && ((1L << (_la - 190)) & ((1L << (EQ - 190)) | (1L << (NEQ - 190)) | (1L << (LT - 190)) | (1L << (LTE - 190)) | (1L << (GT - 190)) | (1L << (GTE - 190)))) != 0)) ) {
			_errHandler.recoverInline(this);
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

	public static class ComparisonQuantifierContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public ComparisonQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonQuantifierContext comparisonQuantifier() throws RecognitionException {
		ComparisonQuantifierContext _localctx = new ComparisonQuantifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_comparisonQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
			_errHandler.recoverInline(this);
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

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
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

	public static class IntervalContext extends ParserRuleContext {
		public Token sign;
		public IntervalFieldContext from;
		public IntervalFieldContext to;
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			match(INTERVAL);
			setState(1276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1275);
				((IntervalContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((IntervalContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1278);
			string();
			setState(1279);
			((IntervalContext)_localctx).from = intervalField();
			setState(1282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1280);
				match(TO);
				setState(1281);
				((IntervalContext)_localctx).to = intervalField();
				}
				break;
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

	public static class IntervalFieldContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_intervalField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284);
			_la = _input.LA(1);
			if ( !(((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (DAY - 44)) | (1L << (HOUR - 44)) | (1L << (MINUTE - 44)) | (1L << (MONTH - 44)))) != 0) || _la==SECOND || _la==YEAR) ) {
			_errHandler.recoverInline(this);
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

	public static class NormalFormContext extends ParserRuleContext {
		public TerminalNode NFD() { return getToken(SqlBaseParser.NFD, 0); }
		public TerminalNode NFC() { return getToken(SqlBaseParser.NFC, 0); }
		public TerminalNode NFKD() { return getToken(SqlBaseParser.NFKD, 0); }
		public TerminalNode NFKC() { return getToken(SqlBaseParser.NFKC, 0); }
		public NormalFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalForm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNormalForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNormalForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNormalForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalFormContext normalForm() throws RecognitionException {
		NormalFormContext _localctx = new NormalFormContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_normalForm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			_la = _input.LA(1);
			if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (NFC - 103)) | (1L << (NFD - 103)) | (1L << (NFKC - 103)) | (1L << (NFKD - 103)))) != 0)) ) {
			_errHandler.recoverInline(this);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1289);
				match(ARRAY);
				setState(1290);
				match(LT);
				setState(1291);
				type(0);
				setState(1292);
				match(GT);
				}
				break;
			case 2:
				{
				setState(1294);
				match(MAP);
				setState(1295);
				match(LT);
				setState(1296);
				type(0);
				setState(1297);
				match(T__3);
				setState(1298);
				type(0);
				setState(1299);
				match(GT);
				}
				break;
			case 3:
				{
				setState(1301);
				match(ROW);
				setState(1302);
				match(T__1);
				setState(1303);
				identifier();
				setState(1304);
				type(0);
				setState(1311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1305);
					match(T__3);
					setState(1306);
					identifier();
					setState(1307);
					type(0);
					}
					}
					setState(1313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1314);
				match(T__2);
				}
				break;
			case 4:
				{
				setState(1316);
				baseType();
				setState(1328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1317);
					match(T__1);
					setState(1318);
					typeParameter();
					setState(1323);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1319);
						match(T__3);
						setState(1320);
						typeParameter();
						}
						}
						setState(1325);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1326);
					match(T__2);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(1332);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(1333);
					match(ARRAY);
					}
					} 
				}
				setState(1338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeParameter);
		try {
			setState(1341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1339);
				match(INTEGER_VALUE);
				}
				break;
			case ADD:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CATALOGS:
			case COALESCE:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DATA:
			case DATE:
			case DAY:
			case DESC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXPLAIN:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case INCLUDING:
			case INPUT:
			case INTEGER:
			case INTERVAL:
			case ISOLATION:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case PUBLIC:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESTRICT:
			case REVOKE:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SMALLINT:
			case SOME:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TINYINT:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case TIME_WITH_TIME_ZONE:
			case TIMESTAMP_WITH_TIME_ZONE:
			case DOUBLE_PRECISION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1340);
				type(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BaseTypeContext extends ParserRuleContext {
		public TerminalNode TIME_WITH_TIME_ZONE() { return getToken(SqlBaseParser.TIME_WITH_TIME_ZONE, 0); }
		public TerminalNode TIMESTAMP_WITH_TIME_ZONE() { return getToken(SqlBaseParser.TIMESTAMP_WITH_TIME_ZONE, 0); }
		public TerminalNode DOUBLE_PRECISION() { return getToken(SqlBaseParser.DOUBLE_PRECISION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBaseType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_baseType);
		try {
			setState(1347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIME_WITH_TIME_ZONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1343);
				match(TIME_WITH_TIME_ZONE);
				}
				break;
			case TIMESTAMP_WITH_TIME_ZONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1344);
				match(TIMESTAMP_WITH_TIME_ZONE);
				}
				break;
			case DOUBLE_PRECISION:
				enterOuterAlt(_localctx, 3);
				{
				setState(1345);
				match(DOUBLE_PRECISION);
				}
				break;
			case ADD:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CATALOGS:
			case COALESCE:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DATA:
			case DATE:
			case DAY:
			case DESC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXPLAIN:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case INCLUDING:
			case INPUT:
			case INTEGER:
			case INTERVAL:
			case ISOLATION:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case PUBLIC:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESTRICT:
			case REVOKE:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SMALLINT:
			case SOME:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TINYINT:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1346);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1349);
			match(WHEN);
			setState(1350);
			((WhenClauseContext)_localctx).condition = expression();
			setState(1351);
			match(THEN);
			setState(1352);
			((WhenClauseContext)_localctx).result = expression();
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

	public static class FilterContext extends ParserRuleContext {
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1354);
			match(FILTER);
			setState(1355);
			match(T__1);
			setState(1356);
			match(WHERE);
			setState(1357);
			booleanExpression(0);
			setState(1358);
			match(T__2);
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

	public static class OverContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_over; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OverContext over() throws RecognitionException {
		OverContext _localctx = new OverContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_over);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1360);
			match(OVER);
			setState(1361);
			match(T__1);
			setState(1372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1362);
				match(PARTITION);
				setState(1363);
				match(BY);
				setState(1364);
				((OverContext)_localctx).expression = expression();
				((OverContext)_localctx).partition.add(((OverContext)_localctx).expression);
				setState(1369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1365);
					match(T__3);
					setState(1366);
					((OverContext)_localctx).expression = expression();
					((OverContext)_localctx).partition.add(((OverContext)_localctx).expression);
					}
					}
					setState(1371);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1374);
				match(ORDER);
				setState(1375);
				match(BY);
				setState(1376);
				sortItem();
				setState(1381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1377);
					match(T__3);
					setState(1378);
					sortItem();
					}
					}
					setState(1383);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANGE || _la==ROWS) {
				{
				setState(1386);
				windowFrame();
				}
			}

			setState(1389);
			match(T__2);
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

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_windowFrame);
		try {
			setState(1407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1391);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1392);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1393);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1394);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1395);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1396);
				match(BETWEEN);
				setState(1397);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1398);
				match(AND);
				setState(1399);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1401);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1402);
				match(BETWEEN);
				setState(1403);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1404);
				match(AND);
				setState(1405);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
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

	public static class FrameBoundContext extends ParserRuleContext {
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
	 
		public FrameBoundContext() { }
		public void copyFrom(FrameBoundContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoundedFrameContext extends FrameBoundContext {
		public Token boundType;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public BoundedFrameContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBoundedFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBoundedFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBoundedFrame(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnboundedFrameContext extends FrameBoundContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public UnboundedFrameContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnboundedFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnboundedFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnboundedFrame(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentRowBoundContext extends FrameBoundContext {
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public CurrentRowBoundContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentRowBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentRowBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentRowBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_frameBound);
		int _la;
		try {
			setState(1418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				_localctx = new UnboundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1409);
				match(UNBOUNDED);
				setState(1410);
				((UnboundedFrameContext)_localctx).boundType = match(PRECEDING);
				}
				break;
			case 2:
				_localctx = new UnboundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1411);
				match(UNBOUNDED);
				setState(1412);
				((UnboundedFrameContext)_localctx).boundType = match(FOLLOWING);
				}
				break;
			case 3:
				_localctx = new CurrentRowBoundContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1413);
				match(CURRENT);
				setState(1414);
				match(ROW);
				}
				break;
			case 4:
				_localctx = new BoundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1415);
				expression();
				setState(1416);
				((BoundedFrameContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((BoundedFrameContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
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

	public static class ExplainOptionContext extends ParserRuleContext {
		public ExplainOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explainOption; }
	 
		public ExplainOptionContext() { }
		public void copyFrom(ExplainOptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainFormatContext extends ExplainOptionContext {
		public Token value;
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode TEXT() { return getToken(SqlBaseParser.TEXT, 0); }
		public TerminalNode GRAPHVIZ() { return getToken(SqlBaseParser.GRAPHVIZ, 0); }
		public ExplainFormatContext(ExplainOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplainFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplainFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplainFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExplainTypeContext extends ExplainOptionContext {
		public Token value;
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(SqlBaseParser.DISTRIBUTED, 0); }
		public TerminalNode VALIDATE() { return getToken(SqlBaseParser.VALIDATE, 0); }
		public ExplainTypeContext(ExplainOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplainType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplainType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplainType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplainOptionContext explainOption() throws RecognitionException {
		ExplainOptionContext _localctx = new ExplainOptionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_explainOption);
		int _la;
		try {
			setState(1424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORMAT:
				_localctx = new ExplainFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1420);
				match(FORMAT);
				setState(1421);
				((ExplainFormatContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==GRAPHVIZ || _la==TEXT) ) {
					((ExplainFormatContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TYPE:
				_localctx = new ExplainTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1422);
				match(TYPE);
				setState(1423);
				((ExplainTypeContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DISTRIBUTED || _la==LOGICAL || _la==VALIDATE) ) {
					((ExplainTypeContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TransactionModeContext extends ParserRuleContext {
		public TransactionModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionMode; }
	 
		public TransactionModeContext() { }
		public void copyFrom(TransactionModeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TransactionAccessModeContext extends TransactionModeContext {
		public Token accessMode;
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode WRITE() { return getToken(SqlBaseParser.WRITE, 0); }
		public TransactionAccessModeContext(TransactionModeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransactionAccessMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransactionAccessMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransactionAccessMode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsolationLevelContext extends TransactionModeContext {
		public TerminalNode ISOLATION() { return getToken(SqlBaseParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(SqlBaseParser.LEVEL, 0); }
		public LevelOfIsolationContext levelOfIsolation() {
			return getRuleContext(LevelOfIsolationContext.class,0);
		}
		public IsolationLevelContext(TransactionModeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIsolationLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIsolationLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIsolationLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransactionModeContext transactionMode() throws RecognitionException {
		TransactionModeContext _localctx = new TransactionModeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_transactionMode);
		int _la;
		try {
			setState(1431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ISOLATION:
				_localctx = new IsolationLevelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1426);
				match(ISOLATION);
				setState(1427);
				match(LEVEL);
				setState(1428);
				levelOfIsolation();
				}
				break;
			case READ:
				_localctx = new TransactionAccessModeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1429);
				match(READ);
				setState(1430);
				((TransactionAccessModeContext)_localctx).accessMode = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ONLY || _la==WRITE) ) {
					((TransactionAccessModeContext)_localctx).accessMode = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LevelOfIsolationContext extends ParserRuleContext {
		public LevelOfIsolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelOfIsolation; }
	 
		public LevelOfIsolationContext() { }
		public void copyFrom(LevelOfIsolationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadUncommittedContext extends LevelOfIsolationContext {
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(SqlBaseParser.UNCOMMITTED, 0); }
		public ReadUncommittedContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReadUncommitted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReadUncommitted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReadUncommitted(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SerializableContext extends LevelOfIsolationContext {
		public TerminalNode SERIALIZABLE() { return getToken(SqlBaseParser.SERIALIZABLE, 0); }
		public SerializableContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSerializable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSerializable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSerializable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadCommittedContext extends LevelOfIsolationContext {
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode COMMITTED() { return getToken(SqlBaseParser.COMMITTED, 0); }
		public ReadCommittedContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReadCommitted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReadCommitted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReadCommitted(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeatableReadContext extends LevelOfIsolationContext {
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public RepeatableReadContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRepeatableRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRepeatableRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRepeatableRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelOfIsolationContext levelOfIsolation() throws RecognitionException {
		LevelOfIsolationContext _localctx = new LevelOfIsolationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_levelOfIsolation);
		try {
			setState(1440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				_localctx = new ReadUncommittedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1433);
				match(READ);
				setState(1434);
				match(UNCOMMITTED);
				}
				break;
			case 2:
				_localctx = new ReadCommittedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1435);
				match(READ);
				setState(1436);
				match(COMMITTED);
				}
				break;
			case 3:
				_localctx = new RepeatableReadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1437);
				match(REPEATABLE);
				setState(1438);
				match(READ);
				}
				break;
			case 4:
				_localctx = new SerializableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1439);
				match(SERIALIZABLE);
				}
				break;
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

	public static class CallArgumentContext extends ParserRuleContext {
		public CallArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgument; }
	 
		public CallArgumentContext() { }
		public void copyFrom(CallArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PositionalArgumentContext extends CallArgumentContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PositionalArgumentContext(CallArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPositionalArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPositionalArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPositionalArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedArgumentContext extends CallArgumentContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext(CallArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgumentContext callArgument() throws RecognitionException {
		CallArgumentContext _localctx = new CallArgumentContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_callArgument);
		try {
			setState(1447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				_localctx = new PositionalArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1442);
				expression();
				}
				break;
			case 2:
				_localctx = new NamedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1443);
				identifier();
				setState(1444);
				match(T__8);
				setState(1445);
				expression();
				}
				break;
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

	public static class PrivilegeContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilege; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrivilege(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrivilege(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegeContext privilege() throws RecognitionException {
		PrivilegeContext _localctx = new PrivilegeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_privilege);
		try {
			setState(1453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1449);
				match(SELECT);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1450);
				match(DELETE);
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1451);
				match(INSERT);
				}
				break;
			case ADD:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CATALOGS:
			case COALESCE:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DATA:
			case DATE:
			case DAY:
			case DESC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXPLAIN:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case INCLUDING:
			case INPUT:
			case INTEGER:
			case INTERVAL:
			case ISOLATION:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case PUBLIC:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESTRICT:
			case REVOKE:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SMALLINT:
			case SOME:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TINYINT:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1452);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1455);
			identifier();
			setState(1460);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1456);
					match(T__0);
					setState(1457);
					identifier();
					}
					} 
				}
				setState(1462);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
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

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BackQuotedIdentifierContext extends IdentifierContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public BackQuotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBackQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBackQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBackQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends IdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DigitIdentifierContext extends IdentifierContext {
		public TerminalNode DIGIT_IDENTIFIER() { return getToken(SqlBaseParser.DIGIT_IDENTIFIER, 0); }
		public DigitIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDigitIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDigitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDigitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends IdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_identifier);
		try {
			setState(1468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1463);
				match(IDENTIFIER);
				}
				break;
			case QUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1464);
				quotedIdentifier();
				}
				break;
			case ADD:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CATALOGS:
			case COALESCE:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DATA:
			case DATE:
			case DAY:
			case DESC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXPLAIN:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case INCLUDING:
			case INPUT:
			case INTEGER:
			case INTERVAL:
			case ISOLATION:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case PUBLIC:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESTRICT:
			case REVOKE:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SMALLINT:
			case SOME:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TINYINT:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1465);
				nonReserved();
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new BackQuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1466);
				match(BACKQUOTED_IDENTIFIER);
				}
				break;
			case DIGIT_IDENTIFIER:
				_localctx = new DigitIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1467);
				match(DIGIT_IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(SqlBaseParser.QUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1470);
			match(QUOTED_IDENTIFIER);
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_number);
		try {
			setState(1474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_VALUE:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1472);
				match(DECIMAL_VALUE);
				}
				break;
			case INTEGER_VALUE:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1473);
				match(INTEGER_VALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode BERNOULLI() { return getToken(SqlBaseParser.BERNOULLI, 0); }
		public TerminalNode CALL() { return getToken(SqlBaseParser.CALL, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode COALESCE() { return getToken(SqlBaseParser.COALESCE, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMMITTED() { return getToken(SqlBaseParser.COMMITTED, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATE() { return getToken(SqlBaseParser.DATE, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(SqlBaseParser.DISTRIBUTED, 0); }
		public TerminalNode EXCLUDING() { return getToken(SqlBaseParser.EXCLUDING, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode GRANTS() { return getToken(SqlBaseParser.GRANTS, 0); }
		public TerminalNode GRAPHVIZ() { return getToken(SqlBaseParser.GRAPHVIZ, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode INCLUDING() { return getToken(SqlBaseParser.INCLUDING, 0); }
		public TerminalNode INPUT() { return getToken(SqlBaseParser.INPUT, 0); }
		public TerminalNode INTEGER() { return getToken(SqlBaseParser.INTEGER, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode ISOLATION() { return getToken(SqlBaseParser.ISOLATION, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode LEVEL() { return getToken(SqlBaseParser.LEVEL, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode NFC() { return getToken(SqlBaseParser.NFC, 0); }
		public TerminalNode NFD() { return getToken(SqlBaseParser.NFD, 0); }
		public TerminalNode NFKC() { return getToken(SqlBaseParser.NFKC, 0); }
		public TerminalNode NFKD() { return getToken(SqlBaseParser.NFKD, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NULLIF() { return getToken(SqlBaseParser.NULLIF, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode ORDINALITY() { return getToken(SqlBaseParser.ORDINALITY, 0); }
		public TerminalNode OUTPUT() { return getToken(SqlBaseParser.OUTPUT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PUBLIC() { return getToken(SqlBaseParser.PUBLIC, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(SqlBaseParser.SERIALIZABLE, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SMALLINT() { return getToken(SqlBaseParser.SMALLINT, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATS() { return getToken(SqlBaseParser.STATS, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYSTEM() { return getToken(SqlBaseParser.SYSTEM, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TEXT() { return getToken(SqlBaseParser.TEXT, 0); }
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode TINYINT() { return getToken(SqlBaseParser.TINYINT, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(SqlBaseParser.UNCOMMITTED, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode VALIDATE() { return getToken(SqlBaseParser.VALIDATE, 0); }
		public TerminalNode VERBOSE() { return getToken(SqlBaseParser.VERBOSE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode WORK() { return getToken(SqlBaseParser.WORK, 0); }
		public TerminalNode WRITE() { return getToken(SqlBaseParser.WRITE, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COALESCE) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXPLAIN) | (1L << FILTER) | (1L << FIRST))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTEGER - 64)) | (1L << (INTERVAL - 64)) | (1L << (ISOLATION - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (ONLY - 64)) | (1L << (OPTION - 64)) | (1L << (ORDINALITY - 64)) | (1L << (OUTPUT - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (PARTITIONS - 64)) | (1L << (POSITION - 64)) | (1L << (PRECEDING - 64)) | (1L << (PRIVILEGES - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PROPERTIES - 128)) | (1L << (PUBLIC - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SMALLINT - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TINYINT - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNCOMMITTED - 128)) | (1L << (USE - 128)) | (1L << (VALIDATE - 128)) | (1L << (VERBOSE - 128)) | (1L << (VIEW - 128)) | (1L << (WORK - 128)) | (1L << (WRITE - 128)) | (1L << (YEAR - 128)) | (1L << (ZONE - 128)))) != 0)) ) {
			_errHandler.recoverInline(this);
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
		case 11:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 22:
			return relation_sempred((RelationContext)_localctx, predIndex);
		case 31:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 34:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 35:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 44:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relation_sempred(RelationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		case 8:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 13);
		case 10:
			return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00dc\u05c9\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4\u0092\n\4\3\4\3\4\3\4\5\4\u0097\n\4\3\4\3\4\3\4"+
		"\3\4\5\4\u009d\n\4\3\4\3\4\5\4\u00a1\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4\u00af\n\4\3\4\3\4\5\4\u00b3\n\4\3\4\3\4\5\4\u00b7"+
		"\n\4\3\4\3\4\5\4\u00bb\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00c3\n\4\3\4\3"+
		"\4\5\4\u00c7\n\4\3\4\5\4\u00ca\n\4\3\4\3\4\3\4\3\4\3\4\5\4\u00d1\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\7\4\u00d8\n\4\f\4\16\4\u00db\13\4\3\4\3\4\3\4\5\4\u00e0"+
		"\n\4\3\4\3\4\5\4\u00e4\n\4\3\4\3\4\3\4\3\4\5\4\u00ea\n\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4\u00f1\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00fa\n\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u011d\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0128\n\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\7\4\u0131\n\4\f\4\16\4\u0134\13\4\5\4\u0136\n\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\7\4\u013e\n\4\f\4\16\4\u0141\13\4\3\4\3\4\5\4\u0145\n\4\3\4\3"+
		"\4\5\4\u0149\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0151\n\4\3\4\3\4\3\4\3\4"+
		"\5\4\u0157\n\4\3\4\3\4\3\4\7\4\u015c\n\4\f\4\16\4\u015f\13\4\3\4\3\4\5"+
		"\4\u0163\n\4\3\4\3\4\5\4\u0167\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\u0171\n\4\3\4\5\4\u0174\n\4\3\4\3\4\5\4\u0178\n\4\3\4\5\4\u017b\n\4\3"+
		"\4\3\4\3\4\3\4\7\4\u0181\n\4\f\4\16\4\u0184\13\4\3\4\3\4\5\4\u0188\n\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0197\n\4\3\4"+
		"\3\4\5\4\u019b\n\4\3\4\3\4\3\4\3\4\5\4\u01a1\n\4\3\4\3\4\5\4\u01a5\n\4"+
		"\3\4\3\4\3\4\3\4\5\4\u01ab\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u01d2\n\4\f\4\16\4\u01d5\13"+
		"\4\5\4\u01d7\n\4\3\4\3\4\5\4\u01db\n\4\3\4\3\4\5\4\u01df\n\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4\u01e7\n\4\3\4\3\4\3\4\3\4\3\4\7\4\u01ee\n\4\f\4\16"+
		"\4\u01f1\13\4\5\4\u01f3\n\4\3\4\3\4\5\4\u01f7\n\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0207\n\4\f\4\16\4\u020a\13\4"+
		"\5\4\u020c\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0214\n\4\3\5\5\5\u0217\n\5"+
		"\3\5\3\5\3\6\3\6\5\6\u021d\n\6\3\6\3\6\3\6\7\6\u0222\n\6\f\6\16\6\u0225"+
		"\13\6\3\7\3\7\5\7\u0229\n\7\3\b\3\b\3\b\3\b\5\b\u022f\n\b\3\t\3\t\3\t"+
		"\3\t\5\t\u0235\n\t\3\n\3\n\3\n\3\n\7\n\u023b\n\n\f\n\16\n\u023e\13\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u024c\n\f\f\f\16"+
		"\f\u024f\13\f\5\f\u0251\n\f\3\f\3\f\5\f\u0255\n\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u025d\n\r\3\r\3\r\3\r\3\r\5\r\u0263\n\r\3\r\7\r\u0266\n\r\f\r"+
		"\16\r\u0269\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0272\n\16\f"+
		"\16\16\16\u0275\13\16\3\16\3\16\3\16\3\16\5\16\u027b\n\16\3\17\3\17\5"+
		"\17\u027f\n\17\3\17\3\17\5\17\u0283\n\17\3\20\3\20\5\20\u0287\n\20\3\20"+
		"\3\20\3\20\7\20\u028c\n\20\f\20\16\20\u028f\13\20\3\20\3\20\3\20\3\20"+
		"\7\20\u0295\n\20\f\20\16\20\u0298\13\20\5\20\u029a\n\20\3\20\3\20\5\20"+
		"\u029e\n\20\3\20\3\20\3\20\5\20\u02a3\n\20\3\20\3\20\5\20\u02a7\n\20\3"+
		"\21\5\21\u02aa\n\21\3\21\3\21\3\21\7\21\u02af\n\21\f\21\16\21\u02b2\13"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u02ba\n\22\f\22\16\22\u02bd\13"+
		"\22\5\22\u02bf\n\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u02c7\n\22\f\22"+
		"\16\22\u02ca\13\22\5\22\u02cc\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u02d5\n\22\f\22\16\22\u02d8\13\22\3\22\3\22\5\22\u02dc\n\22\3\23"+
		"\3\23\3\23\3\23\7\23\u02e2\n\23\f\23\16\23\u02e5\13\23\5\23\u02e7\n\23"+
		"\3\23\3\23\5\23\u02eb\n\23\3\24\3\24\3\24\3\24\7\24\u02f1\n\24\f\24\16"+
		"\24\u02f4\13\24\5\24\u02f6\n\24\3\24\3\24\5\24\u02fa\n\24\3\25\3\25\5"+
		"\25\u02fe\n\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\5\27\u0309"+
		"\n\27\3\27\5\27\u030c\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u0313\n\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\5\30\u0326\n\30\7\30\u0328\n\30\f\30\16\30\u032b\13\30\3"+
		"\31\5\31\u032e\n\31\3\31\3\31\5\31\u0332\n\31\3\31\3\31\5\31\u0336\n\31"+
		"\3\31\3\31\5\31\u033a\n\31\5\31\u033c\n\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\7\32\u0345\n\32\f\32\16\32\u0348\13\32\3\32\3\32\5\32\u034c\n"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0355\n\33\3\34\3\34\3\35"+
		"\3\35\5\35\u035b\n\35\3\35\3\35\5\35\u035f\n\35\5\35\u0361\n\35\3\36\3"+
		"\36\3\36\3\36\7\36\u0367\n\36\f\36\16\36\u036a\13\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0378\n\37\f\37\16\37"+
		"\u037b\13\37\3\37\3\37\3\37\5\37\u0380\n\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\5\37\u038b\n\37\3 \3 \3!\3!\3!\3!\5!\u0393\n!\3!\3"+
		"!\3!\3!\3!\3!\7!\u039b\n!\f!\16!\u039e\13!\3\"\3\"\5\"\u03a2\n\"\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u03ae\n#\3#\3#\3#\3#\3#\3#\5#\u03b6\n#\3"+
		"#\3#\3#\3#\3#\7#\u03bd\n#\f#\16#\u03c0\13#\3#\3#\3#\5#\u03c5\n#\3#\3#"+
		"\3#\3#\3#\3#\5#\u03cd\n#\3#\3#\3#\3#\5#\u03d3\n#\3#\3#\5#\u03d7\n#\3#"+
		"\3#\3#\5#\u03dc\n#\3#\3#\3#\5#\u03e1\n#\3$\3$\3$\3$\5$\u03e7\n$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u03f5\n$\f$\16$\u03f8\13$\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\6%\u0412"+
		"\n%\r%\16%\u0413\3%\3%\3%\3%\3%\3%\3%\7%\u041d\n%\f%\16%\u0420\13%\3%"+
		"\3%\3%\3%\3%\3%\3%\5%\u0429\n%\3%\5%\u042c\n%\3%\3%\3%\5%\u0431\n%\3%"+
		"\3%\3%\7%\u0436\n%\f%\16%\u0439\13%\5%\u043b\n%\3%\3%\5%\u043f\n%\3%\5"+
		"%\u0442\n%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u044c\n%\f%\16%\u044f\13%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\6%\u0461\n%\r%\16%\u0462\3"+
		"%\3%\5%\u0467\n%\3%\3%\3%\3%\6%\u046d\n%\r%\16%\u046e\3%\3%\5%\u0473\n"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u048a"+
		"\n%\f%\16%\u048d\13%\5%\u048f\n%\3%\3%\3%\3%\3%\3%\3%\5%\u0498\n%\3%\3"+
		"%\3%\3%\5%\u049e\n%\3%\3%\3%\3%\5%\u04a4\n%\3%\3%\3%\3%\5%\u04aa\n%\3"+
		"%\3%\3%\3%\3%\3%\3%\5%\u04b3\n%\3%\3%\3%\3%\3%\3%\3%\5%\u04bc\n%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u04d0\n%\f%\16%\u04d3"+
		"\13%\5%\u04d5\n%\3%\5%\u04d8\n%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u04e2\n%\f"+
		"%\16%\u04e5\13%\3&\3&\3&\3&\5&\u04eb\n&\5&\u04ed\n&\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\5\'\u04f5\n\'\3(\3(\3)\3)\3*\3*\3+\3+\5+\u04ff\n+\3+\3+\3+\3+\5"+
		"+\u0505\n+\3,\3,\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\7.\u0520\n.\f.\16.\u0523\13.\3.\3.\3.\3.\3.\3.\3.\7."+
		"\u052c\n.\f.\16.\u052f\13.\3.\3.\5.\u0533\n.\5.\u0535\n.\3.\3.\7.\u0539"+
		"\n.\f.\16.\u053c\13.\3/\3/\5/\u0540\n/\3\60\3\60\3\60\3\60\5\60\u0546"+
		"\n\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\7\63\u055a\n\63\f\63\16\63\u055d\13\63\5\63"+
		"\u055f\n\63\3\63\3\63\3\63\3\63\3\63\7\63\u0566\n\63\f\63\16\63\u0569"+
		"\13\63\5\63\u056b\n\63\3\63\5\63\u056e\n\63\3\63\3\63\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0582"+
		"\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u058d\n\65\3\66"+
		"\3\66\3\66\3\66\5\66\u0593\n\66\3\67\3\67\3\67\3\67\3\67\5\67\u059a\n"+
		"\67\38\38\38\38\38\38\38\58\u05a3\n8\39\39\39\39\39\59\u05aa\n9\3:\3:"+
		"\3:\3:\5:\u05b0\n:\3;\3;\3;\7;\u05b5\n;\f;\16;\u05b8\13;\3<\3<\3<\3<\3"+
		"<\5<\u05bf\n<\3=\3=\3>\3>\5>\u05c5\n>\3?\3?\3?\2\b\30.@FHZ@\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|\2\30\4\2\32\32\u008b\u008b\4\2EEPP\4\2CCss\4\2\r\r\u00cf"+
		"\u00cf\4\2::QQ\4\299\u00b1\u00b1\4\2\24\24\61\61\4\2AA\\\\\4\2\r\r\63"+
		"\63\4\2\26\26\u00a0\u00a0\3\2\u00c6\u00c7\3\2\u00c8\u00ca\3\2\u00c0\u00c5"+
		"\5\2\r\r\21\21\u009c\u009c\4\2??\u00ab\u00ab\7\2..NNfg\u0094\u0094\u00be"+
		"\u00be\3\2il\4\2BB\177\177\4\2JJ\u00a4\u00a4\5\2\64\64dd\u00b5\u00b5\4"+
		"\2tt\u00bd\u00bd-\2\f\r\17\17\21\22\24\26\31\32\35#((,.\61\61\64\64::"+
		"==@BDDGJNOQQSSUUWWZZ\\]__aadgimqrtuxxz\177\u0081\u0085\u0087\u008c\u008e"+
		"\u008e\u0090\u0094\u0096\u00a0\u00a2\u00a4\u00a6\u00aa\u00ac\u00ad\u00af"+
		"\u00b0\u00b3\u00b3\u00b5\u00b5\u00b7\u00b8\u00bc\u00bf\u06ad\2~\3\2\2"+
		"\2\4\u0081\3\2\2\2\6\u0213\3\2\2\2\b\u0216\3\2\2\2\n\u021a\3\2\2\2\f\u0228"+
		"\3\2\2\2\16\u022a\3\2\2\2\20\u0230\3\2\2\2\22\u0236\3\2\2\2\24\u0241\3"+
		"\2\2\2\26\u0245\3\2\2\2\30\u0256\3\2\2\2\32\u027a\3\2\2\2\34\u027c\3\2"+
		"\2\2\36\u0284\3\2\2\2 \u02a9\3\2\2\2\"\u02db\3\2\2\2$\u02ea\3\2\2\2&\u02f9"+
		"\3\2\2\2(\u02fb\3\2\2\2*\u0304\3\2\2\2,\u0312\3\2\2\2.\u0314\3\2\2\2\60"+
		"\u033b\3\2\2\2\62\u034b\3\2\2\2\64\u034d\3\2\2\2\66\u0356\3\2\2\28\u0358"+
		"\3\2\2\2:\u0362\3\2\2\2<\u038a\3\2\2\2>\u038c\3\2\2\2@\u0392\3\2\2\2B"+
		"\u039f\3\2\2\2D\u03e0\3\2\2\2F\u03e6\3\2\2\2H\u04d7\3\2\2\2J\u04ec\3\2"+
		"\2\2L\u04f4\3\2\2\2N\u04f6\3\2\2\2P\u04f8\3\2\2\2R\u04fa\3\2\2\2T\u04fc"+
		"\3\2\2\2V\u0506\3\2\2\2X\u0508\3\2\2\2Z\u0534\3\2\2\2\\\u053f\3\2\2\2"+
		"^\u0545\3\2\2\2`\u0547\3\2\2\2b\u054c\3\2\2\2d\u0552\3\2\2\2f\u0581\3"+
		"\2\2\2h\u058c\3\2\2\2j\u0592\3\2\2\2l\u0599\3\2\2\2n\u05a2\3\2\2\2p\u05a9"+
		"\3\2\2\2r\u05af\3\2\2\2t\u05b1\3\2\2\2v\u05be\3\2\2\2x\u05c0\3\2\2\2z"+
		"\u05c4\3\2\2\2|\u05c6\3\2\2\2~\177\5\6\4\2\177\u0080\7\2\2\3\u0080\3\3"+
		"\2\2\2\u0081\u0082\5> \2\u0082\u0083\7\2\2\3\u0083\5\3\2\2\2\u0084\u0214"+
		"\5\b\5\2\u0085\u0086\7\u00b3\2\2\u0086\u0214\5v<\2\u0087\u0088\7\u00b3"+
		"\2\2\u0088\u0089\5v<\2\u0089\u008a\7\3\2\2\u008a\u008b\5v<\2\u008b\u0214"+
		"\3\2\2\2\u008c\u008d\7%\2\2\u008d\u0091\7\u0092\2\2\u008e\u008f\7O\2\2"+
		"\u008f\u0090\7o\2\2\u0090\u0092\7<\2\2\u0091\u008e\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0096\5t;\2\u0094\u0095\7\u00bb\2\2"+
		"\u0095\u0097\5\22\n\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0214"+
		"\3\2\2\2\u0098\u0099\7\65\2\2\u0099\u009c\7\u0092\2\2\u009a\u009b\7O\2"+
		"\2\u009b\u009d\7<\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u00a0\5t;\2\u009f\u00a1\t\2\2\2\u00a0\u009f\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u0214\3\2\2\2\u00a2\u00a3\7\16\2\2\u00a3\u00a4\7"+
		"\u0092\2\2\u00a4\u00a5\5t;\2\u00a5\u00a6\7\u0087\2\2\u00a6\u00a7\7\u00a9"+
		"\2\2\u00a7\u00a8\5v<\2\u00a8\u0214\3\2\2\2\u00a9\u00aa\7%\2\2\u00aa\u00ae"+
		"\7\u00a1\2\2\u00ab\u00ac\7O\2\2\u00ac\u00ad\7o\2\2\u00ad\u00af\7<\2\2"+
		"\u00ae\u00ab\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2"+
		"\5t;\2\u00b1\u00b3\5:\36\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b5\7!\2\2\u00b5\u00b7\5J&\2\u00b6\u00b4\3\2\2"+
		"\2\u00b6\u00b7\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b9\7\u00bb\2\2\u00b9"+
		"\u00bb\5\22\n\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3"+
		"\2\2\2\u00bc\u00c2\7\23\2\2\u00bd\u00c3\5\b\5\2\u00be\u00bf\7\4\2\2\u00bf"+
		"\u00c0\5\b\5\2\u00c0\u00c1\7\5\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00bd\3\2"+
		"\2\2\u00c2\u00be\3\2\2\2\u00c3\u00c9\3\2\2\2\u00c4\u00c6\7\u00bb\2\2\u00c5"+
		"\u00c7\7m\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00ca\7,\2\2\u00c9\u00c4\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u0214\3\2\2\2\u00cb\u00cc\7%\2\2\u00cc\u00d0\7\u00a1\2\2\u00cd\u00ce"+
		"\7O\2\2\u00ce\u00cf\7o\2\2\u00cf\u00d1\7<\2\2\u00d0\u00cd\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\5t;\2\u00d3\u00d4\7\4\2"+
		"\2\u00d4\u00d9\5\f\7\2\u00d5\u00d6\7\6\2\2\u00d6\u00d8\5\f\7\2\u00d7\u00d5"+
		"\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00df\7\5\2\2\u00dd\u00de\7!"+
		"\2\2\u00de\u00e0\5J&\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e3"+
		"\3\2\2\2\u00e1\u00e2\7\u00bb\2\2\u00e2\u00e4\5\22\n\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u0214\3\2\2\2\u00e5\u00e6\7\65\2\2\u00e6"+
		"\u00e9\7\u00a1\2\2\u00e7\u00e8\7O\2\2\u00e8\u00ea\7<\2\2\u00e9\u00e7\3"+
		"\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u0214\5t;\2\u00ec"+
		"\u00ed\7T\2\2\u00ed\u00ee\7X\2\2\u00ee\u00f0\5t;\2\u00ef\u00f1\5:\36\2"+
		"\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3"+
		"\5\b\5\2\u00f3\u0214\3\2\2\2\u00f4\u00f5\7\60\2\2\u00f5\u00f6\7E\2\2\u00f6"+
		"\u00f9\5t;\2\u00f7\u00f8\7\u00ba\2\2\u00f8\u00fa\5@!\2\u00f9\u00f7\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa\u0214\3\2\2\2\u00fb\u00fc\7\16\2\2\u00fc"+
		"\u00fd\7\u00a1\2\2\u00fd\u00fe\5t;\2\u00fe\u00ff\7\u0087\2\2\u00ff\u0100"+
		"\7\u00a9\2\2\u0100\u0101\5t;\2\u0101\u0214\3\2\2\2\u0102\u0103\7\16\2"+
		"\2\u0103\u0104\7\u00a1\2\2\u0104\u0105\5t;\2\u0105\u0106\7\u0087\2\2\u0106"+
		"\u0107\7\37\2\2\u0107\u0108\5v<\2\u0108\u0109\7\u00a9\2\2\u0109\u010a"+
		"\5v<\2\u010a\u0214\3\2\2\2\u010b\u010c\7\16\2\2\u010c\u010d\7\u00a1\2"+
		"\2\u010d\u010e\5t;\2\u010e\u010f\7\65\2\2\u010f\u0110\7\37\2\2\u0110\u0111"+
		"\5t;\2\u0111\u0214\3\2\2\2\u0112\u0113\7\16\2\2\u0113\u0114\7\u00a1\2"+
		"\2\u0114\u0115\5t;\2\u0115\u0116\7\f\2\2\u0116\u0117\7\37\2\2\u0117\u0118"+
		"\5\16\b\2\u0118\u0214\3\2\2\2\u0119\u011c\7%\2\2\u011a\u011b\7v\2\2\u011b"+
		"\u011d\7\u0089\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u011f\7\u00b8\2\2\u011f\u0120\5t;\2\u0120\u0121\7\23\2"+
		"\2\u0121\u0122\5\b\5\2\u0122\u0214\3\2\2\2\u0123\u0124\7\65\2\2\u0124"+
		"\u0127\7\u00b8\2\2\u0125\u0126\7O\2\2\u0126\u0128\7<\2\2\u0127\u0125\3"+
		"\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0214\5t;\2\u012a"+
		"\u012b\7\31\2\2\u012b\u012c\5t;\2\u012c\u0135\7\4\2\2\u012d\u0132\5p9"+
		"\2\u012e\u012f\7\6\2\2\u012f\u0131\5p9\2\u0130\u012e\3\2\2\2\u0131\u0134"+
		"\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0136\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0135\u012d\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u0138\7\5\2\2\u0138\u0214\3\2\2\2\u0139\u0144\7H\2\2\u013a"+
		"\u013f\5r:\2\u013b\u013c\7\6\2\2\u013c\u013e\5r:\2\u013d\u013b\3\2\2\2"+
		"\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0145"+
		"\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\7\r\2\2\u0143\u0145\7\u0081\2"+
		"\2\u0144\u013a\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148"+
		"\7s\2\2\u0147\u0149\7\u00a1\2\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2"+
		"\2\u0149\u014a\3\2\2\2\u014a\u014b\5t;\2\u014b\u014c\7\u00a9\2\2\u014c"+
		"\u0150\5v<\2\u014d\u014e\7\u00bb\2\2\u014e\u014f\7H\2\2\u014f\u0151\7"+
		"u\2\2\u0150\u014d\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0214\3\2\2\2\u0152"+
		"\u0156\7\u008c\2\2\u0153\u0154\7H\2\2\u0154\u0155\7u\2\2\u0155\u0157\7"+
		"C\2\2\u0156\u0153\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0162\3\2\2\2\u0158"+
		"\u015d\5r:\2\u0159\u015a\7\6\2\2\u015a\u015c\5r:\2\u015b\u0159\3\2\2\2"+
		"\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0163"+
		"\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\7\r\2\2\u0161\u0163\7\u0081\2"+
		"\2\u0162\u0158\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166"+
		"\7s\2\2\u0165\u0167\7\u00a1\2\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2"+
		"\2\u0167\u0168\3\2\2\2\u0168\u0169\5t;\2\u0169\u016a\7E\2\2\u016a\u016b"+
		"\5v<\2\u016b\u0214\3\2\2\2\u016c\u016d\7\u009a\2\2\u016d\u0173\7I\2\2"+
		"\u016e\u0170\7s\2\2\u016f\u0171\7\u00a1\2\2\u0170\u016f\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\5t;\2\u0173\u016e\3\2\2"+
		"\2\u0173\u0174\3\2\2\2\u0174\u0214\3\2\2\2\u0175\u0177\7=\2\2\u0176\u0178"+
		"\7\17\2\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2"+
		"\u0179\u017b\7\u00b7\2\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u0187\3\2\2\2\u017c\u017d\7\4\2\2\u017d\u0182\5j\66\2\u017e\u017f\7\6"+
		"\2\2\u017f\u0181\5j\66\2\u0180\u017e\3\2\2\2\u0181\u0184\3\2\2\2\u0182"+
		"\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2"+
		"\2\2\u0185\u0186\7\5\2\2\u0186\u0188\3\2\2\2\u0187\u017c\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u0214\5\6\4\2\u018a\u018b\7\u009a"+
		"\2\2\u018b\u018c\7%\2\2\u018c\u018d\7\u00a1\2\2\u018d\u0214\5t;\2\u018e"+
		"\u018f\7\u009a\2\2\u018f\u0190\7%\2\2\u0190\u0191\7\u00b8\2\2\u0191\u0214"+
		"\5t;\2\u0192\u0193\7\u009a\2\2\u0193\u0196\7\u00a2\2\2\u0194\u0195\t\3"+
		"\2\2\u0195\u0197\5t;\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u019a"+
		"\3\2\2\2\u0198\u0199\7`\2\2\u0199\u019b\5J&\2\u019a\u0198\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u0214\3\2\2\2\u019c\u019d\7\u009a\2\2\u019d\u01a0"+
		"\7\u0093\2\2\u019e\u019f\t\3\2\2\u019f\u01a1\5v<\2\u01a0\u019e\3\2\2\2"+
		"\u01a0\u01a1\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a3\7`\2\2\u01a3\u01a5"+
		"\5J&\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u0214\3\2\2\2\u01a6"+
		"\u01a7\7\u009a\2\2\u01a7\u01aa\7\35\2\2\u01a8\u01a9\7`\2\2\u01a9\u01ab"+
		"\5J&\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u0214\3\2\2\2\u01ac"+
		"\u01ad\7\u009a\2\2\u01ad\u01ae\7 \2\2\u01ae\u01af\t\3\2\2\u01af\u0214"+
		"\5t;\2\u01b0\u01b1\7\u009a\2\2\u01b1\u01b2\7\u009e\2\2\u01b2\u01b3\t\4"+
		"\2\2\u01b3\u0214\5t;\2\u01b4\u01b5\7\u009a\2\2\u01b5\u01b6\7\u009e\2\2"+
		"\u01b6\u01b7\7C\2\2\u01b7\u01b8\7\4\2\2\u01b8\u01b9\5\36\20\2\u01b9\u01ba"+
		"\7\5\2\2\u01ba\u0214\3\2\2\2\u01bb\u01bc\7\62\2\2\u01bc\u0214\5t;\2\u01bd"+
		"\u01be\7\61\2\2\u01be\u0214\5t;\2\u01bf\u01c0\7\u009a\2\2\u01c0\u0214"+
		"\7G\2\2\u01c1\u01c2\7\u009a\2\2\u01c2\u0214\7\u0097\2\2\u01c3\u01c4\7"+
		"\u0098\2\2\u01c4\u01c5\7\u0097\2\2\u01c5\u01c6\5t;\2\u01c6\u01c7\7\u00c0"+
		"\2\2\u01c7\u01c8\5> \2\u01c8\u0214\3\2\2\2\u01c9\u01ca\7\u008a\2\2\u01ca"+
		"\u01cb\7\u0097\2\2\u01cb\u0214\5t;\2\u01cc\u01cd\7\u009d\2\2\u01cd\u01d6"+
		"\7\u00aa\2\2\u01ce\u01d3\5l\67\2\u01cf\u01d0\7\6\2\2\u01d0\u01d2\5l\67"+
		"\2\u01d1\u01cf\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4"+
		"\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01ce\3\2\2\2\u01d6"+
		"\u01d7\3\2\2\2\u01d7\u0214\3\2\2\2\u01d8\u01da\7\"\2\2\u01d9\u01db\7\u00bc"+
		"\2\2\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u0214\3\2\2\2\u01dc"+
		"\u01de\7\u008e\2\2\u01dd\u01df\7\u00bc\2\2\u01de\u01dd\3\2\2\2\u01de\u01df"+
		"\3\2\2\2\u01df\u0214\3\2\2\2\u01e0\u01e1\7\u009a\2\2\u01e1\u01e2\7}\2"+
		"\2\u01e2\u01e3\t\3\2\2\u01e3\u01e6\5t;\2\u01e4\u01e5\7\u00ba\2\2\u01e5"+
		"\u01e7\5@!\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01f2\3\2\2"+
		"\2\u01e8\u01e9\7w\2\2\u01e9\u01ea\7\30\2\2\u01ea\u01ef\5\34\17\2\u01eb"+
		"\u01ec\7\6\2\2\u01ec\u01ee\5\34\17\2\u01ed\u01eb\3\2\2\2\u01ee\u01f1\3"+
		"\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1"+
		"\u01ef\3\2\2\2\u01f2\u01e8\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f6\3\2"+
		"\2\2\u01f4\u01f5\7a\2\2\u01f5\u01f7\t\5\2\2\u01f6\u01f4\3\2\2\2\u01f6"+
		"\u01f7\3\2\2\2\u01f7\u0214\3\2\2\2\u01f8\u01f9\7\u0080\2\2\u01f9\u01fa"+
		"\5v<\2\u01fa\u01fb\7E\2\2\u01fb\u01fc\5\6\4\2\u01fc\u0214\3\2\2\2\u01fd"+
		"\u01fe\7/\2\2\u01fe\u01ff\7\u0080\2\2\u01ff\u0214\5v<\2\u0200\u0201\7"+
		";\2\2\u0201\u020b\5v<\2\u0202\u0203\7\u00b4\2\2\u0203\u0208\5> \2\u0204"+
		"\u0205\7\6\2\2\u0205\u0207\5> \2\u0206\u0204\3\2\2\2\u0207\u020a\3\2\2"+
		"\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208"+
		"\3\2\2\2\u020b\u0202\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u0214\3\2\2\2\u020d"+
		"\u020e\7\62\2\2\u020e\u020f\7S\2\2\u020f\u0214\5v<\2\u0210\u0211\7\62"+
		"\2\2\u0211\u0212\7z\2\2\u0212\u0214\5v<\2\u0213\u0084\3\2\2\2\u0213\u0085"+
		"\3\2\2\2\u0213\u0087\3\2\2\2\u0213\u008c\3\2\2\2\u0213\u0098\3\2\2\2\u0213"+
		"\u00a2\3\2\2\2\u0213\u00a9\3\2\2\2\u0213\u00cb\3\2\2\2\u0213\u00e5\3\2"+
		"\2\2\u0213\u00ec\3\2\2\2\u0213\u00f4\3\2\2\2\u0213\u00fb\3\2\2\2\u0213"+
		"\u0102\3\2\2\2\u0213\u010b\3\2\2\2\u0213\u0112\3\2\2\2\u0213\u0119\3\2"+
		"\2\2\u0213\u0123\3\2\2\2\u0213\u012a\3\2\2\2\u0213\u0139\3\2\2\2\u0213"+
		"\u0152\3\2\2\2\u0213\u016c\3\2\2\2\u0213\u0175\3\2\2\2\u0213\u018a\3\2"+
		"\2\2\u0213\u018e\3\2\2\2\u0213\u0192\3\2\2\2\u0213\u019c\3\2\2\2\u0213"+
		"\u01a6\3\2\2\2\u0213\u01ac\3\2\2\2\u0213\u01b0\3\2\2\2\u0213\u01b4\3\2"+
		"\2\2\u0213\u01bb\3\2\2\2\u0213\u01bd\3\2\2\2\u0213\u01bf\3\2\2\2\u0213"+
		"\u01c1\3\2\2\2\u0213\u01c3\3\2\2\2\u0213\u01c9\3\2\2\2\u0213\u01cc\3\2"+
		"\2\2\u0213\u01d8\3\2\2\2\u0213\u01dc\3\2\2\2\u0213\u01e0\3\2\2\2\u0213"+
		"\u01f8\3\2\2\2\u0213\u01fd\3\2\2\2\u0213\u0200\3\2\2\2\u0213\u020d\3\2"+
		"\2\2\u0213\u0210\3\2\2\2\u0214\7\3\2\2\2\u0215\u0217\5\n\6\2\u0216\u0215"+
		"\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\5\26\f\2"+
		"\u0219\t\3\2\2\2\u021a\u021c\7\u00bb\2\2\u021b\u021d\7\u0086\2\2\u021c"+
		"\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0223\5("+
		"\25\2\u021f\u0220\7\6\2\2\u0220\u0222\5(\25\2\u0221\u021f\3\2\2\2\u0222"+
		"\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\13\3\2\2"+
		"\2\u0225\u0223\3\2\2\2\u0226\u0229\5\16\b\2\u0227\u0229\5\20\t\2\u0228"+
		"\u0226\3\2\2\2\u0228\u0227\3\2\2\2\u0229\r\3\2\2\2\u022a\u022b\5v<\2\u022b"+
		"\u022e\5Z.\2\u022c\u022d\7!\2\2\u022d\u022f\5J&\2\u022e\u022c\3\2\2\2"+
		"\u022e\u022f\3\2\2\2\u022f\17\3\2\2\2\u0230\u0231\7`\2\2\u0231\u0234\5"+
		"t;\2\u0232\u0233\t\6\2\2\u0233\u0235\7\u0082\2\2\u0234\u0232\3\2\2\2\u0234"+
		"\u0235\3\2\2\2\u0235\21\3\2\2\2\u0236\u0237\7\4\2\2\u0237\u023c\5\24\13"+
		"\2\u0238\u0239\7\6\2\2\u0239\u023b\5\24\13\2\u023a\u0238\3\2\2\2\u023b"+
		"\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023f\3\2"+
		"\2\2\u023e\u023c\3\2\2\2\u023f\u0240\7\5\2\2\u0240\23\3\2\2\2\u0241\u0242"+
		"\5v<\2\u0242\u0243\7\u00c0\2\2\u0243\u0244\5> \2\u0244\25\3\2\2\2\u0245"+
		"\u0250\5\30\r\2\u0246\u0247\7w\2\2\u0247\u0248\7\30\2\2\u0248\u024d\5"+
		"\34\17\2\u0249\u024a\7\6\2\2\u024a\u024c\5\34\17\2\u024b\u0249\3\2\2\2"+
		"\u024c\u024f\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0251"+
		"\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0246\3\2\2\2\u0250\u0251\3\2\2\2\u0251"+
		"\u0254\3\2\2\2\u0252\u0253\7a\2\2\u0253\u0255\t\5\2\2\u0254\u0252\3\2"+
		"\2\2\u0254\u0255\3\2\2\2\u0255\27\3\2\2\2\u0256\u0257\b\r\1\2\u0257\u0258"+
		"\5\32\16\2\u0258\u0267\3\2\2\2\u0259\u025a\f\4\2\2\u025a\u025c\7V\2\2"+
		"\u025b\u025d\5*\26\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e"+
		"\3\2\2\2\u025e\u0266\5\30\r\5\u025f\u0260\f\3\2\2\u0260\u0262\t\7\2\2"+
		"\u0261\u0263\5*\26\2\u0262\u0261\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0264"+
		"\3\2\2\2\u0264\u0266\5\30\r\4\u0265\u0259\3\2\2\2\u0265\u025f\3\2\2\2"+
		"\u0266\u0269\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268\31"+
		"\3\2\2\2\u0269\u0267\3\2\2\2\u026a\u027b\5\36\20\2\u026b\u026c\7\u00a1"+
		"\2\2\u026c\u027b\5t;\2\u026d\u026e\7\u00b6\2\2\u026e\u0273\5> \2\u026f"+
		"\u0270\7\6\2\2\u0270\u0272\5> \2\u0271\u026f\3\2\2\2\u0272\u0275\3\2\2"+
		"\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u027b\3\2\2\2\u0275\u0273"+
		"\3\2\2\2\u0276\u0277\7\4\2\2\u0277\u0278\5\26\f\2\u0278\u0279\7\5\2\2"+
		"\u0279\u027b\3\2\2\2\u027a\u026a\3\2\2\2\u027a\u026b\3\2\2\2\u027a\u026d"+
		"\3\2\2\2\u027a\u0276\3\2\2\2\u027b\33\3\2\2\2\u027c\u027e\5> \2\u027d"+
		"\u027f\t\b\2\2\u027e\u027d\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0282\3\2"+
		"\2\2\u0280\u0281\7r\2\2\u0281\u0283\t\t\2\2\u0282\u0280\3\2\2\2\u0282"+
		"\u0283\3\2\2\2\u0283\35\3\2\2\2\u0284\u0286\7\u0095\2\2\u0285\u0287\5"+
		"*\26\2\u0286\u0285\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\3\2\2\2\u0288"+
		"\u028d\5,\27\2\u0289\u028a\7\6\2\2\u028a\u028c\5,\27\2\u028b\u0289\3\2"+
		"\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e"+
		"\u0299\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0291\7E\2\2\u0291\u0296\5.\30"+
		"\2\u0292\u0293\7\6\2\2\u0293\u0295\5.\30\2\u0294\u0292\3\2\2\2\u0295\u0298"+
		"\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u029a\3\2\2\2\u0298"+
		"\u0296\3\2\2\2\u0299\u0290\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029d\3\2"+
		"\2\2\u029b\u029c\7\u00ba\2\2\u029c\u029e\5@!\2\u029d\u029b\3\2\2\2\u029d"+
		"\u029e\3\2\2\2\u029e\u02a2\3\2\2\2\u029f\u02a0\7K\2\2\u02a0\u02a1\7\30"+
		"\2\2\u02a1\u02a3\5 \21\2\u02a2\u029f\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3"+
		"\u02a6\3\2\2\2\u02a4\u02a5\7M\2\2\u02a5\u02a7\5@!\2\u02a6\u02a4\3\2\2"+
		"\2\u02a6\u02a7\3\2\2\2\u02a7\37\3\2\2\2\u02a8\u02aa\5*\26\2\u02a9\u02a8"+
		"\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02b0\5\"\22\2"+
		"\u02ac\u02ad\7\6\2\2\u02ad\u02af\5\"\22\2\u02ae\u02ac\3\2\2\2\u02af\u02b2"+
		"\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1!\3\2\2\2\u02b2"+
		"\u02b0\3\2\2\2\u02b3\u02dc\5$\23\2\u02b4\u02b5\7\u008f\2\2\u02b5\u02be"+
		"\7\4\2\2\u02b6\u02bb\5t;\2\u02b7\u02b8\7\6\2\2\u02b8\u02ba\5t;\2\u02b9"+
		"\u02b7\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2"+
		"\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02be\u02b6\3\2\2\2\u02be"+
		"\u02bf\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02dc\7\5\2\2\u02c1\u02c2\7\'"+
		"\2\2\u02c2\u02cb\7\4\2\2\u02c3\u02c8\5t;\2\u02c4\u02c5\7\6\2\2\u02c5\u02c7"+
		"\5t;\2\u02c6\u02c4\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8"+
		"\u02c9\3\2\2\2\u02c9\u02cc\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb\u02c3\3\2"+
		"\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02dc\7\5\2\2\u02ce"+
		"\u02cf\7L\2\2\u02cf\u02d0\7\u0099\2\2\u02d0\u02d1\7\4\2\2\u02d1\u02d6"+
		"\5&\24\2\u02d2\u02d3\7\6\2\2\u02d3\u02d5\5&\24\2\u02d4\u02d2\3\2\2\2\u02d5"+
		"\u02d8\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d9\3\2"+
		"\2\2\u02d8\u02d6\3\2\2\2\u02d9\u02da\7\5\2\2\u02da\u02dc\3\2\2\2\u02db"+
		"\u02b3\3\2\2\2\u02db\u02b4\3\2\2\2\u02db\u02c1\3\2\2\2\u02db\u02ce\3\2"+
		"\2\2\u02dc#\3\2\2\2\u02dd\u02e6\7\4\2\2\u02de\u02e3\5> \2\u02df\u02e0"+
		"\7\6\2\2\u02e0\u02e2\5> \2\u02e1\u02df\3\2\2\2\u02e2\u02e5\3\2\2\2\u02e3"+
		"\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3\3\2"+
		"\2\2\u02e6\u02de\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8"+
		"\u02eb\7\5\2\2\u02e9\u02eb\5> \2\u02ea\u02dd\3\2\2\2\u02ea\u02e9\3\2\2"+
		"\2\u02eb%\3\2\2\2\u02ec\u02f5\7\4\2\2\u02ed\u02f2\5t;\2\u02ee\u02ef\7"+
		"\6\2\2\u02ef\u02f1\5t;\2\u02f0\u02ee\3\2\2\2\u02f1\u02f4\3\2\2\2\u02f2"+
		"\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2\3\2"+
		"\2\2\u02f5\u02ed\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7"+
		"\u02fa\7\5\2\2\u02f8\u02fa\5t;\2\u02f9\u02ec\3\2\2\2\u02f9\u02f8\3\2\2"+
		"\2\u02fa\'\3\2\2\2\u02fb\u02fd\5v<\2\u02fc\u02fe\5:\36\2\u02fd\u02fc\3"+
		"\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0300\7\23\2\2\u0300"+
		"\u0301\7\4\2\2\u0301\u0302\5\b\5\2\u0302\u0303\7\5\2\2\u0303)\3\2\2\2"+
		"\u0304\u0305\t\n\2\2\u0305+\3\2\2\2\u0306\u030b\5> \2\u0307\u0309\7\23"+
		"\2\2\u0308\u0307\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030a\3\2\2\2\u030a"+
		"\u030c\5v<\2\u030b\u0308\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u0313\3\2\2"+
		"\2\u030d\u030e\5t;\2\u030e\u030f\7\3\2\2\u030f\u0310\7\u00c8\2\2\u0310"+
		"\u0313\3\2\2\2\u0311\u0313\7\u00c8\2\2\u0312\u0306\3\2\2\2\u0312\u030d"+
		"\3\2\2\2\u0312\u0311\3\2\2\2\u0313-\3\2\2\2\u0314\u0315\b\30\1\2\u0315"+
		"\u0316\5\64\33\2\u0316\u0329\3\2\2\2\u0317\u0325\f\4\2\2\u0318\u0319\7"+
		"&\2\2\u0319\u031a\7[\2\2\u031a\u0326\5\64\33\2\u031b\u031c\5\60\31\2\u031c"+
		"\u031d\7[\2\2\u031d\u031e\5.\30\2\u031e\u031f\5\62\32\2\u031f\u0326\3"+
		"\2\2\2\u0320\u0321\7h\2\2\u0321\u0322\5\60\31\2\u0322\u0323\7[\2\2\u0323"+
		"\u0324\5\64\33\2\u0324\u0326\3\2\2\2\u0325\u0318\3\2\2\2\u0325\u031b\3"+
		"\2\2\2\u0325\u0320\3\2\2\2\u0326\u0328\3\2\2\2\u0327\u0317\3\2\2\2\u0328"+
		"\u032b\3\2\2\2\u0329\u0327\3\2\2\2\u0329\u032a\3\2\2\2\u032a/\3\2\2\2"+
		"\u032b\u0329\3\2\2\2\u032c\u032e\7R\2\2\u032d\u032c\3\2\2\2\u032d\u032e"+
		"\3\2\2\2\u032e\u033c\3\2\2\2\u032f\u0331\7^\2\2\u0330\u0332\7y\2\2\u0331"+
		"\u0330\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u033c\3\2\2\2\u0333\u0335\7\u008d"+
		"\2\2\u0334\u0336\7y\2\2\u0335\u0334\3\2\2\2\u0335\u0336\3\2\2\2\u0336"+
		"\u033c\3\2\2\2\u0337\u0339\7F\2\2\u0338\u033a\7y\2\2\u0339\u0338\3\2\2"+
		"\2\u0339\u033a\3\2\2\2\u033a\u033c\3\2\2\2\u033b\u032d\3\2\2\2\u033b\u032f"+
		"\3\2\2\2\u033b\u0333\3\2\2\2\u033b\u0337\3\2\2\2\u033c\61\3\2\2\2\u033d"+
		"\u033e\7s\2\2\u033e\u034c\5@!\2\u033f\u0340\7\u00b4\2\2\u0340\u0341\7"+
		"\4\2\2\u0341\u0346\5v<\2\u0342\u0343\7\6\2\2\u0343\u0345\5v<\2\u0344\u0342"+
		"\3\2\2\2\u0345\u0348\3\2\2\2\u0346\u0344\3\2\2\2\u0346\u0347\3\2\2\2\u0347"+
		"\u0349\3\2\2\2\u0348\u0346\3\2\2\2\u0349\u034a\7\5\2\2\u034a\u034c\3\2"+
		"\2\2\u034b\u033d\3\2\2\2\u034b\u033f\3\2\2\2\u034c\63\3\2\2\2\u034d\u0354"+
		"\58\35\2\u034e\u034f\7\u00a3\2\2\u034f\u0350\5\66\34\2\u0350\u0351\7\4"+
		"\2\2\u0351\u0352\5> \2\u0352\u0353\7\5\2\2\u0353\u0355\3\2\2\2\u0354\u034e"+
		"\3\2\2\2\u0354\u0355\3\2\2\2\u0355\65\3\2\2\2\u0356\u0357\t\13\2\2\u0357"+
		"\67\3\2\2\2\u0358\u0360\5<\37\2\u0359\u035b\7\23\2\2\u035a\u0359\3\2\2"+
		"\2\u035a\u035b\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035e\5v<\2\u035d\u035f"+
		"\5:\36\2\u035e\u035d\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0361\3\2\2\2\u0360"+
		"\u035a\3\2\2\2\u0360\u0361\3\2\2\2\u03619\3\2\2\2\u0362\u0363\7\4\2\2"+
		"\u0363\u0368\5v<\2\u0364\u0365\7\6\2\2\u0365\u0367\5v<\2\u0366\u0364\3"+
		"\2\2\2\u0367\u036a\3\2\2\2\u0368\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369"+
		"\u036b\3\2\2\2\u036a\u0368\3\2\2\2\u036b\u036c\7\5\2\2\u036c;\3\2\2\2"+
		"\u036d\u038b\5t;\2\u036e\u036f\7\4\2\2\u036f\u0370\5\b\5\2\u0370\u0371"+
		"\7\5\2\2\u0371\u038b\3\2\2\2\u0372\u0373\7\u00b2\2\2\u0373\u0374\7\4\2"+
		"\2\u0374\u0379\5> \2\u0375\u0376\7\6\2\2\u0376\u0378\5> \2\u0377\u0375"+
		"\3\2\2\2\u0378\u037b\3\2\2\2\u0379\u0377\3\2\2\2\u0379\u037a\3\2\2\2\u037a"+
		"\u037c\3\2\2\2\u037b\u0379\3\2\2\2\u037c\u037f\7\5\2\2\u037d\u037e\7\u00bb"+
		"\2\2\u037e\u0380\7x\2\2\u037f\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380"+
		"\u038b\3\2\2\2\u0381\u0382\7]\2\2\u0382\u0383\7\4\2\2\u0383\u0384\5\b"+
		"\5\2\u0384\u0385\7\5\2\2\u0385\u038b\3\2\2\2\u0386\u0387\7\4\2\2\u0387"+
		"\u0388\5.\30\2\u0388\u0389\7\5\2\2\u0389\u038b\3\2\2\2\u038a\u036d\3\2"+
		"\2\2\u038a\u036e\3\2\2\2\u038a\u0372\3\2\2\2\u038a\u0381\3\2\2\2\u038a"+
		"\u0386\3\2\2\2\u038b=\3\2\2\2\u038c\u038d\5@!\2\u038d?\3\2\2\2\u038e\u038f"+
		"\b!\1\2\u038f\u0393\5B\"\2\u0390\u0391\7o\2\2\u0391\u0393\5@!\5\u0392"+
		"\u038e\3\2\2\2\u0392\u0390\3\2\2\2\u0393\u039c\3\2\2\2\u0394\u0395\f\4"+
		"\2\2\u0395\u0396\7\20\2\2\u0396\u039b\5@!\5\u0397\u0398\f\3\2\2\u0398"+
		"\u0399\7v\2\2\u0399\u039b\5@!\4\u039a\u0394\3\2\2\2\u039a\u0397\3\2\2"+
		"\2\u039b\u039e\3\2\2\2\u039c\u039a\3\2\2\2\u039c\u039d\3\2\2\2\u039dA"+
		"\3\2\2\2\u039e\u039c\3\2\2\2\u039f\u03a1\5F$\2\u03a0\u03a2\5D#\2\u03a1"+
		"\u03a0\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2C\3\2\2\2\u03a3\u03a4\5N(\2\u03a4"+
		"\u03a5\5F$\2\u03a5\u03e1\3\2\2\2\u03a6\u03a7\5N(\2\u03a7\u03a8\5P)\2\u03a8"+
		"\u03a9\7\4\2\2\u03a9\u03aa\5\b\5\2\u03aa\u03ab\7\5\2\2\u03ab\u03e1\3\2"+
		"\2\2\u03ac\u03ae\7o\2\2\u03ad\u03ac\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae"+
		"\u03af\3\2\2\2\u03af\u03b0\7\27\2\2\u03b0\u03b1\5F$\2\u03b1\u03b2\7\20"+
		"\2\2\u03b2\u03b3\5F$\2\u03b3\u03e1\3\2\2\2\u03b4\u03b6\7o\2\2\u03b5\u03b4"+
		"\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b8\7P\2\2\u03b8"+
		"\u03b9\7\4\2\2\u03b9\u03be\5> \2\u03ba\u03bb\7\6\2\2\u03bb\u03bd\5> \2"+
		"\u03bc\u03ba\3\2\2\2\u03bd\u03c0\3\2\2\2\u03be\u03bc\3\2\2\2\u03be\u03bf"+
		"\3\2\2\2\u03bf\u03c1\3\2\2\2\u03c0\u03be\3\2\2\2\u03c1\u03c2\7\5\2\2\u03c2"+
		"\u03e1\3\2\2\2\u03c3\u03c5\7o\2\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3\2"+
		"\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c7\7P\2\2\u03c7\u03c8\7\4\2\2\u03c8"+
		"\u03c9\5\b\5\2\u03c9\u03ca\7\5\2\2\u03ca\u03e1\3\2\2\2\u03cb\u03cd\7o"+
		"\2\2\u03cc\u03cb\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce"+
		"\u03cf\7`\2\2\u03cf\u03d2\5F$\2\u03d0\u03d1\78\2\2\u03d1\u03d3\5F$\2\u03d2"+
		"\u03d0\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03e1\3\2\2\2\u03d4\u03d6\7Y"+
		"\2\2\u03d5\u03d7\7o\2\2\u03d6\u03d5\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7"+
		"\u03d8\3\2\2\2\u03d8\u03e1\7p\2\2\u03d9\u03db\7Y\2\2\u03da\u03dc\7o\2"+
		"\2\u03db\u03da\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03de"+
		"\7\63\2\2\u03de\u03df\7E\2\2\u03df\u03e1\5F$\2\u03e0\u03a3\3\2\2\2\u03e0"+
		"\u03a6\3\2\2\2\u03e0\u03ad\3\2\2\2\u03e0\u03b5\3\2\2\2\u03e0\u03c4\3\2"+
		"\2\2\u03e0\u03cc\3\2\2\2\u03e0\u03d4\3\2\2\2\u03e0\u03d9\3\2\2\2\u03e1"+
		"E\3\2\2\2\u03e2\u03e3\b$\1\2\u03e3\u03e7\5H%\2\u03e4\u03e5\t\f\2\2\u03e5"+
		"\u03e7\5F$\6\u03e6\u03e2\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e7\u03f6\3\2\2"+
		"\2\u03e8\u03e9\f\5\2\2\u03e9\u03ea\t\r\2\2\u03ea\u03f5\5F$\6\u03eb\u03ec"+
		"\f\4\2\2\u03ec\u03ed\t\f\2\2\u03ed\u03f5\5F$\5\u03ee\u03ef\f\3\2\2\u03ef"+
		"\u03f0\7\u00cb\2\2\u03f0\u03f5\5F$\4\u03f1\u03f2\f\7\2\2\u03f2\u03f3\7"+
		"\25\2\2\u03f3\u03f5\5L\'\2\u03f4\u03e8\3\2\2\2\u03f4\u03eb\3\2\2\2\u03f4"+
		"\u03ee\3\2\2\2\u03f4\u03f1\3\2\2\2\u03f5\u03f8\3\2\2\2\u03f6\u03f4\3\2"+
		"\2\2\u03f6\u03f7\3\2\2\2\u03f7G\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f9\u03fa"+
		"\b%\1\2\u03fa\u04d8\7p\2\2\u03fb\u04d8\5T+\2\u03fc\u03fd\5v<\2\u03fd\u03fe"+
		"\5J&\2\u03fe\u04d8\3\2\2\2\u03ff\u0400\7\u00d7\2\2\u0400\u04d8\5J&\2\u0401"+
		"\u04d8\5z>\2\u0402\u04d8\5R*\2\u0403\u04d8\5J&\2\u0404\u04d8\7\u00ce\2"+
		"\2\u0405\u04d8\7\7\2\2\u0406\u0407\7~\2\2\u0407\u0408\7\4\2\2\u0408\u0409"+
		"\5F$\2\u0409\u040a\7P\2\2\u040a\u040b\5F$\2\u040b\u040c\7\5\2\2\u040c"+
		"\u04d8\3\2\2\2\u040d\u040e\7\4\2\2\u040e\u0411\5> \2\u040f\u0410\7\6\2"+
		"\2\u0410\u0412\5> \2\u0411\u040f\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0411"+
		"\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0416\7\5\2\2\u0416"+
		"\u04d8\3\2\2\2\u0417\u0418\7\u0090\2\2\u0418\u0419\7\4\2\2\u0419\u041e"+
		"\5> \2\u041a\u041b\7\6\2\2\u041b\u041d\5> \2\u041c\u041a\3\2\2\2\u041d"+
		"\u0420\3\2\2\2\u041e\u041c\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u0421\3\2"+
		"\2\2\u0420\u041e\3\2\2\2\u0421\u0422\7\5\2\2\u0422\u04d8\3\2\2\2\u0423"+
		"\u0424\5t;\2\u0424\u0425\7\4\2\2\u0425\u0426\7\u00c8\2\2\u0426\u0428\7"+
		"\5\2\2\u0427\u0429\5b\62\2\u0428\u0427\3\2\2\2\u0428\u0429\3\2\2\2\u0429"+
		"\u042b\3\2\2\2\u042a\u042c\5d\63\2\u042b\u042a\3\2\2\2\u042b\u042c\3\2"+
		"\2\2\u042c\u04d8\3\2\2\2\u042d\u042e\5t;\2\u042e\u043a\7\4\2\2\u042f\u0431"+
		"\5*\26\2\u0430\u042f\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0432\3\2\2\2\u0432"+
		"\u0437\5> \2\u0433\u0434\7\6\2\2\u0434\u0436\5> \2\u0435\u0433\3\2\2\2"+
		"\u0436\u0439\3\2\2\2\u0437\u0435\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u043b"+
		"\3\2\2\2\u0439\u0437\3\2\2\2\u043a\u0430\3\2\2\2\u043a\u043b\3\2\2\2\u043b"+
		"\u043c\3\2\2\2\u043c\u043e\7\5\2\2\u043d\u043f\5b\62\2\u043e\u043d\3\2"+
		"\2\2\u043e\u043f\3\2\2\2\u043f\u0441\3\2\2\2\u0440\u0442\5d\63\2\u0441"+
		"\u0440\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u04d8\3\2\2\2\u0443\u0444\5v"+
		"<\2\u0444\u0445\7\b\2\2\u0445\u0446\5> \2\u0446\u04d8\3\2\2\2\u0447\u0448"+
		"\7\4\2\2\u0448\u044d\5v<\2\u0449\u044a\7\6\2\2\u044a\u044c\5v<\2\u044b"+
		"\u0449\3\2\2\2\u044c\u044f\3\2\2\2\u044d\u044b\3\2\2\2\u044d\u044e\3\2"+
		"\2\2\u044e\u0450\3\2\2\2\u044f\u044d\3\2\2\2\u0450\u0451\7\5\2\2\u0451"+
		"\u0452\7\b\2\2\u0452\u0453\5> \2\u0453\u04d8\3\2\2\2\u0454\u0455\7\4\2"+
		"\2\u0455\u0456\5\b\5\2\u0456\u0457\7\5\2\2\u0457\u04d8\3\2\2\2\u0458\u0459"+
		"\7<\2\2\u0459\u045a\7\4\2\2\u045a\u045b\5\b\5\2\u045b\u045c\7\5\2\2\u045c"+
		"\u04d8\3\2\2\2\u045d\u045e\7\33\2\2\u045e\u0460\5F$\2\u045f\u0461\5`\61"+
		"\2\u0460\u045f\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0460\3\2\2\2\u0462\u0463"+
		"\3\2\2\2\u0463\u0466\3\2\2\2\u0464\u0465\7\66\2\2\u0465\u0467\5> \2\u0466"+
		"\u0464\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469\7\67"+
		"\2\2\u0469\u04d8\3\2\2\2\u046a\u046c\7\33\2\2\u046b\u046d\5`\61\2\u046c"+
		"\u046b\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u046c\3\2\2\2\u046e\u046f\3\2"+
		"\2\2\u046f\u0472\3\2\2\2\u0470\u0471\7\66\2\2\u0471\u0473\5> \2\u0472"+
		"\u0470\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0475\7\67"+
		"\2\2\u0475\u04d8\3\2\2\2\u0476\u0477\7\34\2\2\u0477\u0478\7\4\2\2\u0478"+
		"\u0479\5> \2\u0479\u047a\7\23\2\2\u047a\u047b\5Z.\2\u047b\u047c\7\5\2"+
		"\2\u047c\u04d8\3\2\2\2\u047d\u047e\7\u00ac\2\2\u047e\u047f\7\4\2\2\u047f"+
		"\u0480\5> \2\u0480\u0481\7\23\2\2\u0481\u0482\5Z.\2\u0482\u0483\7\5\2"+
		"\2\u0483\u04d8\3\2\2\2\u0484\u0485\7\22\2\2\u0485\u048e\7\t\2\2\u0486"+
		"\u048b\5> \2\u0487\u0488\7\6\2\2\u0488\u048a\5> \2\u0489\u0487\3\2\2\2"+
		"\u048a\u048d\3\2\2\2\u048b\u0489\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048f"+
		"\3\2\2\2\u048d\u048b\3\2\2\2\u048e\u0486\3\2\2\2\u048e\u048f\3\2\2\2\u048f"+
		"\u0490\3\2\2\2\u0490\u04d8\7\n\2\2\u0491\u04d8\5v<\2\u0492\u04d8\7)\2"+
		"\2\u0493\u0497\7*\2\2\u0494\u0495\7\4\2\2\u0495\u0496\7\u00cf\2\2\u0496"+
		"\u0498\7\5\2\2\u0497\u0494\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u04d8\3\2"+
		"\2\2\u0499\u049d\7+\2\2\u049a\u049b\7\4\2\2\u049b\u049c\7\u00cf\2\2\u049c"+
		"\u049e\7\5\2\2\u049d\u049a\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u04d8\3\2"+
		"\2\2\u049f\u04a3\7b\2\2\u04a0\u04a1\7\4\2\2\u04a1\u04a2\7\u00cf\2\2\u04a2"+
		"\u04a4\7\5\2\2\u04a3\u04a0\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04d8\3\2"+
		"\2\2\u04a5\u04a9\7c\2\2\u04a6\u04a7\7\4\2\2\u04a7\u04a8\7\u00cf\2\2\u04a8"+
		"\u04aa\7\5\2\2\u04a9\u04a6\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04d8\3\2"+
		"\2\2\u04ab\u04ac\7\u009f\2\2\u04ac\u04ad\7\4\2\2\u04ad\u04ae\5F$\2\u04ae"+
		"\u04af\7E\2\2\u04af\u04b2\5F$\2\u04b0\u04b1\7C\2\2\u04b1\u04b3\5F$\2\u04b2"+
		"\u04b0\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b5\7\5"+
		"\2\2\u04b5\u04d8\3\2\2\2\u04b6\u04b7\7n\2\2\u04b7\u04b8\7\4\2\2\u04b8"+
		"\u04bb\5F$\2\u04b9\u04ba\7\6\2\2\u04ba\u04bc\5X-\2\u04bb\u04b9\3\2\2\2"+
		"\u04bb\u04bc\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04be\7\5\2\2\u04be\u04d8"+
		"\3\2\2\2\u04bf\u04c0\7>\2\2\u04c0\u04c1\7\4\2\2\u04c1\u04c2\5v<\2\u04c2"+
		"\u04c3\7E\2\2\u04c3\u04c4\5F$\2\u04c4\u04c5\7\5\2\2\u04c5\u04d8\3\2\2"+
		"\2\u04c6\u04c7\7\4\2\2\u04c7\u04c8\5> \2\u04c8\u04c9\7\5\2\2\u04c9\u04d8"+
		"\3\2\2\2\u04ca\u04cb\7L\2\2\u04cb\u04d4\7\4\2\2\u04cc\u04d1\5t;\2\u04cd"+
		"\u04ce\7\6\2\2\u04ce\u04d0\5t;\2\u04cf\u04cd\3\2\2\2\u04d0\u04d3\3\2\2"+
		"\2\u04d1\u04cf\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d5\3\2\2\2\u04d3\u04d1"+
		"\3\2\2\2\u04d4\u04cc\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6"+
		"\u04d8\7\5\2\2\u04d7\u03f9\3\2\2\2\u04d7\u03fb\3\2\2\2\u04d7\u03fc\3\2"+
		"\2\2\u04d7\u03ff\3\2\2\2\u04d7\u0401\3\2\2\2\u04d7\u0402\3\2\2\2\u04d7"+
		"\u0403\3\2\2\2\u04d7\u0404\3\2\2\2\u04d7\u0405\3\2\2\2\u04d7\u0406\3\2"+
		"\2\2\u04d7\u040d\3\2\2\2\u04d7\u0417\3\2\2\2\u04d7\u0423\3\2\2\2\u04d7"+
		"\u042d\3\2\2\2\u04d7\u0443\3\2\2\2\u04d7\u0447\3\2\2\2\u04d7\u0454\3\2"+
		"\2\2\u04d7\u0458\3\2\2\2\u04d7\u045d\3\2\2\2\u04d7\u046a\3\2\2\2\u04d7"+
		"\u0476\3\2\2\2\u04d7\u047d\3\2\2\2\u04d7\u0484\3\2\2\2\u04d7\u0491\3\2"+
		"\2\2\u04d7\u0492\3\2\2\2\u04d7\u0493\3\2\2\2\u04d7\u0499\3\2\2\2\u04d7"+
		"\u049f\3\2\2\2\u04d7\u04a5\3\2\2\2\u04d7\u04ab\3\2\2\2\u04d7\u04b6\3\2"+
		"\2\2\u04d7\u04bf\3\2\2\2\u04d7\u04c6\3\2\2\2\u04d7\u04ca\3\2\2\2\u04d8"+
		"\u04e3\3\2\2\2\u04d9\u04da\f\17\2\2\u04da\u04db\7\t\2\2\u04db\u04dc\5"+
		"F$\2\u04dc\u04dd\7\n\2\2\u04dd\u04e2\3\2\2\2\u04de\u04df\f\r\2\2\u04df"+
		"\u04e0\7\3\2\2\u04e0\u04e2\5v<\2\u04e1\u04d9\3\2\2\2\u04e1\u04de\3\2\2"+
		"\2\u04e2\u04e5\3\2\2\2\u04e3\u04e1\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4I"+
		"\3\2\2\2\u04e5\u04e3\3\2\2\2\u04e6\u04ed\7\u00cc\2\2\u04e7\u04ea\7\u00cd"+
		"\2\2\u04e8\u04e9\7\u00ae\2\2\u04e9\u04eb\7\u00cc\2\2\u04ea\u04e8\3\2\2"+
		"\2\u04ea\u04eb\3\2\2\2\u04eb\u04ed\3\2\2\2\u04ec\u04e6\3\2\2\2\u04ec\u04e7"+
		"\3\2\2\2\u04edK\3\2\2\2\u04ee\u04ef\7\u00a6\2\2\u04ef\u04f0\7\u00bf\2"+
		"\2\u04f0\u04f5\5T+\2\u04f1\u04f2\7\u00a6\2\2\u04f2\u04f3\7\u00bf\2\2\u04f3"+
		"\u04f5\5J&\2\u04f4\u04ee\3\2\2\2\u04f4\u04f1\3\2\2\2\u04f5M\3\2\2\2\u04f6"+
		"\u04f7\t\16\2\2\u04f7O\3\2\2\2\u04f8\u04f9\t\17\2\2\u04f9Q\3\2\2\2\u04fa"+
		"\u04fb\t\20\2\2\u04fbS\3\2\2\2\u04fc\u04fe\7W\2\2\u04fd\u04ff\t\f\2\2"+
		"\u04fe\u04fd\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0501"+
		"\5J&\2\u0501\u0504\5V,\2\u0502\u0503\7\u00a9\2\2\u0503\u0505\5V,\2\u0504"+
		"\u0502\3\2\2\2\u0504\u0505\3\2\2\2\u0505U\3\2\2\2\u0506\u0507\t\21\2\2"+
		"\u0507W\3\2\2\2\u0508\u0509\t\22\2\2\u0509Y\3\2\2\2\u050a\u050b\b.\1\2"+
		"\u050b\u050c\7\22\2\2\u050c\u050d\7\u00c2\2\2\u050d\u050e\5Z.\2\u050e"+
		"\u050f\7\u00c4\2\2\u050f\u0535\3\2\2\2\u0510\u0511\7e\2\2\u0511\u0512"+
		"\7\u00c2\2\2\u0512\u0513\5Z.\2\u0513\u0514\7\6\2\2\u0514\u0515\5Z.\2\u0515"+
		"\u0516\7\u00c4\2\2\u0516\u0535\3\2\2\2\u0517\u0518\7\u0090\2\2\u0518\u0519"+
		"\7\4\2\2\u0519\u051a\5v<\2\u051a\u0521\5Z.\2\u051b\u051c\7\6\2\2\u051c"+
		"\u051d\5v<\2\u051d\u051e\5Z.\2\u051e\u0520\3\2\2\2\u051f\u051b\3\2\2\2"+
		"\u0520\u0523\3\2\2\2\u0521\u051f\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0524"+
		"\3\2\2\2\u0523\u0521\3\2\2\2\u0524\u0525\7\5\2\2\u0525\u0535\3\2\2\2\u0526"+
		"\u0532\5^\60\2\u0527\u0528\7\4\2\2\u0528\u052d\5\\/\2\u0529\u052a\7\6"+
		"\2\2\u052a\u052c\5\\/\2\u052b\u0529\3\2\2\2\u052c\u052f\3\2\2\2\u052d"+
		"\u052b\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u0530\3\2\2\2\u052f\u052d\3\2"+
		"\2\2\u0530\u0531\7\5\2\2\u0531\u0533\3\2\2\2\u0532\u0527\3\2\2\2\u0532"+
		"\u0533\3\2\2\2\u0533\u0535\3\2\2\2\u0534\u050a\3\2\2\2\u0534\u0510\3\2"+
		"\2\2\u0534\u0517\3\2\2\2\u0534\u0526\3\2\2\2\u0535\u053a\3\2\2\2\u0536"+
		"\u0537\f\7\2\2\u0537\u0539\7\22\2\2\u0538\u0536\3\2\2\2\u0539\u053c\3"+
		"\2\2\2\u053a\u0538\3\2\2\2\u053a\u053b\3\2\2\2\u053b[\3\2\2\2\u053c\u053a"+
		"\3\2\2\2\u053d\u0540\7\u00cf\2\2\u053e\u0540\5Z.\2\u053f\u053d\3\2\2\2"+
		"\u053f\u053e\3\2\2\2\u0540]\3\2\2\2\u0541\u0546\7\u00d5\2\2\u0542\u0546"+
		"\7\u00d6\2\2\u0543\u0546\7\u00d7\2\2\u0544\u0546\5v<\2\u0545\u0541\3\2"+
		"\2\2\u0545\u0542\3\2\2\2\u0545\u0543\3\2\2\2\u0545\u0544\3\2\2\2\u0546"+
		"_\3\2\2\2\u0547\u0548\7\u00b9\2\2\u0548\u0549\5> \2\u0549\u054a\7\u00a5"+
		"\2\2\u054a\u054b\5> \2\u054ba\3\2\2\2\u054c\u054d\7@\2\2\u054d\u054e\7"+
		"\4\2\2\u054e\u054f\7\u00ba\2\2\u054f\u0550\5@!\2\u0550\u0551\7\5\2\2\u0551"+
		"c\3\2\2\2\u0552\u0553\7{\2\2\u0553\u055e\7\4\2\2\u0554\u0555\7|\2\2\u0555"+
		"\u0556\7\30\2\2\u0556\u055b\5> \2\u0557\u0558\7\6\2\2\u0558\u055a\5> "+
		"\2\u0559\u0557\3\2\2\2\u055a\u055d\3\2\2\2\u055b\u0559\3\2\2\2\u055b\u055c"+
		"\3\2\2\2\u055c\u055f\3\2\2\2\u055d\u055b\3\2\2\2\u055e\u0554\3\2\2\2\u055e"+
		"\u055f\3\2\2\2\u055f\u056a\3\2\2\2\u0560\u0561\7w\2\2\u0561\u0562\7\30"+
		"\2\2\u0562\u0567\5\34\17\2\u0563\u0564\7\6\2\2\u0564\u0566\5\34\17\2\u0565"+
		"\u0563\3\2\2\2\u0566\u0569\3\2\2\2\u0567\u0565\3\2\2\2\u0567\u0568\3\2"+
		"\2\2\u0568\u056b\3\2\2\2\u0569\u0567\3\2\2\2\u056a\u0560\3\2\2\2\u056a"+
		"\u056b\3\2\2\2\u056b\u056d\3\2\2\2\u056c\u056e\5f\64\2\u056d\u056c\3\2"+
		"\2\2\u056d\u056e\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0570\7\5\2\2\u0570"+
		"e\3\2\2\2\u0571\u0572\7\u0084\2\2\u0572\u0582\5h\65\2\u0573\u0574\7\u0091"+
		"\2\2\u0574\u0582\5h\65\2\u0575\u0576\7\u0084\2\2\u0576\u0577\7\27\2\2"+
		"\u0577\u0578\5h\65\2\u0578\u0579\7\20\2\2\u0579\u057a\5h\65\2\u057a\u0582"+
		"\3\2\2\2\u057b\u057c\7\u0091\2\2\u057c\u057d\7\27\2\2\u057d\u057e\5h\65"+
		"\2\u057e\u057f\7\20\2\2\u057f\u0580\5h\65\2\u0580\u0582\3\2\2\2\u0581"+
		"\u0571\3\2\2\2\u0581\u0573\3\2\2\2\u0581\u0575\3\2\2\2\u0581\u057b\3\2"+
		"\2\2\u0582g\3\2\2\2\u0583\u0584\7\u00af\2\2\u0584\u058d\7\177\2\2\u0585"+
		"\u0586\7\u00af\2\2\u0586\u058d\7B\2\2\u0587\u0588\7(\2\2\u0588\u058d\7"+
		"\u0090\2\2\u0589\u058a\5> \2\u058a\u058b\t\23\2\2\u058b\u058d\3\2\2\2"+
		"\u058c\u0583\3\2\2\2\u058c\u0585\3\2\2\2\u058c\u0587\3\2\2\2\u058c\u0589"+
		"\3\2\2\2\u058di\3\2\2\2\u058e\u058f\7D\2\2\u058f\u0593\t\24\2\2\u0590"+
		"\u0591\7\u00ad\2\2\u0591\u0593\t\25\2\2\u0592\u058e\3\2\2\2\u0592\u0590"+
		"\3\2\2\2\u0593k\3\2\2\2\u0594\u0595\7Z\2\2\u0595\u0596\7_\2\2\u0596\u059a"+
		"\5n8\2\u0597\u0598\7\u0085\2\2\u0598\u059a\t\26\2\2\u0599\u0594\3\2\2"+
		"\2\u0599\u0597\3\2\2\2\u059am\3\2\2\2\u059b\u059c\7\u0085\2\2\u059c\u05a3"+
		"\7\u00b0\2\2\u059d\u059e\7\u0085\2\2\u059e\u05a3\7#\2\2\u059f\u05a0\7"+
		"\u0088\2\2\u05a0\u05a3\7\u0085\2\2\u05a1\u05a3\7\u0096\2\2\u05a2\u059b"+
		"\3\2\2\2\u05a2\u059d\3\2\2\2\u05a2\u059f\3\2\2\2\u05a2\u05a1\3\2\2\2\u05a3"+
		"o\3\2\2\2\u05a4\u05aa\5> \2\u05a5\u05a6\5v<\2\u05a6\u05a7\7\13\2\2\u05a7"+
		"\u05a8\5> \2\u05a8\u05aa\3\2\2\2\u05a9\u05a4\3\2\2\2\u05a9\u05a5\3\2\2"+
		"\2\u05aaq\3\2\2\2\u05ab\u05b0\7\u0095\2\2\u05ac\u05b0\7\60\2\2\u05ad\u05b0"+
		"\7T\2\2\u05ae\u05b0\5v<\2\u05af\u05ab\3\2\2\2\u05af\u05ac\3\2\2\2\u05af"+
		"\u05ad\3\2\2\2\u05af\u05ae\3\2\2\2\u05b0s\3\2\2\2\u05b1\u05b6\5v<\2\u05b2"+
		"\u05b3\7\3\2\2\u05b3\u05b5\5v<\2\u05b4\u05b2\3\2\2\2\u05b5\u05b8\3\2\2"+
		"\2\u05b6\u05b4\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7u\3\2\2\2\u05b8\u05b6"+
		"\3\2\2\2\u05b9\u05bf\7\u00d1\2\2\u05ba\u05bf\5x=\2\u05bb\u05bf\5|?\2\u05bc"+
		"\u05bf\7\u00d4\2\2\u05bd\u05bf\7\u00d2\2\2\u05be\u05b9\3\2\2\2\u05be\u05ba"+
		"\3\2\2\2\u05be\u05bb\3\2\2\2\u05be\u05bc\3\2\2\2\u05be\u05bd\3\2\2\2\u05bf"+
		"w\3\2\2\2\u05c0\u05c1\7\u00d3\2\2\u05c1y\3\2\2\2\u05c2\u05c5\7\u00d0\2"+
		"\2\u05c3\u05c5\7\u00cf\2\2\u05c4\u05c2\3\2\2\2\u05c4\u05c3\3\2\2\2\u05c5"+
		"{\3\2\2\2\u05c6\u05c7\t\27\2\2\u05c7}\3\2\2\2\u00b8\u0091\u0096\u009c"+
		"\u00a0\u00ae\u00b2\u00b6\u00ba\u00c2\u00c6\u00c9\u00d0\u00d9\u00df\u00e3"+
		"\u00e9\u00f0\u00f9\u011c\u0127\u0132\u0135\u013f\u0144\u0148\u0150\u0156"+
		"\u015d\u0162\u0166\u0170\u0173\u0177\u017a\u0182\u0187\u0196\u019a\u01a0"+
		"\u01a4\u01aa\u01d3\u01d6\u01da\u01de\u01e6\u01ef\u01f2\u01f6\u0208\u020b"+
		"\u0213\u0216\u021c\u0223\u0228\u022e\u0234\u023c\u024d\u0250\u0254\u025c"+
		"\u0262\u0265\u0267\u0273\u027a\u027e\u0282\u0286\u028d\u0296\u0299\u029d"+
		"\u02a2\u02a6\u02a9\u02b0\u02bb\u02be\u02c8\u02cb\u02d6\u02db\u02e3\u02e6"+
		"\u02ea\u02f2\u02f5\u02f9\u02fd\u0308\u030b\u0312\u0325\u0329\u032d\u0331"+
		"\u0335\u0339\u033b\u0346\u034b\u0354\u035a\u035e\u0360\u0368\u0379\u037f"+
		"\u038a\u0392\u039a\u039c\u03a1\u03ad\u03b5\u03be\u03c4\u03cc\u03d2\u03d6"+
		"\u03db\u03e0\u03e6\u03f4\u03f6\u0413\u041e\u0428\u042b\u0430\u0437\u043a"+
		"\u043e\u0441\u044d\u0462\u0466\u046e\u0472\u048b\u048e\u0497\u049d\u04a3"+
		"\u04a9\u04b2\u04bb\u04d1\u04d4\u04d7\u04e1\u04e3\u04ea\u04ec\u04f4\u04fe"+
		"\u0504\u0521\u052d\u0532\u0534\u053a\u053f\u0545\u055b\u055e\u0567\u056a"+
		"\u056d\u0581\u058c\u0592\u0599\u05a2\u05a9\u05af\u05b6\u05be\u05c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}