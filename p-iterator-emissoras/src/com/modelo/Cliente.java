package com.modelo;

public class Cliente {

	private EmissoraEspecialista especialista;
	private EmissoraAberta aberta;
	
	public Cliente(EmissoraEspecialista especialista, EmissoraAberta aberta) {
		this.especialista = especialista;
		this.aberta = aberta;
	}

	public void programacao() {
		
		Iterator iteratorespecialista = especialista.createIterator();
		while (iteratorespecialista.hasNext()){
			Programa item = (Programa) iteratorespecialista.next();
			System.out.println(item);
		}
		
		Iterator iteratoraberta = aberta.createIterator();
		while(iteratoraberta.hasNext()) {
			Programa item = (Programa) iteratoraberta.next();
			System.out.println(item);
		}
	}
	
	public void limpaProgramacao() {
		Iterator iteratorespecialista = especialista.createIterator();
		while (iteratorespecialista.hasNext()) {
			iteratorespecialista.next();
			iteratorespecialista.remove();
		}
		
		Iterator iteratoraberta = aberta.createIterator();
		while(iteratoraberta.hasNext()) {
			iteratoraberta.next();
			iteratoraberta.remove();
		}
	}
	
}
