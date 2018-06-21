package modelo;

public class Guerra extends Jogo {

	public Guerra(String nome) {
		super(nome);
	}

	public String atira() {
		return "gotcha";
	}
	
	public String esconde() {
		return "nao trab";
	}
	
}
