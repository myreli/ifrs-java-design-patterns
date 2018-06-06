package com.modelo;

import java.util.ArrayList;

public class MenuRestauranteVegano {
	
	private ArrayList<MenuItem> menuItems;

	public MenuRestauranteVegano() {
		this.menuItems = new ArrayList<MenuItem>();
		this.addItem(new MenuItem("Salada", "Salada vegana", 10.0, true));
		this.addItem(new MenuItem("Abobora Recheada", "abobora recheada com tomate", 20.0, true));
	}
	
	private void addItem(MenuItem item) {
		this.menuItems.add(item);
	}

	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
	
	public Iterator createIterator(){
		return new MenuRestauranteVeganoIterator(this);		
	}

}
