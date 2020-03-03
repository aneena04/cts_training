package com.cts.project.stockpriceservice;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*")
@RestController
public class StockPriceRestController {
	@Autowired
	StockPriceRepo spr;

	@GetMapping("/stockprice")
	public List<StockPrice> findAll() {
		return spr.findAll();
	}

	@GetMapping("/stockprice/{id}")
	public StockPrice findOne(@PathVariable int id) {
		Optional<StockPrice> stockp = spr.findById(id);
		StockPrice stockprice = stockp.get();
		return stockprice;
	}

	@PostMapping("/stockprice")
	public StockPrice save(@RequestBody StockPrice stockp) {
		StockPrice stockprice = spr.save(stockp);
		return stockprice;
	}

	@DeleteMapping("/stockprice/{id}")
	public void delete(@PathVariable int id) {
		spr.deleteById(id);
	}

	@PutMapping("/stockprice")
	public StockPrice update(@RequestBody StockPrice stockp) {
		StockPrice stockprice = spr.save(stockp);
		return stockprice;
	}
}
