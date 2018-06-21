/**
 * 
 */
package Modelo;

import java.util.ArrayList;

/**
 * @author myreli
 *
 */
public class Leiloeiro implements Leilao {

	private String nome;
	private Item itemAtual;
	private Concorrente ofertaAtual;
	private ArrayList<Item> items;
	private ArrayList<Concorrente> concorrentes;

	public Leiloeiro(String nome) {
		this.setNome(nome);
		this.items = new ArrayList<Item>();
		this.concorrentes = new ArrayList<Concorrente>();
	}

	@Override
	public void add(Item item) {
		this.items.add(item);		
	}

	@Override
	public void addConcorrente(Concorrente concorrente) {		
		this.concorrentes.add(concorrente);
		notifica("novo participante >> ", concorrente);
	}

	@Override
	public void delConcorrente(Concorrente concorrente) {
		this.concorrentes.remove(concorrente);
		notifica("game over para >> ", concorrente);
		
		if(concorrentes.size() == 1) {
			if(concorrentes.get(0).getLance() >= ofertaAtual.getLance())
				notifica("COMPRADOR", itemAtual, concorrentes.get(0));
		}
	}

	@Override
	public void inicia(ArrayList<Concorrente> concorrentes) {
		if (!this.concorrentes.isEmpty()) return;
		
		for(Concorrente c : concorrentes)
			addConcorrente(c);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public ArrayList<Concorrente> getConcorrentes() {
		return concorrentes;
	}

	public void setConcorrentes(ArrayList<Concorrente> concorrentes) {
		this.concorrentes = concorrentes;
	}

	@Override
	public Item itemAtual() {
		return this.itemAtual;
	}

	@Override
	public Concorrente ofertaAtual() {
		return this.getOfertaAtual();
	}

	@Override
	public void leiloa(Item item) {
		this.itemAtual = item;
		 
		this.notifica("NOVO ITEM SENDO LEILOADO! ", item);
	}

	@Override
	public void notifica(String mensagem, Item item) {
		for (Concorrente concorrente : concorrentes) {
			concorrente.notificacao(mensagem + " " + item.getNome());
		}
	}
	
	@Override
	public void notifica(String mensagem, Concorrente c) {
		for (Concorrente concorrente : concorrentes) {
			concorrente.notificacao(mensagem + " " + c.getNome());
		}
	}

	@Override
	public void notifica(String mensagem, Item item, Concorrente c) {
		for (Concorrente concorrente : concorrentes) {
			concorrente.notificacao(c.getNome() + " " + mensagem + " " + item.getNome());
		}
		
	}

	/**
	 * @return the ofertaAtual
	 */
	public Concorrente getOfertaAtual() {
		return ofertaAtual;
	}

	/**
	 * @param ofertaAtual the ofertaAtual to set
	 */
	public void setOfertaAtual(Concorrente ofertaAtual) {
		this.ofertaAtual = ofertaAtual;
	}
	
	/**
	 * @param concorrentes
	 * @param valor
	 */
	public void recebeAposta(Concorrente concorrente, double valor) {
		concorrente.setLance(valor);
		
		double atual;
		
		if(ofertaAtual != null)
			atual = ofertaAtual.getLance();
		else if (itemAtual.getValorMin() != null && itemAtual.getValorMin() >= 0)
			atual = itemAtual.getValorMin();
		else atual = -1;
		
		if (atual < concorrente.getLance()) {
			this.ofertaAtual = concorrente;
			
			notifica("NOVO LANCE MAIS ALTO PARA", itemAtual, ofertaAtual);
		} else {
			delConcorrente(concorrente);
		}
			
	}

}
