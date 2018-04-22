<%-- 
    Document   : account_activity
    Created on : Apr 20, 2018, 9:51:40 PM
    Author     : Jensen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account Activity</title>
    </head>
    <body>
        <h1>Account Activity</h1>
        
        <c:if test = "${user != null}">
            <p>Welcome, ${sessionScope.user.firstName} ${sessionScope.user.lastName}</p>
        </c:if> 
        
        
        <c:if test = "${user == null}">
            <p>Not Logged In"</p>
        </c:if>    
    </body>
</html>
