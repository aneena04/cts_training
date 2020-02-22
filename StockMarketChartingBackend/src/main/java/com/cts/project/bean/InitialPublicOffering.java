package com.cts.project.bean;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "ipo")
@XmlRootElement(name = "ipolist")
public class InitialPublicOffering {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String stockExchange;
	private int priceShare;
	private int noOfShares;
	private LocalDate date;
	private String remarks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public int getPriceShare() {
		return priceShare;
	}

	public void setPriceShare(int priceShare) {
		this.priceShare = priceShare;
	}

	public int getNoOfShares() {
		return noOfShares;
	}

	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public InitialPublicOffering() {}

	

}
