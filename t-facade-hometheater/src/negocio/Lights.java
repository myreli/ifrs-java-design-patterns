package negocio;

/**
 *
 * @author Myreli
 */
public class Lights {
    
	private boolean on = false;
	
	public boolean isOn() {
		return on;
	}
	
    public void on() {
    	this.on = true;
        System.out.println("setting lights on...");
    }
    
    public void off() {
    	this.on = false;
        System.out.println("setting lights off...");
    }
    
    public void dim(int quantity) {
        System.out.println("dimming " + quantity + "% the lighst... ");
    }
}
