

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Form1")
public class Form1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Form1() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html><body bgcolor=cyan>");
		out.println("<form action=Form2>");
		out.println("<h1>");
		out.println("Name <input type=text name=txt1 size=25>");
		out.println("<br>");
		out.println("College <input type=text name=txt2 size=50>");
		out.println("<br>");
		out.println("<input type=submit value=Next >");
		out.println("</h1>");
		out.println("</body></html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
