package apresentacao;

import complementos.Assinatura;
import complementos.Criptografia;
import email.Email;
import mail.Mail;

/**
 *
 * @author myreli
 */
public class Main {

    public static void main(String[] args) {
        
    	System.out.println("Sem decoradores: ");
    	
        Mail email = new Email();
        System.out.println("Corpo: " + email.getMensagem());
        
        System.out.println("\n\nCom decoradores: -> Assinatura");
        
        email = new Assinatura(email);
        System.out.println("Corpo: " + email.getMensagem());
     
        System.out.println("\n\nCom decoradores: -> Criptografia + Ass");
        
        email = new Criptografia(email);
        System.out.println("Corpo: " + email.getMensagem());
        
    }
    
}
