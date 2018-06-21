package modelo;

/**
 *
 * @author Myreli Borba
 */
public class DispositivoA extends Arduino {
   
	public DispositivoA(String nome) {
		super(nome);
	}

	public String ligar(){
        return "ligando dipositivo A";
    }
    
    public String desaligar(){
        return "desligando dispositivo A";
    }
}
