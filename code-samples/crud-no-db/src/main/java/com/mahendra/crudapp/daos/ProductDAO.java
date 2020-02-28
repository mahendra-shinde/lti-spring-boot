package com.mahendra.crudapp.daos;

import java.util.List;

import com.mahendra.crudapp.models.Product;

public interface ProductDAO {
	public Product create(Product p);
	public List<Product> getAll();
	public Product findById(Integer id);
	public Integer deleteById(Integer id);
	public Product update(Product p);
	
}
