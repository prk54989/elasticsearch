package com.usbank.platform.elastic.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.usbank.platform.elastic.search.model.Customer;
import com.usbank.platform.elastic.search.repository.CustomerRepository;

@RestController
public class ElasticserachController {
	
	@Autowired
	private CustomerRepository repository;
	
	@PostMapping("/saveCustomer")
	public int saveCustomer(@RequestBody List<Customer> customers) {
		repository.saveAll(customers);
		return customers.size();
	}

	@GetMapping("/findAll")
	public Iterable<Customer> findAllCustomers() {
		return repository.findAll();
	}

	@GetMapping("/findByFName/{firstName}")
	public List<Customer> findByFirstName(@PathVariable String firstName) {
		return repository.findByFirstname(firstName);
	}

}
