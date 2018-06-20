package negocio;

/**
 *
 * @author Myreli
 */
public class HomeTheaterFacade {

    private PopCornMaker popper;
    private Lights lights;
    private Tela screen;
    private Amplifier amp;
    private DvdPlayer dvd;
    private Projetor projector;

    public HomeTheaterFacade(PopCornMaker popper, Lights lights, Tela screen, Amplifier amp, DvdPlayer dvd, Projetor projector) {
        this.popper = popper;
        this.lights = lights;
        this.screen = screen;
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
    }

    public void watchMovie(String movie) {
        // Liga a pipoqueira e ativa a prod. de pipocas
        popper.on();
        popper.pop();
        
        // Atenua as luzes para 10%
        lights.dim(10);
        
        // Baixa a tela...
        screen.down();
        
        // Liga o projetor e ativa o modo wide-screen para o filme
        projector.on();
        projector.setInput(dvd);
        projector.wideScreenMode();
        
        // Liga o amplificador, configura-o para DVD, coloca-o em modosurround e ajusta o volume para 5...
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        
        // Liga o DVD Player ....e FINALMENTE, reproduz o filme!!!
        dvd.on();
        dvd.play();
    }
    
    public void endMovie(){
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }

}
