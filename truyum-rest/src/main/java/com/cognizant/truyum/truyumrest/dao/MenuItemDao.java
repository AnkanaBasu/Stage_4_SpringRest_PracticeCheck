package com.cognizant.truyum.truyumrest.dao;

import java.util.List;

import com.cognizant.truyum.truyumrest.exception.MenuItemNotFoundException;
import com.cognizant.truyum.truyumrest.model.MenuItem;

public interface MenuItemDao {
	List<MenuItem> getMenuItemListCustomer();

	void modifyMenuItem(MenuItem menuItem);

	MenuItem getMenuItem(long id) throws MenuItemNotFoundException;
}
