package com.java.demo.graphqlbookproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/")
public class BookController {
	
//	@GetMapping("/")
	public String helloWorld() {
		return "hellow world";
	}
	
	
}
