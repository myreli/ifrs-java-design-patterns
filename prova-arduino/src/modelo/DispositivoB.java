package modelo;

public class DispositivoB extends Arduino {

	public DispositivoB(String nome) {
		super(nome);
	}

	public String hibernate() {
		return "hibernando...";
	}
}
