package com.form2.restapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "form2")
public class Product {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private int price;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}




public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public Product(int id, String name, int price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
public Product() {
	super();
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
}




}
