package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Myreli Borba
 */
public class Joystick {

	List<Command> jogos;
    Command buttons[] = new Command[2];

    public Joystick() {
    	this.jogos = new ArrayList<Command>();
    }
    
    public Joystick(int commands) {
		buttons = new Command[commands];
	}
    
    public void setCommand(int i, Command command) {
        this.buttons[i] = command;
    }
    
    public void addCommand(Command command) {
    	this.jogos.add(command);
    }
    
    public String pushA(Command c){
    	return c.executeA();
    }
    
    public String pushB(Command c){
        return c.executeB();
    }
    
    public String pushA(int i){
        return this.buttons[i].executeA();
    }
    
    public String pushB(int i){
        return this.buttons[i].executeB();
    }
    
}