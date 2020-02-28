package com.mahendra.crudapp.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="products")
public class Product {
	private Integer id;
	private String name;
	private String descrition;
	private Integer quantity;
	private Double price;
	
	public Product(Integer id, String name, String descrition, Integer quantity, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.descrition = descrition;
		this.quantity = quantity;
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescrition() {
		return descrition;
	}
	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
