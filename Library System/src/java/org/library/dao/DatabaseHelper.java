/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.library.dao;

import java.sql.Connection;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 *
 * @author raminorujov
 */
public class DatabaseHelper {
    
    public static Connection connect() throws Exception {
        Context ctx = new InitialContext();
        DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/librarydb");
        Connection connection = ds.getConnection();
        if (connection != null) {
            connection.setAutoCommit(false);
        } else {
            throw new Exception("connect() Connection is null " + new java.util.Date());
        }
        return connection;
    }
}
