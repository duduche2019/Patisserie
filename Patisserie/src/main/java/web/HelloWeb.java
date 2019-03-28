package web;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import org.eclipse.jetty.server.ResponseWriter;


@WebServlet(name= "Hello",urlPatterns= "/hello")
public class HelloWeb extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
		resp.getWriter().println("Hello");
	}
	
	
}
