package com.java.demo.graphqlbookproject.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.java.demo.graphqlbookproject.controller.modal.Author;
import com.java.demo.graphqlbookproject.controller.modal.Book;
import com.java.demo.graphqlbookproject.dao.AuthorRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookResolver implements GraphQLResolver<Book>{
	
	@Autowired
	private AuthorRepository authorRepository;
	
	 public BookResolver(AuthorRepository authorRepository) {
	        this.authorRepository = authorRepository;
	 }
	 
    public Author getAuthor(Book book) {
        Optional<Author> author =  authorRepository.findById(book.getAuthor());
        if(author.isPresent())
        	return author.get();
        return null;
    }
}
