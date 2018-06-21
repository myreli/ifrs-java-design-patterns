/**
 * 
 */
package Modelo;

/**
 * @author myreli
 *
 */
public abstract class Concorrente {
	
	private String nome;
	private Double lance;
	
	public Concorrente(String nome) {
		this.setNome(nome);
	}
	
	public void notificacao(String mensagem) {
		System.out.println(this.nome + " agora sabe que:  " + mensagem);
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
	 * @return the lance
	 */
	public Double getLance() {
		return lance;
	}

	/**
	 * @param lance the lance to set
	 */
	public void setLance(Double lance) {
		this.lance = lance;
	}
	

}
