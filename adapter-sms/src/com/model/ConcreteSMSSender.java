/**
 * 
 */
package com.model;

/**
 * @author myreli
 *
 */
public class ConcreteSMSSender implements SMSSender {

	/* (non-Javadoc)
	 * @see com.model.SMSSender#sendSMS(com.model.SMS)
	 */
	@Override
	public boolean sendSMS(SMS sms) {
		System.out.println("Enviando SMS pelo SMSSender...");
		System.out.println("origem: " + sms.getOrigem() + "\ndestino: " + sms.getDestino() + "\ntexto: " + sms.getTexto());
		return false;
	}
	
}
