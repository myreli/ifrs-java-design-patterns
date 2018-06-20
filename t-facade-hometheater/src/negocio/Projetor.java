package negocio;

/**
 *
 * @author Myreli
 */
public class Projetor {
	
    private DvdPlayer dvdPlayer;
    
    public void on(){
        System.out.println("Ligando o Projetor");
    }
    public void off(){
        System.out.println("Desligando o Projetor");
    }
    public void tvModel(){
        System.out.println("Habilitando modo tv...");
    }
    public void wideScreenMode(){
        System.out.println("Habilitando tela Screen...");
    }

    public void setInput(DvdPlayer dvd) {
        this.dvdPlayer = dvd;
    }
}
