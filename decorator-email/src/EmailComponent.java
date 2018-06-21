/**
 * @author myreli
 *
 */
public abstract class EmailComponent {

	protected String remetente;
	protected String destinatario;
	protected String assunto;
	protected String mensagem;
	
	/**
	 * @return the remetente
	 */
	public String getRemetente() {
		return remetente;
	}
	/**
	 * @param remetente the remetente to set
	 */
	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}
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

	/* 
	 * return Email object as string with its attributes
	 */
	@Override
	public String toString() {
		return "EmailComponent [remetente=" + remetente + ", destinatario=" + destinatario + ", assunto=" + assunto
				+ ", mensagem=" + mensagem + "]";
	}

}
