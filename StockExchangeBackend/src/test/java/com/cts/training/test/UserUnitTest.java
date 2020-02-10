package com.cts.training.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.cts.training.dao.UserDAO;
import com.cts.training.dao.impl.UserDAOImpl;
import com.cts.training.model.User;

public class UserUnitTest {

	private static AnnotationConfigApplicationContext context;
	@Autowired
	private static UserDAO userDAO;
	private static User user;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		user = (User) context.getBean("user");
		userDAO = (UserDAO) context.getBean("userDAO");

	}

	
//	@Test
//	public void test_update_user_success() {
//		User u=userDAO.getUserById(101);
//		u.setEnabled(false);
//		assertEquals(true, userDAO.updateUser(u));
//	}
//	@Test
//	public void test_add_user() {
//		User us= new User(100,  "Jerin","unni12", "unni@gmail.com", 44455476,false);
//		assertEquals(true, userDAO.saveUser(us));
//	}
	
//	@Test
//	public void testGetAllUsers() {
//		List<User> users = userDAO.getAllUsers();
//		assertEquals(9, users.size());
//	}
//	@Test
//	public void testDeleteUser() {
//		User u1=userDAO.getUserById(51);
//		assertEquals(true,userDAO.daleteUser(u1));
//	}
//	@Test(expected=NullPointerException.class)
//	public void testDeleteUserFail() {
//		User u1=userDAO.getUserById(51);
//		assertEquals(true,userDAO.daleteUser(u1));
//	}
	
	@Test
	public void testGetUserById() {
		User u2=userDAO.getUserById(52);
		assertEquals("Joel",u2.getUsername());
	}

	@Test(expected=NullPointerException.class)
	public void testGetUserByIdFail() {
	User u1=userDAO.getUserById(85);
		assertEquals("joel",u1.getPhone());
	}

}
