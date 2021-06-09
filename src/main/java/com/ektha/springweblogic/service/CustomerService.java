package com.ektha.springweblogic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ektha.springweblogic.dao.CustomerDAO;
import com.ektha.springweblogic.entity.Customer;

@Service
public class CustomerService {
	
	@Autowired
	CustomerDAO customerDAO;

	public Customer getCustomer(int id) {
		Optional<Customer> customer = customerDAO.findById(id);
		if (customer.isPresent()) {
			return customer.get();
		}
		return null;
	}
	
	public List<Customer> getCustomers(){
		return customerDAO.findAll();
	}

	public Customer addCustomer(Customer customer) {
		return customerDAO.save(customer);
	}
}
