package antlr.sql;

public class SqlBaseVisitorImpl extends SqlBaseBaseVisitor<String> {

    @Override public String visitSingleStatement(SqlBaseParser.SingleStatementContext ctx) {
        System.out.println("visitSingleStatement");
        return visitChildren(ctx);
    }

    @Override public String visitSingleExpression(SqlBaseParser.SingleExpressionContext ctx) {
        System.out.println("visitSingleExpression");
        return visitChildren(ctx);
    }

    @Override public String visitSingleTableIdentifier(SqlBaseParser.SingleTableIdentifierContext ctx) {
        System.out.println("visitSingleTableIdentifier");
        return visitChildren(ctx);
    }

    @Override public String visitSingleMultipartIdentifier(SqlBaseParser.SingleMultipartIdentifierContext ctx) {
        System.out.println("visitSingleMultipartIdentifier");
        return visitChildren(ctx);
    }

    @Override public String visitSingleFunctionIdentifier(SqlBaseParser.SingleFunctionIdentifierContext ctx) {
        System.out.println("visitSingleFunctionIdentifier");
        return visitChildren(ctx);
    }

    @Override public String visitSingleDataType(SqlBaseParser.SingleDataTypeContext ctx) {
        System.out.println("visitSingleDataType");
        return visitChildren(ctx);
    }

    @Override public String visitSingleTableSchema(SqlBaseParser.SingleTableSchemaContext ctx) {
        System.out.println("visitSingleTableSchema");
        return visitChildren(ctx);
    }

    @Override public String visitStatementDefault(SqlBaseParser.StatementDefaultContext ctx) {
        System.out.println("visitStatementDefault");
        return visitChildren(ctx);
    }

    @Override public String visitDmlStatement(SqlBaseParser.DmlStatementContext ctx) {
        System.out.println("visitDmlStatement");
        return visitChildren(ctx);
    }

    @Override public String visitUse(SqlBaseParser.UseContext ctx) {
        System.out.println("visitUse");
        return visitChildren(ctx);
    }

    @Override public String visitCreateNamespace(SqlBaseParser.CreateNamespaceContext ctx) {
        System.out.println("visitCreateNamespace");
        return visitChildren(ctx);
    }

    @Override public String visitSetNamespaceProperties(SqlBaseParser.SetNamespacePropertiesContext ctx) {
        System.out.println("visitSetNamespaceProperties");
        return visitChildren(ctx);
    }

    @Override public String visitSetNamespaceLocation(SqlBaseParser.SetNamespaceLocationContext ctx) {
        System.out.println("visitSetNamespaceLocation");
        return visitChildren(ctx);
    }

    @Override public String visitDropNamespace(SqlBaseParser.DropNamespaceContext ctx) {
        System.out.println("visitDropNamespace");
        return visitChildren(ctx);
    }

    @Override public String visitShowNamespaces(SqlBaseParser.ShowNamespacesContext ctx) {
        System.out.println("visitShowNamespaces");
        return visitChildren(ctx);
    }

    @Override public String visitCreateTable(SqlBaseParser.CreateTableContext ctx) {
        System.out.println("visitCreateTable");
        return visitChildren(ctx);
    }

    @Override public String visitCreateTableLike(SqlBaseParser.CreateTableLikeContext ctx) {
        System.out.println("visitCreateTableLike");
        return visitChildren(ctx);
    }

    @Override public String visitReplaceTable(SqlBaseParser.ReplaceTableContext ctx) {
        System.out.println("visitReplaceTable");
        return visitChildren(ctx);
    }

    @Override public String visitAnalyze(SqlBaseParser.AnalyzeContext ctx) {
        System.out.println("visitAnalyze");
        return visitChildren(ctx);
    }

    @Override public String visitAnalyzeTables(SqlBaseParser.AnalyzeTablesContext ctx) {
        System.out.println("visitAnalyzeTables");
        return visitChildren(ctx);
    }

    @Override public String visitAddTableColumns(SqlBaseParser.AddTableColumnsContext ctx) {
        System.out.println("visitAddTableColumns");
        return visitChildren(ctx);
    }

    @Override public String visitRenameTableColumn(SqlBaseParser.RenameTableColumnContext ctx) {
        System.out.println("visitRenameTableColumn");
        return visitChildren(ctx);
    }

    @Override public String visitDropTableColumns(SqlBaseParser.DropTableColumnsContext ctx) {
        System.out.println("visitDropTableColumns");
        return visitChildren(ctx);
    }

    @Override public String visitRenameTable(SqlBaseParser.RenameTableContext ctx) {
        System.out.println("visitRenameTable");
        return visitChildren(ctx);
    }

    @Override public String visitSetTableProperties(SqlBaseParser.SetTablePropertiesContext ctx) {
        System.out.println("visitSetTableProperties");
        return visitChildren(ctx);
    }

    @Override public String visitUnsetTableProperties(SqlBaseParser.UnsetTablePropertiesContext ctx) {
        System.out.println("visitUnsetTableProperties");
        return visitChildren(ctx);
    }

    @Override public String visitAlterTableAlterColumn(SqlBaseParser.AlterTableAlterColumnContext ctx) {
        System.out.println("visitAlterTableAlterColumn");
        return visitChildren(ctx);
    }

    @Override public String visitHiveChangeColumn(SqlBaseParser.HiveChangeColumnContext ctx) {
        System.out.println("visitHiveChangeColumn");
        return visitChildren(ctx);
    }

    @Override public String visitHiveReplaceColumns(SqlBaseParser.HiveReplaceColumnsContext ctx) {
        System.out.println("visitHiveReplaceColumns");
        return visitChildren(ctx);
    }

    @Override public String visitSetTableSerDe(SqlBaseParser.SetTableSerDeContext ctx) {
        System.out.println("visitSetTableSerDe");
        return visitChildren(ctx);
    }

    @Override public String visitAddTablePartition(SqlBaseParser.AddTablePartitionContext ctx) {
        System.out.println("visitAddTablePartition");
        return visitChildren(ctx);
    }

    @Override public String visitRenameTablePartition(SqlBaseParser.RenameTablePartitionContext ctx) {
        System.out.println("visitRenameTablePartition");
        return visitChildren(ctx);
    }

    @Override public String visitDropTablePartitions(SqlBaseParser.DropTablePartitionsContext ctx) {
        System.out.println("visitDropTablePartitions");
        return visitChildren(ctx);
    }

