package com.mobileapp.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mobileapp.entity.Customer;
import com.mobileapp.entity.CustomerDTO;

import com.mobileapp.exception.CustomerNotFoundException;
import com.mobileapp.service.CustomerService;

@RestController
@RequestMapping("v1")
@CrossOrigin(value = "http://localhost:3000/")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("customerold")
	public Customer addCustomer(@RequestBody Customer customer) {

		return this.customerService.addCustomer(customer);
	}

	@PostMapping("customer")
	public Customer addCustomer(@Valid @RequestBody CustomerDTO customerDTO) {
		
		Customer customer = new Customer(null, customerDTO.getCustomerName(), customerDTO.getCustomerPassword(), customerDTO.getMobileNumber(), customerDTO.getEmailId(),customerDTO.getRegDate(),null, null);
		return this.customerService.addCustomer(customer);
	}

	@PutMapping("customer")
	public Customer updateCustomer(@RequestBody CustomerDTO customerDTO) throws CustomerNotFoundException {
		return this.customerService.updateCustomer(customerDTO);
	}

	@GetMapping("customers")
	public List<Customer> getAllCustomers() {
		return this.customerService.showAllCustomers();
	}
	@DeleteMapping("customer/{id}")
	public Customer deleteCustomerById(@PathVariable("id") Integer id )throws CustomerNotFoundException {
		return this.customerService.deleteCustomerById(id);
	}

}
