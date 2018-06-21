/**
 * 
 */
package complementos;

import mail.Mail;

/**
 * @author myreli
 *
 */
public class Criptografia extends MailDecorator {
    private Mail mail;

    public Criptografia(Mail mail) {
        this.mail = mail;
    }

    @Override
    public String getMensagem() {
        return criptografa(this.mail.getMensagem());
    }

    public String criptografa(String s) {
    	String cript = "";
    	
    	for (int i = 0; i < s.length(); i++) {
			cript += (char)(s.charAt(i) + 3);
		}
    	
    	return cript;
    }
    
}
