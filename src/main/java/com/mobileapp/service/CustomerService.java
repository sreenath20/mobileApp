package com.mobileapp.service;

import java.util.List;

import com.mobileapp.entity.Customer;
import com.mobileapp.entity.CustomerDTO;
import com.mobileapp.exception.CustomerNotFoundException;

public interface CustomerService {

	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(CustomerDTO customerDTO) throws CustomerNotFoundException;
	public Customer cancelCustomer(Integer customerid) throws CustomerNotFoundException;
	public List<Customer> showAllCustomers();
	public Customer getCustomerById(Integer customerId) throws CustomerNotFoundException;
	public Customer deleteCustomerById(Integer id) throws CustomerNotFoundException;
}
