/**
 * 
 */
package com.presentation;

import com.model.SMSSender;
import com.model.SMS;
import com.model.SMSException;
import com.model.ConcreteEnviadorSMS;
import com.model.ConcreteSMSSender;
import com.model.EnviadorSMS;
import com.model.EnviadorSMSAdapter;

/**
 * @author myreli
 *
 */
public class SMSAdapterTest {

	public static void main(String[] args) {
		
		SMS sms = new SMS();
		sms.setDestino("5553991709995");
		sms.setOrigem("5553981304503");
		sms.setTexto("bla bla bla bla bla bla bla.... Uma enorme mensagem que devera ser divida pela segunda API ao atingir 160 caracteres e ser distribuida em um array de mensagens ble1 ble2 ble3 ble4 ble5");
		
		ConcreteSMSSender smsSender	= new ConcreteSMSSender();
		ConcreteEnviadorSMS enviadorSMS = new ConcreteEnviadorSMS();
		
		SMSSender testAdapter 	= new EnviadorSMSAdapter(enviadorSMS);
		
		System.out.println("enviadorsms: ");
		
		String[] msgs = {"msg1", "msg2"};
		
		try {
			enviadorSMS.enviarSMS("destino", "origem", msgs);
		} catch (SMSException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\nsmssender: ");
		smsSender.sendSMS(sms);
		
		System.out.println("\nadapter: ");
		testAdapter.sendSMS(sms);
		
	}

	
}
