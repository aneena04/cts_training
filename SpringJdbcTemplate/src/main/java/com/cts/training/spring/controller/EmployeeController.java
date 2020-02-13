package com.cts.training.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.training.spring.dao.EmployeeDAO;
import com.cts.training.spring.model.Employee;

public class EmployeeController {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("./applicationContext.xml");
		EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("employeeDAOImpl");
		//add
//		Employee employee = new Employee(11, "Minu", "minut@gmail.com", 556444436);
//		System.out.println(employeeDAO.saveEmployee(employee));

//Employee employee1=employeeDAO.getEmployeeById(10);
//System.out.println(employeeDAO.deleteEmployee(employee1));

//System.out.println(employee1);

//update
//		employee1.setName("hameem");
//		employeeDAO.updateEmployee(employee1);
//		List<Employee> list = employeeDAO.getAllEmployees();
//		System.out.println(list);
		

	}
}
