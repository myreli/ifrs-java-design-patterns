/**
 * @author myreli
 *
 */
public class Assinatura extends EmailDecorator {

	private EmailComponent email;
	private String assinatura;

    public Assinatura(EmailComponent emailComponent, String assinatura) {
        this.email = emailComponent;
        this.assinatura = assinatura;
    }

    @Override
    public String getMensagem() {
        return this.email.getMensagem() + "\n--\n " + this.assinatura;
    }
       
}
