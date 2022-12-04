package com.loginUser;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DbOperations {

	private static SessionFactory sf = SessionFact.createSessionFactory();
	private static Session session;

	public static void saveUser(User user) {
		session = sf.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}

	public static boolean searchUser(String uEmail, String uPwd) {
		session = sf.openSession();
		session.beginTransaction();
		User u = (User) session.get(User.class, uEmail);
		session.getTransaction().commit();
		session.close();
		if (u == null) {
			return false;
		}
		return true;
	}

}
