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
public class Publisher extends BaseDomain {
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Publisher{" + "id = " + id + ", name=" + name + '}';
    }        
    
}
