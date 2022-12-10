package admin.login.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.login.bean.UserBean;


@WebServlet("/UserInfo")
public class SuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SuccessServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
	UserBean user = (UserBean)request.getAttribute("UserDeatils");
		
		out.print("<h1>Hello from Success</h1>");
		out.print("<h3>First Name: "+user.getFirstName()+"</h3>");
		out.print("<h3>Last Name: "+user.getLastName()+"</h3>");
		out.print("<h3>Age: "+user.getAge()+"</h3>");
		out.print("<h3>City: "+user.getCity()+"</h3>");
		
		
	}

}
