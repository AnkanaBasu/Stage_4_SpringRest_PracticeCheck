package com.cognizant.truyum.truyumrest.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.truyum.truyumrest.exception.MenuItemNotFoundException;
import com.cognizant.truyum.truyumrest.model.MenuItem;
@Repository
public class MenuItemDaoImpl implements MenuItemDao {
	private static List<MenuItem> MENUITEM_LIST = new ArrayList<>();

	private static final Logger LOGGER = LoggerFactory.getLogger(MenuItemDaoImpl.class);
	

	@SuppressWarnings({ "unchecked", "resource" })
	public MenuItemDaoImpl() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("menuitem.xml");
		MENUITEM_LIST=(List<MenuItem>) ctx.getBean("menuitem_list");
		LOGGER.debug("MenuItems:{}", MENUITEM_LIST);
	}

	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		return MENUITEM_LIST;
	}

	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		try {
			MenuItem item=getMenuItem(menuItem.getId());
			item.setName(menuItem.getName());
			item.setCategory(menuItem.getCategory());
			item.setPrice(menuItem.getPrice());
			item.setActive(menuItem.isActive());
			item.setFreeDelivery(menuItem.isFreeDelivery());
			item.setDateOfLaunch(menuItem.getDateOfLaunch());
		} catch (MenuItemNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public MenuItem getMenuItem(long id) throws MenuItemNotFoundException {
	    for(MenuItem item:MENUITEM_LIST) {
	    	if(id==item.getId()) {
	    		return item;
	    	}
	    }
		throw new MenuItemNotFoundException("MenuItm not found");
	}

}
