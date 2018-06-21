/**
 * 
 */
package modelo;

/**
 * @author myreli
 *
 */
public class Faca implements Arma {

	private int pwr = 2;
	
	@Override
	public void display() {
		System.out.println("faca de cozinha");
		
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
