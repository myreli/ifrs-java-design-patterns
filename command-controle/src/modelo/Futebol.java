package modelo;

/**
 *
 * @author Myreli Borba
 */
public class Futebol extends Jogo {
    
	private Integer gols;
	private String placar;

	public Futebol(String nome) {
		super(nome);
	}
    
	
    public Integer getGols() {
		return gols;
	}
	public void setGols(Integer gols) {
		this.gols = gols;
	}
	public String getPlacar() {
		return placar;
	}
	public void setPlacar(String placar) {
		this.placar = placar;
	}

	public String chutar(){
        return "chutando a bola (ou o ar)";
    }
    
    public String passar(){
        return "fazendo um passinho do romano";
    }
    
}
