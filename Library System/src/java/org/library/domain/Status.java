/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.library.domain;

/**
 *
 * @author raminorujov
 */
public enum Status {
    
    Active("a"),
    Deactive("d"),
    Unknown("u");
    
    private String value;
    
    Status(String value) {
        this.value = value;
    }
    
    public static Status fromValue(String value) {
        if(value != null) {
            if(value.equals("a")) {
                return Active;
            } else if(value.equals("d")) {
                return Deactive;
            }
        } 
        
        return Unknown;
    }
}
