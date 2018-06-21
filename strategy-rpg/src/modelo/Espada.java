/**
 * 
 */
package modelo;

/**
 * @author myreli
 *
 */
public class Espada implements Arma {

	private int pwr = 5;
	
	
	@Override
	public void display() {
		System.out.println("super espada");
	}

	@Override
	public int getPwr() {
		return pwr;
	}

	@Override
	public boolean usa() {
		return true;
	}

}
