package electricityBillingSystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnToDB {
	 Connection cn;
	 private String url = "jdbc:mysql://localhost:3306/?user=root";
	 private String user = "root";
	 private String pass = "1234";
	
	
	public ConnToDB() {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection(url, user, pass);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
