package kashi;
import java.sql.*;


public class database {
  public static void main(String[] args){
	  try {
		  
	  
	  Class.forName("com.mysql.jdbc.Driver");
	  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/empolyee","root","Ihsak@123");
	  PreparedStatement ps=conn.prepareStatement("insert into empolyee_Detils values(12,'kashinath')");
	 int i= ps.executeUpdate();
	 if(i>0)
	 {
		System.out.println("ok"); 
	 }
	 else
	 {
		 System.out.println("no");
	 }
	  conn.close();
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  }
}