    @Override public String visitSetTableLocation(SqlBaseParser.SetTableLocationContext ctx) {
        System.out.println("visitSetTableLocation");
        return visitChildren(ctx);
    }

    @Override public String visitRecoverPartitions(SqlBaseParser.RecoverPartitionsContext ctx) {
        System.out.println("visitRecoverPartitions");
        return visitChildren(ctx);
    }

    @Override public String visitDropTable(SqlBaseParser.DropTableContext ctx) {
        System.out.println("visitDropTable");
        return visitChildren(ctx);
    }

    @Override public String visitDropView(SqlBaseParser.DropViewContext ctx) {
        System.out.println("visitDropView");
        return visitChildren(ctx);
    }

    @Override public String visitCreateView(SqlBaseParser.CreateViewContext ctx) {
        System.out.println("visitCreateView");
        return visitChildren(ctx);
    }

    @Override public String visitCreateTempViewUsing(SqlBaseParser.CreateTempViewUsingContext ctx) {
        System.out.println("visitCreateTempViewUsing");
        return visitChildren(ctx);
    }

    @Override public String visitAlterViewQuery(SqlBaseParser.AlterViewQueryContext ctx) {
        System.out.println("visitAlterViewQuery");
        return visitChildren(ctx);
    }

    @Override public String visitCreateFunction(SqlBaseParser.CreateFunctionContext ctx) {
        System.out.println("visitCreateFunction");
        return visitChildren(ctx);
    }

    @Override public String visitDropFunction(SqlBaseParser.DropFunctionContext ctx) {
        System.out.println("visitDropFunction");
        return visitChildren(ctx);
    }

    @Override public String visitExplain(SqlBaseParser.ExplainContext ctx) {
        System.out.println("visitExplain");
        return visitChildren(ctx);
    }

    @Override public String visitShowTables(SqlBaseParser.ShowTablesContext ctx) {
        System.out.println("visitShowTables");
        return visitChildren(ctx);
    }

    @Override public String visitShowTableExtended(SqlBaseParser.ShowTableExtendedContext ctx) {
        System.out.println("visitShowTableExtended");
        return visitChildren(ctx);
    }

    @Override public String visitShowTblProperties(SqlBaseParser.ShowTblPropertiesContext ctx) {
        System.out.println("visitShowTblProperties");
        return visitChildren(ctx);
    }

    @Override public String visitShowColumns(SqlBaseParser.ShowColumnsContext ctx) {
        System.out.println("visitShowColumns");
        return visitChildren(ctx);
    }

    @Override public String visitShowViews(SqlBaseParser.ShowViewsContext ctx) {
        System.out.println("visitShowViews");
        return visitChildren(ctx);
    }

    @Override public String visitShowPartitions(SqlBaseParser.ShowPartitionsContext ctx) {
        System.out.println("visitShowPartitions");
        return visitChildren(ctx);
    }

    @Override public String visitShowFunctions(SqlBaseParser.ShowFunctionsContext ctx) {
        System.out.println("visitShowFunctions");
        return visitChildren(ctx);
    }

    @Override public String visitShowCreateTable(SqlBaseParser.ShowCreateTableContext ctx) {
        System.out.println("visitShowCreateTable");
        return visitChildren(ctx);
    }

    @Override public String visitShowCurrentNamespace(SqlBaseParser.ShowCurrentNamespaceContext ctx) {
        System.out.println("visitShowCurrentNamespace");
        return visitChildren(ctx);
    }

    @Override public String visitDescribeFunction(SqlBaseParser.DescribeFunctionContext ctx) {
        System.out.println("visitDescribeFunction");
        return visitChildren(ctx);
    }

    @Override public String visitDescribeNamespace(SqlBaseParser.DescribeNamespaceContext ctx) {
        System.out.println("visitDescribeNamespace");
        return visitChildren(ctx);
    }

    @Override public String visitDescribeRelation(SqlBaseParser.DescribeRelationContext ctx) {
        System.out.println("visitDescribeRelation");
        return visitChildren(ctx);
    }

    @Override public String visitDescribeQuery(SqlBaseParser.DescribeQueryContext ctx) {
        System.out.println("visitDescribeQuery");
        return visitChildren(ctx);
    }

    @Override public String visitCommentNamespace(SqlBaseParser.CommentNamespaceContext ctx) {
        System.out.println("visitCommentNamespace");
        return visitChildren(ctx);
    }

    @Override public String visitCommentTable(SqlBaseParser.CommentTableContext ctx) {
        System.out.println("visitCommentTable");
        return visitChildren(ctx);
    }

    @Override public String visitRefreshTable(SqlBaseParser.RefreshTableContext ctx) {
        System.out.println("visitRefreshTable");
        return visitChildren(ctx);
    }

    @Override public String visitRefreshFunction(SqlBaseParser.RefreshFunctionContext ctx) {
        System.out.println("visitRefreshFunction");
        return visitChildren(ctx);
    }

    @Override public String visitRefreshResource(SqlBaseParser.RefreshResourceContext ctx) {
        System.out.println("visitRefreshResource");
        return visitChildren(ctx);
    }

    @Override public String visitCacheTable(SqlBaseParser.CacheTableContext ctx) {
        System.out.println("visitCacheTable");
        return visitChildren(ctx);
    }

    @Override public String visitUncacheTable(SqlBaseParser.UncacheTableContext ctx) {
        System.out.println("visitUncacheTable");
        return visitChildren(ctx);
    }

    @Override public String visitClearCache(SqlBaseParser.ClearCacheContext ctx) {
        System.out.println("visitClearCache");
        return visitChildren(ctx);
    }

    @Override public String visitLoadData(SqlBaseParser.LoadDataContext ctx) {
        System.out.println("visitLoadData");
        return visitChildren(ctx);
    }

    @Override public String visitTruncateTable(SqlBaseParser.TruncateTableContext ctx) {
        System.out.println("visitTruncateTable");
        return visitChildren(ctx);
    }

    @Override public String visitRepairTable(SqlBaseParser.RepairTableContext ctx) {
        System.out.println("visitRepairTable");
        return visitChildren(ctx);
    }

    @Override public String visitManageResource(SqlBaseParser.ManageResourceContext ctx) {
        System.out.println("visitManageResource");
        return visitChildren(ctx);
    }

    @Override public String visitFailNativeCommand(SqlBaseParser.FailNativeCommandContext ctx) {
        System.out.println("visitFailNativeCommand");
        return visitChildren(ctx);
    }

