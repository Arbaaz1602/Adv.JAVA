package admin.login.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.login.bean.UserBean;
import admin.login.database.LoginDao;


@WebServlet("/newLogin")
public class newLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public newLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setHeader("cache-control",  "no-cache, no-store, must-validate");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String userName =  request.getParameter("username");
		String password = request.getParameter("password");
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		int age = Integer.parseInt(request.getParameter("age"));
		String city = request.getParameter("city");
		
		UserBean user = new UserBean();
		user.setUsername(userName);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setAge(age);
		user.setCity(city);
		
		LoginDao daoObject = new LoginDao();
		try {
			int count = daoObject.EnterNewUser(user);
			
			if(count==1) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("loginSuccess.jsp");
				dispatcher.forward(request, response);
			}
				
			
				
			
		} catch (SQLException e) {
			
			out.print("<h3>Invalid Input</h3>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("Index.jsp");
			dispatcher.forward(request, response);
		}
		
		
	}

}
