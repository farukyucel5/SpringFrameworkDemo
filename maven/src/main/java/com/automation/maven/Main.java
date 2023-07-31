package com.automation.maven;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory factory =new Configuration()
				.configure("hybernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
	       session.beginTransaction();
	       
	       List<City> cities=session.createQuery("from City").getResultList();
	       
	       cities.forEach(n->System.out.println(n.getCity_name()));
	       
	       session.getTransaction().commit();
		}finally {
			factory.close();
		}

	}

}
