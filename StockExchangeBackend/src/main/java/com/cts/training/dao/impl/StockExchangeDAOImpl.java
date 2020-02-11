package com.cts.training.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.training.dao.StockExchangeDAO;
import com.cts.training.model.Company;
import com.cts.training.model.StockExchange;
@Transactional
	@Repository(value="stockDAO")
public class StockExchangeDAOImpl implements StockExchangeDAO{
	
	
		@Autowired
		SessionFactory sessionFactory;

	@Override
	public boolean saveExchange(StockExchange exchange) {
		try {
			sessionFactory.getCurrentSession().save(exchange);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
		
	}
	@Override
	public boolean updateExchange(StockExchange exchange) {
		try {
			sessionFactory.getCurrentSession().update(exchange);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean daleteExchange(StockExchange exchange) {
		try {
			sessionFactory.getCurrentSession().delete(exchange);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public StockExchange getExchangeById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(StockExchange.class, id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<StockExchange> getAllExchanges() {
		try {
			return sessionFactory.getCurrentSession().createQuery("FROM StockExchange").list();
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
		
	}


}
