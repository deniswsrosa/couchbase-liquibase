package com.couchbase.database;

import liquibase.CatalogAndSchema;
import liquibase.change.Change;
import liquibase.changelog.ChangeSet;
import liquibase.changelog.DatabaseChangeLog;
import liquibase.changelog.RanChangeSet;
import liquibase.database.Database;
import liquibase.database.DatabaseConnection;
import liquibase.database.ObjectQuotingStrategy;
import liquibase.exception.*;
import liquibase.sql.visitor.SqlVisitor;
import liquibase.statement.DatabaseFunction;
import liquibase.statement.SqlStatement;
import liquibase.structure.DatabaseObject;

import java.io.IOException;
import java.io.Writer;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;

public class CouchbaseDatabase implements Database {

    public static final String PRODUCT_NAME = "CouchbaseServer";

    protected String getDefaultDatabaseProductName() {
        return "CouchbaseServer";
    }

    public boolean isCorrectDatabaseImplementation(DatabaseConnection conn) throws DatabaseException {
        return false;
    }

    public String getDefaultDriver(String url) {
        return null;
    }

    public DatabaseConnection getConnection() {
        return null;
    }

    public void setConnection(DatabaseConnection conn) {

    }

    public boolean requiresUsername() {
        return false;
    }

    public boolean requiresPassword() {
        return false;
    }

    public boolean getAutoCommitMode() {
        return false;
    }

    public boolean supportsDDLInTransaction() {
        return false;
    }

    public String getDatabaseProductName() {
        return null;
    }

    public String getDatabaseProductVersion() throws DatabaseException {
        return null;
    }

    public int getDatabaseMajorVersion() throws DatabaseException {
        return 0;
    }

    public int getDatabaseMinorVersion() throws DatabaseException {
        return 0;
    }

    public String getShortName() {
        return "couchbase";
    }

    public String getDefaultCatalogName() {
        return null;
    }

    public void setDefaultCatalogName(String catalogName) throws DatabaseException {

    }

    public String getDefaultSchemaName() {
        return null;
    }

    public Integer getDefaultScaleForNativeDataType(String nativeDataType) {
        return null;
    }

    public void setDefaultSchemaName(String schemaName) throws DatabaseException {

    }

    public Integer getDefaultPort() {
        return null;
    }

    public Integer getFetchSize() {
        return null;
    }

    public String getLiquibaseCatalogName() {
        return null;
    }

    public void setLiquibaseCatalogName(String catalogName) {

    }

    public String getLiquibaseSchemaName() {
        return null;
    }

    public void setLiquibaseSchemaName(String schemaName) {

    }

    public boolean supportsInitiallyDeferrableColumns() {
        return false;
    }

    public boolean supportsSequences() {
        return false;
    }

    public boolean supportsDropTableCascadeConstraints() {
        return false;
    }

    public boolean supportsAutoIncrement() {
        return false;
    }

    public String getDateLiteral(String isoDate) {
        return null;
    }

    public String getCurrentDateTimeFunction() {
        return null;
    }

    public void setCurrentDateTimeFunction(String function) {

    }

    public String getLineComment() {
        return null;
    }

    public String getAutoIncrementClause(BigInteger startWith, BigInteger incrementBy) {
        return null;
    }

    public String getDatabaseChangeLogTableName() {
        return null;
    }

    public void setDatabaseChangeLogTableName(String tableName) {

    }

    public String getDatabaseChangeLogLockTableName() {
        return null;
    }

    public void setDatabaseChangeLogLockTableName(String tableName) {

    }

    public String getLiquibaseTablespaceName() {
        return null;
    }

    public void setLiquibaseTablespaceName(String tablespaceName) {

    }

    public String getConcatSql(String... values) {
        return null;
    }

    public void setCanCacheLiquibaseTableInfo(boolean canCacheLiquibaseTableInfo) {

    }

    public void dropDatabaseObjects(CatalogAndSchema schema) throws LiquibaseException {

    }

    public void tag(String tagString) throws DatabaseException {

    }

    public boolean doesTagExist(String tag) throws DatabaseException {
        return false;
    }

    public boolean isSystemObject(DatabaseObject example) {
        return false;
    }

    public boolean isLiquibaseObject(DatabaseObject object) {
        return false;
    }

    public String getViewDefinition(CatalogAndSchema schema, String name) throws DatabaseException {
        return null;
    }

    public String getDateLiteral(Date date) {
        return null;
    }

    public String getTimeLiteral(Time time) {
        return null;
    }

    public String getDateTimeLiteral(Timestamp timeStamp) {
        return null;
    }

    public String getDateLiteral(java.util.Date defaultDateValue) {
        return null;
    }

    public String escapeObjectName(String catalogName, String schemaName, String objectName, Class<? extends DatabaseObject> objectType) {
        return null;
    }

    public String escapeTableName(String catalogName, String schemaName, String tableName) {
        return null;
    }

    public String escapeIndexName(String catalogName, String schemaName, String indexName) {
        return null;
    }

    public String escapeObjectName(String objectName, Class<? extends DatabaseObject> objectType) {
        return null;
    }

    public int getMaxFractionalDigitsForTimestamp() {
        return 0;
    }

    public int getDefaultFractionalDigitsForTimestamp() {
        return 0;
    }

    public String escapeColumnName(String catalogName, String schemaName, String tableName, String columnName) {
        return null;
    }

    public String escapeColumnName(String catalogName, String schemaName, String tableName, String columnName, boolean quoteNamesThatMayBeFunctions) {
        return null;
    }

