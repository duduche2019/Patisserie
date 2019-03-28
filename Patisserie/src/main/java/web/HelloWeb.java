package web;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import org.eclipse.jetty.server.ResponseWriter;


@WebServlet(name= "Hello",urlPatterns= "/hello")
public class HelloWeb extends HttpServlet{
	
	private ArrayList<String> users ;
	
	
	@Override
	public void init() throws ServletException {
		super.init();
		users= new ArrayList<String>();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		RequestDispatcher view = req.getRequestDispatcher("index.jsp");
		view.forward(req, resp);
	}
	
	 @Override
	 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 PrintWriter writer = resp.getWriter();
	     String nameRecu = req.getParameter("name");

	     users.add(nameRecu);
	     /*
	     for (String s: users) {
	     	writer.println("Salut " + s);
	     }*/
	     
	     req.setAttribute("listUser",users);
	     RequestDispatcher view = req.getRequestDispatcher("salutUsers.jsp");
	     view.forward(req,resp);
	 }
}
