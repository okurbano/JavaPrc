

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Form3")
public class Form3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Form3() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String m1=request.getParameter("txt4");
		Cookie ck[]=request.getCookies();
		
		String m2=ck[0].getValue();
		
		out.println("<html><body bgcolor=grey>");
		out.println("<form action=Form4>");
		out.println("<h1>"+"name = "+m2);
		out.println(m1);
		out.println("Rank  <input type=text name=txt5 size=25>");
		out.println("<br>");		
		out.println("<input type=submit value=Next >");
		out.println("</h1>");
		out.println("</body></html>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
