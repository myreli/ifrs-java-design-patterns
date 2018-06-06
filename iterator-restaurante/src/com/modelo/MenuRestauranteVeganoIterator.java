package com.modelo;

public class MenuRestauranteVeganoIterator implements Iterator {

	private MenuRestauranteVegano vegano;
	private int posAtual;
	
	public MenuRestauranteVeganoIterator(MenuRestauranteVegano vegano){
		this.posAtual = 0;
		this.vegano = vegano;
	}
	
	public boolean hasNext() {		
		return posAtual < vegano.getMenuItems().size();
	}

	public Object next() {
		if (hasNext()){
			MenuItem menuItem = vegano.getMenuItems().get(posAtual);
			posAtual++;
			return menuItem;
		}
		return null;
	}

	public void remove() {
		vegano.getMenuItems().remove(posAtual - 1);
		posAtual--;
	}

}
