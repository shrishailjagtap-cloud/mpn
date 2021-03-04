package myprojectnew;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class Test {

	Student s=new Student();
	public void show() throws ClassNotFoundException, SQLException {
		s.setId(102);
		s.setName("shri");
		s.setAddress("bhoom");
		s.setCity("pune");
		Class.forName("com.mysql.jdbc.Driver");
		
		java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ttl","root","root");
		String sql="select * from Student";

 	
	        Statement smt=(Statement) con.createStatement();
	    smt.execute(sql);
		
		
		  ResultSet rs=(ResultSet) smt.getResultSet();
		  
		  while(rs.next()) {
		  
		  System.out.println(rs.getInt(1)); System.out.println(rs.getString(2));
		  System.out.println(rs.getString(3)); System.out.println(rs.getString(4));
		  
		  }
		 
	    	   
	       }
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Test t=new Test();
		t.show();
				
		 
		
	}
	
	
}
