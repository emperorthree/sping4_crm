package com.demo.web.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.domain.Customer;
import com.demo.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{
	private Customer customer = new Customer();
	
	@Override
	public Customer getModel() {
		return customer;
	}
	
	public String saveUI(){
		return "saveUI";
	}
	
	public String add(){
		ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService = (CustomerService) ap.getBean("customerService");
		customerService.save(customer);
		return "saveSuccess";
	}
}