    @Override public String visitSetTimeZone(SqlBaseParser.SetTimeZoneContext ctx) {
        System.out.println("visitSetTimeZone");
        return visitChildren(ctx);
    }

    @Override public String visitSetQuotedConfiguration(SqlBaseParser.SetQuotedConfigurationContext ctx) {
        System.out.println("visitSetQuotedConfiguration");
        return visitChildren(ctx);
    }

    @Override public String visitSetConfiguration(SqlBaseParser.SetConfigurationContext ctx) {
        System.out.println("visitSetConfiguration");
        return visitChildren(ctx);
    }

    @Override public String visitResetQuotedConfiguration(SqlBaseParser.ResetQuotedConfigurationContext ctx) {
        System.out.println("visitResetQuotedConfiguration");
        return visitChildren(ctx);
    }

    @Override public String visitResetConfiguration(SqlBaseParser.ResetConfigurationContext ctx) {
        System.out.println("visitResetConfiguration");
        return visitChildren(ctx);
    }

    @Override public String visitConfigKey(SqlBaseParser.ConfigKeyContext ctx) {
        System.out.println("visitConfigKey");
        return visitChildren(ctx);
    }

    @Override public String visitConfigValue(SqlBaseParser.ConfigValueContext ctx) {
        System.out.println("visitConfigValue");
        return visitChildren(ctx);
    }

    @Override public String visitUnsupportedHiveNativeCommands(SqlBaseParser.UnsupportedHiveNativeCommandsContext ctx) {
        System.out.println("visitUnsupportedHiveNativeCommands");
        return visitChildren(ctx);
    }

    @Override public String visitCreateTableHeader(SqlBaseParser.CreateTableHeaderContext ctx) {
        System.out.println("visitCreateTableHeader");
        return visitChildren(ctx);
    }

    @Override public String visitReplaceTableHeader(SqlBaseParser.ReplaceTableHeaderContext ctx) {
        System.out.println("visitReplaceTableHeader");
        return visitChildren(ctx);
    }

    @Override public String visitBucketSpec(SqlBaseParser.BucketSpecContext ctx) {
        System.out.println("visitBucketSpec");
        return visitChildren(ctx);
    }

    @Override public String visitSkewSpec(SqlBaseParser.SkewSpecContext ctx) {
        System.out.println("visitSkewSpec");
        return visitChildren(ctx);
    }

    @Override public String visitLocationSpec(SqlBaseParser.LocationSpecContext ctx) {
        System.out.println("visitLocationSpec");
        return visitChildren(ctx);
    }

    @Override public String visitCommentSpec(SqlBaseParser.CommentSpecContext ctx) {
        System.out.println("visitCommentSpec");
        return visitChildren(ctx);
    }

    @Override public String visitQuery(SqlBaseParser.QueryContext ctx) {
        System.out.println("visitQuery");
        return visitChildren(ctx);
    }

    @Override public String visitInsertOverwriteTable(SqlBaseParser.InsertOverwriteTableContext ctx) {
        System.out.println("visitInsertOverwriteTable");
        return visitChildren(ctx);
    }

    @Override public String visitInsertIntoTable(SqlBaseParser.InsertIntoTableContext ctx) {
        System.out.println("visitInsertIntoTable");
        return visitChildren(ctx);
    }

    @Override public String visitInsertOverwriteHiveDir(SqlBaseParser.InsertOverwriteHiveDirContext ctx) {
        System.out.println("visitInsertOverwriteHiveDir");
        return visitChildren(ctx);
    }

    @Override public String visitInsertOverwriteDir(SqlBaseParser.InsertOverwriteDirContext ctx) {
        System.out.println("visitInsertOverwriteDir");
        return visitChildren(ctx);
    }

    @Override public String visitPartitionSpecLocation(SqlBaseParser.PartitionSpecLocationContext ctx) {
        System.out.println("visitPartitionSpecLocation");
        return visitChildren(ctx);
    }

    @Override public String visitPartitionSpec(SqlBaseParser.PartitionSpecContext ctx) {
        System.out.println("visitPartitionSpec");
        return visitChildren(ctx);
    }

    @Override public String visitPartitionVal(SqlBaseParser.PartitionValContext ctx) {
        System.out.println("visitPartitionVal");
        return visitChildren(ctx);
    }

    @Override public String visitNamespace(SqlBaseParser.NamespaceContext ctx) {
        System.out.println("visitNamespace");
        return visitChildren(ctx);
    }

    @Override public String visitDescribeFuncName(SqlBaseParser.DescribeFuncNameContext ctx) {
        System.out.println("visitDescribeFuncName");
        return visitChildren(ctx);
    }

    @Override public String visitDescribeColName(SqlBaseParser.DescribeColNameContext ctx) {
        System.out.println("visitDescribeColName");
        return visitChildren(ctx);
    }

    @Override public String visitCtes(SqlBaseParser.CtesContext ctx) {
        System.out.println("visitCtes");
        return visitChildren(ctx);
    }

    @Override public String visitNamedQuery(SqlBaseParser.NamedQueryContext ctx) {
        System.out.println("visitNamedQuery");
        return visitChildren(ctx);
    }

    @Override public String visitTableProvider(SqlBaseParser.TableProviderContext ctx) {
        System.out.println("visitTableProvider");
        return visitChildren(ctx);
    }

    @Override public String visitCreateTableClauses(SqlBaseParser.CreateTableClausesContext ctx) {
        System.out.println("visitCreateTableClauses");
        return visitChildren(ctx);
    }

    @Override public String visitTablePropertyList(SqlBaseParser.TablePropertyListContext ctx) {
        System.out.println("visitTablePropertyList");
        return visitChildren(ctx);
    }

    @Override public String visitTableProperty(SqlBaseParser.TablePropertyContext ctx) {
        System.out.println("visitTableProperty");
        return visitChildren(ctx);
    }

    @Override public String visitTablePropertyKey(SqlBaseParser.TablePropertyKeyContext ctx) {
        System.out.println("visitTablePropertyKey");
        return visitChildren(ctx);
    }

    @Override public String visitTablePropertyValue(SqlBaseParser.TablePropertyValueContext ctx) {
        System.out.println("visitTablePropertyValue");
        return visitChildren(ctx);
    }

    @Override public String visitConstantList(SqlBaseParser.ConstantListContext ctx) {
        System.out.println("visitConstantList");
        return visitChildren(ctx);
    }

    @Override public String visitNestedConstantList(SqlBaseParser.NestedConstantListContext ctx) {
        System.out.println("visitNestedConstantList");
        return visitChildren(ctx);
    }

