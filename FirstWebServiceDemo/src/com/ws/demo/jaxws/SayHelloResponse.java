
package com.ws.demo.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.1.8
 * Thu Dec 15 07:21:34 IST 2016
 * Generated source version: 3.1.8
 */

@XmlRootElement(name = "sayHelloResponse", namespace = "http://demo.ws.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sayHelloResponse", namespace = "http://demo.ws.com/")

public class SayHelloResponse {

    @XmlElement(name = "SampleResponse")
    private java.lang.String SampleResponse;

    public java.lang.String getSampleResponse() {
        return this.SampleResponse;
    }

    public void setSampleResponse(java.lang.String newSampleResponse)  {
        this.SampleResponse = newSampleResponse;
    }

}

