package test;

import model.Amplifier;
import model.DvdPlayer;
import model.HomeTheaterFacade;
import model.Lights;
import model.PopCornMaker;
import model.Projector;
import model.Screen;

/**
 *
 * @author Myreli Borba
 */
public class Main {

    public static void main(String[] args) {
        
        PopCornMaker popper = new PopCornMaker();
        Lights lights 		= new Lights();
        Screen screen 		= new Screen();
        Amplifier amplifier = new Amplifier();
        Projector projector = new Projector();
        DvdPlayer dvdPlayer = new DvdPlayer();

        System.out.println("Testing Facade design pattern\n\n");
        
        HomeTheaterFacade ht = new HomeTheaterFacade(popper, lights, screen, amplifier, dvdPlayer, projector);
        
        ht.watchMovie("The Source Code...");
        
        ht.endMovie();
        
        System.out.println("\n\nEnd of test.");
    }
    
}
