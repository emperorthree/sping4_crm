package com.demo.service.impl;

import com.demo.dao.CustomerDao;
import com.demo.domain.Customer;
import com.demo.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDao customerDao;
	
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	
	@Override
	public void save(Customer customer) {
		System.out.println("service-save");
		customerDao.save(customer);
	}

}
