package com.cts.training.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.cts.training.model.AddressEntity;
import com.cts.training.model.UserEntity;

public class UserController {
	public static void main(String[] args) {
//		BeanFactory beanfactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
		ApplicationContext context=new ClassPathXmlApplicationContext("beanspring.xml");
		UserEntity entity=(UserEntity)context.getBean("user");
		System.out.println(entity);
//		System.out.println(entity.getEmail()+":"+entity.getPhone());
//		
//		
//		AddressEntity address=entity.getAddress();
		AddressEntity address=(AddressEntity)context.getBean("address");
		System.out.println(address);	}

}
