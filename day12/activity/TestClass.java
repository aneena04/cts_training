package com.cts.activity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		addEmployees(employees);
		employees.forEach(System.out::println);
		List<Employee> ageScale = employees.stream()
				.filter(emp -> emp.getAge() < 22 && emp.getAddress().equals("Chennai")).collect(Collectors.toList());
		;
		// System.out.println("data with age <22");
		// System.out.println("address with chennai");
		System.out.println("namelengtth >5");
		List<Employee> lengthscale = employees.stream().filter(e -> e.getName().length() >= 5)
				.collect(Collectors.toList());
		lengthscale.forEach(System.out::println);

		// List<Double>
		// salaryLike=employees.stream().map(emp->emp.getSalary()*1.1).collect(Collectors.toList());
		List<Employee> salaryLike = employees.stream().map(emp -> {
			emp.setSalary(emp.getSalary() * 1.1);
			return emp;
		}).collect(Collectors.toList());

		System.out.println("salary");
		salaryLike.forEach(System.out::println);

	}

	private static void addEmployees(List<Employee> employees) {
		Employee emp1 = new Employee(101, "Abin Joshy", "Hydrabad", 22, 6678687687L, 40000.00);
		Employee emp2 = new Employee(102, "Anu", "Chennai", 21, 345354354L, 20000.00);
		employees.add(emp1);
		employees.add(emp2);
	}
}