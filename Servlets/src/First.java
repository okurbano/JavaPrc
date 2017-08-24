

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.srinivas.math.Helpers;

/**
 * Servlet implementation class First
 */
@WebServlet("/First")
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public First() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String formUid=request.getParameter("uid");
		String formpwd=request.getParameter("pwd");
		PreparedStatement pst = null;
		ResultSet rs=null;
		 boolean status=false; 
		System.out.println("Name ="+formUid);
		try{
		Class.forName(Helpers.DRIVER);
		System.out.println("Driver Loaded Successfully");
		
		Connection conn=DriverManager.getConnection(Helpers.URL,Helpers.USERNAME,Helpers.PASSWORD);
		System.out.println("Connecttion Success");
		
		String query="select * from appsusers where username=? and password=?";
		
        pst = conn.prepareStatement(query);
        pst.setString(1, formUid);
        pst.setString(2,formpwd);
        rs=pst.executeQuery();
      
        while(rs.next()){
        	status=true;
        	
        }    
			
		}
		catch(Exception e)
		{
		System.out.println(e);	
		}
		
		
		if(status)
		{
			RequestDispatcher rd = request.getRequestDispatcher("success");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("error");
			rd.include(request, response);
		}
		
		
		
	}

}
