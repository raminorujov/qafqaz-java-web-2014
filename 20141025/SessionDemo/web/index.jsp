<%-- 
    Document   : index
    Created on : Oct 25, 2014, 9:51:49 AM
    Author     : raminorujov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <a href="SessionInfo">Session Info</a> <br/>
        <a href='<%=response.encodeURL("SessionInfo")%>'>Session Info</a> <br/>
                       
        <a href="DataServlet">Add data into session</a> <br/>
        <a href='<%=response.encodeURL("DataServlet")%>'>Add data into session</a> <br/>
    </body>
</html>
