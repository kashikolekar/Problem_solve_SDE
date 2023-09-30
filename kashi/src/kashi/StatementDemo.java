package kashi;
import java.sql.*;
import java.util.Scanner;

public class StatementDemo {
	public static void main(String[] kashi)
	{
try
{
	Connection con = ConnectionProvider.getConnection();
 //we execute a query using stament in databse query many time database andar compile and execute many time;
//complex to use
	//sql injection
	//System.out.println(con);
	
	  Scanner sc= new Scanner(System.in);
	System.out.println("eneter a name ");
	String name= sc.next();
	System.out.println("eneter a id ");
	int id=sc.nextInt();
	System.out.println("eneter a email ");
	String email =sc.next();
	System.out.println("eneter a password ");
	String pass=sc.next();
	PreparedStatement s= con.prepareStatement("insert into student values(?,?,?,?)");
	
	//PreparedStatement s= con.prepareStatement("insert into kashinath values(?,?,?,?)");
	s.setString(1,name);
	s.setInt(2, id);
	s.setString(3,email);
	s.setString(4, pass);
	long i=s.executeUpdate();
	//long i = s.executeQuery("insert into kashinath values(quary)");
	if(i>0)
	{
		System.out.print("ok");
	}
	else
	{
		System.out.println("no");
	}	
	
}catch(Exception e)
{
	e.printStackTrace();
}
	}
}