    @Override public String visitCreateFileFormat(SqlBaseParser.CreateFileFormatContext ctx) {
        System.out.println("visitCreateFileFormat");
        return visitChildren(ctx);
    }

    @Override public String visitTableFileFormat(SqlBaseParser.TableFileFormatContext ctx) {
        System.out.println("visitTableFileFormat");
        return visitChildren(ctx);
    }

    @Override public String visitGenericFileFormat(SqlBaseParser.GenericFileFormatContext ctx) {
        System.out.println("visitGenericFileFormat");
        return visitChildren(ctx);
    }

    @Override public String visitStorageHandler(SqlBaseParser.StorageHandlerContext ctx) {
        System.out.println("visitStorageHandler");
        return visitChildren(ctx);
    }

    @Override public String visitResource(SqlBaseParser.ResourceContext ctx) {
        System.out.println("visitResource");
        return visitChildren(ctx);
    }

    @Override public String visitSingleInsertQuery(SqlBaseParser.SingleInsertQueryContext ctx) {
        System.out.println("visitSingleInsertQuery");
        return visitChildren(ctx);
    }

    @Override public String visitMultiInsertQuery(SqlBaseParser.MultiInsertQueryContext ctx) {
        System.out.println("visitMultiInsertQuery");
        return visitChildren(ctx);
    }

    @Override public String visitDeleteFromTable(SqlBaseParser.DeleteFromTableContext ctx) {
        System.out.println("visitDeleteFromTable");
        return visitChildren(ctx);
    }

    @Override public String visitUpdateTable(SqlBaseParser.UpdateTableContext ctx) {
        System.out.println("visitUpdateTable");
        return visitChildren(ctx);
    }

    @Override public String visitMergeIntoTable(SqlBaseParser.MergeIntoTableContext ctx) {
        System.out.println("visitMergeIntoTable");
        return visitChildren(ctx);
    }

    @Override public String visitQueryOrganization(SqlBaseParser.QueryOrganizationContext ctx) {
        System.out.println("visitQueryOrganization");
        return visitChildren(ctx);
    }

    @Override public String visitMultiInsertQueryBody(SqlBaseParser.MultiInsertQueryBodyContext ctx) {
        System.out.println("visitMultiInsertQueryBody");
        return visitChildren(ctx);
    }

    @Override public String visitQueryTermDefault(SqlBaseParser.QueryTermDefaultContext ctx) {
        System.out.println("visitQueryTermDefault");
        return visitChildren(ctx);
    }

    @Override public String visitSetOperation(SqlBaseParser.SetOperationContext ctx) {
        System.out.println("visitSetOperation");
        return visitChildren(ctx);
    }

    @Override public String visitQueryPrimaryDefault(SqlBaseParser.QueryPrimaryDefaultContext ctx) {
        System.out.println("visitQueryPrimaryDefault");
        return visitChildren(ctx);
    }

    @Override public String visitFromStmt(SqlBaseParser.FromStmtContext ctx) {
        System.out.println("visitFromStmt");
        return visitChildren(ctx);
    }

    @Override public String visitTable(SqlBaseParser.TableContext ctx) {
        System.out.println("visitTable");
        return visitChildren(ctx);
    }

    @Override public String visitInlineTableDefault1(SqlBaseParser.InlineTableDefault1Context ctx) {
        System.out.println("visitInlineTableDefault1");
        return visitChildren(ctx);
    }

    @Override public String visitSubquery(SqlBaseParser.SubqueryContext ctx) {
        System.out.println("visitSubquery");
        return visitChildren(ctx);
    }

    @Override public String visitSortItem(SqlBaseParser.SortItemContext ctx) {
        System.out.println("visitSortItem");
        return visitChildren(ctx);
    }

    @Override public String visitFromStatement(SqlBaseParser.FromStatementContext ctx) {
        System.out.println("visitFromStatement");
        return visitChildren(ctx);
    }

    @Override public String visitFromStatementBody(SqlBaseParser.FromStatementBodyContext ctx) {
        System.out.println("visitFromStatementBody");
        return visitChildren(ctx);
    }

    @Override public String visitTransformQuerySpecification(SqlBaseParser.TransformQuerySpecificationContext ctx) {
        System.out.println("visitTransformQuerySpecification");
        return visitChildren(ctx);
    }

    @Override public String visitRegularQuerySpecification(SqlBaseParser.RegularQuerySpecificationContext ctx) {
        System.out.println("visitRegularQuerySpecification");
        return visitChildren(ctx);
    }

    @Override public String visitTransformClause(SqlBaseParser.TransformClauseContext ctx) {
        System.out.println("visitTransformClause");
        return visitChildren(ctx);
    }

    @Override public String visitSelectClause(SqlBaseParser.SelectClauseContext ctx) {
        System.out.println("visitSelectClause");
        return visitChildren(ctx);
    }

    @Override public String visitSetClause(SqlBaseParser.SetClauseContext ctx) {
        System.out.println("visitSetClause");
        return visitChildren(ctx);
    }

    @Override public String visitMatchedClause(SqlBaseParser.MatchedClauseContext ctx) {
        System.out.println("visitMatchedClause");
        return visitChildren(ctx);
    }

    @Override public String visitNotMatchedClause(SqlBaseParser.NotMatchedClauseContext ctx) {
        System.out.println("visitNotMatchedClause");
        return visitChildren(ctx);
    }

    @Override public String visitMatchedAction(SqlBaseParser.MatchedActionContext ctx) {
        System.out.println("visitMatchedAction");
        return visitChildren(ctx);
    }

    @Override public String visitNotMatchedAction(SqlBaseParser.NotMatchedActionContext ctx) {
        System.out.println("visitNotMatchedAction");
        return visitChildren(ctx);
    }

    @Override public String visitAssignmentList(SqlBaseParser.AssignmentListContext ctx) {
        System.out.println("visitAssignmentList");
        return visitChildren(ctx);
    }

    @Override public String visitAssignment(SqlBaseParser.AssignmentContext ctx) {
        System.out.println("visitAssignment");
        return visitChildren(ctx);
    }

    @Override public String visitWhereClause(SqlBaseParser.WhereClauseContext ctx) {
        System.out.println("visitWhereClause");
        return visitChildren(ctx);
    }

    @Override public String visitHavingClause(SqlBaseParser.HavingClauseContext ctx) {
        System.out.println("visitHavingClause");
        return visitChildren(ctx);
    }

