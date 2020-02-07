package com.cts.training.model;

import org.springframework.stereotype.Component;


public class AddressEntity {
	private int id;
	private String houseNumber;
	private String street;
	
	public AddressEntity() {
		
	}
	
	
	public AddressEntity(int id, String houseNumber, String street, String city, String state) {
		super();
		this.id = id;
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return " [id=" + id + ", houseNumber=" + houseNumber + ", street=" + street + ", city=" + city
				+ ", state=" + state + "]";
	}
	private String city;
	private String state;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}	

}
