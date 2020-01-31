package com.cts.training.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.Company;
import com.cts.training.model.StockExchange;
import com.cts.training.model.User;

public class CompanyController {

	
	

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		Company company = new Company(101, "cts", "IT","Aneena", 2343243235.555);
//		session.save(company);
		
		
		StockExchange sc = new StockExchange(101, "Mumbai", "BSE","Mutual funds");
	session.save(sc);
		
		transaction.commit();
		session.close();

}
}
