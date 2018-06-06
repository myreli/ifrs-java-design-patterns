package com.modelo;

import java.util.Vector;

public class MenuCroasonho {

	private Vector<MenuItem> menuItems;

	public MenuCroasonho() {
		this.menuItems = new Vector<MenuItem>();
		this.addItem(new MenuItem("Frango Cremoso", "Croa de frango com requeijão e queijo cremoso", 15.0, false));
		this.addItem(new MenuItem("Brocolis", "Croa de brocolis e queijo cremoso", 20.0, true));
		this.addItem(new MenuItem("Carne de panela", "Croa de carne de panela e cheddar", 15.0, false));
	}
	
	private void addItem(MenuItem item) {
		this.menuItems.add(item);
	}

	public Vector<MenuItem> getMenuItems() {
		return menuItems;
	}
	
	public Iterator createIterator(){
		return new MenuCroasonhoIterator(this);		
	}
	
}
