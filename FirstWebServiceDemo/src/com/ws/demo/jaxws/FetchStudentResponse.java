
package com.ws.demo.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.1.8
 * Thu Dec 15 08:14:54 IST 2016
 * Generated source version: 3.1.8
 */

@XmlRootElement(name = "FetchStudentResponse", namespace = "http://com.demo.test")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FetchStudentResponse", namespace = "http://com.demo.test")

public class FetchStudentResponse {

    @XmlElement(name = "return")
    private com.ws.demo.Student _return;

    public com.ws.demo.Student getReturn() {
        return this._return;
    }

    public void setReturn(com.ws.demo.Student new_return)  {
        this._return = new_return;
    }

}
