package com.mobileapp.service;

import java.util.List;

import com.mobileapp.entity.Cart;
import com.mobileapp.entity.CartDTO;

public interface CartService {
	Cart addToCartOld(Cart cart);
	Cart addToCart(CartDTO cartDTO);
	List<Cart> getAllCarts();

}
