/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.library.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.library.dao.PublisherDao;
import org.library.dao.PublisherDaoJdbcImpl;
import org.library.domain.Publisher;
import org.library.service.DefaultPublisherService;
import org.library.service.PublisherService;

/**
 *
 * @author raminorujov
 */
public class ControllerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String action = "";
        
        PublisherDao publisherDao = null;
        PublisherService publisherService = null;
        try  {
            if(request.getParameter("action") != null) {
                action = request.getParameter("action").trim();
            }
            
            if(publisherDao == null) {
                publisherDao = new PublisherDaoJdbcImpl();
            }
            
            if(publisherService == null) {
                publisherService = new DefaultPublisherService(publisherDao);
            }            
            
            if(action.equals("showPublisherList")) {
                List<Publisher> publisherList = publisherService.getPublisherList();
                request.setAttribute("publisherList", publisherList);
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/publisherList.jsp");
                rd.forward(request, response);
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
}
