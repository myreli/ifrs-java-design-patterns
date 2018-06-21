/**
 * 
 */
package Apresentação;

import java.util.ArrayList;

import Modelo.Concorrente;
import Modelo.Eletronico;
import Modelo.Item;
import Modelo.Leiloeiro;
import Modelo.Magnata;
import Modelo.Milionario;
import Modelo.Penetra;

/**
 * @author myreli
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Leiloeiro 	marcio 		= new Leiloeiro("Márcio");

		Item 		tv 			= new Eletronico("Televisão", 200.0);
		Item 		algumaCoisa	= new Item("alguma coisa");
		
		Concorrente myreli 		= new Magnata("Myreli");
		Concorrente bernardo 	= new Milionario("Bernardo");
		Concorrente igor 		= new Penetra("Igor");
		
		ArrayList<Concorrente> concorrentes = new ArrayList<Concorrente>();

		concorrentes.add(myreli);
		concorrentes.add(bernardo);
		concorrentes.add(igor);
		
		marcio.add(tv);
		marcio.add(algumaCoisa);
		marcio.inicia(concorrentes);
		
		System.out.println("|---------- Leilão ----------|");
		
		marcio.leiloa(tv);
		
		marcio.recebeAposta(myreli, 400);
		
		marcio.recebeAposta(igor, 0);
		
		marcio.recebeAposta(bernardo, 800);
		
		marcio.recebeAposta(myreli, 1000);
		
		marcio.recebeAposta(bernardo, 0);
			
	}

}
