import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;

/**
 * TODO:
 * - zabaczyć czy ctx.getChild(i) działa tak jak myśle
 */

public class AntlrParser extends SQLToPandasBaseVisitor<String> {
    ArrayList<String> tableNames = new ArrayList<>();
    StringBuilder aggregateFunction = new StringBuilder();

    @Override
    public String visitQuery(SQLToPandasParser.QueryContext ctx) {
        StringBuilder query = new StringBuilder();
        query.append(visitSelectStatement(ctx.selectStatement()));

        if(ctx.orderByStatement() != null) {
            query.append(visitOrderByStatement(ctx.orderByStatement()));
        }
        if(ctx.groupByStatement() != null) {
            query.append(visitGroupByStatement(ctx.groupByStatement()));
        }

        if(aggregateFunction != null) {
            query.append(aggregateFunction);
        }

        return query.toString();
    }

    @Override
    public String visitSelectStatement(SQLToPandasParser.SelectStatementContext ctx) {
        StringBuilder selectStatement = new StringBuilder();
        selectStatement.append(visitTableName(ctx.tableName()));
        tableNames.add(visitTableName(ctx.tableName()));

        if(ctx.joinClause() != null) {
            selectStatement.append(visitJoinClause(ctx.joinClause()));
        }
        if(ctx.whereClause() != null) {
            selectStatement.append("[").append(visitWhereClause(ctx.whereClause()));
            if(ctx.selectList() != null) {
                selectStatement.append(",");
                selectStatement.append(visitSelectList(ctx.selectList()));
            }
            selectStatement.append("]");
        } else if (!visitSelectList(ctx.selectList()).equals("*")) {
            selectStatement.append("[").append(visitSelectList(ctx.selectList())).append("]");
        }

        return selectStatement.toString();
    }

    @Override
    public String visitSelectList(SQLToPandasParser.SelectListContext ctx) {
        StringBuilder selectList = new StringBuilder();

        if(ctx.getChild(0).toString().equals("*")) {
            return "*";
        }

        for(int i = 0; i < ctx.getChildCount(); i++) {
            if (!ctx.getChild(i).getText().equals(",")) {
                selectList.append(visit(ctx.getChild(i)));
            } else if (!ctx.getChild(i).toString().equals("agg")){
                selectList.append("'").append(ctx.getChild(i).toString()).append("'");
            }
        }
        return selectList.toString();
    }

    @Override
    public String visitSelectItem(SQLToPandasParser.SelectItemContext ctx) {
        StringBuilder selectItem = new StringBuilder();
        if(ctx.columnReference() != null) {
            selectItem.append(visitColumnReference(ctx.columnReference()));
            return selectItem.toString();
        }
        visitAggregateFunction(ctx.aggregateFunction());
        return "agg";
    }

    @Override
    public String visitWhereClause(SQLToPandasParser.WhereClauseContext ctx) {
        return visitCondition(ctx.condition());
    }

    @Override
    public String visitCondition(SQLToPandasParser.ConditionContext ctx) {
        StringBuilder condition = new StringBuilder();
        for(int i = 0; i < ctx.getChildCount(); i++) {
            condition.append(ctx.getChild(i).toString());
        }
        return condition.toString();
    }

    @Override
    public String visitExpression(SQLToPandasParser.ExpressionContext ctx) {
        StringBuilder expression = new StringBuilder();
        ArrayList<String> tables = new ArrayList<>();
        ArrayList<String> columnReferences = new ArrayList<>();
        int tablesCount = tableNames.size();
        int currentReferenceIndex = 0;

        for(int i = 0; i < ctx.columnReference().size(); i++) {
            columnReferences.add(visitColumnReference(ctx.columnReference(i)));
            if(tablesCount == tableNames.size()) {
                tables.add(tableNames.get(0));
            } else {
                tablesCount += 1;
                tables.add(tableNames.get(tableNames.size() - 1));
            }
        }

        for(int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if(child instanceof SQLToPandasParser.ColumnReferenceContext) {
                expression.append(tables.get(currentReferenceIndex)).append("[").append(columnReferences.get(currentReferenceIndex)).append("]");
                currentReferenceIndex += 1;
            } else {
                expression.append(ctx.getChild(i).toString());
            }
        }

        return expression.toString();
    }

    @Override
    public String visitValueList(SQLToPandasParser.ValueListContext ctx) {
        StringBuilder valueList = new StringBuilder();

        for(int i = 0; i < ctx.getChildCount(); i++) {
            valueList.append(ctx.getChild(i).toString());
        }

        return valueList.toString();
    }

    @Override
    public String visitJoinClause(SQLToPandasParser.JoinClauseContext ctx) {
        StringBuilder joinClause = new StringBuilder();

        joinClause.append(".join(").append(visitTableName(ctx.tableName()));
        joinClause.append(", on=").append(visitSelectList(ctx.selectList()));
        joinClause.append(", how=").append(visitJoinType(ctx.joinType()));
        joinClause.append(")");

        if(ctx.joinClause() != null) {
            StringBuilder begin = new StringBuilder();
            begin.append(visitJoinClause(ctx.joinClause()));

            joinClause.reverse();
            begin.reverse();

            joinClause.append(begin);
            joinClause.reverse();
        }

        return joinClause.toString();
    }

    @Override
    public String visitJoinType(SQLToPandasParser.JoinTypeContext ctx) {
        return "'" + ctx.getText() + "'";
    }

    @Override
    public String visitOrderByStatement(SQLToPandasParser.OrderByStatementContext ctx) {
        StringBuilder orderByStatement = new StringBuilder();

        orderByStatement.append(".groupby(by=").append(visitColumnName(ctx.columnName()));
        orderByStatement.append(",axis=1");
        if(ctx.DESC().getText() != null) {
            orderByStatement.append(", ascending=False");
        }
        orderByStatement.append(")");

        return orderByStatement.toString();
    }

    @Override
    public String visitGroupByStatement(SQLToPandasParser.GroupByStatementContext ctx) {
        StringBuilder groupByStatement = new StringBuilder();

        groupByStatement.append(".groupby(by=");

        for(int i = 0; i < ctx.columnReference().size(); i++) {
            groupByStatement.append(visitColumnReference(ctx.columnReference(i)));

            if(i != ctx.columnReference().size() - 1) {
                groupByStatement.append(",");
            }
        }

        groupByStatement.append(")");

        return groupByStatement.toString();
    }

    @Override
    public String visitAggregateFunction(SQLToPandasParser.AggregateFunctionContext ctx) {
        aggregateFunction.append(".agg({").append(visitColumnReference(ctx.columnReference()));
        aggregateFunction.append(": ").append(ctx.getChild(0).getText().toLowerCase());
        aggregateFunction.append(")");
        return "";
    }

    @Override
    public String visitColumnReference(SQLToPandasParser.ColumnReferenceContext ctx) {
        if(ctx.tableName() == null) {
            return visitColumnName(ctx.columnName());
        }

        tableNames.add(visitTableName(ctx.tableName()));
        return visitTableName(ctx.tableName());
    }

    @Override
    public String visitTableName(SQLToPandasParser.TableNameContext ctx) {
        return "'" + ctx.getText() + "'";
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
}
