package com.cognizant.truyum.truyumrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.truyum.truyumrest.exception.MenuItemNotFoundException;
import com.cognizant.truyum.truyumrest.model.MenuItem;
import com.cognizant.truyum.truyumrest.sevice.MenuItemService;

@RestController
@RequestMapping("/menuitems")
public class MenuItemController {

	@Autowired
	private MenuItemService menuItemService;
	@GetMapping()
	public List<MenuItem> getMenuItemListCustomer() {
		return menuItemService.getMenuItemListCustomer();
	}
	@GetMapping("/{id}")
	public MenuItem getMenuItem(@PathVariable long id) throws MenuItemNotFoundException {
		return menuItemService.getMenuItem(id);
	}
	@PutMapping
	public void modifyMenuItem(@RequestBody MenuItem menuItem) {
		menuItemService.modifyMenuItem(menuItem);
	}
}

