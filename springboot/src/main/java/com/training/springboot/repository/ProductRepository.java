package com.training.springboot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.springboot.model.Product;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	@Query("SELECT p FROM Product p")
    List<Product> getProducts();
	
	Optional<Product> findByPid(Long pid);

}