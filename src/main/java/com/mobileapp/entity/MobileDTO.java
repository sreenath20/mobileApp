package com.mobileapp.entity;

import java.time.LocalDate;

public class MobileDTO {

	private String mobileName;
	private Double mobileCost;
	private LocalDate mfd;
	private String modelNumber;
	private String companyName;
	private Integer categoryId;
	
	public MobileDTO() {
		super();
	}
	public MobileDTO(String mobileName, Double mobileCost, LocalDate mfd, String modelNumber, String companyName,
			Integer categoryId) {
		super();
		this.mobileName = mobileName;
		this.mobileCost = mobileCost;
		this.mfd = mfd;
		this.modelNumber = modelNumber;
		this.companyName = companyName;
		this.categoryId = categoryId;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public Double getMobileCost() {
		return mobileCost;
	}
	public void setMobileCost(Double mobileCost) {
		this.mobileCost = mobileCost;
	}
	public LocalDate getMfd() {
		return mfd;
	}
	public void setMfd(LocalDate mfd) {
		this.mfd = mfd;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	
}
