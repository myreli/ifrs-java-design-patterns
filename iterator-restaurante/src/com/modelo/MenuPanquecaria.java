package com.modelo;

public class MenuPanquecaria {

	private final static int MAX_ITEMS = 6;
	private int		   quantidadeAtual;
	private MenuItem[] menuItems;
	
	public MenuPanquecaria() {
		this.quantidadeAtual = 0;
		this.menuItems = new MenuItem[MAX_ITEMS]; 
		addItem(new MenuItem("Carne", "panqueca de carne", 5.0, false));
		addItem(new MenuItem("Calabresa", "panqueca de calabresa", 5.0, false));
	}
	
	private void addItem(MenuItem item) {
		if (quantidadeAtual < MAX_ITEMS) {
			this.menuItems[quantidadeAtual] = item;
			quantidadeAtual++;
		} else {
			System.err.println("capacidade máxima de itens atingida");
		}
	}

	public MenuItem[] getMenuItems() {
		return menuItems;
	}
	
	public void setMenuItems(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}

	public int getQuantidadeAtual() {
		return quantidadeAtual;
	}
	
	public void setQuantidadeAtual(int quantidadeAtual) {
		this.quantidadeAtual = quantidadeAtual;
	}
	
	public Iterator createIterator(){
		return new MenuPanquecariaIterator(this);		
	}
	
}
