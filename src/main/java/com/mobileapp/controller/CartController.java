package com.mobileapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobileapp.entity.Cart;
import com.mobileapp.entity.CartDTO;
import com.mobileapp.service.CartService;

@RestController
public class CartController {

	@Autowired
	private CartService cartService;

	@PostMapping("cartold")
	public Cart addToCartOld(@RequestBody Cart cart) {

		return this.cartService.addToCartOld(cart);
	}

	@PostMapping("cart")
	public Cart addToCart(@RequestBody CartDTO cartDTO) {

		return this.cartService.addToCart(cartDTO);
	}

	@GetMapping("carts")
	public List<Cart> getAllCarts() {

		return this.cartService.getAllCarts();
	}

	
}
