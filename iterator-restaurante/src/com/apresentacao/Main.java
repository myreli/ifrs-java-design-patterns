package com.apresentacao;

import com.modelo.Garconete;
import com.modelo.MenuCroasonho;
import com.modelo.MenuPanquecaria;
import com.modelo.MenuRestauranteVegano;

public class Main {

	public static void main(String [] args) {
		
		MenuPanquecaria menuPanquecaria  = new MenuPanquecaria();
		MenuRestauranteVegano menuVegano = new MenuRestauranteVegano();
		MenuCroasonho menuCroa			 = new MenuCroasonho();
		
		Garconete garconete = new Garconete(menuPanquecaria, menuVegano, menuCroa);
		
		System.out.println("listando itens utilizando iterator...");
		
		garconete.printMenu();
		
		System.out.println("removendo itens utilizando iterator...");
		
		garconete.cleanMenu();
		
		System.out.println("e tentando listar itens dos menus vazios...");
		
		garconete.printMenu();
	}
	
}
