package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CtsDockerDemoController {


	@GetMapping("/hello")
	public String SayHello() {
		return "Good Morning";
	}
	
	@GetMapping("/languages")
	public List<String> languages(){
		return new ArrayList<String>(Arrays.asList("Java" ,"Python","Typescript","C Programming"));
		
		
	}

}
