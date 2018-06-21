import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

/**
 * 
 */

/**
 * @author myreli
 *
 */
public class MailSender {

	private EmailComponent email;
	private String hostName;
	private String smtpPort;
	private String autenticatorMail;
	private String autenticatorPsw;
	
	public MailSender(EmailComponent email) {
		this.email = email;
	}
    
    public void send() {
    	
    	
        try {
        	HtmlEmail mailer = new HtmlEmail();
            mailer.setHostName("smtp.googlemail.com");
            mailer.setSmtpPort(465);
            //mailer.setAuthenticator(new DefaultAuthenticator("nao.responda.ifrs.riogrande@gmail.com", "senha"));
            mailer.setSSLOnConnect(true);
			mailer.setFrom(email.getRemetente());
			mailer.setSubject(this.email.getAssunto());
	        mailer.setHtmlMsg(this.email.getMensagem());
	        mailer.addTo(email.getDestinatario());
	        mailer.send();
		} catch (EmailException e) {
			e.printStackTrace();
		}
    	
    }
	
}
