package example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HitCounterServlet
 */
@WebServlet("/HitCounter")
public class HitCounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HitCounterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//Obtaining the session for this client
		HttpSession currentSession = request.getSession();
		Integer count = 0;
		
	if(currentSession.isNew()) 
			count = 1;			
		
		else {
			//Obtaining the existing value of hitCount
			count = (Integer)currentSession.getAttribute("hitCount");
			
			count++;
		}
		currentSession.setAttribute("hitCount", count);
		out.println("<h1>Hit Count: " + count + "</h1>");
		//Obtaining RequestDispatcher to include counter.html
		RequestDispatcher dispatcher = request.getRequestDispatcher("counter.html");
		dispatcher.include(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
