package email;

import mail.Mail;

/**
 *
 * @author myreli
 */
public class Email extends Mail {
    
    public Email() {
        super.destinatario = "destinatario";
        super.remetente = "remetente";
        super.assunto = "assunto";
        super.mensagem = "msg";
    }
    
    public Email(String destinatario, String assunto, String mensagem, String remetente) {
        super.destinatario = destinatario;
        super.remetente = remetente;
        super.assunto = assunto;
        super.mensagem = mensagem;
    }

}
