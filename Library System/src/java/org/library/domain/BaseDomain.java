/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.library.domain;

import java.math.BigDecimal;

/**
 *
 * @author raminorujov
 */
public class BaseDomain {
    protected BigDecimal id;
    protected Status status;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BaseDomain{" + "id=" + id + ", status=" + status + '}';
    }
    
    
}
