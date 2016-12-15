package com.ws.demo.handler;

import java.io.OutputStream;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.binding.soap.wsdl.extensions.SoapBody;

public class SOAPMessageHandler implements SOAPHandler<SOAPMessageContext> {

	@Override
	public void close(MessageContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean handleMessage(SOAPMessageContext smc) {

		Boolean isRequest = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		// for response message only, true for outbound messages, false for
		// inbound
		System.out.println("Is Response=" + isRequest);
		if (!isRequest) {

			
				SOAPMessage soapMsg = smc.getMessage();
				
				try {
					 SOAPMessage message = smc.getMessage();
	                  SOAPPart part = message.getSOAPPart();
	                  SOAPEnvelope envelope = part.getEnvelope();
	                  SOAPHeader header = envelope.getHeader();
	                  
	                  
	                  
	                  
					System.out.println("part=" + part);
					System.out.println("envelope=" + envelope);
				} catch (SOAPException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Soap Message=" + soapMsg);
				

			

		}

		return true;
	}

	@Override
	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

}
