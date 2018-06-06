package com.modelo;

public class Garconete {

	private MenuPanquecaria panquecaria;
	private MenuRestauranteVegano vegano;
	private MenuCroasonho croa;
	
	public Garconete(MenuPanquecaria panquecaria, MenuRestauranteVegano vegano, MenuCroasonho croa) {
		this.panquecaria = panquecaria;
		this.vegano = vegano;
		this.croa = croa;
	}

	public void printMenu() {
		
		Iterator iteratorVegano = vegano.createIterator();
		while (iteratorVegano.hasNext()){
			MenuItem item = (MenuItem) iteratorVegano.next();
			System.out.println(item);
		}
		
		Iterator iteratorPanquecaria = panquecaria.createIterator();
		while (iteratorPanquecaria.hasNext()){
			MenuItem item = (MenuItem) iteratorPanquecaria.next();
			System.out.println(item);
		}
		
		Iterator iteratorCroa = croa.createIterator();
		while(iteratorCroa.hasNext()) {
			MenuItem item = (MenuItem) iteratorCroa.next();
			System.out.println(item);
		}
	}
	
	public void cleanMenu() {
		Iterator iteratorVegano = vegano.createIterator();
		while (iteratorVegano.hasNext()) {
			iteratorVegano.next();
			iteratorVegano.remove();
		}
		
		Iterator iteratorPanquecaria = panquecaria.createIterator();
		while (iteratorPanquecaria.hasNext()){
			iteratorPanquecaria.next();
			iteratorPanquecaria.remove();
		}
		
		Iterator iteratorCroa = croa.createIterator();
		while(iteratorCroa.hasNext()) {
			iteratorCroa.next();
			iteratorCroa.remove();
		}
	}
	
}
