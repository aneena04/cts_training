package com.cts.training.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.ContractualEmployee;
import com.cts.training.model.Employee;
import com.cts.training.model.PermanentEmployee;

public class EmploeeController {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();
		Employee employee = new Employee();
		employee.setName("Rinu");

		PermanentEmployee pe = new PermanentEmployee();
		pe.setSalary(5047543);
		pe.setBonus(43223.34F);

		ContractualEmployee ce = new ContractualEmployee();
		ce.setPayPerHour(4000);
		ce.setContractPeriod(12);
//		Set< String> emails = new LinkedHashSet<String>();
//		emails.add( "anu@gmail.com");
//		emails.add( "aneena@gmail.com");
//		emails.add("anuu.anu@yahoo.com");
//		employee.setEmails(emails);
		session.save(employee);
		session.save(pe);
		session.save(ce);

		tx.commit();
		session.close();

	}
}
