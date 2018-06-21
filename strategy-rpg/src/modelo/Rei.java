/**
 * 
 */
package modelo;

/**
 * @author myreli
 *
 */
public class Rei extends Personagem {

	
	/**
	 * @param nome
	 */
	public Rei(String nome) {
		super(nome);
	}

	@Override
	protected void aprende() {
		this.xp += 2;
	}

	
}
