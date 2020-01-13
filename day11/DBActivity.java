package com.cts.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBActivity {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "password";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement stmt = con.createStatement();

		String q = "insert into employee Values(?,?,?,?,?,?)";

		Scanner s = new Scanner(System.in);
		System.out.println("enter employee id");
		int EmployeeID = Integer.parseInt(s.nextLine());
		System.out.println("enter employee first name");
		String FirstName = s.nextLine();

		System.out.println("enter employee last name");
		String LastName = s.nextLine();
		System.out.println("enter your email");
		String Email = s.nextLine();
		System.out.println("enter addressline");
		String AddressLine = s.nextLine();
		System.out.println("enter the city");
		String City = s.nextLine();
		
		
PreparedStatement ps=con.prepareStatement(q);
ps.setInt(1, EmployeeID);
ps.setString(2, FirstName);
ps.setString(3, LastName);
ps.setString(4, Email);
ps.setString(5, AddressLine);
ps.setString(6, City);

int result=ps.executeUpdate();
if(result>0)
{
	System.out.println("successful");
}
else {
	System.out.println("try again");
}


		System.out.println("connection established");

	}

}
