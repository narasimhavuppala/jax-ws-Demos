
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

@XmlRootElement(name = "sayHello", namespace = "http://demo.ws.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sayHello", namespace = "http://demo.ws.com/")

public class SayHello {

    @XmlElement(name = "providedText")
    private java.lang.String providedText;

    public java.lang.String getProvidedText() {
        return this.providedText;
    }

    public void setProvidedText(java.lang.String newProvidedText)  {
        this.providedText = newProvidedText;
    }

}
