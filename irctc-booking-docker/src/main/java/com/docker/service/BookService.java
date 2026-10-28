package com.docker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.docker.entity.BookEntity;
import com.docker.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepository;

	public ResponseEntity<String> bookTicket(BookEntity bookEntity) {
		bookRepository.save(bookEntity);
		return new ResponseEntity<String>("Ticket Booked", HttpStatus.OK);
	}
	
	public ResponseEntity<BookEntity> getTicket(Integer bookId) {
		
		BookEntity byBookId = bookRepository.findByBookId(bookId);
		
		
		return new ResponseEntity<BookEntity>(byBookId, HttpStatus.OK);
	}
}
