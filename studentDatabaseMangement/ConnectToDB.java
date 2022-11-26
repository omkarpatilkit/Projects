package studentDatabaseMangement;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectToDB {
	
	
	static private String url = "jdbc:mysql://localhost:3306/?user=root";
	static private String user = "root";
	static private String pass = "1234";
	
	public static Connection connectJDBC() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, pass);
			return conn;
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return null;
					
	}

}
