package com.training.springboot.service;

import java.util.List;
import java.util.Optional;

import com.training.springboot.model.Product;

public interface ProductService {
	public List<Product> getProducts();
	public Optional<Product> getProductByID(String pid);
	

}
