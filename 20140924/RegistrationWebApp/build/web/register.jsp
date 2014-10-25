<%-- 
    Document   : register
    Created on : Sep 24, 2014, 4:55:10 PM
    Author     : raminorujov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
        <h1>Please, enter your data!</h1>
        <form method="post" action="register">
            Name: <input type="text" name="name" /> <br/>
            Surname: <input type="text" name="surname"/> <br/>
            Gender: <input type="radio" name="gender" value="male">Male</input> &nbsp;
                    <input type="radio" name="gender" value="female">Female</input> <br/>
            Citizenship:
            <select name="citizenship">
                <option value="0" selected="1">Azerbaijan</option>
                <option value="1">Turkey</option>
                <option value="2">Russia</option>
                <option value="3">USA</option>
                <option value="4">Germany</option>
                <option value="5">UK</option>
                <option value="6">Georgia</option>
                <option value="7">Iran</option>
                <option value="8">Italy</option>
                <option value="9">Austria</option>
                <option value="10">Egypt</option>
            </select>
             <br/>
            
            Visited countries:
            <select name="countries" multiple="1" size="10">
                <option value="0">Azerbaijan</option>
                <option value="1">Turkey</option>
                <option value="2">Russia</option>
                <option value="3">USA</option>
                <option value="4">Germany</option>
                <option value="5">UK</option>
                <option value="6">Georgia</option>
                <option value="7">Iran</option>
                <option value="8">Italy</option>
                <option value="9">Austria</option>
                <option value="10">Egypt</option>
            </select>
            
            <hr/>
            <input type="submit" name="register" value="Register"/> &nbsp;
            <input type="reset" name="clear" value="Clear"/>            
        </form>
    </body>
</html>
