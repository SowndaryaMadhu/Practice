package com.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

	

}
