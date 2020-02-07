package com.cts.training.model;

public class AccountEntity {
	private String accountNumber;
	private String accountType;
	@Override
	public String toString() {
		return " [accountNumber=" + accountNumber + ", accountType=" + accountType + ", owner=" + owner
				+ "]";
	}
	private CustomerEntity owner;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public CustomerEntity getOwner() {
		return owner;
	}
	public void setOwner(CustomerEntity owner) {
		this.owner = owner;
	}
	

}
