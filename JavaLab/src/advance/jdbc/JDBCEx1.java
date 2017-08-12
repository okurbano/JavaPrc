package advance.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx1 {

	public static void main(String[] args) {
		
		
		
		try {
		//  load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded successfully.........");
			
			//create the connection object
			Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE" ,"system","tiger");
			System.out.println("Connection Successfully");

			
			//create the statment 			
			Statement st =conn.createStatement();
			
			
			//create query			
			ResultSet rs= st.executeQuery("select * from book");			
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+ " "+rs.getString(2)+ "  "+rs.getInt(3));
				
			}
			conn.close();
			
		} 
		
		
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
