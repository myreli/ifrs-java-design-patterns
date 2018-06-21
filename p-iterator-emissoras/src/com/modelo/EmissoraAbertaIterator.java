package com.modelo;

public class EmissoraAbertaIterator implements Iterator {

	private int				posAtual;
	private EmissoraAberta 	emissora;
	
	public EmissoraAbertaIterator(EmissoraAberta emissora) {
		this.posAtual = 0;
		this.emissora 	  = emissora;
	}
	
	public boolean hasNext() {		
		return posAtual < emissora.getProgramas().size();
	}

	public Object next() {
		if (hasNext()){
			Programa emissoraItem = emissora.getProgramas().get(posAtual);
			posAtual++;
			return emissoraItem;
		}
		return null;
	}

	public void remove() {
		emissora.getProgramas().remove(posAtual - 1);
		posAtual--;
	}
}
