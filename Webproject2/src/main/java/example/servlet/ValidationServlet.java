package example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import example.bean.User;
import example.beans.UserValidator;

/**
 * Servlet implementation class ValidationServlet
 */
@WebServlet(name = "validate", urlPatterns = { "/doValidate" })
public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
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
		boolean valid = UserValidator.isValid(currentUser);
		if(valid)
		out.println("<h3>Welcome Shabnam</h3>");
		
		else
			out.println("<h3>You are not Shabnam</h3>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
