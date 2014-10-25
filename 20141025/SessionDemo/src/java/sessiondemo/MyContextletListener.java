/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessiondemo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author raminorujov
 */
public class MyContextletListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("My application is initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("My application is destroyed");
    }
}
