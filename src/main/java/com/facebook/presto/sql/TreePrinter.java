/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.facebook.presto.sql;

import com.facebook.presto.sql.tree.*;
import com.google.common.base.Joiner;
import com.google.common.base.Strings;

import javax.annotation.Nullable;
import java.io.PrintStream;
import java.util.*;

public class TreePrinter
{
    private static final String INDENT = "   ";

    private Stack nowTable = new Stack();
    private Stack nowTableAlias = new Stack();
    private Stack nowOper = new Stack();
    private Stack nowCols = new Stack();
    private Set<String> cols = new HashSet<String>();

    private HashMap<String,String> aliasCorr = new HashMap<String,String>();

    private Map<String,TableOperInfo> result = new HashMap<String, TableOperInfo>();
    private List<TableOperInfo> returnlist = new ArrayList<TableOperInfo>();

    private final IdentityHashMap<Expression, QualifiedName> resolvedNameReferences;
    private final PrintStream out;

    public List<TableOperInfo> getAllTableOperInfo(){
        returnlist.addAll(result.values());
        return returnlist;
    }

    private void addToResult(String operType){
        while (!nowTable.empty()){
            TableOperInfo toi = new TableOperInfo();
            toi.setTableName(nowTable.peek().toString());
            //select --> 0     esle --> 1
            if(operType.equals("SELECT")){
                toi.setOpType(0);
            }else{
                toi.setOpType(1);
            }
            toi.setCols(null);
            result.put(toi.getTableName()+"_"+toi.getOpType().toString(),toi);
            nowTable.pop();
        }
    }

    public TreePrinter(IdentityHashMap<Expression, QualifiedName> resolvedNameReferences, PrintStream out)
    {
        this.resolvedNameReferences = new IdentityHashMap<>(resolvedNameReferences);
        this.out = out;
    }

