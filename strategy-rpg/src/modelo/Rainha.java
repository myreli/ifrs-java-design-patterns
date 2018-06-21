/**
 * 
 */
package modelo;

/**
 * @author myreli
 *
 */
public class Rainha extends Personagem {

	public Rainha(String nome) {
		super(nome);
	}
	
	@Override
	protected void aprende() {
		this.xp += 10;
		evolui();
	}

}
