/**
 * @author myreli
 *
 */
public class Criptografia extends EmailDecorator {

	private EmailComponent email;

    public Criptografia(EmailComponent email) {
        this.email = email;
    }

    @Override
    public String getMensagem() {
        return criptografa(this.email.getMensagem());
    }
    
    private String criptografa(String texto) {
    	String cript = "";
    	
    	for (int i = 0; i < texto.length(); i++) {
			cript += texto.charAt(i) + 5;
		}
    	
    	return cript;
    }
	
}