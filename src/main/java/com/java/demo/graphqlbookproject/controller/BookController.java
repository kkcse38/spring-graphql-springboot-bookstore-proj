package com.java.demo.graphqlbookproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.demo.graphqlbookproject.service.BookResolver;

import graphql.GraphQL;
import graphql.schema.GraphQLSchema;

//@RestController
//@RequestMapping("/graphql")
public class BookController {
	
	//@Autowired
	//private GraphQL graphql;
	
   // @GetMapping("/")
	public String helloWorld() {
		return "hellow world";
	}
	

}
