package model;

/**
 *
 * @author Myreli
 */
public class CdPlayer {
    
	private Amplifier 		amplifier;
	private PlayerStatus	status;
	private boolean			on;
    
    public CdPlayer (){
    	this.on = false;
    }
    
    public boolean isOn() {
    	return on;
    }
    
    public void on(){
    	this.on = true;
        System.out.println("setting CD Player on...");
    }
    
    public void off(){
    	this.on = false;
        System.out.println("setting CD Player off...");
    }

    public void eject(){
    	this.status = PlayerStatus.EMPTY;
        System.out.println("ejecting current CD...");
    }
    
    public void pause(){
    	this.status = PlayerStatus.PAUSED;
        System.out.println("pausing CD Player...");
    }
    
    public void play() {
    	this.status = PlayerStatus.PLAYING;
    	System.out.println("playing CD Player...");
    }
    
    public void stop(){
    	this.status = PlayerStatus.STOPPED;
        System.out.println("stopping CD Player...");
    }
            
    
}
