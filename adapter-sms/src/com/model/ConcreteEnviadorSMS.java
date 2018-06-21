/**
 * 
 */
package com.model;

/**
 * @author myreli
 *
 */
public class ConcreteEnviadorSMS implements EnviadorSMS {


	/* (non-Javadoc)
	 * @see com.model.EnviadorSMS#enviarSMS(java.lang.String, java.lang.String, java.lang.String[])
	 */
	@Override
	public void enviarSMS(String destino, String origem, String[] msgs) throws SMSException {
		System.out.println("Enviando mensagem na nova API");
		System.out.println("destino: " + destino);
		System.out.println("origem: " + origem);
		System.out.println("mensagens: ");
		for (int i = 0; i < msgs.length; i++) {
			System.out.println(i + ": " + msgs[i]);
		}
		
	}

}
