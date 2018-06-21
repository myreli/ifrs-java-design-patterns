package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Myreli Borba
 */
public class PlacaArduino {

	List<Command> jogos;

    public PlacaArduino() {
    	this.jogos = new ArrayList<Command>();
    }
    
    public void addCommand(Command command) {
    	this.jogos.add(command);
    }
    
    public String pressMainButton(Command c){
    	return c.execute();
    }
}