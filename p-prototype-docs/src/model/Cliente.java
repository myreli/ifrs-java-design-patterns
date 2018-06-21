package model;

public class Cliente {

	PDF pdf 	= new PDF();
	ASCII ascii	= new ASCII();
	
	public Documento criarDocumento(TIPO tipo) {
		
		if(tipo == TIPO.PDF) {
			System.out.println("criando tipo pdf a partir da instancia default pdf...");
			return pdf.clone();
		} else if (tipo == TIPO.ASCII) {
			System.out.println("criando tipo pdf a partir da instancia default asc...");
			return ascii.clone();
		}
		
		throw new IllegalArgumentException(tipo.name() + " nao suportado. Atualmente so suporta tipos: PDF ou ASCII");
	}
	
}
