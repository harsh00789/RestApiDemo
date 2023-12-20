package com.form2.restapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.form2.restapi.entities.Product;
import com.form2.restapi.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
     
	@Autowired
	private ProductRepository pr;
	
	@Override
	public Product addproduct(Product p) {
		
	     return  pr.save(p);
		
	}

}
