package com.modelo;

public class MenuCroasonhoIterator implements Iterator {

	private int				posAtual;
	private MenuCroasonho 	menu;
	
	public MenuCroasonhoIterator(MenuCroasonho menu) {
		this.posAtual = 0;
		this.menu 	  = menu;
	}
	
	public boolean hasNext() {		
		return posAtual < menu.getMenuItems().size();
	}

	public Object next() {
		if (hasNext()){
			MenuItem menuItem = menu.getMenuItems().get(posAtual);
			posAtual++;
			return menuItem;
		}
		return null;
	}

	public void remove() {
		menu.getMenuItems().remove(posAtual - 1);
		posAtual--;
	}
}
