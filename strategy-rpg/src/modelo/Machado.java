/**
 * 
 */
package modelo;

/**
 * @author myreli
 *
 */
public class Machado implements Arma {

	@Override
	public void display() {
		System.out.println("machadao");
		
	}

	@Override
	public int getPwr() {
		return 3;
	}

	@Override
	public boolean usa() {
		return true;
	}

}
