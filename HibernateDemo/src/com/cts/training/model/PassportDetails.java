package com.cts.training.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "passport")
public class PassportDetails {
	@Id
	@GeneratedValue
	private int id;
	private String passsportNumber;
	@OneToOne(cascade = CascadeType.ALL)
	private Person person;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPasssportNumber() {
		return passsportNumber;
	}

	public void setPasssportNumber(String passsportNumber) {
		this.passsportNumber = passsportNumber;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
}
