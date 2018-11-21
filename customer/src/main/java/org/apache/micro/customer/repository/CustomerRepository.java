package org.apache.micro.customer.repository;

import org.apache.micro.customer.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

	public Customer findByName(String name);
}