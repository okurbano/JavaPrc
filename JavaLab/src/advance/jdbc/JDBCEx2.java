package advance.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCEx2 {

	public static void main(String[] args) {
		
		String bname;
		String bauthor;
		int price;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Book Name   ");
		bname=sc.next();
		
		System.out.println("Enter the Book Auhtor");
		bauthor=sc.next();
		
		System.out.println("Enter the Book Price");
		price=sc.nextInt();
		
		

		try {
		//  load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded successfully.........");
			
			//create the connection object
			Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE" ,"system","tiger");
			System.out.println("Connection Successfully");
			
			
			//Create a prepared statement to insert the row
			
			PreparedStatement ps = conn.prepareStatement("insert into book values (?,?,?)");
			ps.setString(1,bname);
			ps.setString(2,bauthor);
			ps.setInt(3,price);
			
			int check =ps.executeUpdate();
			System.out.println(check + "  Record Inserted Successfully");
			conn.close();
			
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}


	}

}
