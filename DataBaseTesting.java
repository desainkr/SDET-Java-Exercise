package SDETInterview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseTesting {

	public static void main(String[] args) throws SQLException {

         //Data
		
		
		
		
		//User Registration
		
		
		
		
		
		// Data base connection
		
		Connection  con= DriverManager.getConnection("jdbc:mysq://localhost:3306/openshop","username","pwd");
		Statement stmt = con.createStatement();
		String query ="Select firstname, lastname, email, telephone from oc_customer";
		ResultSet rs= stmt.executeQuery(query);
      
		 boolean status=false;
		 while(rs.next())
		 {
			 String firstname = rs.getString("firstname");
			 String lastname = rs.getString("lastname");
			 String email = rs.getString("email");
			 String telephone = rs.getString("telephone");
			 
		//	 if (cust_firstname.equals(firstname) &&cust_lastname.equals(lastname)  
		//		 && cust_email.equals(email)  && cust_telephone.equals(telephone))
			 {
				 System.out.println("Record found in the table || Test Passed");
				 status=true;
				 break;
			 }
			 
		 }
		
		if(status == false)
		{
			System.out.println("Record NOt found || Test failed");
		}
		 
		 
		 
		
	}

}
