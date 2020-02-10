package com.cts.training.dao;

import java.util.List;

import com.cts.training.model.StockExchange;


public interface StockExchangeDAO {
	public boolean saveExchange(StockExchange stock);

	public boolean updateExchange(StockExchange stock);

	public boolean daleteExchange(StockExchange stock);

	public StockExchange getExchangeById(int id);

	public List<StockExchange> getAllExchanges();

}
