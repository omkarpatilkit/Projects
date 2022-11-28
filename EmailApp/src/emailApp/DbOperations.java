package emailApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DbOperations {
	
	private Connection cn = ConnectToDB.connectToDB();
	
	public void insertIntoDB(String name , String lastName , String email, String password, String dept) {
		if (!dataExists(email, dept)) {
			String query = "insert into email.users (name, last_name,dept, email,password) values (?,?, ?,?,?)";
			
			try {
				PreparedStatement pst = cn.prepareStatement(query);
				pst.setString(1, name);
				pst.setString(2, lastName);
				pst.setString(3, dept);
				pst.setString(4, email);
				pst.setString(5, password);
				
				pst.executeUpdate();
				AppUI.showInformation("Email created sucessfully");
				AppUI.clearData();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	private boolean dataExists(String email, String dept) {
		try {
			PreparedStatement pst = cn.prepareStatement("select email from email.users where email =? and dept = ?");
			pst.setString(1, email);
			pst.setString(2, dept);
			
			ResultSet res = pst.executeQuery();
			if (res.next() == false) {
				
				return false;
			}
			else {
				AppUI.showWarning("Email already taken, please try different combination.");
				AppUI.clearData();
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return true;
	}

}
