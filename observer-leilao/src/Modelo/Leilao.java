/**
 * 
 */
package Modelo;

import java.util.ArrayList;
import java.util.Map;

/**
 * @author myreli
 *
 */
public interface Leilao {
	
	public void add(Item item);
	
	public void addConcorrente(Concorrente concorrente);
	
	public void delConcorrente(Concorrente concorrente);
	
	public void inicia(ArrayList<Concorrente> concorrentes);
	
	public Item itemAtual();
	
	public Concorrente ofertaAtual();
	
	public void leiloa(Item item);
	
	public void notifica(String mensagem, Item item);
	
	public void notifica(String mensagem, Item item, Concorrente concorrente);

	public void notifica(String mensagem, Concorrente c);

}
