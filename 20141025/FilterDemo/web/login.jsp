<%-- 
    Document   : login
    Created on : Oct 25, 2014, 12:19:36 PM
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
        <h1>Login page</h1>
        <form action="login" method='post'>
            Username: <input type='text' name='username'/> <br/>
            Password: <input type="password" name='password'/>
            <input type="submit" name='login' value='Login'/> &nbsp;
            <input type='reset' name='clear' value='Clear'/>
        </form>
    </body>
</html>
