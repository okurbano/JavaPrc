import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet {

	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		
		out.print("<html>   <body>  <h1 style='color:red'>Hello srinivas reddy how are u </h1>  </body> </html> " );
		
		
		
	}

}
