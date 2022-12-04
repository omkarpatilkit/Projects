package com.loginUser;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class SessionFact {
	private static SessionFactory sf ;
	private static ServiceRegistry serviceRegistry;
	private SessionFact() {
		
	}
	
	public static SessionFactory createSessionFactory() {
		if(sf == null) {
			Configuration configuration = new Configuration();
		    configuration.configure("hibernate.cfg.xml");
		    configuration.addAnnotatedClass(User.class);
		    serviceRegistry = new ServiceRegistryBuilder().applySettings(
		            configuration.getProperties()). buildServiceRegistry();
		    sf = configuration.buildSessionFactory(serviceRegistry);
			
		}
		return sf;
	}
}
