package org.apache.micro.customer.resource;

import org.apache.micro.customer.model.Customer;
import org.apache.micro.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerResource {

	@Autowired
	private CustomerService service;

	@PostMapping("${rest.mapping.customer}")
	public Customer post(Customer customer) {
		return service.saveOrUpdate(customer);
	}

	@GetMapping("${rest.mapping.customer}")
	public Customer search(@RequestParam String name) {
		return service.search(name);
	}
	//
	// @GetMapping
	// @RequestMapping("${rest.mapping.customer.id}")
	// public Customer get(String id) {
	// return service.get(id);
	// }
	//
	// @PutMapping
	// @RequestMapping("${rest.mapping.customer.id}")
	// public void put(Customer customer) {
	// service.saveOrUpdate(customer);
	// }

	@DeleteMapping
	@RequestMapping("${rest.mapping.customer.id}")
	public void delete(String id) {
		service.delete(id);
	}
}