
package TOBA;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class NewCustomerServlet extends HttpServlet {

   
 @Override
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException
 {
     
     
     String url = "/New_customer.jsp";
     
     String action = request.getParameter("action");
     
     if (action == null) 
     {
        action = "submit";
     }
     
     if (action.equals("submit")) 
     {
        url = "New_customer.jsp";
     }
     
     else if (action.equals("add")) 
     {
         String firstName = request.getParameter("firstName");
         String lastName = request.getParameter("lastName");
         String phone = request.getParameter("phone");
         String address = request.getParameter("address");
         String city = request.getParameter("city");
         String state = request.getParameter("state");
         String zipCode = request.getParameter("zipCode");
         String email = request.getParameter("email");
         String userName = (request.getParameter("lastName") + request.getParameter("zipCode"));
         String passWord = "welcome1";
         
         
         User user = new User(firstName, lastName, phone, address, city, state, zipCode, email);
         
          String message;
     
     if (firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty() || address.isEmpty() || city.isEmpty() || state.isEmpty() || zipCode.isEmpty() || email.isEmpty()) 
     {
        message = "Please fill out the entire form.";
        request.setAttribute("message", message);
        request.getRequestDispatcher("/New_customer.jsp").forward(request, response);
        
     }
     
     else
     {
         response.sendRedirect("Success.html");
         
     }
     
     //add usr object to session scope
     
     //get session object
     HttpSession session = request.getSession();
     
     session.setAttribute("user", user);
     //set attributes 
     
     }//else if
     
     //forward request and response objects to specified URL
     
     getServletContext()
             .getRequestDispatcher(url)
             .forward(request, response);
    
     
     
     //response.sendRedirect("Success.html");
     
     //User user = (User)request.getAttribute("user");
     
 }

   
    
}
