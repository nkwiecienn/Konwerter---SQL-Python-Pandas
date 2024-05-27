import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;

public class AntlrParser extends SQLToPandasBaseVisitor<String> {
    ArrayList<String> tableNames = new ArrayList<>();
    StringBuilder aggregateFunction = new StringBuilder();

    @Override
    public String visitQuery(SQLToPandasParser.QueryContext ctx) {
        StringBuilder query = new StringBuilder();
        query.append(visitSelectStatement(ctx.selectStatement()));

        if (ctx.orderByStatement() != null) {
            query.append(visitOrderByStatement(ctx.orderByStatement()));
        }
        if (ctx.groupByStatement() != null) {
            query.append(visitGroupByStatement(ctx.groupByStatement()));
        }
        if (aggregateFunction.length() > 0) {
            query.append(aggregateFunction);
        }

        return query.toString();
    }

    @Override
    public String visitSelectStatement(SQLToPandasParser.SelectStatementContext ctx) {
        StringBuilder selectStatement = new StringBuilder();
        String tableName = visitTableName(ctx.tableName());
        selectStatement.append(tableName);
        tableNames.add(tableName);

        boolean hasWhereClause = ctx.whereClause() != null;
        if (ctx.joinClause() != null) {
            selectStatement.append(visitJoinClause(ctx.joinClause()));
        }
        if (hasWhereClause) {
            selectStatement.append(visitWhereClause(ctx.whereClause()));
        }
        if (ctx.selectList() != null && !visitSelectList(ctx.selectList()).equals("*")) {
            selectStatement.append("[[").append(visitSelectListWithoutTable(ctx.selectList())).append("]]");
        }

        return selectStatement.toString();
    }

