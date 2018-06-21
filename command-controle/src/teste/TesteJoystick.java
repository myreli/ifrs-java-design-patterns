package teste;

import modelo.Futebol;
import modelo.FutebolCommand;
import modelo.Guerra;
import modelo.GuerraCommand;
import modelo.Joystick;
import modelo.Luta;
import modelo.LutaCommand;
/**
 *
 * @author Myreli Borba
 */
public class TesteJoystick {

    public static void main(String[] args) {

        Joystick controle = new Joystick();
        
        LutaCommand luta 		= new LutaCommand(new Luta("Tekken"));
        FutebolCommand futebol  = new FutebolCommand(new Futebol("Fifa"));
        GuerraCommand guerra	= new GuerraCommand(new Guerra("COD"));
        
        controle.addCommand(luta);
        System.out.println(controle.pushA(luta));
        System.out.println(controle.pushB(luta));
        
        controle.addCommand(futebol);
        System.out.println(controle.pushA(futebol));
        System.out.println(controle.pushB(futebol));
        
        controle.addCommand(guerra);
        System.out.println(controle.pushA(guerra));
        System.out.println(controle.pushB(guerra));
        
        /*
        controle.setCommand(0, new LutaCommand(new Luta("Tekken")));
        System.out.println(controle.pushA(0));
        System.out.println(controle.pushB(0));
        
        controle.setCommand(1, new FutebolCommand(new Futebol("Fifa")));
        System.out.println(controle.pushA(1));
        System.out.println(controle.pushB(1));
        */
        //controle.setCommand(3, new GuerraCommand(new Guerra("COD")));
        
    }
    
}
