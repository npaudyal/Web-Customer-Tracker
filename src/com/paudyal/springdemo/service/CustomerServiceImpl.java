package com.paudyal.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paudyal.springdemo.dao.CustomerDAO;
import com.paudyal.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	//need to inject customer dao
	@Autowired
	private CustomerDAO customerDAO;
	

	@Override
	@Transactional
	public List<Customer> getCustomers() {
			
		
		
		return customerDAO.getCustomers();
	}


	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		
		customerDAO.saveCustomer(theCustomer);
		
		
	}


	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		
		return customerDAO.getCustomer(theId);
		
	}


	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		// TODO Auto-generated method stub
		
		customerDAO.deleteCustomer(theId);
		
	}

}
