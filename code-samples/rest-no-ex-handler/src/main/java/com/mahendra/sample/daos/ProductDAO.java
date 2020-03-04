package com.mahendra.sample.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mahendra.sample.models.Product;

@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {
	
}
