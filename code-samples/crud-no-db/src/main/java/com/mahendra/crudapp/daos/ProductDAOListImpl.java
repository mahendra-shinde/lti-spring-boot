package com.mahendra.crudapp.daos;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.mahendra.crudapp.models.Product;

@Repository
public class ProductDAOListImpl implements ProductDAO {

	private List<Product> productList = new LinkedList<>();
	
	@PostConstruct
	public void init() {
		productList.add(new Product(101, "Harry Potter and Mumbai local",
					"Harry lost in local train", 12, 230.00));
		productList.add(new Product(102,"Harry Potter in Hinjewadi","Harry got job in Pune!",5,300.00));
		
	}
	
	@Override
	public Product create(Product p) {
		productList.add(p);
		return p;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return productList;
	}

	@Override
	public Product findById(Integer id) {
		for(Product p : productList) {
			if(p.getId()==id) {
				return p;
			}
		}
		//return productList.stream().filter(p-> p.getId() == id).findFirst().get();
		return null;
	}

	@Override
	public Integer deleteById(Integer id) {
		Product p = findById(id);
		productList.remove(p);
		return id;
	}

	@Override
	public Product update(Product p) {
		Product t = findById(p.getId());
		t.setName(p.getName());
		t.setDescrition(p.getDescrition());
		t.setPrice(p.getPrice());
		t.setQuantity(p.getQuantity());
		return t;
	}

}
