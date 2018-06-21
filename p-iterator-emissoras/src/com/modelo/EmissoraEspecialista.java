package com.modelo;

import java.util.ArrayList;

public class EmissoraEspecialista {
	
	private ArrayList<Programa> programas;

	public EmissoraEspecialista() {
		this.programas = new ArrayList<Programa>();
		this.addItem(new Programa("super esporte", "programa especialista em esportes"));
		this.addItem(new Programa("esportezao", "outro programa especialista em esportes"));
	}
	
	private void addItem(Programa item) {
		this.programas.add(item);
	}

	public ArrayList<Programa> getProgramas() {
		return programas;
	}
	
	public Iterator createIterator(){
		return new EmissoraEspecialistaIterator(this);		
	}

}
