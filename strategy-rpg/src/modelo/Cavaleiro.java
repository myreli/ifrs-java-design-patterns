/**
 * 
 */
package modelo;

/**
 * @author myreli
 *
 */
public class Cavaleiro extends Personagem {

	/**
	 * @param nome
	 */
	public Cavaleiro(String nome) {
		super(nome);
	}

	@Override
	protected void aprende() {
		this.xp++;
	}

}
