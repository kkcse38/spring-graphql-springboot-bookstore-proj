package com.java.demo.graphqlbookproject.dao;


import org.springframework.data.jpa.repository.JpaRepository;


import com.java.demo.graphqlbookproject.controller.modal.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer>{
	
}
