package org.apache.micro.customer.service;

import org.apache.micro.customer.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	public Customer get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Customer saveOrUpdate(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(String id) {
		// TODO Auto-generated method stub

	}

	public Customer search(String name) {
		Customer result = new Customer();
		result.setName("*"+name+"*");
		return result;
	}

}
