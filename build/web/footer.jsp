<%-- 
    Document   : footer
    Created on : Apr 20, 2018, 11:01:42 PM
    Author     : Jensen
--%>
<%@ page import="java.util.GregorianCalendar, java.util.Calendar" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Footer</title>
    </head>
    <body>
        <%
            GregorianCalendar currentDate = new GregorianCalendar();
            int currentYear = currentDate.get(Calendar.YEAR);
        %>
        
        <p>&copy; Copyright <%= currentYear %> Jensen Blair</p>
    </body>
</html>
