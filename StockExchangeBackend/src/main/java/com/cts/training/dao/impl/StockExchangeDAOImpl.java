package com.cts.training.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.training.dao.CompanyDAO;
import com.cts.training.dao.StockExchangeDAO;
import com.cts.training.model.StockExchange;
import com.cts.training.model.User;

@Transactional
@Repository(value = "companyDAO")
public class StockExchangeDAOImpl implements StockExchangeDAO{
	

		@Autowired
		SessionFactory sessionFactory;

	@Override
	public boolean saveExchange(StockExchange stock) {
		try {
			sessionFactory.getCurrentSession().save(stock);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateExchange(StockExchange stock) {
		try {
			sessionFactory.getCurrentSession().update(stock);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean daleteExchange(StockExchange stock) {
		try {
			sessionFactory.getCurrentSession().delete(stock);
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
		}	}

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
