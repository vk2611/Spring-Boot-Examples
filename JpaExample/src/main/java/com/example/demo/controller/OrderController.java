package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@RestController
public class OrderController {
	
	@Autowired
	private CustomerRepository customerRepository;
	  
//	@Autowired
//	private ProductRepository productRepository;
//	
	
	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody Customer customer) {
		return customerRepository.save(customer);
	}
	
	@GetMapping("/findAllOrders")
	public List<Customer> findAllOrders(){
		return customerRepository.findAll();
	}
	
}

