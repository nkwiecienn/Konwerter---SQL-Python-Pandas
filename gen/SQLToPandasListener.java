// Generated from C:/Users/Oliwier/IdeaProjects/Konwerter---SQL-Python-Pandas/gen/SQLToPandas.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLToPandasParser}.
 */
public interface SQLToPandasListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLToPandasParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SQLToPandasParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLToPandasParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SQLToPandasParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLToPandasParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(SQLToPandasParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLToPandasParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(SQLToPandasParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLToPandasParser#selectList}.
	 * @param ctx the parse tree
	 */
	void enterSelectList(SQLToPandasParser.SelectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLToPandasParser#selectList}.
	 * @param ctx the parse tree
	 */
	void exitSelectList(SQLToPandasParser.SelectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLToPandasParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterSelectItem(SQLToPandasParser.SelectItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLToPandasParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitSelectItem(SQLToPandasParser.SelectItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLToPandasParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(SQLToPandasParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLToPandasParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(SQLToPandasParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLToPandasParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(SQLToPandasParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLToPandasParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(SQLToPandasParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLToPandasParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SQLToPandasParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLToPandasParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SQLToPandasParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLToPandasParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SQLToPandasParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLToPandasParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SQLToPandasParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLToPandasParser#valueList}.
	 * @param ctx the parse tree
	 */
	void enterValueList(SQLToPandasParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLToPandasParser#valueList}.
	 * @param ctx the parse tree
	 */
	void exitValueList(SQLToPandasParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLToPandasParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinClause(SQLToPandasParser.JoinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLToPandasParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinClause(SQLToPandasParser.JoinClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLToPandasParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(SQLToPandasParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLToPandasParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(SQLToPandasParser.JoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLToPandasParser#orderByStatement}.
	 * @param ctx the parse tree
	 */
	void enterOrderByStatement(SQLToPandasParser.OrderByStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLToPandasParser#orderByStatement}.
	 * @param ctx the parse tree
	 */
	void exitOrderByStatement(SQLToPandasParser.OrderByStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLToPandasParser#orderByList}.
	 * @param ctx the parse tree
	 */
	void enterOrderByList(SQLToPandasParser.OrderByListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLToPandasParser#orderByList}.
	 * @param ctx the parse tree
	 */
	void exitOrderByList(SQLToPandasParser.OrderByListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLToPandasParser#groupByStatement}.
	 * @param ctx the parse tree
	 */
	void enterGroupByStatement(SQLToPandasParser.GroupByStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLToPandasParser#groupByStatement}.
	 * @param ctx the parse tree
	 */
	void exitGroupByStatement(SQLToPandasParser.GroupByStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLToPandasParser#aggregateFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregateFunction(SQLToPandasParser.AggregateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLToPandasParser#aggregateFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregateFunction(SQLToPandasParser.AggregateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLToPandasParser#columnReference}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(SQLToPandasParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLToPandasParser#columnReference}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(SQLToPandasParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLToPandasParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SQLToPandasParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLToPandasParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SQLToPandasParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLToPandasParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SQLToPandasParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLToPandasParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SQLToPandasParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLToPandasParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(SQLToPandasParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLToPandasParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(SQLToPandasParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLToPandasParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaName(SQLToPandasParser.SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLToPandasParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaName(SQLToPandasParser.SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLToPandasParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(SQLToPandasParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLToPandasParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(SQLToPandasParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLToPandasParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(SQLToPandasParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLToPandasParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(SQLToPandasParser.OperatorContext ctx);
}