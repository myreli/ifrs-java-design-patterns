package teste;

import java.util.Calendar;

import modelo.Viagem;

public class Main {

	public static void main(String[] args) {
		
		
		Viagem viagem = new Viagem.Builder(Calendar.getInstance(), Calendar.getInstance(), "12398712738").onibus().dinheiro().build();
		
        System.out.println(viagem);
		
	}
	
}
