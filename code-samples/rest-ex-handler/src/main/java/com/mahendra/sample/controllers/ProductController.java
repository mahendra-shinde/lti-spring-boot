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
	public ResponseEntity<List<Product>> loadAll() {
		List<Product> products = service.findAll();
		log.info("Number of Records found: " + products.size());
		ResponseEntity<List<Product>> pr = new ResponseEntity<>(products, HttpStatus.OK);
		return pr;

	}

	@PostMapping(consumes = "application/json")
	public ResponseEntity<Product> create(@RequestBody Product product) {

		Product temp = service.save(product);
		if (temp != null) {
			log.info("New product created " + temp.getId());
		}
		ResponseEntity<Product> pr = new ResponseEntity<>(temp, HttpStatus.CREATED);
		return pr;

	}

	@PutMapping(consumes = "application/json")
	public ResponseEntity<Product> update(@RequestBody Product product) {

		Product temp = service.update(product);
		if (temp != null) {
			log.info("Product Updated " + temp.getId());
		}
		ResponseEntity<Product> pr = new ResponseEntity<>(temp, HttpStatus.ACCEPTED);
		return pr;

	}

	@GetMapping("/{id}")
	public ResponseEntity<Product> findById(@PathVariable int id) {

		Product product = service.findById(id);
		log.info("Product found: " + product.getName());
		ResponseEntity<Product> pr = new ResponseEntity<>(product, HttpStatus.OK);
		return pr;

	}

}
