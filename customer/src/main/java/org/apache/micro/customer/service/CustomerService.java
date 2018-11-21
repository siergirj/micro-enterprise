package org.apache.micro.customer.service;

import org.apache.micro.customer.model.Customer;
import org.apache.micro.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repository;

	public Customer get(String id) {
		return null; //repository.findOne(id);
	}

	public Customer saveOrUpdate(Customer customer) {
		return repository.save(customer);
	}

	public void delete(String id) {
//		repository.delete(id);
	}

	public Customer search(String name) {
		return repository.findByName(name);
	}
}
