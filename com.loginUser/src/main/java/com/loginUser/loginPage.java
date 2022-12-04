package com.loginUser;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

@WebServlet("/loginPage")
public class loginPage extends HttpServlet {

	
	
	
	public void doPost(HttpServletRequest req , HttpServletResponse res) {
		String userName = req.getParameter("uEmail");
		String userPwd = req.getParameter("uPwd");
		
		
		
		
	}

    

}
