package com.mobileapp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	
	@Id
	@GeneratedValue
	private Integer categoryId;
	private String categoryName;
	
	@OneToMany(mappedBy = "category")
	private List<Mobile> mobiles = new ArrayList<>();

	public Category() {
		super();
	}

	public Category(Integer categoryId, String categoryName, List<Mobile> mobiles) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.mobiles = mobiles;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<Mobile> getMobiles() {
		return mobiles;
	}

	public void setMobiles(List<Mobile> mobiles) {
		this.mobiles = mobiles;
	}
	
	

}
