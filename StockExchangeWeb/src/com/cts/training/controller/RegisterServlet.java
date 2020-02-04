
package com.cts.training.controller;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
		    Connection conn;
		    String url="jdbc:mysql://localhost:3306/new";
			String username="root",name;
			String password="password";
			String query="insert into register values(?,?,?,?,?,?)";
			String Name=request.getParameter("name");
			String Lastname=request.getParameter("lname");
			String email=request.getParameter("email");
			String user=request.getParameter("uname");

			String pass1=request.getParameter("password");
			String pass2=request.getParameter("cpassword");
			PreparedStatement ps;
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,username,password);
			ps =  conn.prepareStatement(query);
			ps.setString(1, Name);
			ps.setString(2, Lastname);
			ps.setString(3, email);
			ps.setString(4, user);

			ps.setString(5, pass1);
			ps.setString(6, pass2);
			int result=ps.executeUpdate();
			if(result==1) {
				rd.forward(request, responce);
			}
			else {
				System.out.println("User not registered");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
