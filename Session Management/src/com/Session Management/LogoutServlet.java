

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  
			throws ServletException, IOException {  
		response.setContentType("text/html");  
		PrintWriter printWriter=response.getWriter();  

		request.getRequestDispatcher("logout.html").include(request, response);  

		HttpSession session=request.getSession();  
		session.invalidate();  

		printWriter.flush();
		printWriter.close();  
	}  
}