    @Override public String visitHint(SqlBaseParser.HintContext ctx) {
        System.out.println("visitHint");
        return visitChildren(ctx);
    }

    @Override public String visitHintStatement(SqlBaseParser.HintStatementContext ctx) {
        System.out.println("visitHintStatement");
        return visitChildren(ctx);
    }

    @Override public String visitFromClause(SqlBaseParser.FromClauseContext ctx) {
        System.out.println("visitFromClause");
        return visitChildren(ctx);
    }

    @Override public String visitAggregationClause(SqlBaseParser.AggregationClauseContext ctx) {
        System.out.println("visitAggregationClause");
        return visitChildren(ctx);
    }

    @Override public String visitGroupByClause(SqlBaseParser.GroupByClauseContext ctx) {
        System.out.println("visitGroupByClause");
        return visitChildren(ctx);
    }

    @Override public String visitGroupingAnalytics(SqlBaseParser.GroupingAnalyticsContext ctx) {
        System.out.println("visitGroupingAnalytics");
        return visitChildren(ctx);
    }

    @Override public String visitGroupingElement(SqlBaseParser.GroupingElementContext ctx) {
        System.out.println("visitGroupingElement");
        return visitChildren(ctx);
    }

    @Override public String visitGroupingSet(SqlBaseParser.GroupingSetContext ctx) {
        System.out.println("visitGroupingSet");
        return visitChildren(ctx);
    }

    @Override public String visitPivotClause(SqlBaseParser.PivotClauseContext ctx) {
        System.out.println("visitPivotClause");
        return visitChildren(ctx);
    }

    @Override public String visitPivotColumn(SqlBaseParser.PivotColumnContext ctx) {
        System.out.println("visitPivotColumn");
        return visitChildren(ctx);
    }

    @Override public String visitPivotValue(SqlBaseParser.PivotValueContext ctx) {
        System.out.println("visitPivotValue");
        return visitChildren(ctx);
    }

    @Override public String visitLateralView(SqlBaseParser.LateralViewContext ctx) {
        System.out.println("visitLateralView");
        return visitChildren(ctx);
    }

    @Override public String visitSetQuantifier(SqlBaseParser.SetQuantifierContext ctx) {
        System.out.println("visitSetQuantifier");
        return visitChildren(ctx);
    }

    @Override public String visitRelation(SqlBaseParser.RelationContext ctx) {
        System.out.println("visitRelation");
        return visitChildren(ctx);
    }

    @Override public String visitJoinRelation(SqlBaseParser.JoinRelationContext ctx) {
        System.out.println("visitJoinRelation");
        return visitChildren(ctx);
    }

    @Override public String visitJoinType(SqlBaseParser.JoinTypeContext ctx) {
        System.out.println("visitJoinType");
        return visitChildren(ctx);
    }

    @Override public String visitJoinCriteria(SqlBaseParser.JoinCriteriaContext ctx) {
        System.out.println("visitJoinCriteria");
        return visitChildren(ctx);
    }

    @Override public String visitSample(SqlBaseParser.SampleContext ctx) {
        System.out.println("visitSample");
        return visitChildren(ctx);
    }

    @Override public String visitSampleByPercentile(SqlBaseParser.SampleByPercentileContext ctx) {
        System.out.println("visitSampleByPercentile");
        return visitChildren(ctx);
    }

    @Override public String visitSampleByRows(SqlBaseParser.SampleByRowsContext ctx) {
        System.out.println("visitSampleByRows");
        return visitChildren(ctx);
    }

    @Override public String visitSampleByBucket(SqlBaseParser.SampleByBucketContext ctx) {
        System.out.println("visitSampleByBucket");
        return visitChildren(ctx);
    }

    @Override public String visitSampleByBytes(SqlBaseParser.SampleByBytesContext ctx) {
        System.out.println("visitSampleByBytes");
        return visitChildren(ctx);
    }

    @Override public String visitIdentifierList(SqlBaseParser.IdentifierListContext ctx) {
        System.out.println("visitIdentifierList");
        return visitChildren(ctx);
    }

    @Override public String visitIdentifierSeq(SqlBaseParser.IdentifierSeqContext ctx) {
        System.out.println("visitIdentifierSeq");
        return visitChildren(ctx);
    }

    @Override public String visitOrderedIdentifierList(SqlBaseParser.OrderedIdentifierListContext ctx) {
        System.out.println("visitOrderedIdentifierList");
        return visitChildren(ctx);
    }

    @Override public String visitOrderedIdentifier(SqlBaseParser.OrderedIdentifierContext ctx) {
        System.out.println("visitOrderedIdentifier");
        return visitChildren(ctx);
    }

    @Override public String visitIdentifierCommentList(SqlBaseParser.IdentifierCommentListContext ctx) {
        System.out.println("visitIdentifierCommentList");
        return visitChildren(ctx);
    }

    @Override public String visitIdentifierComment(SqlBaseParser.IdentifierCommentContext ctx) {
        System.out.println("visitIdentifierComment");
        return visitChildren(ctx);
    }

    @Override public String visitTableName(SqlBaseParser.TableNameContext ctx) {
        System.out.println("visitTableName");
        return visitChildren(ctx);
    }

    @Override public String visitAliasedQuery(SqlBaseParser.AliasedQueryContext ctx) {
        System.out.println("visitAliasedQuery");
        return visitChildren(ctx);
    }

    @Override public String visitAliasedRelation(SqlBaseParser.AliasedRelationContext ctx) {
        System.out.println("visitAliasedRelation");
        return visitChildren(ctx);
    }

    @Override public String visitInlineTableDefault2(SqlBaseParser.InlineTableDefault2Context ctx) {
        System.out.println("visitInlineTableDefault2");
        return visitChildren(ctx);
    }

    @Override public String visitTableValuedFunction(SqlBaseParser.TableValuedFunctionContext ctx) {
        System.out.println("visitTableValuedFunction");
        return visitChildren(ctx);
    }

    @Override public String visitInlineTable(SqlBaseParser.InlineTableContext ctx) {
        System.out.println("visitInlineTable");
        return visitChildren(ctx);
    }

    @Override public String visitFunctionTable(SqlBaseParser.FunctionTableContext ctx) {
        System.out.println("visitFunctionTable");
        return visitChildren(ctx);
    }

    @Override public String visitTableAlias(SqlBaseParser.TableAliasContext ctx) {
        System.out.println("visitTableAlias");
        return visitChildren(ctx);
    }

