// Generated from C:/Users/Oliwier/IdeaProjects/Konwerter---SQL-Python-Pandas/gen/SQLToPandas.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SQLToPandasParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, SELECT=8, FROM=9, 
		WHERE=10, IN=11, BETWEEN=12, LIKE=13, IS_NULL=14, AS=15, JOIN=16, ON=17, 
		AND=18, OR=19, ORDER_BY=20, GROUP_BY=21, INNER=22, LEFT=23, RIGHT=24, 
		ASC=25, DESC=26, COUNT=27, SUM=28, AVG=29, MAX=30, MIN=31, COMMA=32, LPAREN=33, 
		RPAREN=34, DOT=35, NUMERICAL_VALUE=36, STRING_VALUE=37, IDENTIFIER=38, 
		WS=39;
	public static final int
		RULE_query = 0, RULE_selectStatement = 1, RULE_selectList = 2, RULE_selectItem = 3, 
		RULE_tableReference = 4, RULE_whereClause = 5, RULE_condition = 6, RULE_expression = 7, 
		RULE_valueList = 8, RULE_joinClause = 9, RULE_joinType = 10, RULE_orderByStatement = 11, 
		RULE_orderByList = 12, RULE_groupByStatement = 13, RULE_aggregateFunction = 14, 
		RULE_columnReference = 15, RULE_tableName = 16, RULE_value = 17, RULE_columnName = 18, 
		RULE_schemaName = 19, RULE_alias = 20, RULE_operator = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "selectStatement", "selectList", "selectItem", "tableReference", 
			"whereClause", "condition", "expression", "valueList", "joinClause", 
			"joinType", "orderByStatement", "orderByList", "groupByStatement", "aggregateFunction", 
			"columnReference", "tableName", "value", "columnName", "schemaName", 
			"alias", "operator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'='", "'!='", "'<'", "'>'", "'<='", "'>='", "'SELECT'", 
			"'FROM'", "'WHERE'", "'IN'", "'BETWEEN'", "'LIKE'", "'IS NULL'", "'AS'", 
			"'JOIN'", "'ON'", "'AND'", "'OR'", "'ORDER BY'", "'GROUP BY'", "'INNER'", 
			"'LEFT'", "'RIGHT'", "'ASC'", "'DESC'", "'COUNT'", "'SUM'", "'AVG'", 
			"'MAX'", "'MIN'", "','", "'('", "')'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "SELECT", "FROM", "WHERE", 
			"IN", "BETWEEN", "LIKE", "IS_NULL", "AS", "JOIN", "ON", "AND", "OR", 
			"ORDER_BY", "GROUP_BY", "INNER", "LEFT", "RIGHT", "ASC", "DESC", "COUNT", 
			"SUM", "AVG", "MAX", "MIN", "COMMA", "LPAREN", "RPAREN", "DOT", "NUMERICAL_VALUE", 
			"STRING_VALUE", "IDENTIFIER", "WS"
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

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public List<SelectStatementContext> selectStatement() {
			return getRuleContexts(SelectStatementContext.class);
		}
		public SelectStatementContext selectStatement(int i) {
			return getRuleContext(SelectStatementContext.class,i);
		}
		public List<OrderByStatementContext> orderByStatement() {
			return getRuleContexts(OrderByStatementContext.class);
		}
		public OrderByStatementContext orderByStatement(int i) {
			return getRuleContext(OrderByStatementContext.class,i);
		}
		public List<GroupByStatementContext> groupByStatement() {
			return getRuleContexts(GroupByStatementContext.class);
		}
		public GroupByStatementContext groupByStatement(int i) {
			return getRuleContext(GroupByStatementContext.class,i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLToPandasVisitor ) return ((SQLToPandasVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SELECT) {
				{
				{
				setState(44);
				selectStatement();
				setState(51);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER_BY) {
						{
						setState(45);
						orderByStatement();
						}
					}

					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GROUP_BY) {
						{
						setState(48);
						groupByStatement();
						}
					}

					}
					break;
				}
				}
				}
				setState(57);
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
	public static class SelectStatementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SQLToPandasParser.SELECT, 0); }
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQLToPandasParser.FROM, 0); }
		public TableReferenceContext tableReference() {
			return getRuleContext(TableReferenceContext.class,0);
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
			setState(58);
			match(SELECT);
			setState(59);
			selectList();
			setState(60);
			match(FROM);
			setState(61);
			tableReference();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(62);
				whereClause();
				}
			}

			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) {
				{
				setState(65);
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
		int _la;
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
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
				setState(69);
				selectItem();
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(70);
					match(COMMA);
					setState(71);
					selectItem();
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
		public TerminalNode AS() { return getToken(SQLToPandasParser.AS, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
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
		int _la;
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
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
				setState(80);
				aggregateFunction();
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(81);
					match(AS);
					setState(82);
					alias();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TableReferenceContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLToPandasParser.AS, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).enterTableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).exitTableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLToPandasVisitor ) return ((SQLToPandasVisitor<? extends T>)visitor).visitTableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferenceContext tableReference() throws RecognitionException {
		TableReferenceContext _localctx = new TableReferenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tableReference);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				tableName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				tableName();
				setState(89);
				match(AS);
				setState(90);
				alias();
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
		enterRule(_localctx, 10, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(WHERE);
			setState(95);
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
		enterRule(_localctx, 12, RULE_condition);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				expression();
				setState(99);
				match(AND);
				setState(100);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				expression();
				setState(103);
				match(OR);
				setState(104);
				condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				match(LPAREN);
				setState(107);
				condition();
				setState(108);
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
		enterRule(_localctx, 14, RULE_expression);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				columnReference();
				setState(113);
				operator();
				setState(114);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				columnReference();
				setState(117);
				operator();
				setState(118);
				columnReference();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				columnReference();
				setState(121);
				match(IN);
				setState(122);
				match(LPAREN);
				setState(123);
				valueList();
				setState(124);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				columnReference();
				setState(127);
				match(BETWEEN);
				setState(128);
				value();
				setState(129);
				match(AND);
				setState(130);
				value();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				columnReference();
				setState(133);
				match(LIKE);
				setState(134);
				value();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				columnReference();
				setState(137);
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
		enterRule(_localctx, 16, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			value();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(142);
				match(COMMA);
				setState(143);
				value();
				}
				}
				setState(148);
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
	public static class JoinClauseContext extends ParserRuleContext {
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(SQLToPandasParser.JOIN, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(SQLToPandasParser.ON, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
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

	public final JoinClauseContext joinClause() throws RecognitionException {
		return joinClause(0);
	}

	private JoinClauseContext joinClause(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, _parentState);
		JoinClauseContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_joinClause, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(150);
			joinType();
			setState(151);
			match(JOIN);
			setState(152);
			tableName();
			setState(153);
			match(ON);
			setState(154);
			condition();
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JoinClauseContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_joinClause);
					setState(156);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(157);
					match(AND);
					setState(158);
					joinType();
					setState(159);
					match(JOIN);
					setState(160);
					tableName();
					setState(161);
					match(ON);
					setState(162);
					condition();
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_joinType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
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
	public static class OrderByStatementContext extends ParserRuleContext {
		public TerminalNode ORDER_BY() { return getToken(SQLToPandasParser.ORDER_BY, 0); }
		public OrderByListContext orderByList() {
			return getRuleContext(OrderByListContext.class,0);
		}
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

	public final OrderByStatementContext orderByStatement() throws RecognitionException {
		OrderByStatementContext _localctx = new OrderByStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_orderByStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(ORDER_BY);
			setState(172);
			orderByList();
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
	public static class OrderByListContext extends ParserRuleContext {
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
		public List<TerminalNode> ASC() { return getTokens(SQLToPandasParser.ASC); }
		public TerminalNode ASC(int i) {
			return getToken(SQLToPandasParser.ASC, i);
		}
		public List<TerminalNode> DESC() { return getTokens(SQLToPandasParser.DESC); }
		public TerminalNode DESC(int i) {
			return getToken(SQLToPandasParser.DESC, i);
		}
		public OrderByListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).enterOrderByList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).exitOrderByList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLToPandasVisitor ) return ((SQLToPandasVisitor<? extends T>)visitor).visitOrderByList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByListContext orderByList() throws RecognitionException {
		OrderByListContext _localctx = new OrderByListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_orderByList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			columnReference();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(175);
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

			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(178);
				match(COMMA);
				setState(179);
				columnReference();
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(180);
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
				setState(187);
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

	public final GroupByStatementContext groupByStatement() throws RecognitionException {
		GroupByStatementContext _localctx = new GroupByStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_groupByStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(GROUP_BY);
			setState(189);
			columnReference();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(190);
				match(COMMA);
				setState(191);
				columnReference();
				}
				}
				setState(196);
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

	public final AggregateFunctionContext aggregateFunction() throws RecognitionException {
		AggregateFunctionContext _localctx = new AggregateFunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_aggregateFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4160749568L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(198);
			match(LPAREN);
			setState(199);
			columnReference();
			setState(200);
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

	public final ColumnReferenceContext columnReference() throws RecognitionException {
		ColumnReferenceContext _localctx = new ColumnReferenceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_columnReference);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(202);
				tableName();
				setState(203);
				match(DOT);
				setState(204);
				columnName();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
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
	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLToPandasParser.IDENTIFIER, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLToPandasParser.DOT, 0); }
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

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(209);
				schemaName();
				setState(210);
				match(DOT);
				}
				break;
			}
			setState(214);
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

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
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

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
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
	public static class SchemaNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLToPandasParser.IDENTIFIER, 0); }
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).enterSchemaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).exitSchemaName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLToPandasVisitor ) return ((SQLToPandasVisitor<? extends T>)visitor).visitSchemaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
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
	public static class AliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLToPandasParser.IDENTIFIER, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLToPandasListener ) ((SQLToPandasListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLToPandasVisitor ) return ((SQLToPandasVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
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

	public static final String _serializedATN =
		"\u0004\u0001\'\u00e3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0003\u0000/\b\u0000\u0001\u0000\u0003\u0000"+
		"2\b\u0000\u0003\u00004\b\u0000\u0005\u00006\b\u0000\n\u0000\f\u00009\t"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001@\b\u0001\u0001\u0001\u0003\u0001C\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002I\b\u0002\n\u0002\f\u0002L\t\u0002"+
		"\u0003\u0002N\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003T\b\u0003\u0003\u0003V\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004]\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006o\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u008c\b\u0007\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u0091\b\b\n\b\f\b\u0094\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u00a5\b\t\n\t\f\t\u00a8\t\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f\u00b1\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00b6\b\f\u0005\f\u00b8\b\f\n\f\f\f\u00bb\t\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u00c1\b\r\n\r\f\r\u00c4\t\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00d0\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u00d5\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0000\u0001"+
		"\u0012\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*\u0000\u0005\u0001\u0000\u0016\u0018\u0001"+
		"\u0000\u0019\u001a\u0001\u0000\u001b\u001f\u0001\u0000$%\u0001\u0000\u0002"+
		"\u0007\u00e7\u00007\u0001\u0000\u0000\u0000\u0002:\u0001\u0000\u0000\u0000"+
		"\u0004M\u0001\u0000\u0000\u0000\u0006U\u0001\u0000\u0000\u0000\b\\\u0001"+
		"\u0000\u0000\u0000\n^\u0001\u0000\u0000\u0000\fn\u0001\u0000\u0000\u0000"+
		"\u000e\u008b\u0001\u0000\u0000\u0000\u0010\u008d\u0001\u0000\u0000\u0000"+
		"\u0012\u0095\u0001\u0000\u0000\u0000\u0014\u00a9\u0001\u0000\u0000\u0000"+
		"\u0016\u00ab\u0001\u0000\u0000\u0000\u0018\u00ae\u0001\u0000\u0000\u0000"+
		"\u001a\u00bc\u0001\u0000\u0000\u0000\u001c\u00c5\u0001\u0000\u0000\u0000"+
		"\u001e\u00cf\u0001\u0000\u0000\u0000 \u00d4\u0001\u0000\u0000\u0000\""+
		"\u00d8\u0001\u0000\u0000\u0000$\u00da\u0001\u0000\u0000\u0000&\u00dc\u0001"+
		"\u0000\u0000\u0000(\u00de\u0001\u0000\u0000\u0000*\u00e0\u0001\u0000\u0000"+
		"\u0000,3\u0003\u0002\u0001\u0000-/\u0003\u0016\u000b\u0000.-\u0001\u0000"+
		"\u0000\u0000./\u0001\u0000\u0000\u0000/1\u0001\u0000\u0000\u000002\u0003"+
		"\u001a\r\u000010\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000024\u0001"+
		"\u0000\u0000\u00003.\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"+
		"46\u0001\u0000\u0000\u00005,\u0001\u0000\u0000\u000069\u0001\u0000\u0000"+
		"\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008\u0001\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u0000:;\u0005\b\u0000\u0000;<\u0003"+
		"\u0004\u0002\u0000<=\u0005\t\u0000\u0000=?\u0003\b\u0004\u0000>@\u0003"+
		"\n\u0005\u0000?>\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@B\u0001"+
		"\u0000\u0000\u0000AC\u0003\u0012\t\u0000BA\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000C\u0003\u0001\u0000\u0000\u0000DN\u0005\u0001\u0000"+
		"\u0000EJ\u0003\u0006\u0003\u0000FG\u0005 \u0000\u0000GI\u0003\u0006\u0003"+
		"\u0000HF\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000MD\u0001\u0000\u0000\u0000ME\u0001\u0000\u0000\u0000"+
		"N\u0005\u0001\u0000\u0000\u0000OV\u0003\u001e\u000f\u0000PS\u0003\u001c"+
		"\u000e\u0000QR\u0005\u000f\u0000\u0000RT\u0003(\u0014\u0000SQ\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000UO\u0001"+
		"\u0000\u0000\u0000UP\u0001\u0000\u0000\u0000V\u0007\u0001\u0000\u0000"+
		"\u0000W]\u0003 \u0010\u0000XY\u0003 \u0010\u0000YZ\u0005\u000f\u0000\u0000"+
		"Z[\u0003(\u0014\u0000[]\u0001\u0000\u0000\u0000\\W\u0001\u0000\u0000\u0000"+
		"\\X\u0001\u0000\u0000\u0000]\t\u0001\u0000\u0000\u0000^_\u0005\n\u0000"+
		"\u0000_`\u0003\f\u0006\u0000`\u000b\u0001\u0000\u0000\u0000ao\u0003\u000e"+
		"\u0007\u0000bc\u0003\u000e\u0007\u0000cd\u0005\u0012\u0000\u0000de\u0003"+
		"\f\u0006\u0000eo\u0001\u0000\u0000\u0000fg\u0003\u000e\u0007\u0000gh\u0005"+
		"\u0013\u0000\u0000hi\u0003\f\u0006\u0000io\u0001\u0000\u0000\u0000jk\u0005"+
		"!\u0000\u0000kl\u0003\f\u0006\u0000lm\u0005\"\u0000\u0000mo\u0001\u0000"+
		"\u0000\u0000na\u0001\u0000\u0000\u0000nb\u0001\u0000\u0000\u0000nf\u0001"+
		"\u0000\u0000\u0000nj\u0001\u0000\u0000\u0000o\r\u0001\u0000\u0000\u0000"+
		"pq\u0003\u001e\u000f\u0000qr\u0003*\u0015\u0000rs\u0003\"\u0011\u0000"+
		"s\u008c\u0001\u0000\u0000\u0000tu\u0003\u001e\u000f\u0000uv\u0003*\u0015"+
		"\u0000vw\u0003\u001e\u000f\u0000w\u008c\u0001\u0000\u0000\u0000xy\u0003"+
		"\u001e\u000f\u0000yz\u0005\u000b\u0000\u0000z{\u0005!\u0000\u0000{|\u0003"+
		"\u0010\b\u0000|}\u0005\"\u0000\u0000}\u008c\u0001\u0000\u0000\u0000~\u007f"+
		"\u0003\u001e\u000f\u0000\u007f\u0080\u0005\f\u0000\u0000\u0080\u0081\u0003"+
		"\"\u0011\u0000\u0081\u0082\u0005\u0012\u0000\u0000\u0082\u0083\u0003\""+
		"\u0011\u0000\u0083\u008c\u0001\u0000\u0000\u0000\u0084\u0085\u0003\u001e"+
		"\u000f\u0000\u0085\u0086\u0005\r\u0000\u0000\u0086\u0087\u0003\"\u0011"+
		"\u0000\u0087\u008c\u0001\u0000\u0000\u0000\u0088\u0089\u0003\u001e\u000f"+
		"\u0000\u0089\u008a\u0005\u000e\u0000\u0000\u008a\u008c\u0001\u0000\u0000"+
		"\u0000\u008bp\u0001\u0000\u0000\u0000\u008bt\u0001\u0000\u0000\u0000\u008b"+
		"x\u0001\u0000\u0000\u0000\u008b~\u0001\u0000\u0000\u0000\u008b\u0084\u0001"+
		"\u0000\u0000\u0000\u008b\u0088\u0001\u0000\u0000\u0000\u008c\u000f\u0001"+
		"\u0000\u0000\u0000\u008d\u0092\u0003\"\u0011\u0000\u008e\u008f\u0005 "+
		"\u0000\u0000\u008f\u0091\u0003\"\u0011\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0011\u0001\u0000\u0000"+
		"\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0006\t\uffff\uffff"+
		"\u0000\u0096\u0097\u0003\u0014\n\u0000\u0097\u0098\u0005\u0010\u0000\u0000"+
		"\u0098\u0099\u0003 \u0010\u0000\u0099\u009a\u0005\u0011\u0000\u0000\u009a"+
		"\u009b\u0003\f\u0006\u0000\u009b\u00a6\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\n\u0001\u0000\u0000\u009d\u009e\u0005\u0012\u0000\u0000\u009e\u009f\u0003"+
		"\u0014\n\u0000\u009f\u00a0\u0005\u0010\u0000\u0000\u00a0\u00a1\u0003 "+
		"\u0010\u0000\u00a1\u00a2\u0005\u0011\u0000\u0000\u00a2\u00a3\u0003\f\u0006"+
		"\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u009c\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u0013\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00aa\u0007\u0000\u0000"+
		"\u0000\u00aa\u0015\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u0014\u0000"+
		"\u0000\u00ac\u00ad\u0003\u0018\f\u0000\u00ad\u0017\u0001\u0000\u0000\u0000"+
		"\u00ae\u00b0\u0003\u001e\u000f\u0000\u00af\u00b1\u0007\u0001\u0000\u0000"+
		"\u00b0\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b9\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005 \u0000\u0000\u00b3"+
		"\u00b5\u0003\u001e\u000f\u0000\u00b4\u00b6\u0007\u0001\u0000\u0000\u00b5"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b2\u0001\u0000\u0000\u0000\u00b8"+
		"\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0001\u0000\u0000\u0000\u00ba\u0019\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0015\u0000\u0000\u00bd"+
		"\u00c2\u0003\u001e\u000f\u0000\u00be\u00bf\u0005 \u0000\u0000\u00bf\u00c1"+
		"\u0003\u001e\u000f\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c3\u001b\u0001\u0000\u0000\u0000\u00c4\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c6\u0007\u0002\u0000\u0000\u00c6\u00c7"+
		"\u0005!\u0000\u0000\u00c7\u00c8\u0003\u001e\u000f\u0000\u00c8\u00c9\u0005"+
		"\"\u0000\u0000\u00c9\u001d\u0001\u0000\u0000\u0000\u00ca\u00cb\u0003 "+
		"\u0010\u0000\u00cb\u00cc\u0005#\u0000\u0000\u00cc\u00cd\u0003$\u0012\u0000"+
		"\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00d0\u0003$\u0012\u0000\u00cf"+
		"\u00ca\u0001\u0000\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0"+
		"\u001f\u0001\u0000\u0000\u0000\u00d1\u00d2\u0003&\u0013\u0000\u00d2\u00d3"+
		"\u0005#\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0005&\u0000\u0000\u00d7!\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0007\u0003\u0000\u0000\u00d9#\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0005&\u0000\u0000\u00db%\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0005&\u0000\u0000\u00dd\'\u0001\u0000\u0000\u0000\u00de\u00df\u0005"+
		"&\u0000\u0000\u00df)\u0001\u0000\u0000\u0000\u00e0\u00e1\u0007\u0004\u0000"+
		"\u0000\u00e1+\u0001\u0000\u0000\u0000\u0015.137?BJMSU\\n\u008b\u0092\u00a6"+
		"\u00b0\u00b5\u00b9\u00c2\u00cf\u00d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}