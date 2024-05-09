// Generated from C:/Users/natal/IdeaProjects/FinalVersionKompilatory/Konwerter---SQL-Python-Pandas-main/gen/SQLToPandas.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLToPandasParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLToPandasVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLToPandasParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(SQLToPandasParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLToPandasParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(SQLToPandasParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLToPandasParser#selectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectList(SQLToPandasParser.SelectListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLToPandasParser#selectItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectItem(SQLToPandasParser.SelectItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLToPandasParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(SQLToPandasParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLToPandasParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(SQLToPandasParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLToPandasParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SQLToPandasParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLToPandasParser#valueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(SQLToPandasParser.ValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLToPandasParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinClause(SQLToPandasParser.JoinClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLToPandasParser#joinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinType(SQLToPandasParser.JoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLToPandasParser#orderByStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByStatement(SQLToPandasParser.OrderByStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLToPandasParser#groupByStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByStatement(SQLToPandasParser.GroupByStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLToPandasParser#aggregateFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateFunction(SQLToPandasParser.AggregateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLToPandasParser#columnReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnReference(SQLToPandasParser.ColumnReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLToPandasParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SQLToPandasParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLToPandasParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SQLToPandasParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLToPandasParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(SQLToPandasParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLToPandasParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(SQLToPandasParser.OperatorContext ctx);
}