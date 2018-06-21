package apresentacao;

import modelo.DispositivoA;
import modelo.DispositivoACommand;
import modelo.DispositivoB;
import modelo.DispositivoBCommand;
import modelo.PlacaArduino;

/**
 *
 * @author Myreli Borba
 */
public class Main {

    public static void main(String[] args) {
    	
    	// command

        PlacaArduino teste = new PlacaArduino();
        
        DispositivoACommand a   = new DispositivoACommand(new DispositivoA("A"));
        DispositivoBCommand b	= new DispositivoBCommand(new DispositivoB("B"));
        
        teste.addCommand(a);
        System.out.println(teste.pressMainButton(a));
        
        teste.addCommand(b);
        System.out.println(teste.pressMainButton(b));
        
    }
    
}
