/**
 * 
 */
package modelo;

/**
 * @author myreli
 *
 */
public class Arco implements Arma {
	
	private int pwr = 5;
	private int municao = 10;
	
	@Override
	public void display() {
		System.out.println("arco e flecha");
	}

	@Override
	public int getPwr() {
		return pwr;
	}

	@Override
	public boolean usa() {
		if (municao <= 0) return false;
		
		municao--;
		return true;
	}
	
	public void carrega() {
		municao++;
	}

}
