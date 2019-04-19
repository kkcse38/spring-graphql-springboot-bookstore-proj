package com.java.demo.graphqlbookproject.dao;
import org.springframework.data.jpa.repository.JpaRepository;


import com.java.demo.graphqlbookproject.controller.modal.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
