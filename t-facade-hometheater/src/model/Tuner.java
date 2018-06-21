package model;

/**
 *
 * @author Myreli
 */
public class Tuner {

	private Amplifier amplifier;
    
	private boolean	  on;

    public void on(){
    	this.on = true;
    	System.out.println("setting tuner on...");
    }
    
    public void off(){
    	this.on = false;
    	System.out.println("setting tuner off...");
    }
    
    public void setAm(){
        System.out.println("switching to AM...");
    }
    public void setFm(){
        System.out.println("switching to FM...");
    }
    public void setFrequency(){
        System.out.println("setting frequency...");
    }
            
    
}
