package mail;

/**
 *
 * @author myreli
 */
public abstract class Mail {
    
	protected String remetente;
    protected String destinatario;
    protected String assunto;
    protected String mensagem;
    
	/**
	 * @return the destinatario
	 */
	public String getDestinatario() {
		return destinatario;
	}

	/**
	 * @param destinatario the destinatario to set
	 */
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	/**
	 * @return the assunto
	 */
	public String getAssunto() {
		return assunto;
	}

	/**
	 * @param assunto the assunto to set
	 */
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	/**
	 * @return the mensagem
	 */
	public String getMensagem() {
		return mensagem;
	}

	/**
	 * @param mensagem the mensagem to set
	 */
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	/**
	 * @return the destinatario
	 */
	public String getRemetente() {
		return remetente;
	}

	/**
	 * @param destinatario the destinatario to set
	 */
	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

    
    
}
