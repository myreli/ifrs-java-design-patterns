package com.modelo;

import java.util.Arrays;

public class MenuPanquecariaIterator implements Iterator {

	private int				posAtual;
	private MenuPanquecaria menuPanquecaria;
	
	public MenuPanquecariaIterator(MenuPanquecaria menuPanquecaria) {
		this.posAtual 		 = 0;
		this.menuPanquecaria = menuPanquecaria;
	}
	
	public boolean hasNext() {
		return posAtual < menuPanquecaria.getQuantidadeAtual();
	}

	public Object next() {
		if (hasNext()) {
			MenuItem menuItem = menuPanquecaria.getMenuItems()[posAtual];
			posAtual++;
			return menuItem;
		}
		return null;
	}

	public void remove() {
		menuPanquecaria.setMenuItems(removeElement(menuPanquecaria.getMenuItems(), menuPanquecaria.getMenuItems()[posAtual]));
		menuPanquecaria.setQuantidadeAtual(menuPanquecaria.getQuantidadeAtual() - 1);
		posAtual--;
	}

	private static MenuItem[] removeElement(MenuItem[] arr, MenuItem elem) {
		int length = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != elem) arr[length++] = arr[i];
		}
		
		return Arrays.copyOf(arr, length);
	}

}
