package emailApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDB {
	
	
	static private String url = "jdbc:mysql://localhost:3306/?user=root";
	static private String user = "root";
	static private String pass = "1234";
	
	public static Connection connectToDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connected to JDBC");
			return cn;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
