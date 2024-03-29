package com.demo.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Book;
import com.demo.repository.BookRepository;

@RestController

public class BookController {
	@Autowired
	private BookRepository repository;
	
	
	@PostMapping("/addBook")
	public String saveBook(@RequestBody Book book) {
		repository.save(book);
		return "Added book with Id:"+ book.getId();
	}
	@GetMapping("/getBook")
	public List<Book> getBook(){
		return repository.findAll();
	}	
	@GetMapping("/getBook/{id}")
	public Optional<Book> getBook(@PathVariable int id){
		return repository.findById(id);
	}
	@DeleteMapping("/")
	public String deleteBook(@PathVariable int id) {
		repository.deleteById(id);
		return "book deleted "+ id ;
		
	}
		
		
	
}
