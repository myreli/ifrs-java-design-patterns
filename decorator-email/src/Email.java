/**
 * @author myreli
 *
 */
public class Email extends EmailComponent{

	/**
	 * @param remetente
	 * @param destinatario
	 * @param assunto
	 * @param mensagem
	 */
	public Email(String remetente, String destinatario, String assunto, String mensagem) {
		super.remetente = remetente;
		super.destinatario = destinatario;
		super.assunto = assunto;
		super.mensagem = mensagem;
	}
}
