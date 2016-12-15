/**
 * 
 */
package com.ws.demo;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author Shree
 *
 */

@HandlerChain(file = "handler-chain.xml")
@WebService(targetNamespace="http://com.demo.test")

public class AgeCalculator {
	
	@WebMethod(operationName="FetchStudent")
	
	public Student getStudent(){
		System.out.println("In Get Student");
		Student objStudent=new Student();
		objStudent.setId(1);
		objStudent.setName("Narasimha");
		objStudent.setSalary(1400.0);
		return objStudent;
	}
	

	
	
	@WebMethod(operationName = "sayHello", action = "urn:SayHello")
	@WebResult(name="SampleResponse")
	public String sayHello(@WebParam(name="providedText") String inputMessage){
		return "hello " + inputMessage;
	}
	
	@WebMethod(operationName = "getSum", action = "urn:GetSum")
	public int getSum(int a,int b){
		return a + b;
	}

}
