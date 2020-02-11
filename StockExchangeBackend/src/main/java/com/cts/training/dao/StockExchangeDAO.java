package com.cts.training.dao;

import java.util.List;

import com.cts.training.model.StockExchange;

public interface StockExchangeDAO {
	
		public boolean saveExchange(StockExchange exchange);

		public boolean updateExchange(StockExchange exchange);

		public boolean daleteExchange(StockExchange exchange);

		public StockExchange getExchangeById(int id);

		public List<StockExchange> getAllExchanges();

	}



