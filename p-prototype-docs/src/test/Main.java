package test;

import model.Cliente;
import model.Documento;
import model.TIPO;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Testando docs...\n");
		
		Cliente c = new Cliente();
		
		Documento pdf = c.criarDocumento(TIPO.PDF);
		
		System.out.println(pdf.info());
		
		Documento asc = c.criarDocumento(TIPO.ASCII);
		
		System.out.println(asc.info());
		
		
		try {			
			Documento err = c.criarDocumento(TIPO.XML);
			
			System.out.println(err.info());
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException: " + e.getMessage());
		}
		
		System.out.println("\nfim dos testes.");
	}
}