    @Override public String visitRowFormatSerde(SqlBaseParser.RowFormatSerdeContext ctx) {
        System.out.println("visitRowFormatSerde");
        return visitChildren(ctx);
    }

    @Override public String visitRowFormatDelimited(SqlBaseParser.RowFormatDelimitedContext ctx) {
        System.out.println("visitRowFormatDelimited");
        return visitChildren(ctx);
    }

    @Override public String visitMultipartIdentifierList(SqlBaseParser.MultipartIdentifierListContext ctx) {
        System.out.println("visitMultipartIdentifierList");
        return visitChildren(ctx);
    }

    @Override public String visitMultipartIdentifier(SqlBaseParser.MultipartIdentifierContext ctx) {
        System.out.println("visitMultipartIdentifier");
        return visitChildren(ctx);
    }

    @Override public String visitTableIdentifier(SqlBaseParser.TableIdentifierContext ctx) {
        System.out.println("visitTableIdentifier");
        return visitChildren(ctx);
    }

    @Override public String visitFunctionIdentifier(SqlBaseParser.FunctionIdentifierContext ctx) {
        System.out.println("visitFunctionIdentifier");
        return visitChildren(ctx);
    }

    @Override public String visitNamedExpression(SqlBaseParser.NamedExpressionContext ctx) {
        System.out.println("visitNamedExpression");
        return visitChildren(ctx);
    }

    @Override public String visitNamedExpressionSeq(SqlBaseParser.NamedExpressionSeqContext ctx) {
        System.out.println("visitNamedExpressionSeq");
        return visitChildren(ctx);
    }

    @Override public String visitPartitionFieldList(SqlBaseParser.PartitionFieldListContext ctx) {
        System.out.println("visitPartitionFieldList");
        return visitChildren(ctx);
    }

    @Override public String visitPartitionTransform(SqlBaseParser.PartitionTransformContext ctx) {
        System.out.println("visitPartitionTransform");
        return visitChildren(ctx);
    }

    @Override public String visitPartitionColumn(SqlBaseParser.PartitionColumnContext ctx) {
        System.out.println("visitPartitionColumn");
        return visitChildren(ctx);
    }

    @Override public String visitIdentityTransform(SqlBaseParser.IdentityTransformContext ctx) {
        System.out.println("visitIdentityTransform");
        return visitChildren(ctx);
    }

    @Override public String visitApplyTransform(SqlBaseParser.ApplyTransformContext ctx) {
        System.out.println("visitApplyTransform");
        return visitChildren(ctx);
    }

    @Override public String visitTransformArgument(SqlBaseParser.TransformArgumentContext ctx) {
        System.out.println("visitTransformArgument");
        return visitChildren(ctx);
    }

    @Override public String visitExpression(SqlBaseParser.ExpressionContext ctx) {
        System.out.println("visitExpression");
        return visitChildren(ctx);
    }

    @Override public String visitExpressionSeq(SqlBaseParser.ExpressionSeqContext ctx) {
        System.out.println("visitExpressionSeq");
        return visitChildren(ctx);
    }

    @Override public String visitLogicalNot(SqlBaseParser.LogicalNotContext ctx) {
        System.out.println("visitLogicalNot");
        return visitChildren(ctx);
    }

    @Override public String visitPredicated(SqlBaseParser.PredicatedContext ctx) {
        System.out.println("visitPredicated");
        return visitChildren(ctx);
    }

    @Override public String visitExists(SqlBaseParser.ExistsContext ctx) {
        System.out.println("visitExists");
        return visitChildren(ctx);
    }

    @Override public String visitLogicalBinary(SqlBaseParser.LogicalBinaryContext ctx) {
        System.out.println("visitLogicalBinary");
        return visitChildren(ctx);
    }

    @Override public String visitPredicate(SqlBaseParser.PredicateContext ctx) {
        System.out.println("visitPredicate");
        return visitChildren(ctx);
    }

    @Override public String visitValueExpressionDefault(SqlBaseParser.ValueExpressionDefaultContext ctx) {
        System.out.println("visitValueExpressionDefault");
        return visitChildren(ctx);
    }

    @Override public String visitComparison(SqlBaseParser.ComparisonContext ctx) {
        System.out.println("visitComparison");
        return visitChildren(ctx);
    }

    @Override public String visitArithmeticBinary(SqlBaseParser.ArithmeticBinaryContext ctx) {
        System.out.println("visitArithmeticBinary");
        return visitChildren(ctx);
    }

    @Override public String visitArithmeticUnary(SqlBaseParser.ArithmeticUnaryContext ctx) {
        System.out.println("visitArithmeticUnary");
        return visitChildren(ctx);
    }

    @Override public String visitStruct(SqlBaseParser.StructContext ctx) {
        System.out.println("visitStruct");
        return visitChildren(ctx);
    }

    @Override public String visitDereference(SqlBaseParser.DereferenceContext ctx) {
        System.out.println("visitDereference");
        return visitChildren(ctx);
    }

    @Override public String visitSimpleCase(SqlBaseParser.SimpleCaseContext ctx) {
        System.out.println("visitSimpleCase");
        return visitChildren(ctx);
    }

    @Override public String visitColumnReference(SqlBaseParser.ColumnReferenceContext ctx) {
        System.out.println("visitColumnReference");
        return visitChildren(ctx);
    }

    @Override public String visitRowConstructor(SqlBaseParser.RowConstructorContext ctx) {
        System.out.println("visitRowConstructor");
        return visitChildren(ctx);
    }

    @Override public String visitLast(SqlBaseParser.LastContext ctx) {
        System.out.println("visitLast");
        return visitChildren(ctx);
    }

    @Override public String visitStar(SqlBaseParser.StarContext ctx) {
        System.out.println("visitStar");
        return visitChildren(ctx);
    }

    @Override public String visitOverlay(SqlBaseParser.OverlayContext ctx) {
        System.out.println("visitOverlay");
        return visitChildren(ctx);
    }

    @Override public String visitSubscript(SqlBaseParser.SubscriptContext ctx) {
        System.out.println("visitSubscript");
        return visitChildren(ctx);
    }

    @Override public String visitSubqueryExpression(SqlBaseParser.SubqueryExpressionContext ctx) {
        System.out.println("visitSubqueryExpression");
        return visitChildren(ctx);
    }

    @Override public String visitSubstring(SqlBaseParser.SubstringContext ctx) {
        System.out.println("visitSubstring");
        return visitChildren(ctx);
    }

    @Override public String visitCurrentDatetime(SqlBaseParser.CurrentDatetimeContext ctx) {
        System.out.println("visitCurrentDatetime");
        return visitChildren(ctx);
    }

