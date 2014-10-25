/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessiondemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author raminorujov
 */
public class SessionInfo extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            HttpSession session = request.getSession();
     
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SessionInfo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SessionInfo at " + request.getContextPath() + "</h1>");
            
            out.println("Session id = " + session.getId() + "<br/>");
            out.println("Session create time = " + session.getCreationTime() + " / " + new java.util.Date(session.getCreationTime()) + "<br/>");
            out.println("Session last accessed time = "  + session.getLastAccessedTime() + " / " + new java.util.Date(session.getLastAccessedTime()) + "<br/>");
            out.println("Session max inactive interval " + session.getMaxInactiveInterval());
            
            out.println("<br/><br/>Session attributes <br/>");
            Enumeration<String> attributes = session.getAttributeNames();
            while(attributes.hasMoreElements()) {
                String name = attributes.nextElement();
                out.println(name + " = " + session.getAttribute(name) + "<br/>");
            }
            
            
            
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
