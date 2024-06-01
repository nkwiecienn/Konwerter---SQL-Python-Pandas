// Generated from C:/Users/Oliwier/IdeaProjects/Konwerter---SQL-Python-Pandas/gen/SQLToPandas.g4 by ANTLR 4.13.1

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

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SQLToPandasParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, SELECT=8, FROM=9, 
		WHERE=10, IN=11, BETWEEN=12, LIKE=13, IS_NULL=14, AS=15, JOIN=16, USING=17, 
		AND=18, OR=19, ORDER_BY=20, GROUP_BY=21, INNER=22, LEFT=23, RIGHT=24,
            ASC = 25, DESC = 26, COUNT = 27, SUM = 28, AVG = 29, MAX = 30, MIN = 31, LIMIT = 32, COMMA = 33,
            LPAREN = 34, RPAREN = 35, DOT = 36, NUMERICAL_VALUE = 37, STRING_VALUE = 38, IDENTIFIER = 39,
            WS = 40, SEMICOLON = 41;
	public static final int
		RULE_query = 0, RULE_selectStatement = 1, RULE_selectList = 2, RULE_selectItem = 3, 
		RULE_whereClause = 4, RULE_condition = 5, RULE_expression = 6, RULE_valueList = 7, 
		RULE_joinClause = 8, RULE_joinType = 9, RULE_orderByStatement = 10, RULE_groupByStatement = 11, 
		RULE_aggregateFunction = 12, RULE_columnReference = 13, RULE_tableName = 14, 
		RULE_value = 15, RULE_columnName = 16, RULE_operator = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "selectStatement", "selectList", "selectItem", "whereClause", 
			"condition", "expression", "valueList", "joinClause", "joinType", "orderByStatement", 
			"groupByStatement", "aggregateFunction", "columnReference", "tableName", 
			"value", "columnName", "operator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();
    public static final String _serializedATN =
            "\u0004\u0001)\u00bf\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
                    "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
                    "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
                    "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002" +
                    "\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f" +
                    "\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000" +
                    "\u0003\u0000\'\b\u0000\u0001\u0000\u0003\u0000*\b\u0000\u0003\u0000,\b" +
                    "\u0000\u0001\u0000\u0001\u0000\u0003\u00000\b\u0000\u0001\u0000\u0003" +
                    "\u00003\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0003\u0001:\b\u0001\u0001\u0001\u0003\u0001=\b\u0001\u0001\u0002" +
                    "\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002C\b\u0002\n\u0002\f\u0002" +
                    "F\t\u0002\u0003\u0002H\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003L\b" +
                    "\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001" +
                    "\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001" +
                    "\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005^\b" +
                    "\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001" +
                    "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001" +
                    "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001" +
                    "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001" +
                    "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006{\b\u0006\u0001" +
                    "\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0080\b\u0007\n\u0007\f\u0007" +
                    "\u0083\t\u0007\u0001\b\u0001\b\u0003\b\u0087\b\b\u0001\b\u0001\b\u0001" +
                    "\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001" +
                    "\b\u0001\b\u0005\b\u0096\b\b\n\b\f\b\u0099\t\b\u0001\t\u0001\t\u0001\n" +
                    "\u0001\n\u0001\n\u0003\n\u00a0\b\n\u0001\u000b\u0001\u000b\u0001\u000b" +
                    "\u0001\u000b\u0005\u000b\u00a6\b\u000b\n\u000b\f\u000b\u00a9\t\u000b\u0001" +
                    "\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001" +
                    "\r\u0003\r\u00b5\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001" +
                    "\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0000\u0001\u0010" +
                    "\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018" +
                    "\u001a\u001c\u001e \"\u0000\u0005\u0001\u0000\u0016\u0018\u0001\u0000" +
                    "\u0019\u001a\u0001\u0000\u001b\u001f\u0001\u0000%&\u0001\u0000\u0002\u0007" +
                    "\u00c4\u0000$\u0001\u0000\u0000\u0000\u00024\u0001\u0000\u0000\u0000\u0004" +
                    "G\u0001\u0000\u0000\u0000\u0006K\u0001\u0000\u0000\u0000\bM\u0001\u0000" +
                    "\u0000\u0000\n]\u0001\u0000\u0000\u0000\fz\u0001\u0000\u0000\u0000\u000e" +
                    "|\u0001\u0000\u0000\u0000\u0010\u0084\u0001\u0000\u0000\u0000\u0012\u009a" +
                    "\u0001\u0000\u0000\u0000\u0014\u009c\u0001\u0000\u0000\u0000\u0016\u00a1" +
                    "\u0001\u0000\u0000\u0000\u0018\u00aa\u0001\u0000\u0000\u0000\u001a\u00b4" +
                    "\u0001\u0000\u0000\u0000\u001c\u00b6\u0001\u0000\u0000\u0000\u001e\u00b8" +
                    "\u0001\u0000\u0000\u0000 \u00ba\u0001\u0000\u0000\u0000\"\u00bc\u0001" +
                    "\u0000\u0000\u0000$+\u0003\u0002\u0001\u0000%\'\u0003\u0014\n\u0000&%" +
                    "\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\')\u0001\u0000\u0000" +
                    "\u0000(*\u0003\u0016\u000b\u0000)(\u0001\u0000\u0000\u0000)*\u0001\u0000" +
                    "\u0000\u0000*,\u0001\u0000\u0000\u0000+&\u0001\u0000\u0000\u0000+,\u0001" +
                    "\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-.\u0005 \u0000\u0000.0\u0005" +
                    "%\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000002\u0001" +
                    "\u0000\u0000\u000013\u0005)\u0000\u000021\u0001\u0000\u0000\u000023\u0001" +
                    "\u0000\u0000\u00003\u0001\u0001\u0000\u0000\u000045\u0005\b\u0000\u0000" +
                    "56\u0003\u0004\u0002\u000067\u0005\t\u0000\u000079\u0003\u001c\u000e\u0000" +
                    "8:\u0003\b\u0004\u000098\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000" +
                    ":<\u0001\u0000\u0000\u0000;=\u0003\u0010\b\u0000<;\u0001\u0000\u0000\u0000" +
                    "<=\u0001\u0000\u0000\u0000=\u0003\u0001\u0000\u0000\u0000>H\u0005\u0001" +
                    "\u0000\u0000?D\u0003\u0006\u0003\u0000@A\u0005!\u0000\u0000AC\u0003\u0006" +
                    "\u0003\u0000B@\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001" +
                    "\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000" +
                    "FD\u0001\u0000\u0000\u0000G>\u0001\u0000\u0000\u0000G?\u0001\u0000\u0000" +
                    "\u0000H\u0005\u0001\u0000\u0000\u0000IL\u0003\u001a\r\u0000JL\u0003\u0018" +
                    "\f\u0000KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000L\u0007\u0001" +
                    "\u0000\u0000\u0000MN\u0005\n\u0000\u0000NO\u0003\n\u0005\u0000O\t\u0001" +
                    "\u0000\u0000\u0000P^\u0003\f\u0006\u0000QR\u0003\f\u0006\u0000RS\u0005" +
                    "\u0012\u0000\u0000ST\u0003\n\u0005\u0000T^\u0001\u0000\u0000\u0000UV\u0003" +
                    "\f\u0006\u0000VW\u0005\u0013\u0000\u0000WX\u0003\n\u0005\u0000X^\u0001" +
                    "\u0000\u0000\u0000YZ\u0005\"\u0000\u0000Z[\u0003\n\u0005\u0000[\\\u0005" +
                    "#\u0000\u0000\\^\u0001\u0000\u0000\u0000]P\u0001\u0000\u0000\u0000]Q\u0001" +
                    "\u0000\u0000\u0000]U\u0001\u0000\u0000\u0000]Y\u0001\u0000\u0000\u0000" +
                    "^\u000b\u0001\u0000\u0000\u0000_`\u0003\u001a\r\u0000`a\u0003\"\u0011" +
                    "\u0000ab\u0003\u001e\u000f\u0000b{\u0001\u0000\u0000\u0000cd\u0003\u001a" +
                    "\r\u0000de\u0003\"\u0011\u0000ef\u0003\u001a\r\u0000f{\u0001\u0000\u0000" +
                    "\u0000gh\u0003\u001a\r\u0000hi\u0005\u000b\u0000\u0000ij\u0005\"\u0000" +
                    "\u0000jk\u0003\u000e\u0007\u0000kl\u0005#\u0000\u0000l{\u0001\u0000\u0000" +
                    "\u0000mn\u0003\u001a\r\u0000no\u0005\f\u0000\u0000op\u0003\u001e\u000f" +
                    "\u0000pq\u0005\u0012\u0000\u0000qr\u0003\u001e\u000f\u0000r{\u0001\u0000" +
                    "\u0000\u0000st\u0003\u001a\r\u0000tu\u0005\r\u0000\u0000uv\u0003\u001e" +
                    "\u000f\u0000v{\u0001\u0000\u0000\u0000wx\u0003\u001a\r\u0000xy\u0005\u000e" +
                    "\u0000\u0000y{\u0001\u0000\u0000\u0000z_\u0001\u0000\u0000\u0000zc\u0001" +
                    "\u0000\u0000\u0000zg\u0001\u0000\u0000\u0000zm\u0001\u0000\u0000\u0000" +
                    "zs\u0001\u0000\u0000\u0000zw\u0001\u0000\u0000\u0000{\r\u0001\u0000\u0000" +
                    "\u0000|\u0081\u0003\u001e\u000f\u0000}~\u0005!\u0000\u0000~\u0080\u0003" +
                    "\u001e\u000f\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000" +
                    "\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000" +
                    "\u0000\u0000\u0082\u000f\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000" +
                    "\u0000\u0000\u0084\u0086\u0006\b\uffff\uffff\u0000\u0085\u0087\u0003\u0012" +
                    "\t\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000" +
                    "\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0010\u0000" +
                    "\u0000\u0089\u008a\u0003\u001c\u000e\u0000\u008a\u008b\u0005\u0011\u0000" +
                    "\u0000\u008b\u008c\u0003\u0004\u0002\u0000\u008c\u0097\u0001\u0000\u0000" +
                    "\u0000\u008d\u008e\n\u0001\u0000\u0000\u008e\u008f\u0005\u0012\u0000\u0000" +
                    "\u008f\u0090\u0003\u0012\t\u0000\u0090\u0091\u0005\u0010\u0000\u0000\u0091" +
                    "\u0092\u0003\u001c\u000e\u0000\u0092\u0093\u0005\u0011\u0000\u0000\u0093" +
                    "\u0094\u0003\u0004\u0002\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095" +
                    "\u008d\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097" +
                    "\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098" +
                    "\u0011\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a" +
                    "\u009b\u0007\u0000\u0000\u0000\u009b\u0013\u0001\u0000\u0000\u0000\u009c" +
                    "\u009d\u0005\u0014\u0000\u0000\u009d\u009f\u0003 \u0010\u0000\u009e\u00a0" +
                    "\u0007\u0001\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u009f\u00a0" +
                    "\u0001\u0000\u0000\u0000\u00a0\u0015\u0001\u0000\u0000\u0000\u00a1\u00a2" +
                    "\u0005\u0015\u0000\u0000\u00a2\u00a7\u0003\u001a\r\u0000\u00a3\u00a4\u0005" +
                    "!\u0000\u0000\u00a4\u00a6\u0003\u001a\r\u0000\u00a5\u00a3\u0001\u0000" +
                    "\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000" +
                    "\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u0017\u0001\u0000" +
                    "\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ab\u0007\u0002" +
                    "\u0000\u0000\u00ab\u00ac\u0005\"\u0000\u0000\u00ac\u00ad\u0003\u001a\r" +
                    "\u0000\u00ad\u00ae\u0005#\u0000\u0000\u00ae\u0019\u0001\u0000\u0000\u0000" +
                    "\u00af\u00b0\u0003\u001c\u000e\u0000\u00b0\u00b1\u0005$\u0000\u0000\u00b1" +
                    "\u00b2\u0003 \u0010\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b5" +
                    "\u0003 \u0010\u0000\u00b4\u00af\u0001\u0000\u0000\u0000\u00b4\u00b3\u0001" +
                    "\u0000\u0000\u0000\u00b5\u001b\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005" +
                    "\'\u0000\u0000\u00b7\u001d\u0001\u0000\u0000\u0000\u00b8\u00b9\u0007\u0003" +
                    "\u0000\u0000\u00b9\u001f\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\'\u0000" +
                    "\u0000\u00bb!\u0001\u0000\u0000\u0000\u00bc\u00bd\u0007\u0004\u0000\u0000" +
                    "\u00bd#\u0001\u0000\u0000\u0000\u0012&)+/29<DGK]z\u0081\u0086\u0097\u009f" +
                    "\u00a7\u00b4";
    private static final String[] _LITERAL_NAMES = makeLiteralNames();

	private static String[] makeLiteralNames() {
		return new String[] {
                null, "'*'", "'='", "'!='", "'<'", "'>'", "'<='", "'>='", null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, "','",
                "'('", "')'", "'.'", null, null, null, null, "';'"
        };
    }
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "SQLToPandas.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLToPandasParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, "SELECT", "FROM", "WHERE",
                "IN", "BETWEEN", "LIKE", "IS_NULL", "AS", "JOIN", "USING", "AND", "OR",
                "ORDER_BY", "GROUP_BY", "INNER", "LEFT", "RIGHT", "ASC", "DESC", "COUNT",
                "SUM", "AVG", "MAX", "MIN", "LIMIT", "COMMA", "LPAREN", "RPAREN", "DOT",
                "NUMERICAL_VALUE", "STRING_VALUE", "IDENTIFIER", "WS", "SEMICOLON"
		};
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			selectStatement();
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER_BY) {
					{
					setState(37);
					orderByStatement();
					}
				}

				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GROUP_BY) {
					{
					setState(40);
					groupByStatement();
					}
				}

				}
				break;
			}
                setState(47);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LIMIT) {
                    {
                        setState(45);
                        match(LIMIT);
				setState(46);
                        match(NUMERICAL_VALUE);
                    }
                }

                setState(50);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == SEMICOLON) {
                    {
                        setState(49);
                        match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectStatementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SQLToPandasParser.SELECT, 0); }
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQLToPandasParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public JoinClauseContext joinClause() {
			return getRuleContext(JoinClauseContext.class,0);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).exitSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLToPandasVisitor ) return ((SQLToPandasVisitor<? extends T>)visitor).visitSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(52);
			match(SELECT);
                setState(53);
			selectList();
                setState(54);
			match(FROM);
                setState(55);
			tableName();
                setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(56);
                    whereClause();
                }
            }

                setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 29425664L) != 0)) {
				{
                    setState(59);
				joinClause(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectListContext extends ParserRuleContext {
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLToPandasParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLToPandasParser.COMMA, i);
		}
		public SelectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).enterSelectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).exitSelectList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLToPandasVisitor ) return ((SQLToPandasVisitor<? extends T>)visitor).visitSelectList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectListContext selectList() throws RecognitionException {
		SelectListContext _localctx = new SelectListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectList);
		try {
			int _alt;
            setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
                    setState(62);
				match(T__0);
				}
				break;
			case COUNT:
			case SUM:
			case AVG:
			case MAX:
			case MIN:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
                    setState(63);
				selectItem();
                    setState(68);
				_errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
                            setState(64);
						match(COMMA);
                            setState(65);
						selectItem();
						}
						} 
					}
                    setState(70);
					_errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectItemContext extends ParserRuleContext {
		public ColumnReferenceContext columnReference() {
			return getRuleContext(ColumnReferenceContext.class,0);
		}
		public AggregateFunctionContext aggregateFunction() {
			return getRuleContext(AggregateFunctionContext.class,0);
		}
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).enterSelectItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).exitSelectItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLToPandasVisitor ) return ((SQLToPandasVisitor<? extends T>)visitor).visitSelectItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selectItem);
		try {
            setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
                    setState(73);
				columnReference();
				}
				break;
			case COUNT:
			case SUM:
			case AVG:
			case MAX:
			case MIN:
				enterOuterAlt(_localctx, 2);
				{
                    setState(74);
				aggregateFunction();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SQLToPandasParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLToPandasVisitor ) return ((SQLToPandasVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(77);
			match(WHERE);
                setState(78);
			condition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SQLToPandasParser.AND, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode OR() { return getToken(SQLToPandasParser.OR, 0); }
		public TerminalNode LPAREN() { return getToken(SQLToPandasParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SQLToPandasParser.RPAREN, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLToPandasVisitor ) return ((SQLToPandasVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		try {
            setState(93);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
                    setState(80);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(81);
				expression();
                    setState(82);
				match(AND);
                    setState(83);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
                    setState(85);
				expression();
                    setState(86);
				match(OR);
                    setState(87);
				condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
                    setState(89);
				match(LPAREN);
                    setState(90);
				condition();
                    setState(91);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<ColumnReferenceContext> columnReference() {
			return getRuleContexts(ColumnReferenceContext.class);
		}
		public ColumnReferenceContext columnReference(int i) {
			return getRuleContext(ColumnReferenceContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode IN() { return getToken(SQLToPandasParser.IN, 0); }
		public TerminalNode LPAREN() { return getToken(SQLToPandasParser.LPAREN, 0); }
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SQLToPandasParser.RPAREN, 0); }
		public TerminalNode BETWEEN() { return getToken(SQLToPandasParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SQLToPandasParser.AND, 0); }
		public TerminalNode LIKE() { return getToken(SQLToPandasParser.LIKE, 0); }
		public TerminalNode IS_NULL() { return getToken(SQLToPandasParser.IS_NULL, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLToPandasVisitor ) return ((SQLToPandasVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
            setState(122);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
                    setState(95);
				columnReference();
                    setState(96);
				operator();
                    setState(97);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(99);
				columnReference();
                    setState(100);
				operator();
                    setState(101);
				columnReference();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
                    setState(103);
				columnReference();
                    setState(104);
				match(IN);
                    setState(105);
				match(LPAREN);
                    setState(106);
				valueList();
                    setState(107);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
                    setState(109);
				columnReference();
                    setState(110);
				match(BETWEEN);
                    setState(111);
				value();
                    setState(112);
				match(AND);
                    setState(113);
				value();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
                    setState(115);
				columnReference();
                    setState(116);
				match(LIKE);
                    setState(117);
				value();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
                    setState(119);
				columnReference();
                    setState(120);
				match(IS_NULL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueListContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLToPandasParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLToPandasParser.COMMA, i);
		}
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).exitValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLToPandasVisitor ) return ((SQLToPandasVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(124);
			value();
                setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
                    setState(125);
				match(COMMA);
                    setState(126);
				value();
				}
				}
                setState(131);
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

	private JoinClauseContext joinClause(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, _parentState);
		JoinClauseContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_joinClause, _p);
        int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
                setState(134);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) {
                    {
                        setState(133);
                        joinType();
                    }
                }

                setState(136);
			match(JOIN);
                setState(137);
			tableName();
                setState(138);
			match(USING);
                setState(139);
			selectList();
			}
			_ctx.stop = _input.LT(-1);
                setState(151);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JoinClauseContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_joinClause);
                        setState(141);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                        setState(142);
					match(AND);
                        setState(143);
					joinType();
                        setState(144);
					match(JOIN);
                        setState(145);
					tableName();
                        setState(146);
					match(USING);
                        setState(147);
                        selectList();
                    }
                    }
                }
                setState(153);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
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

	public final JoinClauseContext joinClause() throws RecognitionException {
		return joinClause(0);
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_joinType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(154);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SQLToPandasParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(SQLToPandasParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SQLToPandasParser.RIGHT, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLToPandasVisitor ) return ((SQLToPandasVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByStatementContext orderByStatement() throws RecognitionException {
		OrderByStatementContext _localctx = new OrderByStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_orderByStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(156);
			match(ORDER_BY);
                setState(157);
			columnName();
                setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
                    setState(158);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByStatementContext extends ParserRuleContext {
		public TerminalNode ORDER_BY() { return getToken(SQLToPandasParser.ORDER_BY, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SQLToPandasParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLToPandasParser.DESC, 0); }
		public OrderByStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).enterOrderByStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).exitOrderByStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLToPandasVisitor ) return ((SQLToPandasVisitor<? extends T>)visitor).visitOrderByStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByStatementContext groupByStatement() throws RecognitionException {
		GroupByStatementContext _localctx = new GroupByStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_groupByStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(161);
			match(GROUP_BY);
                setState(162);
			columnReference();
                setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
                    setState(163);
				match(COMMA);
                    setState(164);
				columnReference();
				}
				}
                setState(169);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GroupByStatementContext extends ParserRuleContext {
		public TerminalNode GROUP_BY() { return getToken(SQLToPandasParser.GROUP_BY, 0); }
		public List<ColumnReferenceContext> columnReference() {
			return getRuleContexts(ColumnReferenceContext.class);
		}
		public ColumnReferenceContext columnReference(int i) {
			return getRuleContext(ColumnReferenceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLToPandasParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLToPandasParser.COMMA, i);
		}
		public GroupByStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).enterGroupByStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).exitGroupByStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLToPandasVisitor ) return ((SQLToPandasVisitor<? extends T>)visitor).visitGroupByStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateFunctionContext aggregateFunction() throws RecognitionException {
		AggregateFunctionContext _localctx = new AggregateFunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_aggregateFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(170);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4160749568L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
                setState(171);
			match(LPAREN);
                setState(172);
			columnReference();
                setState(173);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AggregateFunctionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SQLToPandasParser.LPAREN, 0); }
		public ColumnReferenceContext columnReference() {
			return getRuleContext(ColumnReferenceContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SQLToPandasParser.RPAREN, 0); }
		public TerminalNode COUNT() { return getToken(SQLToPandasParser.COUNT, 0); }
		public TerminalNode SUM() { return getToken(SQLToPandasParser.SUM, 0); }
		public TerminalNode AVG() { return getToken(SQLToPandasParser.AVG, 0); }
		public TerminalNode MAX() { return getToken(SQLToPandasParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(SQLToPandasParser.MIN, 0); }
		public AggregateFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).enterAggregateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).exitAggregateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLToPandasVisitor ) return ((SQLToPandasVisitor<? extends T>)visitor).visitAggregateFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnReferenceContext columnReference() throws RecognitionException {
		ColumnReferenceContext _localctx = new ColumnReferenceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_columnReference);
		try {
            setState(180);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
                    setState(175);
				tableName();
                    setState(176);
				match(DOT);
                    setState(177);
				columnName();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(179);
				columnName();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnReferenceContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLToPandasParser.DOT, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ColumnReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLToPandasVisitor ) return ((SQLToPandasVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(182);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLToPandasParser.IDENTIFIER, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLToPandasVisitor ) return ((SQLToPandasVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(184);
			_la = _input.LA(1);
			if ( !(_la==NUMERICAL_VALUE || _la==STRING_VALUE) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMERICAL_VALUE() { return getToken(SQLToPandasParser.NUMERICAL_VALUE, 0); }
		public TerminalNode STRING_VALUE() { return getToken(SQLToPandasParser.STRING_VALUE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLToPandasVisitor ) return ((SQLToPandasVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(186);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLToPandasParser.IDENTIFIER, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLToPandasVisitor ) return ((SQLToPandasVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(188);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 252L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLToPandasVisitor ) return ((SQLToPandasVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

    @SuppressWarnings("CheckReturnValue")
    public static class QueryContext extends ParserRuleContext {
        public QueryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public SelectStatementContext selectStatement() {
            return getRuleContext(SelectStatementContext.class, 0);
        }

        public TerminalNode LIMIT() {
            return getToken(SQLToPandasParser.LIMIT, 0);
        }

        public TerminalNode NUMERICAL_VALUE() {
            return getToken(SQLToPandasParser.NUMERICAL_VALUE, 0);
        }

        public TerminalNode SEMICOLON() {
            return getToken(SQLToPandasParser.SEMICOLON, 0);
        }

        public OrderByStatementContext orderByStatement() {
            return getRuleContext(OrderByStatementContext.class, 0);
        }

        public GroupByStatementContext groupByStatement() {
            return getRuleContext(GroupByStatementContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_query;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SQLToPandasListener) ((SQLToPandasListener) listener).enterQuery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SQLToPandasListener) ((SQLToPandasListener) listener).exitQuery(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SQLToPandasVisitor)
                return ((SQLToPandasVisitor<? extends T>) visitor).visitQuery(this);
            else return visitor.visitChildren(this);
        }
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return joinClause_sempred((JoinClauseContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean joinClause_sempred(JoinClauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinClauseContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(SQLToPandasParser.JOIN, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode USING() { return getToken(SQLToPandasParser.USING, 0); }
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}

        public JoinTypeContext joinType() {
            return getRuleContext(JoinTypeContext.class, 0);
        }
		public JoinClauseContext joinClause() {
			return getRuleContext(JoinClauseContext.class,0);
		}
		public TerminalNode AND() { return getToken(SQLToPandasParser.AND, 0); }
		public JoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).enterJoinClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).exitJoinClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLToPandasVisitor ) return ((SQLToPandasVisitor<? extends T>)visitor).visitJoinClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}