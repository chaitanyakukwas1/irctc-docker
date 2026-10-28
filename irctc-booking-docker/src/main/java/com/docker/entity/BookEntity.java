package com.docker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "irctc_docker")
@Data
public class BookEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;
	private int userId;
	private String userName;
	private String amount;
	private String paymentType;
}
