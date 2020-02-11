package com.cts.training.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.training.dao.StockExchangeDAO;
import com.cts.training.model.StockExchange;

public class StockExchangeUnitTest {

	private static AnnotationConfigApplicationContext context;
	@Autowired
	private static StockExchangeDAO stockDAO;
	private static StockExchange stock;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		stock = (StockExchange) context.getBean("stock");
		stockDAO = (StockExchangeDAO) context.getBean("stockDAO");

	}

	
//	@Test
//	public void test_update_exchange_success() {
//		StockExchange se=stockDAO.getExchangeById(101);
//		assertEquals(true, stockDAO.updateExchange(se));
//	}
	@Test
	public void test_add_exchange() {
		StockExchange se= new StockExchange(100,  "chennai","dddd", "mutual fund");
		assertEquals(true, stockDAO.saveExchange(se));
	}
	
	@Test
	public void testGetAllExchanges() {
		List<StockExchange> exchanges = stockDAO.getAllExchanges();
		assertEquals(1, exchanges.size());
	}
//	@Test
//	public void testDeleteUser() {
//		User u1=userDAO.getUserById(51);
//		assertEquals(true,userDAO.daleteUser(u1));
//	}
//	@Test(expected=NullPointerException.class)
//	public void testDeleteUserFail() {
//		User u1=userDAO.getUserById(51);
//		assertEquals(true,userDAO.daleteUser(u1));
//	}
	
	

}
