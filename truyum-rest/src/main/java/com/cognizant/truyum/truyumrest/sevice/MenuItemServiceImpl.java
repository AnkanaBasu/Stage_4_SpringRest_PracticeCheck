package com.cognizant.truyum.truyumrest.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.truyumrest.dao.MenuItemDao;
import com.cognizant.truyum.truyumrest.exception.MenuItemNotFoundException;
import com.cognizant.truyum.truyumrest.model.MenuItem;
@Service
public class MenuItemServiceImpl implements MenuItemService {
 
	@Autowired
    private MenuItemDao menuItemDao;
	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		// TODO Auto-generated method stub
		return menuItemDao.getMenuItemListCustomer();
	}

	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		menuItemDao.modifyMenuItem(menuItem);

	}

	@Override
	public MenuItem getMenuItem(long id) throws MenuItemNotFoundException {
		return menuItemDao.getMenuItem(id);
	}

}
