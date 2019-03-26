package com.demo.dao.impl;

import com.demo.dao.CustomerDao;
import com.demo.domain.Customer;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public void save(Customer customer) {
		System.out.println("daoImpl--save");

	}

}

