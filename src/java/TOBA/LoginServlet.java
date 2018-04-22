/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TOBA;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jensen
 */
public class LoginServlet extends HttpServlet {

   
 @Override
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException
 {
     
     String url = "/Login.html";
     
     String action = request.getParameter("action");
     
     if (action == null) 
     {
        action = "login";
        
     }
     
     if (action.equals("login")) 
     {
        url = "/Login.html";
     }
     String userName = request.getParameter("userName");
     String password = request.getParameter("password");
     
     if (userName.equals("jsmith@toba.com") && password.equals("letmein")) 
     {
         response.sendRedirect("Success.html");
     }
     
     else
     {
        response.sendRedirect("Login_failure.html");
     }
     
     
 }
}
