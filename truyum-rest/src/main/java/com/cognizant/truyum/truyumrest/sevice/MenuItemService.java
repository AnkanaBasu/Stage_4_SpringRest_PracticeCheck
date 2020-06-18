package com.cognizant.truyum.truyumrest.sevice;

import java.util.List;

import com.cognizant.truyum.truyumrest.exception.MenuItemNotFoundException;
import com.cognizant.truyum.truyumrest.model.MenuItem;

public interface MenuItemService {
	List<MenuItem> getMenuItemListCustomer();

	void modifyMenuItem(MenuItem menuItem);

	MenuItem getMenuItem(long id) throws MenuItemNotFoundException;
}
