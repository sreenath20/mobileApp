package com.mobileapp.entity;

public class CartDTO {

	
	private Integer customerId;
	
	private Integer mobileId;
	
	public CartDTO() {
		super();
	}
	public CartDTO(Integer customerId, Integer mobileId) {
		super();
		this.customerId = customerId;
		this.mobileId = mobileId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getMobileId() {
		return mobileId;
	}
	public void setMobileId(Integer mobileId) {
		this.mobileId = mobileId;
	}
	
}