    @Override
    public String visitSelectList(SQLToPandasParser.SelectListContext ctx) {
        StringBuilder selectList = new StringBuilder();

        if (ctx.getChild(0).toString().equals("*")) {
            return "*";
        }

        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (!ctx.getChild(i).getText().equals(",")) {
                if (selectList.length() > 0) {
                    selectList.append(", ");
                }
                selectList.append(visit(ctx.getChild(i)));
            }
        }
        return selectList.toString();
    }

    private String visitSelectListWithoutTable(SQLToPandasParser.SelectListContext ctx) {
        StringBuilder selectList = new StringBuilder();

        if (ctx.getChild(0).toString().equals("*")) {
            return "*";
        }

        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (!ctx.getChild(i).getText().equals(",")) {
                if (selectList.length() > 0) {
                    selectList.append(", ");
                }
                selectList.append("'").append(ctx.getChild(i).getText()).append("'");
            }
        }
        return selectList.toString();
    }

    @Override
    public String visitSelectItem(SQLToPandasParser.SelectItemContext ctx) {
        if (ctx.columnReference() != null) {
            return visitColumnReference(ctx.columnReference());
        }
        visitAggregateFunction(ctx.aggregateFunction());
        return "";
    }

    @Override
    public String visitWhereClause(SQLToPandasParser.WhereClauseContext ctx) {
        return "[" + visit(ctx.condition()) + "]";
    }

    @Override
    public String visitCondition(SQLToPandasParser.ConditionContext ctx) {
        StringBuilder condition = new StringBuilder();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof SQLToPandasParser.ExpressionContext) {
                if (condition.length() > 0 && !condition.toString().endsWith("& ") && !condition.toString().endsWith("| ")) {
                    condition.append(" & ");
                }
                condition.append("(").append(visit(child)).append(")");
            } else if (child instanceof SQLToPandasParser.ConditionContext) {
                if (condition.length() > 0 && !condition.toString().endsWith("& ") && !condition.toString().endsWith("| ")) {
                    condition.append(" & ");
                }
                condition.append(visit(child));
            } else if (child.getText().equalsIgnoreCase("AND")) {
                condition.append(" & ");
            } else if (child.getText().equalsIgnoreCase("OR")) {
                condition.append(" | ");
            } else if (child.getText().equals("(")) {
                condition.append("(");
            } else if (child.getText().equals(")")) {
                condition.append(")");
            }
        }

        return condition.toString();
    }

    @Override
    public String visitExpression(SQLToPandasParser.ExpressionContext ctx) {
        StringBuilder expression = new StringBuilder();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof SQLToPandasParser.ColumnReferenceContext) {
                expression.append(visitColumnReference((SQLToPandasParser.ColumnReferenceContext) child));
            } else if (child instanceof SQLToPandasParser.OperatorContext) {
                String operator = visit(child);
                if (operator.equals("=")) {
                    operator = "==";
                }
                expression.append(" ").append(operator).append(" ");
            } else if (child instanceof SQLToPandasParser.ValueContext) {
                expression.append(visit(child));
            }
        }

        return expression.toString().trim();
    }

    @Override
    public String visitValueList(SQLToPandasParser.ValueListContext ctx) {
        StringBuilder valueList = new StringBuilder();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            valueList.append(ctx.getChild(i).toString());
        }

        return valueList.toString();
    }

    @Override
    public String visitJoinClause(SQLToPandasParser.JoinClauseContext ctx) {
        StringBuilder joinClause = new StringBuilder();

        joinClause.append(".merge(").append(visitTableName(ctx.tableName()));
        joinClause.append(", on=").append(visitJoinColumnList(ctx.selectList()));
        joinClause.append(", how=").append(visitJoinType(ctx.joinType()));
        joinClause.append(")");

        if (ctx.joinClause() != null) {
            joinClause.append(visitJoinClause(ctx.joinClause()));
        }

        return joinClause.toString();
    }

    @Override
    public String visitJoinType(SQLToPandasParser.JoinTypeContext ctx) {
        return "'" + ctx.getText().toLowerCase() + "'";
    }

    @Override
    public String visitOrderByStatement(SQLToPandasParser.OrderByStatementContext ctx) {
        StringBuilder orderByStatement = new StringBuilder();

        orderByStatement.append(".sort_values(by=").append(visitColumnName(ctx.columnName()));
        if (ctx.DESC() != null) {
            orderByStatement.append(", ascending=False");
        } else {
            orderByStatement.append(", ascending=True");
        }
        orderByStatement.append(")");

        return orderByStatement.toString();
    }

    @Override
    public String visitGroupByStatement(SQLToPandasParser.GroupByStatementContext ctx) {
        StringBuilder groupByStatement = new StringBuilder();

        groupByStatement.append(".groupby(");

        for (int i = 0; i < ctx.columnReference().size(); i++) {
            groupByStatement.append(visitColumnReference(ctx.columnReference(i)));

            if (i != ctx.columnReference().size() - 1) {
                groupByStatement.append(", ");
            }
        }

        groupByStatement.append(")");

        return groupByStatement.toString();
    }

    @Override
    public String visitAggregateFunction(SQLToPandasParser.AggregateFunctionContext ctx) {
        aggregateFunction.append(".agg({").append(visitColumnReference(ctx.columnReference()));
        aggregateFunction.append(": '").append(ctx.getChild(0).getText().toLowerCase()).append("'");
        aggregateFunction.append("})");
        return "";
    }

    @Override
    public String visitColumnReference(SQLToPandasParser.ColumnReferenceContext ctx) {
        return tableNames.get(0) + "['" + ctx.getText() + "']";
    }

    @Override
    public String visitTableName(SQLToPandasParser.TableNameContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitValue(SQLToPandasParser.ValueContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitColumnName(SQLToPandasParser.ColumnNameContext ctx) {
        return "'" + ctx.getText() + "'";
    }

    @Override
    public String visitOperator(SQLToPandasParser.OperatorContext ctx) {
        return ctx.getText();
    }

    private String visitJoinColumnList(SQLToPandasParser.SelectListContext ctx) {
        StringBuilder columns = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (!ctx.getChild(i).getText().equals(",")) {
                if (columns.length() > 0) {
                    columns.append(", ");
                }
                columns.append("'").append(ctx.getChild(i).getText()).append("'");
            }
        }
        return "[" + columns + "]";
    }
}
