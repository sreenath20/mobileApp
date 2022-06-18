package com.mobileapp.entity;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CustomerDTO {

	private Integer customerId;

	@NotNull(message = " Name cannot be null.")
	@Size(min = 3, message = " Customer name should be of min 3 chars.")
	@Pattern(regexp = "[a-zA-Z0-9]*",message = " User name can't have special charcters.")
	private String customerName;
	@Size(min = 8, message = " Password should have min 8 chars.")
	private String customerPassword;

	@Pattern(regexp = "^[0-9]{10}$",message = " Mobile number must be of 10 digits.")
    
	private String mobileNumber;
	@Email(message = " Email should be valid.")
	private String emailId;
	private LocalDate regDate;

	public CustomerDTO() {
		super();
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public CustomerDTO(Integer customerId, String customerName, String customerPassword, String mobileNumber,
			String emailId) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPassword = customerPassword;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
