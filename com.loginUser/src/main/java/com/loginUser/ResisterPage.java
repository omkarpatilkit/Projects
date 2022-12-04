package com.loginUser;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ResisterPage")
public class ResisterPage extends HttpServlet {
	
	public void doPost(HttpServletRequest req , HttpServletResponse res) {
		String uName = req.getParameter("uName");
		String uEmail = req.getParameter("uEmail");
		String uPwd = req.getParameter("uPwd");
		String uPhone = req.getParameter("uPhone");
		
		if(DbOperations.searchUser(uEmail)) {
			String str = "User already exists/nPlease try to login";
			req.setAttribute("userInfo", str);
			RequestDispatcher rd = req.getRequestDispatcher("userExists.jsp");
			try {
				rd.forward(req, res);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		else {
			User user =  new User( uName,  uEmail,  uPwd,  uPhone);
			DbOperations.saveUser(user);
			String str = "User data added sucessfully, try to login";
			req.setAttribute("userInfo", str);
			RequestDispatcher rd = req.getRequestDispatcher("userExists.jsp");
			try {
				rd.forward(req, res);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		
	}
	
}
