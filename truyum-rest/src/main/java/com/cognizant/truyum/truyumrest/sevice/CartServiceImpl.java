package com.cognizant.truyum.truyumrest.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.truyumrest.dao.CartDao;
import com.cognizant.truyum.truyumrest.exception.MenuItemNotFoundException;
import com.cognizant.truyum.truyumrest.model.MenuItem;
@Service
public class CartServiceImpl implements CartService {
@Autowired
private CartDao cartDao;
	@Override
	public void addCartItem(String userId, long menuItemId) throws MenuItemNotFoundException {
      cartDao.addCartItem(userId, menuItemId);
	}

	@Override
	public List<MenuItem> getAllCartItems(String userId) {
		return cartDao.getAllCartItems(userId);
	}

	@Override
	public void removeCartItem(String userId, long menuItemId) throws MenuItemNotFoundException {
		cartDao.removeCartItem(userId, menuItemId);

	}

}
