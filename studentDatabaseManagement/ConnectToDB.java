package studentDatabaseManagement;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectToDB {
  private static String url = "jdbc:mysql://localhost:3306/?user=root";
  private static String user = "root";
  private static String pass = "1234";

  public static Connection connectJDBC() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn = DriverManager.getConnection(url, user, pass);
      return conn;
    } catch (Exception e) {
      System.out.println(e);
    }
    return null;
  }
}
