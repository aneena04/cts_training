package com.cts.training.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.User;

public class UserController {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		User user = new User(104, "Rinu", "rinu@123", "rinu@cts.com", 97355533489L, true);
		session.save(user);
		
		
		
		
//User getUser=session.get(User.class, 102);
//				getUser.setPassword("12345");
//		session.update(getUser);
	
//		session.delete(getUser);
		List<User> users=session.createQuery("FROM User").list();
		users.forEach(System.out::println);
		
		transaction.commit();
		session.close();
		

	}

}
