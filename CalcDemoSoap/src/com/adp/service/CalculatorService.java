package com.adp.service;

import javax.annotation.Resource;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.WebFault;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.soap.MTOM;
@WebService(name="MyCalcService")
@WebFault(name = "portType",targetNamespace="http://com.test.exception/")
@SOAPBinding(style=Style.DOCUMENT,use=Use.LITERAL)

@MTOM
public class CalculatorService {

	@Resource
	WebServiceContext context;

	@WebMethod(exclude=true,action="SOAP_Fetc",operationName="calculateSumOperation")
	public int getSum(int a, int b) {

		return a + b;
	}

	@WebMethod
	public int getDiff(int a, int b) {

		return a - b;
	}
	
	@Oneway
	public void print(){
		System.out.println("test it");
	}

}
