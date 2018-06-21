package modelo;

/**
 *
 * @author Myreli Borba
 */
public class Luta extends Jogo {
	
    private Integer golpes;

    public Luta(String nome) {
		super(nome);
		setGolpes(0);
	}

	public Integer getGolpes() {
		return golpes;
	}

	public void setGolpes(Integer golpes) {
		this.golpes = golpes;
	}
	
	public String soca() {
		golpes++;
		return "dando um soco";
	}
	
	public String chuta() {
		golpes++;
		return "dando um chute";
	}
    
}