package admin.login.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import admin.login.bean.UserBean;
import admin.login.database.LoginDao;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {


	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
	//-----------------THIS CODE IS TO AVOID ACCESING PAGE WITHOUT LOGING IN	
//		if(session.getAttribute("username") == null)
//		{response.sendRedirect("Index.jsp");}
//		
//		if(session.getAttribute("password") == null)
//		{	response.sendRedirect("Index.jsp");}
		
	//CODE TO AVOID CACHING
		response.setHeader("cache-control",  "no-cache, no-store, must-validate");
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		UserBean beanObject = new UserBean();
		beanObject.setUsername(username);
		beanObject.setPassword(password);
		
		
		LoginDao daoObject = new LoginDao();
		try {
			if(daoObject.validate(beanObject))
			{
				System.out.println("Condition is true");
				UserBean userDetails = daoObject.getUserDetails(beanObject);
				
				request.setAttribute("UserDeatils", userDetails);
				RequestDispatcher dispatcher = request.getRequestDispatcher("UserInfo");
				dispatcher.forward(request, response);
				
				
				
			}
			else
			{
				
				response.sendRedirect("Index.jsp");
			}
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
