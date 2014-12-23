/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.library.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.library.domain.Publisher;
import org.library.domain.Status;
import org.library.utility.JdbcUtil;

/**
 *
 * @author raminorujov
 */
public class PublisherDaoJdbcImpl implements PublisherDao {

    @Override
    public List<Publisher> getPublisherList() {
        List<Publisher> publisherList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Publisher p = null;
        
        try {
            connection = DatabaseHelper.connect();
            String sql = "select id, name, status from publisher order by id";
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                p = new Publisher();
                p.setId(rs.getBigDecimal("id"));
                p.setName(rs.getString("name"));
                p.setStatus(Status.fromValue(rs.getString("status")));
                publisherList.add(p);
            }
        } catch(Exception e) {
            e.printStackTrace();
            
        } finally {
            JdbcUtil.close(rs, ps, connection);
        }
        
        return publisherList;
        
    }

    @Override
    public Publisher getPublisher(BigDecimal id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Publisher savePublisher(Publisher publisher) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Publisher> findPublisherByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
