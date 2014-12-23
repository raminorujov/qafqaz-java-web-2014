/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.library.service;

import java.math.BigDecimal;
import java.util.List;
import org.library.domain.Publisher;

/**
 *
 * @author raminorujov
 */
public interface PublisherService {
    List<Publisher> getPublisherList();
    Publisher getPublisher(BigDecimal id);
    Publisher savePublisher(Publisher publisher);
    List<Publisher> findPublisherByName(String name);
}
