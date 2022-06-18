package com.mobileapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileapp.entity.Customer;
import com.mobileapp.entity.CustomerDTO;
import com.mobileapp.exception.CustomerNotFoundException;
import com.mobileapp.repository.CustomerRepository;

/************************************************************************************
 *          @author          Ram Kumar
 *          Description      It is a service class that provides the services for adding anew account, 
                                        transferring fund and viewing all the accounts  
  *         Version             1.0
  *         Created Date    02-APR-2020
 ************************************************************************************/

@Service // @Component
public class CustomerServiceImpl implements CustomerService {

	
	@Autowired
	private CustomerRepository customerRepo;
	
	
	
	/************************************************************************************
	 * Method: transferFund
     *Description: To transfer the fund from one account to another account
	 * @param fromAccountID       - Sender’s Account ID
	 * @param toAccountID            - Reciepent Account ID
	 * @param amt                           - Amount to be Transferred
	 * @returns Boolean                  - true, if transferred otherwise throws AccountException
	 * @throws AccountException - It is raised due to insufficient balance or invalid account Id or  
                                                                         server side validation
     *Created By                                - Ram kumar
     *Created Date                            - 7-APR-2020                           
	 
	 ************************************************************************************/


	@Override
	public Customer addCustomer(Customer newCustomer) {		
		
		return this.customerRepo.save(newCustomer);
	}


	/************************************************************************************
	 * Method: transferFund
     *Description: To transfer the fund from one account to another account
	 * @param fromAccountID       - Sender’s Account ID
	 * @param toAccountID            - Reciepent Account ID
	 * @param amt                           - Amount to be Transferred
	 * @returns Boolean                  - true, if transferred otherwise throws AccountException
	 * @throws AccountException - It is raised due to insufficient balance or invalid account Id or  
                                                                         server side validation
     *Created By                                - Ram kumar
     *Created Date                            - 7-APR-2020                           
	 
	 ************************************************************************************/


	@Override
	public Customer updateCustomer(CustomerDTO customerDTO) throws CustomerNotFoundException {
		
		Optional<Customer> customerOpt = this.customerRepo.findById(customerDTO.getCustomerId());
		if(customerOpt.isEmpty())
			throw new CustomerNotFoundException("Customer id does not exist to update.");
		
		Customer updateCustomer = customerOpt.get();
		updateCustomer.setCustomerName(customerDTO.getCustomerName());
		updateCustomer.setMobileNumber(customerDTO.getMobileNumber());
		updateCustomer.setEmailId(customerDTO.getEmailId());
		
		return this.customerRepo.save(updateCustomer);
	}


	/************************************************************************************
	 * Method: transferFund
     *Description: To transfer the fund from one account to another account
	 * @param fromAccountID       - Sender’s Account ID
	 * @param toAccountID            - Reciepent Account ID
	 * @param amt                           - Amount to be Transferred
	 * @returns Boolean                  - true, if transferred otherwise throws AccountException
	 * @throws AccountException - It is raised due to insufficient balance or invalid account Id or  
                                                                         server side validation
     *Created By                                - Ram kumar
     *Created Date                            - 7-APR-2020                           
	 
	 ************************************************************************************/


	@Override
	public Customer cancelCustomer(Integer customerid) throws CustomerNotFoundException {

		return null;
	}

	@Override
	public List<Customer> showAllCustomers() {
		
		return this.customerRepo.findAll();
	}

	@Override
	public Customer getCustomerById(Integer customerId) throws CustomerNotFoundException {

		return null;
	}

	/************************************************************************************
	 * Method: transferFund
     *Description: To transfer the fund from one account to another account
	 * @param fromAccountID       - Sender’s Account ID
	 * @param toAccountID            - Reciepent Account ID
	 * @param amt                           - Amount to be Transferred
	 * @returns Boolean                  - true, if transferred otherwise throws AccountException
	 * @throws AccountException - It is raised due to insufficient balance or invalid account Id or  
                                                                         server side validation
     *Created By                                - Ram kumar
     *Created Date                            - 7-APR-2020                           
	 
	 ************************************************************************************/


	@Override
	public Customer deleteCustomerById(Integer id) throws CustomerNotFoundException {
		
		Optional<Customer> optCustomer = this.customerRepo.findById(id);
		if(optCustomer.isEmpty())
			throw new CustomerNotFoundException("Customer Id does not exists to delete.");
		this.customerRepo.deleteById(id);
		return optCustomer.get();
	}

}
