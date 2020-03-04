package com.mahendra.sample.exceptions;

public class DuplicateProductFoundException extends RuntimeException {

	public DuplicateProductFoundException(int id) {
		super("Product "+id+" already exists!");
	}

}
