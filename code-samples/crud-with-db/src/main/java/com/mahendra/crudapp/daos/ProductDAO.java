package com.mahendra.crudapp.daos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mahendra.crudapp.models.Product;

@Repository
public interface ProductDAO extends CrudRepository<Product, Integer> {
	
	@Query("from Product p")
	public List<Product> getAll();
	
}
