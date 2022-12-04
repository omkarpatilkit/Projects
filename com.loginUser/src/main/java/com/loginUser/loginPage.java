package com.loginUser;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginPage")
public class loginPage extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		String userEmail = req.getParameter("uEmail");
		String userPwd = req.getParameter("uPwd");

		if (DbOperations.searchUser(userEmail)) {
			User u = DbOperations.getUser(userEmail);
			if ((u.getuPwd()).equals(userPwd)) {
				req.setAttribute("userName", u.getuName());
				req.setAttribute("userEmail", u.getuEmail());
				req.setAttribute("userPhone", u.getuPhone());
				
				RequestDispatcher rd = req.getRequestDispatcher("successLogin.jsp");
				try {
					rd.forward(req, res);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else {
				req.setAttribute("alert1", "Invalid Login Attempt");
				RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
				try {
					rd.forward(req, res);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		

	}

}
