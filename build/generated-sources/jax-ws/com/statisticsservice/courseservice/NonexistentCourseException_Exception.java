
package com.statisticsservice.courseservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "NonexistentCourseException", targetNamespace = "http://courseservice.com/")
public class NonexistentCourseException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private NonexistentCourseException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public NonexistentCourseException_Exception(String message, NonexistentCourseException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public NonexistentCourseException_Exception(String message, NonexistentCourseException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.statisticsservice.courseservice.NonexistentCourseException
     */
    public NonexistentCourseException getFaultInfo() {
        return faultInfo;
    }

}
