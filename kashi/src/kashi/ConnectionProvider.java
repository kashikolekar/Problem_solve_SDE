package kashi;
import java.sql.*;
import java.util.Scanner;
public final class ConnectionProvider {//no any one inh karan final
    private ConnectionProvider()//obj no any one 
	{
		
	}

	public static Connection getConnection()
	{
		Connection c=null;
		try
		{
			  Scanner sc= new Scanner(System.in);
			System.out.println("enter databse name");
			String str=sc.next();
			
		 Class.forName(DatabaseDetials.Database_driver);//register or connection ki karan;
		 c = DriverManager.getConnection(DatabaseDetials.databse_url+str,DatabaseDetials.databse_user,DatabaseDetials.databse_pass);
	
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return c;
	}
}
