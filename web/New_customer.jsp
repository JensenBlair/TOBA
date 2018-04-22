<%-- 
    Document   : New_customer
    Created on : Apr 5, 2018, 4:59:43 PM
    Author     : Jensen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Customer</title>
    </head>
    <body>
        <form method="post" action="NewCustomerServlet">
            
            <input type="hidden" name="action" value="add">
            
            First Name:<input type="text" name="firstName" value="${User.firstName}"/><br>
            Last Name:<input type="text" name="lastName" value="${User.lastName}"/><br>
            Phone #:<input type="text" name="phone" value="${User.phone}"/><br>
            Address:<input type="text" name="address" value="${User.address}"/><br>
            City:<input type="text" name="city" value="${User.city}"/><br>
            State:<input type="text" name="state" value="${User.state}"/><br>
            Zip Code:<input type="text" name="zipCode" value="${User.zipCode}"/><br>
            EMail:<input type="text" name="email" value="${User.email}"/><br>
            
            <input type="submit" value="Register Now"/>
        </form>
        
        <p>${message}</p>
    </body>
</html>
