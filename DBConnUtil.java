package util;
import java.sql.*;


public class DBConnUtil {




	private static Connection conn = null;
	private  DBConnUtil() {
	
	
    try {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        

       
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/HospitalMS", "root", "vibha");
        
        
        
        System.out.println("Connected to the database");

      }
    catch(Exception e)
    {
    	System.out.println(e);
    }       
    
    
}

	
   public static Connection getConnect()
    {
	   DBConnUtil d1=new DBConnUtil();
    			return conn;
    }
}