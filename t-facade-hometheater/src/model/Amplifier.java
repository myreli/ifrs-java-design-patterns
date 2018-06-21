package model;

/**
 *
 * @author Myreli Borba
 */
public class Amplifier {
	
    private Tuner 		tuner;
    private DvdPlayer 	dvd;
    private CdPlayer 	cd;
    private Sound 		sound;
    private int 		volume;
    private boolean		on;

    public void on(){
    	this.on = true;
    	System.out.println("setting amplifier on...");
    }
    
    public void off(){
    	this.on = false;
    	System.out.println("setting amplifier off...");
    }
    
    public boolean isOn() {
    	return on;
    }

    public void setCd(CdPlayer cd) {
        this.cd = cd;
    }

    public void setStereoSound(){
    	this.sound = Sound.STEREO;
    }

    public void setSurroundSound(){
    	this.sound = Sound.SURROUND;
    }
    
    public void setTuner(Tuner tuner) {
    	this.tuner = tuner;
    }

    public void setVolume(int volume){
    	this.volume = volume;
    }

	public void setDvd(DvdPlayer dvd) {
		this.dvd = dvd;
	}
    
}
