package com.cts.training.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.training.model.AccountEntity;
import com.cts.training.model.CustomerEntity;
import com.cts.training.model.FundTransferEntity;

public class BankController {
	public static void main(String[] args) {
		
	
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	FundTransferEntity entity=(FundTransferEntity)context.getBean("fund");
	AccountEntity account=entity.getSender();
	AccountEntity account1=entity.getReceiver();

//	CustomerEntity customer=account.getOwner();
	System.out.println("sender:"+account);
	System.out.println("receiver:"+account1);
	System.out.println(entity.getAmount());
	}
}
