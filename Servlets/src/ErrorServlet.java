

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/error")
public class ErrorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ErrorServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest reqq, HttpServletResponse ress) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest reqq, HttpServletResponse ress) throws ServletException, IOException {
		ress.setContentType("text/html");
		PrintWriter out=ress.getWriter();
		
		String name =reqq.getParameter("uid");
		out.print("<html><body bgcolor=red>");
		out.print("<h1>"+name+"</h1>");
		out.print("</body></html>");
	}

}
