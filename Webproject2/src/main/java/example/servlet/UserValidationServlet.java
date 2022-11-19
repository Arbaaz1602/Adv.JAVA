package example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import example.bean.User;
import example.bean.UserDetails;
import example.bean.UserValidationImpl;
//import example.beans.UserValidator;


@WebServlet("/doValidateUser")
public class UserValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UserValidationServlet() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//fetching request specific parameters uid and pwd
		
		//This is done using getParameter(String)------>(name of parameter) fromhttpServlerRequest
		String CurrentUsername= request.getParameter("uid");
		String currentPassword = request.getParameter("pwd");
		
		//populating an object of type user based upon username and password
		User currentUser = new User(CurrentUsername,currentPassword);
		
		//passign this object to validator
		
		UserDetails foundUserDeatils = UserValidationImpl.getValidatedUser(currentUser);
		
		
		RequestDispatcher dispatcher = null;
		if(foundUserDeatils!=null) {//VALID
			//Obtail the requestDispatcher for the servlet having url (doDisplay)
			
			dispatcher = request.getRequestDispatcher("doDisplay");
			
			//Attaching the user details which are found to the current request
			request.setAttribute("currentUserDetails", foundUserDeatils);
			//now forwarding the request
			dispatcher.forward(request, response);
			
		}
		else
		{
			//if invalid obtain requestDispatcher for input html page
			dispatcher = request.getRequestDispatcher("login.html");
			out.println("<h2>invalid Username or Password.Try again</h2>");
			//now include the login.html;
			dispatcher.include(request, response);
			
		
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
