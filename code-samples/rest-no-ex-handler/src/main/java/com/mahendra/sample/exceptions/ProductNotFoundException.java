package com.mahendra.sample.exceptions;

public class ProductNotFoundException extends RuntimeException {

	public ProductNotFoundException(int id) {
		this("Product "+id+" does not exists!");
	}

	public ProductNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
}
