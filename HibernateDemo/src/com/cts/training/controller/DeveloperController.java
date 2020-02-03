package com.cts.training.controller;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.cts.training.model.Developer;
import com.cts.training.model.Technology;

public class DeveloperController {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

//		Developer developer1 = new Developer();
//		developer1.setName("Aneena");
//
//		Developer developer2 = new Developer();
//		developer2.setName("GuruDutt");
//
//		Developer developer3 = new Developer();
//		developer3.setName("Hameem");
//
//		Technology technology1 = new Technology();
//		technology1.setLanguage("Java");
//		technology1.setExpertise("Intermediate");
//
//		Technology technology2 = new Technology();
//		technology2.setLanguage("Python");
//		technology2.setExpertise("Expert");
//
//		Set<Technology> technologies = new HashSet<Technology>();
//		technologies.add(technology1);
//		technologies.add(technology2);
//
//		developer1.setTechnology(technologies);
//		developer2.setTechnology(technologies);
//		developer3.setTechnology(technologies);
//
//		session.save(developer1);
//		session.save(developer2);
//		session.save(developer3);
//
//		tx.commit();
//		session.close();
		Criteria criteria = session.createCriteria(Developer.class);
		criteria.add(Restrictions.eq("id",40L));

		Developer developer = (Developer) criteria.uniqueResult();
		System.out.println(developer.toString());

		Set<Technology> tech = developer.getTechnology();
		for(Technology technology : tech){
		  System.out.println(technology.toString());
		  
		 // tx.commit();
		session.close();
		}
	}

}
