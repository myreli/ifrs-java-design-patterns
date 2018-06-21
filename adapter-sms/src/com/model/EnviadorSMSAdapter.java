/**
 * 
 */
package com.model;

/**
 * @author myreli
 *
 */
public class EnviadorSMSAdapter implements SMSSender {

	EnviadorSMS enviadorSMS;
	
	/**
	 * @param enviador
	 */
	public EnviadorSMSAdapter(EnviadorSMS enviador) {
		this.enviadorSMS = enviador;
	}

	/* (non-Javadoc)
	 * @see com.model.SMSSender#sendSMS(com.model.SMS)
	 */
	@Override
	public boolean sendSMS(SMS sms) {
		if (sms.getTexto() == null || sms.getTexto().isEmpty()) return false;
		
        String str  = sms.getTexto().replaceAll("(.{160})", "$1§");
        System.out.println(str);
        String[] msgs = str.split("\\§");
		try {
			enviadorSMS.enviarSMS(sms.getDestino(), sms.getOrigem(), msgs);
			return true;
			
		} catch (SMSException e) {
			return false;
			
		}
	}
	
}
