package com.cognizant.truyum.truyumrest.dao;

import java.util.List;

import com.cognizant.truyum.truyumrest.exception.MenuItemNotFoundException;
import com.cognizant.truyum.truyumrest.model.MenuItem;

public interface CartDao {
	void addCartItem(String userId, long menuItemId) throws MenuItemNotFoundException;

	List<MenuItem> getAllCartItems(String userId);

	void removeCartItem(String userId, long menuItemId) throws MenuItemNotFoundException;
}
