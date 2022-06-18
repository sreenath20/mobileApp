package com.mobileapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mobileapp.entity.Customer;
import com.mobileapp.entity.CustomerDTO;
import com.mobileapp.exception.CustomerNotFoundException;
import com.mobileapp.service.CustomerService;

@SpringBootTest
class OnlinemobileappApplicationTests {

	@Autowired
	private CustomerService customerService;

	@Test
	void addCustomerTest() {
		Customer customer = new Customer(105, "Capgi", "123", "88888", "test@gmail.com", null, null);
		Customer testCustomer = this.customerService.addCustomer(customer);
		assertNotNull(testCustomer);// it should return newly added customer object
		// remove test data
	}

	@Test
	void updateCustomerTest() {
		CustomerDTO customerDTO = new CustomerDTO(105, "TestName", null, "8888", "test@gmail.com");

		assertThrows(CustomerNotFoundException.class, () -> this.customerService.updateCustomer(customerDTO));

	}

	@Test
	void updateCustomerTest2() {
		// Customer customer = new Customer(24, "Capgi", "123", 8888L, "test@gmail.com",
		// null, null);
		// Customer testCustomer = this.customerService.addCustomer(customer);

		CustomerDTO customerDTO = new CustomerDTO(24, "TestName", null, "8888", "test@gmail.com");

		try {
			Customer updatedCustomer = this.customerService.updateCustomer(customerDTO);

			assertEquals("TestName", updatedCustomer.getCustomerName());
		} catch (CustomerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
