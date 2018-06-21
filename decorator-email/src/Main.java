/**
 * @author myreli
 *
 */
public class Main {

	public static void main(String[] args) {

		EmailComponent email = new Email("myreli-borba@hotmail.com", "igor.pereira@riogrande.ifrs.edu.br", 
				"E-mail Teste", "Conteúdo de teste"); 	 
		
		System.out.println("Sem decoradores: " + email.toString());
		
		email = new Assinatura(email, "Minha Assinatura.");
		
		System.out.println("Com assinatura: " + email.toString());
		
		email = new Criptografia(email);
		
		System.out.println("Com criptografia: " + email.toString());
	
	}
}
