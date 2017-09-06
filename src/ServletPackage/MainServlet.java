package ServletPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servlet behavior is defined by the HttpServlet Class from the javax.servlet package
//To write a servlet the MainServlet Class is created and extends the HttpServlet
//And the doGet method is used to attend the requests and provide the answers

public class MainServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
              throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();	
		writer.print("Success");
    }

}