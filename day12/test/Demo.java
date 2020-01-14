package com.cts.test;

import java.util.ArrayList;

import com.cts.test.Employee;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> list = new ArrayList<>();

		Employee emp1 = new Employee(211, "Abin", "Chennai", 22, 331111111L, 2222222L);
		Employee emp2 = new Employee(215, "Anu", "Kerala", 26, 111555111L, 223312L);
		Employee emp3 = new Employee(122, "Malus", "Hyd", 22, 11111111L, 22227777L);
		Employee emp4 = new Employee(200, "Guru", "Banglore", 21, 99991111L, 55552222L);
		Employee emp5 = new Employee(111, "Hameem", "Kochi", 24, 166661111L, 12233266L);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
	//	SortById sbi= new SortById();
		System.out.println(list);

	}
}
