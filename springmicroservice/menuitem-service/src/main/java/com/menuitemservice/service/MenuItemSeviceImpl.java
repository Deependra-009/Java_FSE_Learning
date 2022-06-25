package com.menuitemservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import entity.MenuItem;

@Service
public class MenuItemSeviceImpl implements MenuItemService {

	List<MenuItem> list=List.of(
			new MenuItem(1,"popcorn","100"),
			new MenuItem(2,"pizza","200"),
			new MenuItem(3,"sandwitch","350"),
			new MenuItem(4,"samosa","120")

			);
	
	@Override
	public List<MenuItem> getMenuItem() {
		
		
		return this.list;
	}
	
	

}