    public void print(Node root)
    {
        AstVisitor<Void, Integer> printer = new DefaultTraversalVisitor<Void, Integer>() {
            @Override
            protected Void visitExtract(Extract node, Integer indentLevel) {
                return super.visitExtract(node, indentLevel);
            }

            @Override
            protected Void visitCast(Cast node, Integer indentLevel) {
                return super.visitCast(node, indentLevel);
            }

            @Override
            protected Void visitArithmeticBinary(ArithmeticBinaryExpression node, Integer indentLevel)
            {
                print(indentLevel, node.getType().toString());

                super.visitArithmeticBinary(node, indentLevel);

                return null;
            }

            @Override
            protected Void visitBetweenPredicate(BetweenPredicate node, Integer indentLevel) {
                return super.visitBetweenPredicate(node, indentLevel);
            }

            @Override
            protected Void visitCoalesceExpression(CoalesceExpression node, Integer indentLevel) {
                return super.visitCoalesceExpression(node, indentLevel);
            }

            @Override
            protected Void visitAtTimeZone(AtTimeZone node, Integer indentLevel) {
                return super.visitAtTimeZone(node, indentLevel);
            }

            @Override
            protected Void visitArrayConstructor(ArrayConstructor node, Integer indentLevel) {
                return super.visitArrayConstructor(node, indentLevel);
            }

            @Override
            protected Void visitSubscriptExpression(SubscriptExpression node, Integer indentLevel) {
                return super.visitSubscriptExpression(node, indentLevel);
            }

            @Override
            protected Void visitComparisonExpression(ComparisonExpression node, Integer indentLevel)
            {
                print(indentLevel, node.getType().toString());

                super.visitComparisonExpression(node, indentLevel);

                return null;
            }

            @Override
            protected Void visitQuery(Query node, Integer indentLevel)
            {
                print(indentLevel, "Query ");

                indentLevel++;


                if (node.getWith().isPresent()){
                    print(indentLevel,"With");
                    process(node.getWith().get(),indentLevel + 1);
                }

                print(indentLevel, "QueryBody");
                process(node.getQueryBody(), indentLevel);
//                if (node.getOrderBy().isPresent()) {
//                    print(indentLevel, "OrderBy");
//                    process(node.getOrderBy().get(), indentLevel + 1);
//                }
//
//                if (node.getLimit().isPresent()) {
//                    print(indentLevel, "Limit: " + node.getLimit().get());
//                }

                return null;
            }



            @Override
            protected Void visitWith(With node, Integer indentLevel)
            {
                int num = node.getQueries().size();

                for(int i=0; i<num; i++){
                    process(node.getQueries().get(i),indentLevel);
                }
                return null;
            }

            @Override
            protected Void visitWithQuery(WithQuery node, Integer indentLevel)
            {
                print(indentLevel,"WithQuery");
                process(node.getQuery(),indentLevel+1);
                return null;
            }

            @Override
            protected Void visitSelect(Select node, Integer indentLevel)
            {
                String distinct = "";
                if (node.isDistinct()) {
                    distinct = "[DISTINCT]";
                }
                print(indentLevel, "Select" + distinct);
                nowOper.push("SELECT");
                cols.clear();
                super.visitSelect(node, indentLevel); // visit children

                return null;
            }

            @Override
            protected Void visitSingleColumn(SingleColumn node, Integer indent)
            {
                if (node.getAlias().isPresent()) {
                    print(indent, "Alias: " + node.getAlias().get());
                }

                super.visitSingleColumn(node, indent + 1); // visit children

                return null;
            }

            @Override
            protected Void visitWhenClause(WhenClause node, Integer indentLevel) {
                print(indentLevel,"When");
                indentLevel++;
                print(indentLevel,"Operand[" + node.getOperand()+"]");
                print(indentLevel,"Result[" + node.getResult()+"]");
                return null;
            }

            @Override
            protected Void visitInPredicate(InPredicate node, Integer indentLevel)
            {
                print(indentLevel, "IN");

                super.visitInPredicate(node, indentLevel);

                return null;
            }

            @Override
            protected Void visitFunctionCall(FunctionCall node, Integer indentLevel)
            {
                String name = Joiner.on('.').join(node.getName().getParts());
                print(indentLevel, "FunctionCall[" + name + "]");

                super.visitFunctionCall(node, indentLevel);

                return null;
            }

            @Override
            protected Void visitGroupingOperation(GroupingOperation node, Integer indentLevel) {
                return super.visitGroupingOperation(node, indentLevel);
            }

            @Override
            protected Void visitDereferenceExpression(DereferenceExpression node, Integer indentLevel)
            {
                QualifiedName resolved = resolvedNameReferences.get(node);
                String resolvedName = "";
                if (resolved != null) {
                    resolvedName = "=>" + resolved.toString();
                }
                print(indentLevel, "DereferenceExpression[" + node + resolvedName + "]");
                return null;
            }

            @Override
            public Void visitWindow(Window node, Integer indentLevel) {
                return super.visitWindow(node, indentLevel);
            }

            @Override
            public Void visitWindowFrame(WindowFrame node, Integer indentLevel) {
                return super.visitWindowFrame(node, indentLevel);
            }

            @Override
            public Void visitFrameBound(FrameBound node, Integer indentLevel) {
                return super.visitFrameBound(node, indentLevel);
            }

            @Override
            protected Void visitSimpleCaseExpression(SimpleCaseExpression node, Integer indentLevel) {
                return super.visitSimpleCaseExpression(node, indentLevel);
            }

            @Override
            protected Void visitInListExpression(InListExpression node, Integer indentLevel) {
                return super.visitInListExpression(node, indentLevel);
            }

            @Override
            protected Void visitNullIfExpression(NullIfExpression node, Integer indentLevel) {
                return super.visitNullIfExpression(node,indentLevel);
            }

            @Override
            protected Void visitIfExpression(IfExpression node, Integer indentLevel) {
                return super.visitIfExpression(node, indentLevel);
            }

            @Override
            protected Void visitTryExpression(TryExpression node, Integer indentLevel) {
                return super.visitTryExpression(node, indentLevel);
            }

            @Override
            protected Void visitBindExpression(BindExpression node, Integer indentLevel) {
                return super.visitBindExpression(node, indentLevel);
            }

            @Override
            protected Void visitArithmeticUnary(ArithmeticUnaryExpression node, Integer indentLevel) {
                return super.visitArithmeticUnary(node, indentLevel);
            }

            @Override
            protected Void visitNotExpression(NotExpression node, Integer indentLevel) {
                return super.visitNotExpression(node, indentLevel + 1);
            }

            @Override
            protected Void visitSearchedCaseExpression(SearchedCaseExpression node, Integer indentLevel) {
                process(node.getWhenClauses().get(0),indentLevel);
                print(indentLevel, "DefaultValues["+node.getDefaultValue()+"]");
                return null;
            }

            @Override
            protected Void visitLikePredicate(LikePredicate node, Integer indentLevel)
            {
                print(indentLevel, "LIKE");

                super.visitLikePredicate(node, indentLevel);

                return null;
            }

            @Override
            protected Void visitIsNotNullPredicate(IsNotNullPredicate node, Integer indentLevel) {
                return super.visitIsNotNullPredicate(node, indentLevel);
            }

            @Override
            protected Void visitIsNullPredicate(IsNullPredicate node, Integer indentLevel) {
                return super.visitIsNullPredicate(node, indentLevel);
            }

            @Override
            protected Void visitLogicalBinaryExpression(LogicalBinaryExpression node, Integer indentLevel)
            {
                print(indentLevel, node.getType().toString());

                super.visitLogicalBinaryExpression(node, indentLevel);

                return null;
            }

            @Override
            protected Void visitSubqueryExpression(SubqueryExpression node, Integer indentLevel)
            {
                print(indentLevel, "SubQuery");

                super.visitSubqueryExpression(node, indentLevel + 1);

                return null;
            }

            @Override
            protected Void visitOrderBy(OrderBy node, Integer indentLevel)
            {
                for (SortItem sortItem : node.getSortItems()) {
                    process(sortItem, indentLevel);
                }

                return null;
            }

            @Override
            protected Void visitSortItem(SortItem node, Integer indentLevel) {
                return super.visitSortItem(node, indentLevel + 1);
            }

            @Override
            protected Void visitQuerySpecification(QuerySpecification node, Integer indentLevel) {
                print(indentLevel, "QuerySpecification ");
                indentLevel++;
                if (node.getFrom().isPresent()) {
                    print(indentLevel, "From");
                    process(node.getFrom().get(), indentLevel + 1);
                }

                process(node.getSelect(), indentLevel);

                if (node.getWhere().isPresent()) {
                    print(indentLevel, "Where");
                    process(node.getWhere().get(), indentLevel + 1);
                }

                if (node.getGroupBy().isPresent()) {
                    String distinct = "";
                    if (node.getGroupBy().get().isDistinct()) {
                        distinct = "[DISTINCT]";
                    }
                    print(indentLevel, "GroupBy" + distinct);
                    for (GroupingElement groupingElement : node.getGroupBy().get().getGroupingElements()) {
                        print(indentLevel, "SimpleGroupBy");
                        if (groupingElement instanceof SimpleGroupBy) {
                            for (Expression column : ((SimpleGroupBy) groupingElement).getColumnExpressions()) {
                                process(column, indentLevel + 1);
                            }
                        }
                        else if (groupingElement instanceof GroupingSets) {
                            print(indentLevel + 1, "GroupingSets");
                            for (Set<Expression> column : groupingElement.enumerateGroupingSets()) {
                                print(indentLevel + 2, "GroupingSet[");
                                for (Expression expression : column) {
                                    process(expression, indentLevel + 3);
                                }
                                print(indentLevel + 2, "]");
                            }
                        }
                        else if (groupingElement instanceof Cube) {
                            print(indentLevel + 1, "Cube");
                            for (QualifiedName column : ((Cube) groupingElement).getColumns()) {
                                print(indentLevel + 1, column.toString());
                            }
                        }
                        else if (groupingElement instanceof Rollup) {
                            print(indentLevel + 1, "Rollup");
                            for (QualifiedName column : ((Rollup) groupingElement).getColumns()) {
                                print(indentLevel + 1, column.toString());
                            }
                        }
                    }
                }

                if (node.getHaving().isPresent()) {
                    print(indentLevel, "Having");
                    process(node.getHaving().get(), indentLevel + 1);
                }

                if (node.getOrderBy().isPresent()) {
                    print(indentLevel, "OrderBy");
                    process(node.getOrderBy().get(), indentLevel + 1);
                }

                if (node.getLimit().isPresent()) {
                    print(indentLevel, "Limit: " + node.getLimit().get());
                }

                nowCols.push(cols);
                addToResult("SELECT");

                return null;
            }

            @Override
            protected Void visitSetOperation(SetOperation node, Integer indentLevel) {
                return super.visitSetOperation(node, indentLevel);
            }

            @Override
            protected Void visitValues(Values node, Integer indentLevel)
            {
                print(indentLevel, "Values");

                super.visitValues(node, indentLevel + 1);

                return null;
            }

            @Override
            protected Void visitRow(Row node, Integer indentLevel)
            {
                print(indentLevel, "Row");

                super.visitRow(node, indentLevel + 1);

                return null;
            }

            @Override
            protected Void visitTableSubquery(TableSubquery node, Integer indentLevel)
            {
                print(indentLevel, "SubQuery");

                super.visitTableSubquery(node, indentLevel + 1);

                return null;
            }

            @Override
            protected Void visitAliasedRelation(AliasedRelation node, Integer indentLevel)
            {
                print(indentLevel, "Alias[" + node.getAlias() + "]");
                // for future
                nowTableAlias.push(node.getAlias());
                String relation = node.getRelation().toString();
                if(relation.indexOf("Table")==0){
                    int begin=0,end=0;
                    begin = relation.indexOf("{")+1;
                    end = relation.indexOf("}");
                    aliasCorr.put(node.getAlias(),relation.substring(begin,end));
                }

                super.visitAliasedRelation(node, indentLevel + 1);

                return null;
            }

            @Override
            protected Void visitSampledRelation(SampledRelation node, Integer indentLevel)
            {
                print(indentLevel, "TABLESAMPLE[" + node.getType() + " (" + node.getSamplePercentage() + ")]");

                super.visitSampledRelation(node, indentLevel + 1);

                return null;
            }

            @Override
            protected Void visitJoin(Join node, Integer indentLevel) {
                return super.visitJoin(node, indentLevel);
            }

            @Override
            protected Void visitUnnest(Unnest node, Integer indentLevel) {
                return super.visitUnnest(node, indentLevel);
            }

            @Override
            protected Void visitGroupBy(GroupBy node, Integer indentLevel) {
                return super.visitGroupBy(node, indentLevel);
            }

            @Override
            protected Void visitGroupingElement(GroupingElement node, Integer indentLevel) {
                return super.visitGroupingElement(node, indentLevel);
            }

            @Override
            protected Void visitInsert(Insert node, Integer indentLevel) {
                print(indentLevel,"Insert");
                indentLevel++;
                print(indentLevel,"Target[" + node.getTarget().getSuffix() + "]");
                nowTable.push(node.getTarget().getSuffix().toString());
                addToResult("INSERT");
                if(node.getColumns().isPresent())
                    print(indentLevel,"Columns" + node.getColumns().get().toString());
                process(node.getQuery(),indentLevel + 1);
                return null;
            }

            @Override
            protected Void visitDelete(Delete node, Integer indentLevel) {
                print(indentLevel,"Delete");
                indentLevel++;
                print(indentLevel,"TableName[" + node.getTable().getName() + "]");
                nowTable.add(node.getTable().getName().toString());
                addToResult("DELETE");
                if(node.getWhere().isPresent()){
                    print(indentLevel,"Where");
                    process(node.getWhere().get(),indentLevel+1);
                }
                return null;
            }

            @Override
            protected Void visitCreateTableAsSelect(CreateTableAsSelect node, Integer indentLevel) {
                print(indentLevel,"CreateTableAsSelect");
                indentLevel++;
                print(indentLevel,"CreateTable");
                print(indentLevel+1,"TableName[" + node.getName() + "]");

                nowTable.push(node.getName().toString());
                addToResult("CREATE");

                if(node.getColumnAliases().isPresent()){
                    print(indentLevel,"ColumnsAliases["+ node.getColumnAliases() + "]");
                }
                print(indentLevel,"AsSelect");
                process(node.getQuery(),indentLevel+1);
                if(!node.getProperties().isEmpty()){
                    print(indentLevel,"Properties" + node.getProperties().toString());
                }
                return null;
            }

            @Override
            protected Void visitCreateView(CreateView node, Integer indentLevel) {
                print(indentLevel,"CreateView");
                indentLevel++;
                print(indentLevel,"ViewName["+node.getName()+"]");
                print(indentLevel,"AsSelect");
                process(node.getQuery(),indentLevel+1);
                return null;
            }

            @Override
            protected Void visitSetSession(SetSession node, Integer indentLevel) {
                print(indentLevel,"SetSession");
                indentLevel++;
                print(indentLevel,"name["+node.getName()+"]");
                print(indentLevel,"value["+node.getValue()+"]");
                return null;
            }

            @Override
            protected Void visitAddColumn(AddColumn node, Integer indentLevel) {
                print(indentLevel,"AddColumns");
                indentLevel++;
                print(indentLevel,"Table[" + node.getName() + "]");
                print(indentLevel,"Columns");

                return super.visitAddColumn(node, indentLevel+1);
            }

            @Override
            protected Void visitCreateTable(CreateTable node, Integer indentLevel) {
                print(indentLevel,"CreateTable");
                indentLevel++;
                print(indentLevel,"TableName["+node.getName()+"]");

                nowTable.push(node.getName().toString());
                addToResult("CREATE");

                int num = node.getElements().size();
                for(int i=0; i<num; i++){
                    process(node.getElements().get(i),indentLevel);
                }
                // no treat for properties
                if(node.getComment().isPresent()){
                    print(indentLevel,"TableComment[" + node.getComment().get() + "]");
                }
                return null;
            }

            @Override
            protected Void visitShowPartitions(ShowPartitions node, Integer indentLevel) {
                print(indentLevel,"ShowPartitions");
                indentLevel++;
                print(indentLevel,"From");
                print(indentLevel+1,"Table["+node.getTable()+"]");
                nowTable.push(node.getTable());
                addToResult("SHOWPARTITION");
                return super.visitShowPartitions(node, indentLevel);
            }

            @Override
            protected Void visitStartTransaction(StartTransaction node, Integer indentLevel) {
                print(indentLevel,"StartTransaction");
                indentLevel++;
                print(indentLevel,"TransactionModes["+ node.getTransactionModes().toString()+"]");
                return null;
            }

            @Override
            protected Void visitExplain(Explain node, Integer indentLevel) {
                print(indentLevel,"Explain");
                indentLevel++;
                int num = node.getOptions().size();
                if(num>0) {
                    print(indentLevel,"Options");
                    for (int i = 0; i < num; i++) {
                        process(node.getOptions().get(i), indentLevel + 1);
                    }
                }
                print(indentLevel,"Statement");
                process(node.getStatement(),indentLevel+1);
                return null;
            }

            @Override
            protected Void visitQuantifiedComparisonExpression(QuantifiedComparisonExpression node, Integer indentLevel) {
                return super.visitQuantifiedComparisonExpression(node, indentLevel);
            }

            @Override
            protected Void visitExists(ExistsPredicate node, Integer indentLevel) {
                return super.visitExists(node, indentLevel);
            }

            @Override
            protected Void visitLateral(Lateral node, Integer indentLevel) {
                return super.visitLateral(node, indentLevel);
            }

            @Override
            public Void process(Node node) {
                return super.process(node);
            }

            @Override
            public Void process(Node node, @Nullable Integer indentLevel) {
                return super.process(node, indentLevel);
            }

            @Override
            protected Void visitNode(Node node, Integer indentLevel)
            {
                throw new UnsupportedOperationException("not yet implemented: " + node);
            }

            @Override
            protected Void visitExpression(Expression node, Integer indentLevel) {
                return super.visitExpression(node, indentLevel+1);
            }

            @Override
            protected Void visitCurrentTime(CurrentTime node, Integer indentLevel) {
                return super.visitCurrentTime(node, indentLevel);
            }

            @Override
            protected Void visitLiteral(Literal node, Integer indentLevel) {
                return super.visitLiteral(node, indentLevel);
            }

            @Override
            protected Void visitDoubleLiteral(DoubleLiteral node, Integer indentLevel) {
                print(indentLevel,"Double[" + node.getValue() + "]");
                return null;
            }

            @Override
            protected Void visitDecimalLiteral(DecimalLiteral node, Integer indentLevel) {
                print(indentLevel,"Demical[" + node.getValue() + "]");
                return null;
            }

            @Override
            protected Void visitStatement(Statement node, Integer indentLevel) {
                return super.visitStatement(node, indentLevel);
            }

            @Override
            protected Void visitPrepare(Prepare node, Integer indentLevel) {
                return super.visitPrepare(node, indentLevel);
            }

            @Override
            protected Void visitDeallocate(Deallocate node, Integer indentLevel) {
                return super.visitDeallocate(node, indentLevel);
            }

            @Override
            protected Void visitExecute(Execute node, Integer indentLevel) {
                return super.visitExecute(node, indentLevel);
            }

            @Override
            protected Void visitDescribeOutput(DescribeOutput node, Integer indentLevel) {
                print(indentLevel,"Table[" + node.getName() + "]");
                return null;
            }

            @Override
            protected Void visitDescribeInput(DescribeInput node, Integer indentLevel) {
                print(indentLevel,"Table[" + node.getName() + "]");
                return null;
            }

            @Override
            protected Void visitShowTables(ShowTables node, Integer indentLevel) {
                print(indentLevel,"ShowTables");
                indentLevel++;
                print(indentLevel,"schema["+node.getSchema()+"]");
                print(indentLevel,"likePattern["+node.getLikePattern()+"]");
                return null;
            }

            @Override
            protected Void visitShowSchemas(ShowSchemas node, Integer indentLevel) {
                print(indentLevel,"ShowSchemas");
                indentLevel++;
                print(indentLevel,"catalog["+node.getCatalog()+"]");
                print(indentLevel,"likePattern["+node.getLikePattern()+"]");
                return null;
            }

            @Override
            protected Void visitShowCatalogs(ShowCatalogs node, Integer indentLevel) {
                print(indentLevel,"ShowCatalogs");
                indentLevel++;
                print(indentLevel,"{Catalogs}");
                return null;
            }

            @Override
            protected Void visitShowColumns(ShowColumns node, Integer indentLevel) {
                print(indentLevel,"ShowColumns");
                indentLevel++;
                print(indentLevel,"Table[" + node.getTable() + "]");
                nowTable.push(node.getTable().toString());
                addToResult("SHOWCOLUMNS");
                return null;
            }

            @Override
            protected Void visitShowStats(ShowStats node, Integer indentLevel) {
                return super.visitShowStats(node, indentLevel);
            }

            @Override
            protected Void visitShowCreate(ShowCreate node, Integer indentLevel) {
                print(indentLevel,"ShowCreate");
                indentLevel++;
                print(indentLevel,"type["+node.getType()+"]");
                print(indentLevel,"Name["+node.getName()+"]");
                return null;
            }

            @Override
            protected Void visitShowFunctions(ShowFunctions node, Integer indentLevel) {
                print(indentLevel,"ShowFunctions");
                indentLevel++;
                print(indentLevel,"{Functions}");
                return null;
            }

            @Override
            protected Void visitUse(Use node, Integer indentLevel) {
                print(indentLevel,"Use");
                indentLevel++;
                print(indentLevel,"Catalog[" + node.getCatalog().get() + "]");
                print(indentLevel,"Schema["+node.getSchema() + "]");
                return null;
            }

            @Override
            protected Void visitShowSession(ShowSession node, Integer indentLevel) {
                print(indentLevel,"ShowSession");
                indentLevel++;
                print(indentLevel+1,"{Sessions}");
                return null;
            }

            @Override
            protected Void visitResetSession(ResetSession node, Integer indentLevel) {
                print(indentLevel,"ResetSession");
                indentLevel++;
                print(indentLevel,"Name["+node.getName().getSuffix()+"]");
//                if(node.getName().getOriginalParts().size() == 1){
//                    print(indentLevel,"Name");
//                    print(indentLevel+1,node.getName().getSuffix());
//                }
//                else if(node.getName().getOriginalParts().size() == 2){
//                }
                return null;
            }

            @Override
            protected Void visitGenericLiteral(GenericLiteral node, Integer indentLevel) {
                print(indentLevel,"GenericType[" + node.getType()
                        + "] GenericValue[" + node.getValue() + "]");
                return null;
            }

            @Override
            protected Void visitTimeLiteral(TimeLiteral node, Integer indentLevel) {
                print(indentLevel,"Time[" + node.getValue() + "]");
                return null;
            }

            @Override
            protected Void visitExplainOption(ExplainOption node, Integer indentLevel) {
                print(indentLevel,node.toString());
                return null;
            }

            @Override
            protected Void visitRelation(Relation node, Integer indentLevel) {
                return super.visitRelation(node, indentLevel);
            }

            @Override
            protected Void visitQueryBody(QueryBody node, Integer indentLevel) {
                return super.visitQueryBody(node, indentLevel);
            }

            @Override
            protected Void visitUnion(Union node, Integer indentLevel) {
                print(indentLevel,"UnionAll");
                indentLevel++;
                process(node.getRelations().get(0),indentLevel);
                process(node.getRelations().get(1),indentLevel);
                return null;
            }

            @Override
            protected Void visitIntersect(Intersect node, Integer indentLevel) {
                return super.visitIntersect(node, indentLevel);
            }

            @Override
            protected Void visitExcept(Except node, Integer indentLevel) {
                return super.visitExcept(node, indentLevel);
            }

            @Override
            protected Void visitTimestampLiteral(TimestampLiteral node, Integer indentLevel) {
                print(indentLevel,"Timestamp[" + node.getValue() + "]");
                return null;
            }

            @Override
            protected Void visitIntervalLiteral(IntervalLiteral node, Integer indentLevel) {
                print(indentLevel,"Interval");
                indentLevel++;
                print(indentLevel,"IsYearToMonth[" + node.isYearToMonth() + "]");
                print(indentLevel,"Start[" + node.getStartField() + "]");
                print(indentLevel,"End[" + node.getEndField() + "]");
                print(indentLevel,"Value[" + node.getValue() + "]");
                print(indentLevel,"Sign[" + node.getSign() + "]");
                return null;
            }

            @Override
            protected Void visitLambdaExpression(LambdaExpression node, Integer indentLevel) {
                return super.visitLambdaExpression(node, indentLevel);
            }

            @Override
            protected Void visitStringLiteral(StringLiteral node, Integer indentLevel)
            {
                print(indentLevel, "String[" + node.getValue() + "]");
                return null;
            }

            @Override
            protected Void visitCharLiteral(CharLiteral node, Integer indentLevel) {
                print(indentLevel,"Char[" + node.getValue()
                        + "] Slice" + node.getSlice() + "]");
                return null;
            }

            @Override
            protected Void visitBinaryLiteral(BinaryLiteral node, Integer indentLevel)
            {
                print(indentLevel, "Binary[" + node.toHexString() + "]");
                return null;
            }

            @Override
            protected Void visitBooleanLiteral(BooleanLiteral node, Integer indentLevel)
            {
                print(indentLevel, "Boolean[" + node.getValue() + "]");
                return null;
            }

            @Override
            protected Void visitIdentifier(Identifier node, Integer indentLevel)
            {
                QualifiedName resolved = resolvedNameReferences.get(node);
                String resolvedName = "";
                if (resolved != null) {
                    resolvedName = "=>" + resolved.toString();
                }
                print(indentLevel, "Identifier[" + node.getName() + resolvedName + "]");
                cols.add(node.getName());
                return null;
            }

            @Override
            protected Void visitNullLiteral(NullLiteral node, Integer indentLevel) {
                print(indentLevel,"NULL[Null]");
                return null;
            }

            @Override
            protected Void visitSelectItem(SelectItem node, Integer indentLevel) {
                return super.visitSelectItem(node, indentLevel);
            }

            @Override
            protected Void visitAllColumns(AllColumns node, Integer indent)
            {
                if (node.getPrefix().isPresent()) {
                    print(indent, node.getPrefix() + ".*");
                }
                else {
                    print(indent, "*");
                }

                return null;
            }

            @Override
            protected Void visitLongLiteral(LongLiteral node, Integer indentLevel)
            {
                print(indentLevel, "Long[" + node.getValue() + "]");
                return null;
            }

            @Override
            protected Void visitParameter(Parameter node, Integer indentLevel) {
                return super.visitParameter(node, indentLevel);
            }

            @Override
            protected Void visitTable(Table node, Integer indentLevel)
            {
                String name = Joiner.on('.').join(node.getName().getParts());
                print(indentLevel, "Table[" + name + "]");
                nowTable.push(node.getName().toString());
                return null;
            }

            @Override
            protected Void visitFieldReference(FieldReference node, Integer indentLevel) {
                return super.visitFieldReference(node, indentLevel);
            }

            @Override
            protected Void visitCallArgument(CallArgument node, Integer indentLevel) {
                if(node.getName().isPresent()) {
                    print(indentLevel, "Argument[" + node.getName().get()
                            + "] => Value[" + node.getValue().toString() + "]");
                }
                else{
                    print(indentLevel, "Value[" + node.getValue().toString() + "]");
                }
                return null;
            }

            @Override
            protected Void visitTableElement(TableElement node, Integer indentLevel) {
                print(indentLevel,"TableElement");
                indentLevel++;
                process((ColumnDefinition) node,indentLevel+1);
                return null;
            }

            @Override
            protected Void visitColumnDefinition(ColumnDefinition node, Integer indentLevel) {
                print(indentLevel,"ColumnDefination");
                indentLevel++;
                print(indentLevel,"ColName[" + node.getName()+"]");
                print(indentLevel,"Type[" + node.getType()+"]");
                print(indentLevel,"Comment["
                        + ((node.getComment().isPresent())?node.getComment().get():node.getComment())
                        + "]");
                return null;
            }

            @Override
            protected Void visitLikeClause(LikeClause node, Integer indentLevel) {
                // add table.*
                print(indentLevel+1,"LikeTableName[" + node.getTableName() + "]");
                return null;
            }

            @Override
            protected Void visitCreateSchema(CreateSchema node, Integer indentLevel) {
                print(indentLevel,"CreateSchema");
                indentLevel++;
                print(indentLevel,"SchemaName[" + node.getSchemaName() + "]");
                print(indentLevel,"NotExist[" + node.isNotExists() + "]");
                print(indentLevel,"Properties" + node.getProperties());
                return null;
            }

            @Override
            protected Void visitDropSchema(DropSchema node, Integer indentLevel) {
                print(indentLevel,"DropSchema");
                indentLevel++;
                print(indentLevel,"SchemaName[" + node.getSchemaName() + "]");
                print(indentLevel,"Exists["+node.isExists()+"]");
                return null;
            }

            @Override
            protected Void visitRenameSchema(RenameSchema node, Integer indentLevel) {
                print(indentLevel,"RenameSchema");
                indentLevel++;
                print(indentLevel,"SourceSchema["+ node.getSource()+"]");
                print(indentLevel,"NewSchemaName["+ node.getTarget()+"]");
                return null;
            }

            @Override
            protected Void visitDropTable(DropTable node, Integer indentLevel) {
                print(indentLevel,"DropTable");
                indentLevel++;
                print(indentLevel,"TableName[" + node.getTableName() + "]");
                nowTable.push(node.getTableName().toString());
                addToResult("DROPTABLE");
                print(indentLevel,"Exists["+node.isExists()+"]");
                return null;
            }

            @Override
            protected Void visitRenameTable(RenameTable node, Integer indentLevel) {
                print(indentLevel,"RenameTable");
                indentLevel++;
                print(indentLevel,"SourceTable["+ node.getSource()+"]");
                print(indentLevel,"NewTableName["+ node.getTarget()+"]");
                return null;
            }

            @Override
            protected Void visitRenameColumn(RenameColumn node, Integer indentLevel) {
                print(indentLevel,"RenameColumn");
                indentLevel++;
                print(indentLevel,"Table["+node.getTable()+"]");
                print(indentLevel,"SourceColumn["+ node.getSource()+"]");
                print(indentLevel,"NewColumnName["+ node.getTarget()+"]");
                return null;
            }

            @Override
            protected Void visitDropColumn(DropColumn node, Integer indentLevel) {
                print(indentLevel,"DropColumn");
                indentLevel++;
                print(indentLevel,"Table[" + node.getTable() + "]");
                print(indentLevel,"Columns["+node.getColumn()+"]");
                return null;
            }

            @Override
            protected Void visitDropView(DropView node, Integer indentLevel) {
                print(indentLevel,"DropView");
                indentLevel++;
                print(indentLevel,"ViewName[" + node.getName() + "]");
                print(indentLevel,"Exists["+node.isExists()+"]");
                return null;
            }

            @Override
            protected Void visitCall(Call node, Integer indentLevel) {
                print(indentLevel,"CallProcedure");
                indentLevel++;
                print(indentLevel,"FunctionName[" + node.getName() + "]");
                int num = node.getArguments().size();
                for(int i=0; i<num; i++){
                    process(node.getArguments().get(i),indentLevel+1);
                }
                return null;
            }

            @Override
            protected Void visitGrant(Grant node, Integer indentLevel) {
                print(indentLevel,"Grant");
                indentLevel++;
                print(indentLevel,"Privilegs");
                print(indentLevel+1,node.getPrivileges().get().toString());
                print(indentLevel,"ON");
                print(indentLevel+1,node.getTableName().getSuffix());
                print(indentLevel,"TO");
                print(indentLevel+1,node.getGrantee());
                print(indentLevel,"WITH GRANT OPTION");
                print(indentLevel+1,node.isWithGrantOption()?"True":"False");
                return null;
            }

            @Override
            protected Void visitRevoke(Revoke node, Integer indentLevel) {
                print(indentLevel,"Revoke");
                indentLevel++;
                print(indentLevel,"GrantOptionFor["+node.isGrantOptionFor()+"]");
                print(indentLevel,"Privileges");
                print(indentLevel+1,node.getPrivileges().toString());
//                print(indentLevel,"IsTable["+node.isTable()+"]");
                print(indentLevel,"ON");
                print(indentLevel+1,node.getTableName().getSuffix());
                print(indentLevel,"FROM");
                print(indentLevel+1,node.getGrantee());
                return null;
            }

            @Override
            protected Void visitShowGrants(ShowGrants node, Integer indentLevel) {
                print(indentLevel,"ShowGrants");
                indentLevel++;
                print(indentLevel, "Table");
                if(node.getTable()) {
                    print(indentLevel+1,node.getTableName().toString());
                    nowTable.push(node.getTableName().toString());
                    addToResult("SHOWGRANTS");
                }
                else {
                    print(indentLevel+1,"No Table");
                }
                return null;
            }

            @Override
            protected Void visitTransactionMode(TransactionMode node, Integer indentLevel) {
                return super.visitTransactionMode(node, indentLevel);
            }

            @Override
            protected Void visitIsolationLevel(Isolation node, Integer indentLevel) {
                return super.visitIsolationLevel(node, indentLevel);
            }

            @Override
            protected Void visitTransactionAccessMode(TransactionAccessMode node, Integer indentLevel) {
                return super.visitTransactionAccessMode(node, indentLevel);
            }

            @Override
            protected Void visitCommit(Commit node, Integer indentLevel) {
                print(indentLevel,"COMMIT");
                return null;
            }

            @Override
            protected Void visitRollback(Rollback node, Integer indentLevel) {
                print(indentLevel,"ROLLBACK");
                return null;
            }

            @Override
            protected Void visitCube(Cube node, Integer indentLevel) {
                return super.visitCube(node, indentLevel);
            }

            @Override
            protected Void visitGroupingSets(GroupingSets node, Integer indentLevel) {
                return super.visitGroupingSets(node, indentLevel);
            }

            @Override
            protected Void visitRollup(Rollup node, Integer indentLevel) {
                return super.visitRollup(node, indentLevel);
            }

            @Override
            protected Void visitSimpleGroupBy(SimpleGroupBy node, Integer indentLevel) {
                return super.visitSimpleGroupBy(node, indentLevel);
            }

            @Override
            protected Void visitSymbolReference(SymbolReference node, Integer indentLevel) {
                return super.visitSymbolReference(node, indentLevel);
            }

            @Override
            protected Void visitLambdaArgumentDeclaration(LambdaArgumentDeclaration node, Integer indentLevel) {
                return super.visitLambdaArgumentDeclaration(node, indentLevel);
            }

            @Override
            public int hashCode() {
                return super.hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }

            @Override
            public String toString() {
                return super.toString();
            }

            @Override
            protected void finalize() throws Throwable {
                super.finalize();
            }
        };

        printer.process(root, 0);

    }

    private void print(Integer indentLevel, String value)
    {
//        out.println(Strings.repeat(INDENT, indentLevel) + value);
    }
}
