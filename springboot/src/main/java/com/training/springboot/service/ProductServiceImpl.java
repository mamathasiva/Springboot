package com.training.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springboot.model.Product;
import com.training.springboot.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	public ProductRepository productRepository;

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return productRepository.getProducts();
	}

	@Override
	public Optional<Product> getProductByID(String pid) {
		// TODO Auto-generated method stub
		return productRepository.findByPid(Long.valueOf(pid));
	}

}
