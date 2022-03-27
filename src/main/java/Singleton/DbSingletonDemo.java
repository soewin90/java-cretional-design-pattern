package Singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {

  public static void main(String[] args) {
    DbSingleton instance = DbSingleton.getInstance();

    long timeBefore = System.currentTimeMillis();
    Connection conn = instance.getConnection();
    long timeAfter = System.currentTimeMillis();
    System.out.println(timeAfter - timeBefore);

    Statement state;

    try {
      state = conn.createStatement();
      int count =
          state.executeUpdate("create table address(id int, name varchar(20), city varchar(20))");
      System.out.println("Table Created");

    } catch (SQLException e) {
      e.printStackTrace();
    }

    timeBefore = System.currentTimeMillis();
    conn = instance.getConnection();
    timeAfter = System.currentTimeMillis();
    System.out.println(timeAfter - timeBefore);
    try {
      state = conn.createStatement();
      ResultSet rs = state.executeQuery("select * from address");
      System.out.println(rs);
      rs.close();

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
