package com.mahendra.sample.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahendra.sample.controllers.ProductController;
import com.mahendra.sample.daos.ProductDAO;
import com.mahendra.sample.exceptions.DuplicateProductFoundException;
import com.mahendra.sample.exceptions.ProductNotFoundException;
import com.mahendra.sample.models.Product;

@Service
public class ProductServiceImpl implements ProductService {
	private static final Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);

	@Autowired private ProductDAO dao;
	
	@Override
	public Product findById(Integer id) {
		Optional<Product> product = dao.findById(id);
		if(!product.isPresent())
			throw new ProductNotFoundException(id);
		return product.get();
	}

	@Override
	public List<Product> findAll() {
		return dao.findAll();
	}

	@Override
	public Product save(Product p) {
		Integer id = p.getId();
		if(id != null && dao.existsById(id)) {
			throw new DuplicateProductFoundException(p.getId());
		}
		return dao.save(p);
	}

	@Override
	public Product update(Product p) {
		Integer id = p.getId();
		log.info("Found id "+id);
		if(id==null || !dao.existsById(id)) {
			throw new ProductNotFoundException("Product not found");
		}
		return dao.save(p);
	}

	@Override
	public void delete(Product p) {
		if(!dao.existsById(p.getId())) {
			throw new ProductNotFoundException(p.getId());
		}
		dao.delete(p);
	}
	
}