    @Override public String visitCast(SqlBaseParser.CastContext ctx) {
        System.out.println("visitCast");
        return visitChildren(ctx);
    }

    @Override public String visitConstantDefault(SqlBaseParser.ConstantDefaultContext ctx) {
        System.out.println("visitConstantDefault");
        return visitChildren(ctx);
    }

    @Override public String visitLambda(SqlBaseParser.LambdaContext ctx) {
        System.out.println("visitLambda");
        return visitChildren(ctx);
    }

    @Override public String visitParenthesizedExpression(SqlBaseParser.ParenthesizedExpressionContext ctx) {
        System.out.println("visitParenthesizedExpression");
        return visitChildren(ctx);
    }

    @Override public String visitExtract(SqlBaseParser.ExtractContext ctx) {
        System.out.println("visitExtract");
        return visitChildren(ctx);
    }

    @Override public String visitTrim(SqlBaseParser.TrimContext ctx) {
        System.out.println("visitTrim");
        return visitChildren(ctx);
    }

    @Override public String visitFunctionCall(SqlBaseParser.FunctionCallContext ctx) {
        System.out.println("visitFunctionCall");
        return visitChildren(ctx);
    }

    @Override public String visitSearchedCase(SqlBaseParser.SearchedCaseContext ctx) {
        System.out.println("visitSearchedCase");
        return visitChildren(ctx);
    }

    @Override public String visitPosition(SqlBaseParser.PositionContext ctx) {
        System.out.println("visitPosition");
        return visitChildren(ctx);
    }

    @Override public String visitFirst(SqlBaseParser.FirstContext ctx) {
        System.out.println("visitFirst");
        return visitChildren(ctx);
    }

    @Override public String visitNullLiteral(SqlBaseParser.NullLiteralContext ctx) {
        System.out.println("visitNullLiteral");
        return visitChildren(ctx);
    }

    @Override public String visitIntervalLiteral(SqlBaseParser.IntervalLiteralContext ctx) {
        System.out.println("visitIntervalLiteral");
        return visitChildren(ctx);
    }

    @Override public String visitTypeConstructor(SqlBaseParser.TypeConstructorContext ctx) {
        System.out.println("visitTypeConstructor");
        return visitChildren(ctx);
    }

    @Override public String visitNumericLiteral(SqlBaseParser.NumericLiteralContext ctx) {
        System.out.println("visitNumericLiteral");
        return visitChildren(ctx);
    }

    @Override public String visitBooleanLiteral(SqlBaseParser.BooleanLiteralContext ctx) {
        System.out.println("visitBooleanLiteral");
        return visitChildren(ctx);
    }

    @Override public String visitStringLiteral(SqlBaseParser.StringLiteralContext ctx) {
        System.out.println("visitStringLiteral");
        return visitChildren(ctx);
    }

    @Override public String visitComparisonOperator(SqlBaseParser.ComparisonOperatorContext ctx) {
        System.out.println("visitComparisonOperator");
        return visitChildren(ctx);
    }

    @Override public String visitArithmeticOperator(SqlBaseParser.ArithmeticOperatorContext ctx) {
        System.out.println("visitArithmeticOperator");
        return visitChildren(ctx);
    }

    @Override public String visitPredicateOperator(SqlBaseParser.PredicateOperatorContext ctx) {
        System.out.println("visitPredicateOperator");
        return visitChildren(ctx);
    }

    @Override public String visitBooleanValue(SqlBaseParser.BooleanValueContext ctx) {
        System.out.println("visitBooleanValue");
        return visitChildren(ctx);
    }

    @Override public String visitInterval(SqlBaseParser.IntervalContext ctx) {
        System.out.println("visitInterval");
        return visitChildren(ctx);
    }

    @Override public String visitErrorCapturingMultiUnitsInterval(SqlBaseParser.ErrorCapturingMultiUnitsIntervalContext ctx) {
        System.out.println("visitErrorCapturingMultiUnitsInterval");
        return visitChildren(ctx);
    }

    @Override public String visitMultiUnitsInterval(SqlBaseParser.MultiUnitsIntervalContext ctx) {
        System.out.println("visitMultiUnitsInterval");
        return visitChildren(ctx);
    }

    @Override public String visitErrorCapturingUnitToUnitInterval(SqlBaseParser.ErrorCapturingUnitToUnitIntervalContext ctx) {
        System.out.println("visitErrorCapturingUnitToUnitInterval");
        return visitChildren(ctx);
    }

    @Override public String visitUnitToUnitInterval(SqlBaseParser.UnitToUnitIntervalContext ctx) {
        System.out.println("visitUnitToUnitInterval");
        return visitChildren(ctx);
    }

    @Override public String visitIntervalValue(SqlBaseParser.IntervalValueContext ctx) {
        System.out.println("visitIntervalValue");
        return visitChildren(ctx);
    }

    @Override public String visitColPosition(SqlBaseParser.ColPositionContext ctx) {
        System.out.println("visitColPosition");
        return visitChildren(ctx);
    }

    @Override public String visitComplexDataType(SqlBaseParser.ComplexDataTypeContext ctx) {
        System.out.println("visitComplexDataType");
        return visitChildren(ctx);
    }

    @Override public String visitYearMonthIntervalDataType(SqlBaseParser.YearMonthIntervalDataTypeContext ctx) {
        System.out.println("visitYearMonthIntervalDataType");
        return visitChildren(ctx);
    }

    @Override public String visitDayTimeIntervalDataType(SqlBaseParser.DayTimeIntervalDataTypeContext ctx) {
        System.out.println("visitDayTimeIntervalDataType");
        return visitChildren(ctx);
    }

    @Override public String visitPrimitiveDataType(SqlBaseParser.PrimitiveDataTypeContext ctx) {
        System.out.println("visitPrimitiveDataType");
        return visitChildren(ctx);
    }

    @Override public String visitQualifiedColTypeWithPositionList(SqlBaseParser.QualifiedColTypeWithPositionListContext ctx) {
        System.out.println("visitQualifiedColTypeWithPositionList");
        return visitChildren(ctx);
    }

    @Override public String visitQualifiedColTypeWithPosition(SqlBaseParser.QualifiedColTypeWithPositionContext ctx) {
        System.out.println("visitQualifiedColTypeWithPosition");
        return visitChildren(ctx);
    }

    @Override public String visitColTypeList(SqlBaseParser.ColTypeListContext ctx) {
        System.out.println("visitColTypeList");
        return visitChildren(ctx);
    }

