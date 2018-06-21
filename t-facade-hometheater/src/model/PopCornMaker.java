package model;

/**
 *
 * @author Myreli
 */
public class PopCornMaker {
    
	private boolean on = false;
	
	public boolean isOn() {
		return on;
	}
	
    public void on() {
    	this.on = true;
        System.out.println("starting popcorn machine...");
    }
    
    public void off() {
    	this.on = false;
        System.out.println("shutting popcorn machine down...");
    }
    
    public void pop() {
        System.out.println("popping pop corn...");
    }
    
}
