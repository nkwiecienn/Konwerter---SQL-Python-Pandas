import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.util.ArrayList;

/**
 * TODO:
 * - zabaczyć czy ctx.getChild(i) działa tak jak myśle
 */

public class AntlrParser extends SQLToPandasBaseVisitor<String> {
    ArrayList<String> tableNames = new ArrayList<>();

    @Override
    public String visitQuery(SQLToPandasParser.QueryContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitSelectStatement(SQLToPandasParser.SelectStatementContext ctx) {
        StringBuilder selectStatement = new StringBuilder();
        selectStatement.append(visitTableName(ctx.tableName()));
        tableNames.add(visitTableName(ctx.tableName()));

        if(!ctx.joinClause().isEmpty()) {
            selectStatement.append(".").append(visitJoinClause(ctx.joinClause()));
        }
        if(!ctx.whereClause().isEmpty()) {
            selectStatement.append("[").append(visitWhereClause(ctx.whereClause()));
            if(!ctx.selectList().isEmpty()) {
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
            if(ctx.getChild(i).toString().equals(",")) {
                selectList.append(",");
            } else if (!ctx.getChild(i).toString().equals("agg")){
                selectList.append("'").append(ctx.getChild(i).toString()).append("'");
            }
        }
        return selectList.toString();
    }

    @Override
    public String visitSelectItem(SQLToPandasParser.SelectItemContext ctx) {
        StringBuilder selectItem = new StringBuilder();
        if(!ctx.columnReference().isEmpty()) {
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
                expression.append(ctx.getChild(i));
            }
        }

        return expression.toString();
    }

    @Override
    public String visitColumnReference(SQLToPandasParser.ColumnReferenceContext ctx) {
        if(ctx.tableName().isEmpty()) {
            return visitColumnName(ctx.columnName());
        }

        tableNames.add(visitTableName(ctx.tableName()));
        return visitTableName(ctx.tableName());
    }
}
