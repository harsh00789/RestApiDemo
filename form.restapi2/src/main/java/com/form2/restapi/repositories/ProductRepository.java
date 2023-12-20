package com.form2.restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.form2.restapi.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
