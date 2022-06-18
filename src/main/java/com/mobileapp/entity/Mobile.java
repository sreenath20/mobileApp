package com.mobileapp.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Mobile {
	@Id
	@GeneratedValue
	private Integer mobileId;
	
	private String mobileName;
	private Double mobileCost;
	private LocalDate mfd;
	private String modelNumber;
	private String companyName;
	
	@ManyToOne
	@JsonIgnore
	private Category category;

	public Mobile() {
		super();
	}

	public Mobile(Integer mobileId, String mobileName, Double mobileCost, LocalDate mfd, String modelNumber,
			String companyName, Category category) {
		super();
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.mobileCost = mobileCost;
		this.mfd = mfd;
		this.modelNumber = modelNumber;
		this.companyName = companyName;
		this.category = category;
	}

	public Integer getMobileId() {
		return mobileId;
	}

	public void setMobileId(Integer mobileId) {
		this.mobileId = mobileId;
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

	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	

}
