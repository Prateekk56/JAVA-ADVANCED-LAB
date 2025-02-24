

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProfileServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)  
			throws ServletException, IOException {  
		response.setContentType("text/html");  
		PrintWriter printWriter=response.getWriter();  

		HttpSession session=request.getSession(false);  
		if(session!=null){  
			String name=(String)session.getAttribute("username");  
			request.getRequestDispatcher("profile.html").include(request, response);
		}  
		else{  
			printWriter.print("Please login first");  
			request.getRequestDispatcher("login.html").include(request, response);  
		}  
		printWriter.close();  
	}  
}
