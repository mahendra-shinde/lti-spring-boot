package com.mahendra.sample.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.mahendra.sample.models.Product;
import com.mahendra.sample.services.ProductService;

@RestController
@RequestMapping(value = "/api/product", produces = "application/json")
public class ProductController {

	private static final Logger log = LoggerFactory.getLogger(ProductController.class);
	@Autowired
	private ProductService service;

	@GetMapping
	public ResponseEntity<?> loadAll() {
		try {
			List<Product> products = service.findAll();
			log.info("Number of Records found: " + products.size());
			ResponseEntity<List<Product>> pr = new ResponseEntity<>(products, HttpStatus.OK);
			return pr;
		} catch (RuntimeException ex) {
			log.error(ex.getMessage(), ex);
			ResponseEntity<String> er = new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
			return er;
		}
	}

	@PostMapping(consumes = "application/json")
	public ResponseEntity<?> create(@RequestBody Product product) {
		try {
			Product temp = service.save(product);
			if (temp != null) {
				log.info("New product created " + temp.getId());
			}
			ResponseEntity<Product> pr = new ResponseEntity<>(temp, HttpStatus.CREATED);
			return pr;
		} catch (RuntimeException ex) {
			log.error(ex.getMessage(), ex);
			ResponseEntity<String> er = new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
			return er;
		}
	}

	@PutMapping(consumes = "application/json")
	public ResponseEntity<?> update(@RequestBody Product product) {
		try {
			Product temp = service.update(product);
			if (temp != null) {
				log.info("Product Updated " + temp.getId());
			}
			ResponseEntity<Product> pr = new ResponseEntity<>(temp, HttpStatus.ACCEPTED);
			return pr;
		} catch (RuntimeException ex) {
			log.error(ex.getMessage(), ex);
			ResponseEntity<String> er = new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
			return er;
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable int id) {
		try {
			Product product = service.findById(id);
			log.info("Product found: " + product.getName());
			ResponseEntity<Product> pr = new ResponseEntity<>(product, HttpStatus.OK);
			return pr;
		} catch (RuntimeException ex) {
			log.error(ex.getMessage(), ex);
			ResponseEntity<String> er = new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
			return er;
		}
	}
	
	
}
