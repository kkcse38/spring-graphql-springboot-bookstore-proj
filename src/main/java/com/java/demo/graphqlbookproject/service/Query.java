package com.java.demo.graphqlbookproject.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import com.java.demo.graphqlbookproject.controller.modal.Book;
import com.java.demo.graphqlbookproject.dao.BookRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class Query implements GraphQLQueryResolver{
	
	@Autowired
	private BookRepository bookRepository;
	
	public Query(BookRepository bookRepository) {
	        this.bookRepository = bookRepository;
	}
	
	public Book bookById(int id) {
		Optional<Book> book = bookRepository.findById(id);
		if(book.isPresent())
			return book.get();	
		return null;
	}
}
