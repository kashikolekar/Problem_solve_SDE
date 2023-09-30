package com.program.webapp.Application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class JdbcConnection {

	public static void main(String kashi[]) 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");  
		Connection con	= DriverManager.getConnection("jdbc:mysql://localhost:3306/empolyee","root","Ihsak@123");
			PreparedStatement ps = con.prepareStatement("insert into empolyee_Detils values(12,'kashinath')");
			ps.execute();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
