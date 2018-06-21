package com.modelo;

import java.util.Vector;

public class EmissoraAberta {

	private Vector<Programa> programas;

	public EmissoraAberta() {
		this.programas = new Vector<Programa>();
		this.addItem(new Programa("Jornal Principal", "jornalzao"));
		this.addItem(new Programa("Novela Mexicana", "novelinha bacana"));
		this.addItem(new Programa("Esportes", "programa sobre esportes"));
	}
	
	private void addItem(Programa item) {
		this.programas.add(item);
	}

	public Vector<Programa> getProgramas() {
		return programas;
	}
	
	public Iterator createIterator(){
		return new EmissoraAbertaIterator(this);		
	}
	
}