    @Override public String visitColType(SqlBaseParser.ColTypeContext ctx) {
        System.out.println("visitColType");
        return visitChildren(ctx);
    }

    @Override public String visitComplexColTypeList(SqlBaseParser.ComplexColTypeListContext ctx) {
        System.out.println("visitComplexColTypeList");
        return visitChildren(ctx);
    }

    @Override public String visitComplexColType(SqlBaseParser.ComplexColTypeContext ctx) {
        System.out.println("visitComplexColType");
        return visitChildren(ctx);
    }

    @Override public String visitWhenClause(SqlBaseParser.WhenClauseContext ctx) {
        System.out.println("visitWhenClause");
        return visitChildren(ctx);
    }

    @Override public String visitWindowClause(SqlBaseParser.WindowClauseContext ctx) {
        System.out.println("visitWindowClause");
        return visitChildren(ctx);
    }

    @Override public String visitNamedWindow(SqlBaseParser.NamedWindowContext ctx) {
        System.out.println("visitNamedWindow");
        return visitChildren(ctx);
    }

    @Override public String visitWindowRef(SqlBaseParser.WindowRefContext ctx) {
        System.out.println("visitWindowRef");
        return visitChildren(ctx);
    }

    @Override public String visitWindowDef(SqlBaseParser.WindowDefContext ctx) {
        System.out.println("visitWindowDef");
        return visitChildren(ctx);
    }

    @Override public String visitWindowFrame(SqlBaseParser.WindowFrameContext ctx) {
        System.out.println("visitWindowFrame");
        return visitChildren(ctx);
    }

    @Override public String visitFrameBound(SqlBaseParser.FrameBoundContext ctx) {
        System.out.println("visitFrameBound");
        return visitChildren(ctx);
    }

    @Override public String visitQualifiedNameList(SqlBaseParser.QualifiedNameListContext ctx) {
        System.out.println("visitQualifiedNameList");
        return visitChildren(ctx);
    }

    @Override public String visitFunctionName(SqlBaseParser.FunctionNameContext ctx) {
        System.out.println("visitFunctionName");
        return visitChildren(ctx);
    }

    @Override public String visitQualifiedName(SqlBaseParser.QualifiedNameContext ctx) {
        System.out.println("visitQualifiedName");
        return visitChildren(ctx);
    }

    @Override public String visitErrorCapturingIdentifier(SqlBaseParser.ErrorCapturingIdentifierContext ctx) {
        System.out.println("visitErrorCapturingIdentifier");
        return visitChildren(ctx);
    }

    @Override public String visitErrorIdent(SqlBaseParser.ErrorIdentContext ctx) {
        System.out.println("visitErrorIdent");
        return visitChildren(ctx);
    }

    @Override public String visitRealIdent(SqlBaseParser.RealIdentContext ctx) {
        System.out.println("visitRealIdent");
        return visitChildren(ctx);
    }

    @Override public String visitIdentifier(SqlBaseParser.IdentifierContext ctx) {
        System.out.println("visitIdentifier");
        return visitChildren(ctx);
    }

    @Override public String visitUnquotedIdentifier(SqlBaseParser.UnquotedIdentifierContext ctx) {
        System.out.println("visitUnquotedIdentifier");
        return visitChildren(ctx);
    }

    @Override public String visitQuotedIdentifierAlternative(SqlBaseParser.QuotedIdentifierAlternativeContext ctx) {
        System.out.println("visitQuotedIdentifierAlternative");
        return visitChildren(ctx);
    }

    @Override public String visitQuotedIdentifier(SqlBaseParser.QuotedIdentifierContext ctx) {
        System.out.println("visitQuotedIdentifier");
        return visitChildren(ctx);
    }

    @Override public String visitExponentLiteral(SqlBaseParser.ExponentLiteralContext ctx) {
        System.out.println("visitExponentLiteral");
        return visitChildren(ctx);
    }

    @Override public String visitDecimalLiteral(SqlBaseParser.DecimalLiteralContext ctx) {
        System.out.println("visitDecimalLiteral");
        return visitChildren(ctx);
    }

    @Override public String visitLegacyDecimalLiteral(SqlBaseParser.LegacyDecimalLiteralContext ctx) {
        System.out.println("visitLegacyDecimalLiteral");
        return visitChildren(ctx);
    }

    @Override public String visitIntegerLiteral(SqlBaseParser.IntegerLiteralContext ctx) {
        System.out.println("visitIntegerLiteral");
        return visitChildren(ctx);
    }

    @Override public String visitBigIntLiteral(SqlBaseParser.BigIntLiteralContext ctx) {
        System.out.println("visitBigIntLiteral");
        return visitChildren(ctx);
    }

    @Override public String visitSmallIntLiteral(SqlBaseParser.SmallIntLiteralContext ctx) {
        System.out.println("visitSmallIntLiteral");
        return visitChildren(ctx);
    }

    @Override public String visitTinyIntLiteral(SqlBaseParser.TinyIntLiteralContext ctx) {
        System.out.println("visitTinyIntLiteral");
        return visitChildren(ctx);
    }

    @Override public String visitDoubleLiteral(SqlBaseParser.DoubleLiteralContext ctx) {
        System.out.println("visitDoubleLiteral");
        return visitChildren(ctx);
    }

    @Override public String visitFloatLiteral(SqlBaseParser.FloatLiteralContext ctx) {
        System.out.println("visitFloatLiteral");
        return visitChildren(ctx);
    }

    @Override public String visitBigDecimalLiteral(SqlBaseParser.BigDecimalLiteralContext ctx) {
        System.out.println("visitBigDecimalLiteral");
        return visitChildren(ctx);
    }

    @Override public String visitAlterColumnAction(SqlBaseParser.AlterColumnActionContext ctx) {
        System.out.println("visitAlterColumnAction");
        return visitChildren(ctx);
    }

    @Override public String visitAnsiNonReserved(SqlBaseParser.AnsiNonReservedContext ctx) {
        System.out.println("visitAnsiNonReserved");
        return visitChildren(ctx);
    }

    @Override public String visitStrictNonReserved(SqlBaseParser.StrictNonReservedContext ctx) {
        System.out.println("visitStrictNonReserved");
        return visitChildren(ctx);
    }

    @Override public String visitNonReserved(SqlBaseParser.NonReservedContext ctx) {
        System.out.println("visitNonReserved");
        return visitChildren(ctx);
    }

}