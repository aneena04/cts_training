package com.cts.training.model;

public class FundTransferEntity {
	private AccountEntity sender;
	private AccountEntity receiver;
	private int amount;
	public AccountEntity getSender() {
		return sender;
	}
	public void setSender(AccountEntity sender) {
		this.sender = sender;
	}
	public AccountEntity getReceiver() {
		return receiver;
	}
	public void setReceiver(AccountEntity receiver) {
		this.receiver = receiver;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	

}
