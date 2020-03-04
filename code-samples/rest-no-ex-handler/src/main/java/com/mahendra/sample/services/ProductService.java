package com.mahendra.sample.services;

import java.util.List;

import com.mahendra.sample.models.Product;

public interface ProductService {
	
	Product findById(Integer id);
	List<Product> findAll();
	Product save(Product p);
	Product update(Product p);
	void delete(Product p);
}
