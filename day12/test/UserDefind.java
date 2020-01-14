package com.cts.test;

import java.util.Comparator;

class Employee{
		private String name;
		private String addr;
		private int id;
		private int age;
		private long phone;
		private long salary ;
		public Employee(int id,String name,String addr,int age,long phone,long salary) {
super();

this.id=id;
this.name=name;
this.age=age;
this.addr=addr;
this.phone=phone;
this.salary=salary;
}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddr() {
			return addr;
		}
		public void setAddr(String addr) {
			this.addr = addr;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(long salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", addr=" + addr + ", id=" + id + ", age=" + age + ", phone=" + phone
					+ ", salary=" + salary + "]";
		}
}
		
	
		//{



		//class SortById implements Comparator<Employee>{
	  		
		//public int compare(Employee o1,Employee o2) {
			//if(o1.getId()>o2.getId())
				//return 1;
			//else if
		//}
		
		
	
		
		
		
	//}


