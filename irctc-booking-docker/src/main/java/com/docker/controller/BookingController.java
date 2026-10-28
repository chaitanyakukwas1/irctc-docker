package com.docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.docker.entity.BookEntity;
import com.docker.service.BookService;

@RestController
public class BookingController {
	
	@Autowired
	BookService bookService;
	
	@PostMapping("/bookTicket")
	public ResponseEntity<String> bookTicket(@RequestBody BookEntity bookEntity){
		return bookService.bookTicket(bookEntity);
	}
	
	
	@GetMapping("/getTicket/{id}")
	public ResponseEntity<BookEntity> getTicket(@PathVariable Integer id){
		return bookService.getTicket(id);
	}
	
}
