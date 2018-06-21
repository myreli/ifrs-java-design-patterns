package com.modelo;

public class EmissoraEspecialistaIterator implements Iterator {

	private EmissoraEspecialista emissora;
	private int posAtual;
	
	public EmissoraEspecialistaIterator(EmissoraEspecialista emissora){
		this.posAtual = 0;
		this.emissora = emissora;
	}
	
	public boolean hasNext() {		
		return posAtual < emissora.getProgramas().size();
	}

	public Object next() {
		if (hasNext()){
			Programa menuItem = emissora.getProgramas().get(posAtual);
			posAtual++;
			return menuItem;
		}
		return null;
	}

	public void remove() {
		emissora.getProgramas().remove(posAtual - 1);
		posAtual--;
	}

}