    public String escapeColumnNameList(String columnNames) {
        return null;
    }

    public boolean supportsTablespaces() {
        return false;
    }

    public boolean supportsCatalogs() {
        return false;
    }

    public CatalogAndSchema.CatalogAndSchemaCase getSchemaAndCatalogCase() {
        return null;
    }

    public boolean supportsSchemas() {
        return false;
    }

    public boolean supportsCatalogInObjectName(Class<? extends DatabaseObject> type) {
        return false;
    }

    public String generatePrimaryKeyName(String tableName) {
        return null;
    }

    public String escapeSequenceName(String catalogName, String schemaName, String sequenceName) {
        return null;
    }

    public String escapeViewName(String catalogName, String schemaName, String viewName) {
        return null;
    }

    public ChangeSet.RunStatus getRunStatus(ChangeSet changeSet) throws DatabaseException, DatabaseHistoryException {
        return null;
    }

    public RanChangeSet getRanChangeSet(ChangeSet changeSet) throws DatabaseException, DatabaseHistoryException {
        return null;
    }

    public void markChangeSetExecStatus(ChangeSet changeSet, ChangeSet.ExecType execType) throws DatabaseException {

    }

    public List<RanChangeSet> getRanChangeSetList() throws DatabaseException {
        return null;
    }

    public java.util.Date getRanDate(ChangeSet changeSet) throws DatabaseException, DatabaseHistoryException {
        return null;
    }

    public void removeRanStatus(ChangeSet changeSet) throws DatabaseException {

    }

    public void commit() throws DatabaseException {

    }

    public void rollback() throws DatabaseException {

    }

    public String escapeStringForDatabase(String string) {
        return null;
    }

    public void close() throws DatabaseException {

    }

    public boolean supportsRestrictForeignKeys() {
        return false;
    }

    public String escapeConstraintName(String constraintName) {
        return null;
    }

    public boolean isAutoCommit() throws DatabaseException {
        return false;
    }

    public void setAutoCommit(boolean b) throws DatabaseException {

    }

    public boolean isSafeToRunUpdate() throws DatabaseException {
        return false;
    }

    public void executeStatements(Change change, DatabaseChangeLog changeLog, List<SqlVisitor> sqlVisitors) throws LiquibaseException {

    }

    public void execute(SqlStatement[] statements, List<SqlVisitor> sqlVisitors) throws LiquibaseException {

    }

    public void saveStatements(Change change, List<SqlVisitor> sqlVisitors, Writer writer) throws IOException, LiquibaseException {

    }

    public void executeRollbackStatements(Change change, List<SqlVisitor> sqlVisitors) throws LiquibaseException {

    }

    public void executeRollbackStatements(SqlStatement[] statements, List<SqlVisitor> sqlVisitors) throws LiquibaseException {

    }

    public void saveRollbackStatement(Change change, List<SqlVisitor> sqlVisitors, Writer writer) throws IOException, LiquibaseException {

    }

    public java.util.Date parseDate(String dateAsString) throws DateParseException {
        return null;
    }

    public List<DatabaseFunction> getDateFunctions() {
        return null;
    }

    public void resetInternalState() {

    }

    public boolean supportsForeignKeyDisable() {
        return false;
    }

    public boolean disableForeignKeyChecks() throws DatabaseException {
        return false;
    }

    public void enableForeignKeyChecks() throws DatabaseException {

    }

    public boolean isCaseSensitive() {
        return false;
    }

    public boolean isReservedWord(String string) {
        return false;
    }

    public CatalogAndSchema correctSchema(CatalogAndSchema schema) {
        return null;
    }

    public String correctObjectName(String name, Class<? extends DatabaseObject> objectType) {
        return null;
    }

    public boolean isFunction(String string) {
        return false;
    }

    public int getDataTypeMaxParameters(String dataTypeName) {
        return 0;
    }

    public CatalogAndSchema getDefaultSchema() {
        return null;
    }

    public boolean dataTypeIsNotModifiable(String typeName) {
        return false;
    }

    public String generateDatabaseFunctionValue(DatabaseFunction databaseFunction) {
        return null;
    }

    public ObjectQuotingStrategy getObjectQuotingStrategy() {
        return null;
    }

    public void setObjectQuotingStrategy(ObjectQuotingStrategy quotingStrategy) {

    }

    public boolean createsIndexesForForeignKeys() {
        return false;
    }

    public boolean getOutputDefaultSchema() {
        return false;
    }

    public void setOutputDefaultSchema(boolean outputDefaultSchema) {

    }

    public boolean isDefaultSchema(String catalog, String schema) {
        return false;
    }

    public boolean isDefaultCatalog(String catalog) {
        return false;
    }

    public boolean getOutputDefaultCatalog() {
        return false;
    }

    public void setOutputDefaultCatalog(boolean outputDefaultCatalog) {

    }

    public boolean supportsPrimaryKeyNames() {
        return false;
    }

    public boolean supportsNotNullConstraintNames() {
        return false;
    }

    public boolean supportsBatchUpdates() throws DatabaseException {
        return false;
    }

    public boolean requiresExplicitNullForColumns() {
        return false;
    }

    public String getSystemSchema() {
        return null;
    }

    public void addReservedWords(Collection<String> words) {

    }

    public String escapeDataTypeName(String dataTypeName) {
        return null;
    }

    public String unescapeDataTypeName(String dataTypeName) {
        return null;
    }

    public String unescapeDataTypeString(String dataTypeString) {
        return null;
    }

    public ValidationErrors validate() {
        return null;
    }

    public int getPriority() {
        return 0;
    }
}
