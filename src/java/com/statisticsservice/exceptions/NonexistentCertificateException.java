/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.statisticsservice.exceptions;

/**
 *
 * @author bjw
 */
public class NonexistentCertificateException extends Exception {
    private String certificateCode;
    
    public NonexistentCertificateException(String certificateCode) {
        this.certificateCode = certificateCode;
    }
    
    public String getCertificateCode() {
        return this.certificateCode;
    }
    
    @Override
    public String getMessage() {
        return "Certificate does not exist: " + this.certificateCode;
    }
}
