/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessiondemo;

import java.util.Date;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Web application lifecycle listener.
 *
 * @author raminorujov
 */
@WebListener()
public class MySessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("New session is created ") ;
        System.out.println("Session id = "  + se.getSession().getId());
        System.out.println("Session create time = " + new Date(se.getSession().getCreationTime()));
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Session " + se.getSession().getId() + "is destroyed ") ;        
        System.out.println("Session last access time = " + new Date(se.getSession().getLastAccessedTime()));
    }
}
