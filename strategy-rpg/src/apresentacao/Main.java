/**
 * 
 */
package apresentacao;

import modelo.Arco;
import modelo.Cavaleiro;
import modelo.Espada;
import modelo.Faca;
import modelo.Machado;
import modelo.Rainha;
import modelo.Rei;

/**
 * @author myreli
 *
 */

public class Main {

	public static void main(String[] args) {
		
		System.out.println("|--------------------------------------|");
		System.out.println("|         Iniciando simulação...       |");		
		System.out.println("|--------------------------------------|");
		
		Machado machadao 	= new Machado();
		Espada anaklusmos 	= new Espada();
		Arco arcoKatniss	= new Arco();
		Faca facaDaCozinha	= new Faca();
		
		Rainha myreli 		= new Rainha("Myreli");
		Cavaleiro bernardo 	= new Cavaleiro("Bernardete");
		Rei inimigo			= new Rei("Babaca");
		Cavaleiro vigarista = new Cavaleiro("Vigarista");
		
		inimigo.pega(facaDaCozinha);
		
		inimigo.ataca(myreli);
		
		myreli.pega(arcoKatniss);
		
		myreli.ataca(bernardo);
		
		myreli.ataca(inimigo);
		
		bernardo.pega(anaklusmos);
		
		for (int i = 0; i < 10; i++) {
			bernardo.ataca(vigarista);
		}
		
		vigarista.pega(machadao);
		
		vigarista.ataca(myreli);
		
		inimigo.ataca(myreli);
		
		vigarista.ataca(myreli);
		
		while(bernardo.vivo()) inimigo.ataca(bernardo);
		
		myreli.pega(anaklusmos);
		
		while(vigarista.vivo()) myreli.ataca(vigarista);
		
		inimigo.ataca(myreli);
		
		inimigo.ataca(myreli);
		
		myreli.ataca(inimigo);
		
		while(inimigo.vivo()) myreli.ataca(inimigo);
	
		System.out.println("\n==> Resultados: ");
		
		System.out.println(bernardo.display() + " está morto. ==> " + !bernardo.vivo());
		System.out.println(inimigo.display() + " está morto. ==> " + !inimigo.vivo());
		System.out.println(vigarista.display() + " está morto. ==> " + !vigarista.vivo());
		System.out.println(myreli.display() + " está viva. ==> " + myreli.vivo());
		
		System.out.println("\n|--------------------------------------|");
		System.out.println("|          Simulação Finalizada        |");
		System.out.println("|--------------------------------------|");
		
	}

}
