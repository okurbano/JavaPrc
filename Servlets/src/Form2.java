

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Form2")
public class Form2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Form2() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name=request.getParameter("txt1");
		
		Cookie ck = new Cookie("uname",name);
		response.addCookie(ck);
		
		out.println("<html><body bgcolor=green>");
		out.println("<form action=Form3>");
		out.println("<h1>"+name);
		out.println("Maths <input type=text name=txt3 size=25>");
		out.println("<br>");
		out.println("Hindi <input type=text name=txt4 size=50>");
		out.println("<br>");
		out.println("<input type=submit value=Next >");
		out.println("</h1>");
		out.println("</body></html>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
