package com.college.unittest;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.college.model.Login;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory  factory = new Configuration().configure("hibernate.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		session.beginTransaction();
		Login login = new Login();
		login.setName("VIPUL");
		login.setPassword("12345");
		login.setStatus("active");
		session.save(login);
		session.getTransaction().commit();
		session.close();
	}

}
