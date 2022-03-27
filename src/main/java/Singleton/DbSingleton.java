package Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

  public static volatile DbSingleton instance = null; // lazy loading
  public static volatile Connection conn = null;

  private DbSingleton() {

    try {
      DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
    } catch (SQLException e) {
      e.printStackTrace();
    }

    // to prevent reflection object creation
    if (instance != null) {
      throw new RuntimeException("Use getInstance() method to create.");
    }

    // to prevent reflection object creation
    if (conn != null) {
      throw new RuntimeException("Use getConnection() method to create.");
    }
  }

  public static DbSingleton getInstance() {
    if (instance == null) {
      // if 2 threads try to getInstance then one is created and for second thread it will say
      // instance is not null then return the same create instance earlier
      synchronized (DbSingleton.class) {
        if (instance == null) {
          instance = new DbSingleton();
        }
      }
    }
    return instance;
  }

  public static Connection getConnection() {
    if (conn == null) {
      synchronized (DbSingleton.class) {
        if (conn == null) {
          String jdbcUrl = "jdbc:derby:memory:gtech/webdb;create=true";
          try {
            conn = DriverManager.getConnection(jdbcUrl);
          } catch (SQLException e) {
            e.printStackTrace();
          }
        }
      }
    }
    return conn;
  }
}
