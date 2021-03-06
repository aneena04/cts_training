package com.cts.training.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "contractal")
//@DiscriminatorValue(value = "CE")
//@PrimaryKeyJoinColumn(name="emp_id")
@AttributeOverrides({
	@AttributeOverride(name = "id", column=@Column(name="id")),
	@AttributeOverride(name = "name", column=@Column(name="name"))

	
	
})
public class ContractualEmployee extends Employee {
	private double payPerHour;
	private double contractPeriod;

	public double getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(double payPerHour) {
		this.payPerHour = payPerHour;
	}

	public double getContractPeriod() {
		return contractPeriod;
	}

	public void setContractPeriod(double contractPeriod) {
		this.contractPeriod = contractPeriod;
	}

}
