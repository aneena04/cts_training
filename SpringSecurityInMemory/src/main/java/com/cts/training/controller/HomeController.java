package com.cts.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String indexPage() {
		return "index";

	}
	@RequestMapping("/admin")
	public String adminPage() {
		return "admin";

	}
	@RequestMapping("/hr")
	public String hrPage() {
		return "hr";

	}
	@RequestMapping("/user")
	public String userPage() {
		return "employee";

	}
	

}
