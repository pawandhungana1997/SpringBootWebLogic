package com.ektha.springweblogic.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ektha.springweblogic.entity.Customer;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer>{

}
