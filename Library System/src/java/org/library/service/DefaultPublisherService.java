/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.library.service;

import java.math.BigDecimal;
import java.util.List;
import org.library.dao.PublisherDao;
import org.library.dao.PublisherDaoJdbcImpl;
import org.library.domain.Publisher;

/**
 *
 * @author raminorujov
 */
public class DefaultPublisherService implements PublisherService {
    
    private PublisherDao publisherDao;
    
    public DefaultPublisherService(PublisherDao publisherDao) {
        this.publisherDao = publisherDao;
    }
    
    @Override
    public List<Publisher> getPublisherList() {
        return publisherDao.getPublisherList();
    }

    @Override
    public Publisher getPublisher(BigDecimal id) {
        return publisherDao.getPublisher(id);
    }

    @Override
    public Publisher savePublisher(Publisher publisher) {
        return publisherDao.savePublisher(publisher);
    }

    @Override
    public List<Publisher> findPublisherByName(String name) {
        return publisherDao.findPublisherByName(name);
    }
    
    
}
