package com.mahendra.crudapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mahendra.crudapp.models.Product;
import com.mahendra.crudapp.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired private ProductService service;
	
	@GetMapping(produces= {"application/json"})
	public List<Product> getAll(){
		List<Product> products = service.getAll();
		return products;
	}
	
	@GetMapping(value="/find",produces="application/json")
	public Product findBy(@RequestParam("id") Integer id) {
		return service.findById(id);
	}
	
	@PostMapping(consumes="application/json", produces="application/json")
	public Product create(@RequestBody Product product) {
		return service.create(product);
	}
	
	@PutMapping(value="/{id}", consumes="application/json", produces="application/json")
	public Product update(@PathVariable("id")Integer id, @RequestBody Product product) {
		return service.update(product);
	}
	
	@DeleteMapping(value="/{id}",produces="application/json")
	public String delete(@PathVariable("id")Integer id) {
		return "Deleted product "+service.deleteById(id);
	}
	
	
}
