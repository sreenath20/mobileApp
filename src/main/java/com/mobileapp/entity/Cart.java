package com.mobileapp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Cart {

	@Id
	@GeneratedValue
	private Integer cartId;
	private Integer quantity;
	private Double cost;

	@OneToOne(mappedBy = "cart")
	@JsonIgnore
	private Customer customer;

	@ManyToMany
	private List<Mobile> mobiles = new ArrayList<>();

	public Cart() {
		super();
	}

	public Cart(Integer cartId, Customer customer, List<Mobile> mobiles, Integer quantity, Double cost) {
		super();
		this.cartId = cartId;
		this.customer = customer;
		this.mobiles = mobiles;
		this.quantity = quantity;
		this.cost = cost;
	}

	public List<Mobile> getMobiles() {
		return mobiles;
	}

	public void setMobiles(List<Mobile> mobiles) {
		this.mobiles = mobiles;
	}

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

}
