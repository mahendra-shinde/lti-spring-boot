package com.mahendra.crudapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahendra.crudapp.daos.ProductDAO;
import com.mahendra.crudapp.models.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired private ProductDAO dao;
	
	@Override
	public Product create(Product p) {
		if(dao.findById(p.getId())!=null) {
			throw new RuntimeException("Product already exists!");
		}
		dao.create(p);
		return p;
	}

	@Override
	public List<Product> getAll() {
		return dao.getAll();
	}

	@Override
	public Product findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	public Integer deleteById(Integer id) {
		if(dao.findById(id)==null) {
			throw new RuntimeException("Product does not exists!");
		}
		dao.deleteById(id);
		return id;
	}

	@Override
	public Product update(Product p) {
		return dao.update(p);
	}

}
