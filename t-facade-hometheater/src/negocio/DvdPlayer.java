package negocio;

/**
 *
 * @author Myreli
 */
public class DvdPlayer {
	
    private Amplifier 		amplifier;
	private PlayerStatus	status;
	private Sound			sound;
	private boolean			on;
	private boolean 		twoChannel;
    
    public DvdPlayer (){
    	this.on = false;
    	this.twoChannel = false;
    	this.sound = Sound.STEREO;
    }
    
    public boolean isOn() {
    	return on;
    }
    
    public boolean isTwoCHannel() {
    	return twoChannel;
    }
    
    public void on(){
    	this.on = true;
        System.out.println("setting DVD Player on...");
    }
    
    public void off(){
    	this.on = false;
        System.out.println("setting DVD Player off...");
    }

    public void eject(){
    	this.status = PlayerStatus.EMPTY;
        System.out.println("ejecting current DVD...");
    }
    
    public void pause(){
    	this.status = PlayerStatus.PAUSED;
        System.out.println("pausing DVD Player...");
    }
    
    public void play() {
    	this.status = PlayerStatus.PLAYING;
    	System.out.println("playing DVD Player...");
    }
    
    public void setSurroundAudio() {
    	this.sound = Sound.SURROUND;
    }
    
    public void setTwoChannelAudio() {
    	this.twoChannel = true;
    }
    
    public void stop(){
    	this.status = PlayerStatus.STOPPED;
        System.out.println("stopping DVD Player...");
    }
  
}
