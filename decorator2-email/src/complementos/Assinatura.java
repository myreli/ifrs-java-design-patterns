package complementos;

import mail.Mail;

/**
 *
 * @author myreli
 */
public class Assinatura extends MailDecorator {
    private Mail mail;

    public Assinatura(Mail mail) {
        this.mail = mail;
    }

    @Override
    public String getMensagem() {
        return this.mail.getMensagem() + "\n--\nAssinatura";
    }

}
