package com.mahendra.crudapp.services;

import java.util.List;

import com.mahendra.crudapp.models.Product;

public interface ProductService {
	public Product create(Product p);
	public List<Product> getAll();
	public Product findById(Integer id);
	public Integer deleteById(Integer id);
	public Product update(Product p);
}
