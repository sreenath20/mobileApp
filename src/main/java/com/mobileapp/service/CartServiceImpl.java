package com.mobileapp.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileapp.entity.Cart;
import com.mobileapp.entity.CartDTO;
import com.mobileapp.entity.Customer;
import com.mobileapp.entity.Mobile;
import com.mobileapp.repository.CartRepository;
import com.mobileapp.repository.CustomerRepository;
import com.mobileapp.repository.MobileRepository;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository cartRepo;
	@Autowired
	private CustomerRepository customerRepo;
	@Autowired
	private MobileRepository mobileRepo;

	@Override
	public Cart addToCartOld(Cart cart) {
		// TODO Auto-generated method stub
		return this.cartRepo.save(cart);
	}

	@Override
	public Cart addToCart(CartDTO cartDTO) {

		Optional<Customer> optCustomer = this.customerRepo.findById(cartDTO.getCustomerId());
		// do the exception handling for customer
		Optional<Mobile> optMobile = this.mobileRepo.findById(cartDTO.getMobileId());
		Mobile mobile = optMobile.get();
		// do the exception handling for mobile
		Customer customer = optCustomer.get();
		Cart cart=null;
		if (customer.getCart() == null) {

			cart = new Cart(); // create new cart for customer
			cart.setCustomer(customer);
			cart.getMobiles().add(mobile);
			cart = this.cartRepo.save(cart); // save the cart
			customer.setCart(cart); // set new cart to customer

		}
		else
		{
			cart = customer.getCart(); // cart of existing customer
			cart.getMobiles().add(mobile);
			
		}

		return this.cartRepo.save(cart);
	}

	@Override
	public List<Cart> getAllCarts() {
		
		return this.cartRepo.findAll();
	}

}
