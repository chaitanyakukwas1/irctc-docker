package com.docker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docker.entity.BookEntity;
import java.util.List;


@Repository
public interface BookRepository extends JpaRepository<BookEntity, Integer> {
	
	BookEntity findByBookId(int bookId);
}
