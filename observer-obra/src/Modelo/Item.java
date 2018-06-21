/**
 * 
 */
package Modelo;

/**
 * @author myreli
 *
 */
public class Item {

	private String nome;
	private Double valorMin;
	
	/**
	 * 
	 */
	public Item(String nome) {
		this.nome = nome;
	}
	
	public Item(String nome, Double valorMin) {
		this(nome);
		this.setValorMin(valorMin);
	}
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the valorMin
	 */
	public Double getValorMin() {
		return valorMin;
	}

	/**
	 * @param valorMin the valorMin to set
	 */
	public void setValorMin(Double valorMin) {
		this.valorMin = valorMin;
	}
	
	
	
}
