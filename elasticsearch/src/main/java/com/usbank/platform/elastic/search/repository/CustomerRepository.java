package com.usbank.platform.elastic.search.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.usbank.platform.elastic.search.model.Customer;
public interface CustomerRepository extends ElasticsearchRepository<Customer, String>{

	List<Customer> findByFirstname(String firstName);

}
