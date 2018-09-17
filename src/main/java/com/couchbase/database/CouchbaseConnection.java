package com.couchbase.database;

import com.couchbase.client.java.Bucket;
import liquibase.database.Database;
import liquibase.database.DatabaseConnection;
import liquibase.exception.DatabaseException;

public class CouchbaseConnection implements DatabaseConnection {


    private Bucket bucket;

    public void close() throws DatabaseException {

    }

    public void commit() throws DatabaseException {

    }

    public boolean getAutoCommit() throws DatabaseException {
        return false;
    }

    public String getCatalog() throws DatabaseException {
        return null;
    }

    public String nativeSQL(String sql) throws DatabaseException {
        return null;
    }

    public void rollback() throws DatabaseException {
        throw new UnsupportedOperationException( "Couchbase does not support transactions." );
    }

    public void setAutoCommit(boolean autoCommit) throws DatabaseException {
        if(!autoCommit) {
            throw new UnsupportedOperationException("AutoCommit = false is not supported by Couchbase.");
        }
    }

    public String getDatabaseProductName() throws DatabaseException {
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

    public String getURL() {
        return null;
    }

    public String getConnectionUserName() {
        return null;
    }

    public boolean isClosed() throws DatabaseException {
        return false;
    }

    public void attached(Database database) {

    }
}
