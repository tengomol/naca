# What is Naca? -->[click here](Naca0201.md) #

# JLib - DB connection pooling #

## Standalone DB connection pooling manager ##

### Usage ###

> Do the following operations in your application source file:

> import jlib.log.**;
> import jlib.sql.**;

> Create a DbConnectionManager instance:

```
  DbConnectionManager manager = new DbConnectionManager();If you are using an oracle DB, call manager.initOracle(...) with parameters.
```

> If you are using a DB2 DB, call manager.initDB2(...) with parameters.
> If you are using another DB, call manager.init(...) with parameters.

> For the 2 first calls, the parameters are:

  * dbUrl. For example : "jdbc:oracle:thin:@itsdev1.PUBLIGROUPE.NET:1521:ITSDB"
  * dbUser
  * dbPassword
  * dbUrlOptionalParameters; This parameter is optional and if if not null it is concatenated with the DB URL; it may contains variables that will be replaced at runtime:
    * $FoundPoolName that will be replaced by the connection pool name found
    * $RequestedPoolName that will be replaced by the connection pool name requested
  * Maximum number of connections that be maintained simultaneously in the connection pool.
  * Number of milliseconds the connection can remain unused in the pool. After this time is elapsed, the connection will be closed and freed asynchronously.
  * For DB other than Oracle or DB2, you must give a supplementary parameter giving the driver class for the db in use.

> You can provide optional parameters by calling:

```
  manager.setAutoCommit(true);
  manager.setCloseCursorOnCommit(true);
```

> In order to create a new connection, or to get it from the pool if one is available, call:

```
  DbConnectionBase connection = manager.getConnection();Then, you can use the connection as required by application code.
```

> To return the connection to the pool, in order to have it available at a later time, do the following:

```
  connection.returnConnectionToPool();
```