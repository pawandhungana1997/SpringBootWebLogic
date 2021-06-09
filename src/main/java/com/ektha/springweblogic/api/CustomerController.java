package com.ektha.springweblogic.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ektha.springweblogic.entity.Customer;
import com.ektha.springweblogic.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;

	@GetMapping("api/customers/{id}")
	public Customer getCustomer(@PathVariable int id) {
		return customerService.getCustomer(id);
	}
	
	@GetMapping("api/customers")
	public List<Customer> getCustomers(){
		return customerService.getCustomers();
	}
	
	@PostMapping("api/customers")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}
}
