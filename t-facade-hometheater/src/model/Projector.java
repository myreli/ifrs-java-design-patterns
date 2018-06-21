package model;

/**
 *
 * @author Myreli
 */
public class Projector {
	
    private DvdPlayer dvdPlayer;
    
    private boolean	  on;

    public void on(){
    	this.on = true;
    	System.out.println("setting projector on...");
    }
    
    public void off(){
    	this.on = false;
    	System.out.println("setting projector off...");
    }

    public void tvMode(){
        System.out.println("switching to tv mode...");
    }
    public void wideScreenMode(){
        System.out.println("setting to wide screen");
    }

    public void setInput(DvdPlayer dvd) {
        this.dvdPlayer = dvd;
    }
}
