package kashi;
import java.util.*;
import java.sql.*;
class A
{
	static int x=1;
	static {
		System.out.println(" A kashi");
		
	}
	
}

public class firstjdbc {
	static A a;
	static {
		System.out.println("kashi");
		
		
	}
public static void main(String kashi[])
{
	Connection c=null;
	Statement s;
	try
	{
		//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		//Class  cn = Class.forName(kashi[0]);
		//Class  cn = Class.forName("com.mysql.cj.jdbc.Driver");//register or connection ki karan;
		 c = DriverManager.getConnection("jdbc:mysql:///javadatabase","root","Ihsak@123");
		 System.out.println(c);
		//return resultSet=  s.executeQuery(Sql String); select ddldatafech
		 //return long = s.executeUpdate(Sql String );//update delete insert,;dml/
		// conection close()
		   s= c.createStatement();
		   Scanner sc = new Scanner(System.in);
		  String  name=sc.next();
		   int id=sc.nextInt();
		 //  long i = s.executeUpdate("insert into user values('deve',8 )");
		   /*if(i>0)
		   {
			   System.out.println("ok");
		   } 
		   else
		   {
			   System.out.println("no");
		   }*/
		  
		  PreparedStatement ps = c.prepareStatement("insert into user values(?,?)");//pre compile hoti he
		  ps.setString(1,name);
		  ps.setInt(2, id);
		  long i= ps.executeUpdate();
		  if(i>0)
		   {
			   System.out.println("ok");
		   } 
		   else
		   {
			   System.out.println("no");
		   }
		  ResultSet res= s.executeQuery("select * from user");
		  while(res.next())
		  {
			  System.out.println("name ="+res.getString("name"));
			  System.out.println("id ="+res.getInt(2));
			
		  }
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally
	{ 
		try
		{ 
			c.close();
		}catch(Exception e)
		{
	     System.out.print(e);
		}
		
	}
}
}
