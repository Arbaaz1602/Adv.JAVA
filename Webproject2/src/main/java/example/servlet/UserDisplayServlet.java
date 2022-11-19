package example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import example.bean.UserDetails;


@WebServlet("/doDisplay")
public class UserDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UserDisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//Obtaining the details
		Object obj = request.getAttribute("currentUserDetails");
		UserDetails ud = (UserDetails)obj;//TypeCasting done as obj is of Object type
		String fname = ud.getFirstName();
		String lname = ud.getLastName();
		LocalDate bdate = ud.getBirthDate();
		
		out.println("<h2>First Name: "+fname+"</h2>");
		out.println("<h2>Last Name: "+lname+"</h2>");
		out.println("<h2>Birth Date: "+bdate+"</h2>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
