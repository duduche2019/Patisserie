package web;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import org.eclipse.jetty.server.ResponseWriter;


@WebServlet(name= "Hello",urlPatterns= "/hello")
public class HelloWeb extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Boulangerie Flo</h1>");
		writer.println("<a href='http://www.google.com'>lien de ma boulangerie</a>");
		
	}
	
	
}
