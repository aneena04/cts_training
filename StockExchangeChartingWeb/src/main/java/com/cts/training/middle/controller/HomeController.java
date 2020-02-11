package com.cts.training.middle.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.training.dao.CompanyDAO;
import com.cts.training.dao.UserDAO;
import com.cts.training.model.Company;
import com.cts.training.model.User;

@Controller
public class HomeController {
	@Autowired 
//	private UserDAO userDAO;
	private CompanyDAO companyDAO;
	
	//@GetMapping("/")//--->from spring 4.3
//	@RequestMapping("/")//--->old version
//public String indexPage(Model model) {
//model.addAttribute("message", "Welcome to spring mvc");
//List<String> names= new ArrayList<String>();
//List<User> users= userDAO.getAllUsers();

//addNames(names);
//model.addAttribute("list", users);

//return "index";
//	}
	@RequestMapping("/")
	
	public String indexPage(Model model) {
		List<Company> company= companyDAO.getAllCompanies();

		model.addAttribute("list", company);
		
		return "index";

	}


//private void addNames(List<String> names) {
//	names.add("Aneena");
//	names.add("Hameem");
//	names.add("Malu");
//	names.add("Guru");
//
//}
//	
	
	
	
	
}
