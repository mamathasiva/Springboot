package com.training.springboot.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Product   
{  
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long pid;  

public Long getPid() {
	return pid;
}

public void setPid(Long pid) {
	this.pid = pid;
}

public String getProduct_name() {
	return product_name;
}

public void setProduct_name(String product_name) {
	this.product_name = product_name;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

private String product_name;  
private double price;  
//default constructor  
public Product()  
{  
      
}  

public Product(Long pid, String product_name, double price) {
	super();
	this.pid = pid;
	this.product_name = product_name;
	this.price = price;
}

}  
