package com.cts.training.model;

import java.io.Serializable;

public class Company implements Serializable {

	private static final long serialVersionUID = -2586010873652163243L;
	private int id;
	private String name;
	private String sector;
	private String ceoName;
	private double turnover;

	public Company() {

	}

	public Company(int id, String name, String sector, String ceoName, double turnover) {
		super();
		this.id = id;
		this.name = name;
		this.sector = sector;
		this.ceoName = ceoName;
		this.turnover = turnover;
	}

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

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	public double getTurnover() {
		return turnover;
	}

	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", sector=" + sector + ", ceoName=" + ceoName + ", turnover="
				+ turnover + "]";
	}

}
