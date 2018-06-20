package apresentacao;

import negocio.Amplifier;
import negocio.DvdPlayer;
import negocio.HomeTheaterFacade;
import negocio.Lights;
import negocio.PopCornMaker;
import negocio.Projetor;
import negocio.Tela;

/**
 *
 * @author Myreli Borba
 */
public class Main {

    public static void main(String[] args) {
        
    	DvdPlayer dvdPlayer = new DvdPlayer();
        PopCornMaker popper = new PopCornMaker();
        Lights lights = new Lights();
        Tela screen =  new Tela();
        Amplifier amp = new Amplifier();
        Projetor projector = new Projetor();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(popper, lights, screen, amp, dvdPlayer, projector);
        homeTheaterFacade.watchMovie("Matrix..");
        
        System.out.println("------------------");
        
        homeTheaterFacade.endMovie();
    }
    
}
