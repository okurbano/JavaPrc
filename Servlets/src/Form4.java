

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Form4")
public class Form4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Form4() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String s1=request.getParameter("txt5");
		String s2=request.getParameter("txt4");
		

		out.println("<html><body bgcolor=yellow>");
		out.println("<h1>We are in Final Page :::</h1>");
		out.println("<form action=Form4>");
		out.println("<h1>");
		out.println("Rank= "+"<h1>"+s1+"</h1>");
		out.println("HIndi= "+"<h1>"+s2+"</h1>");
		out.println("<br>");		
		out.println("<input type=submit value=Next >");
		out.println("</h1>");
		out.println("</body></html>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
