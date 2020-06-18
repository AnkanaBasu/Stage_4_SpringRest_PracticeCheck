package com.cognizant.truyum.truyumrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.truyum.truyumrest.exception.MenuItemNotFoundException;
import com.cognizant.truyum.truyumrest.model.MenuItem;
import com.cognizant.truyum.truyumrest.sevice.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartService cartService;
	@PostMapping("/{userId}/{menuItemId}")
	void addCartItem(@PathVariable String userId, @PathVariable long menuItemId) throws MenuItemNotFoundException {
		cartService.addCartItem(userId, menuItemId);
	}

	@GetMapping("/{userId}")
	List<MenuItem> getAllCartItems(@PathVariable String userId) {
		return cartService.getAllCartItems(userId);
	}

	@DeleteMapping("/{userId}/{menuItemId}")
	void removeCartItem(@PathVariable String userId, @PathVariable long menuItemId) throws MenuItemNotFoundException {
		cartService.removeCartItem(userId, menuItemId);
	}

}
