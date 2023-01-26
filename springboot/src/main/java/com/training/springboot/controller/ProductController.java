package com.training.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.model.Product;
import com.training.springboot.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired 
	public ProductService productService;
	
	
	
	@GetMapping("/product")
	public List<Product> getProducts()
	{
		
		List<Product> lproducts= productService.getProducts();
	
		return lproducts;
	}

	@GetMapping("/product/{id}")
	public Optional<Product> getProduct(@PathVariable("id") String pid)
	{
		
		Optional<Product> lproducts= productService.getProductByID(pid);
	
		return lproducts;
	}

}
