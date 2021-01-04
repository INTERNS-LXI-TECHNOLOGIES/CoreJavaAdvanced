package com.Lxisoft.Repositry;
import com.Lxisoft.Control.*;
import com.Lxisoft.Model.*;
import com.Lxisoft.View.*;
import java.sql.*;
import java.util.*;
import java.io.*;

public class MysqlRepositry
{
	Connection connection =null;
	ResultSet result = null;
	Statement statement = null;
	PreparedStatement preparedstatement = null;
	int row;
	ContactAppView	contactview = new ContactAppView();

	public void createDatabaseConnection()
	{
		
		String jdbcURL = "jdbc:mysql://localhost:3306/ContactApp";
  		String userName = "root";
  		String password = "root";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			try
			{
				connection = DriverManager.getConnection(jdbcURL,userName,password);
				if (connection !=null)
				{
					System.out.println("Connected TO Database");
				}
			}
		

			catch(SQLException e)
			{
				System.out.println("Database is not Connected Due to SQLException");
			}
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Database Is Not Connected To Database Due To ClassNotFoundException");
		}
	}
	public void addContacts()
    {
    	//createDatabaseConnection();
    	//contactview.addContacts();
    	int i=0;
    	try
    	{
    		Scanner add_contact = new Scanner(System.in);
    		System.out.println("Enter First Name ");
    		String fname=add_contact.nextLine();
    		//preparedstatement = connection.prepareStatement("INSERT INTO ContactInfo (First_Name) VALUES ('"+contactview.fname+"')");
			//row = preparedstatement.executeUpdate();

    		System.out.println("Enter Last Name");
    		String lName=add_contact.nextLine();
    		///preparedstatement = connection.prepareStatement("INSERT INTO ContactInfo (Last_Name) VALUES ('"+lName+"')");
			
 			
 			System.out.println("Enter Email");
    		String email = 	add_contact.nextLine();
    		//preparedstatement = connection.prepareStatement("INSERT INTO ContactInfo (Email) VALUES ('"+email+"')");
			//row = preparedstatement.executeUpdate();

	 	    System.out.println("Enter Contact Number");
    		String phNo=add_contact.nextLine();
    		preparedstatement = connection.prepareStatement("INSERT INTO ContactInfo (First_Name,Last_Name,Email,Contact_Number) VALUES ('"+fname+"','"+lName+"','"+email+"','"+phNo+"')");
			row = preparedstatement.executeUpdate();


			preparedstatement.close();
			connection.close();    	
			if(row>0)
			{
				System.out.println(" New Contact Has Been Added");
			}	

    	}
    	catch(SQLException e)
    	{
    		e.printStackTrace();
    		//System.out.println("Database is not Connected Due to SQLException");
    	}

    }
    public void updateContact()
    {
    	createDatabaseConnection();

    	Scanner updateinfo = new Scanner(System.in);
		System.out.println("Enter the index number to update");
		int j=updateinfo.nextInt();

		
		try
		{
		Scanner update = new Scanner(System.in);
		int i=0;
		System.out.println("Enter First Name to be updated");
    	String fname=update.nextLine();
    		
    	System.out.println("Enter Last Name");
    	String lName=update.nextLine();
    		
    	System.out.println("Enter Email");
    	String email = update.nextLine();

    	System.out.println("Enter Contact Number");
    	String phNo= update.nextLine();	
			
			preparedstatement = connection.prepareStatement("UPDATE ContactInfo SET First_Name='"+fname+"',  Last_Name='"+lName+"', Email='"+email+"', Contact_Number='"+phNo+"' WHERE id ='"+j+"'");
			row = preparedstatement.executeUpdate();
			preparedstatement.close();
			connection.close();
			if(row>0)
			{
				System.out.println("The Contact Details has been updated");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

    }
    public void deleteContact()
    {
    	createDatabaseConnection();
    	try
		{
			
			Scanner deleteDatabaseInput = new Scanner(System.in);
			System.out.println("Enter the Index numer to be deleted");
			int delete= deleteDatabaseInput.nextInt();
			
			
			statement = connection.createStatement();
			statement.executeUpdate("delete from ContactInfo where ID='"+delete+"'");
			System.out.println("Record Sucessfully Deleted");
			statement.close();
			connection.close();	
		//	if(row>0)
				//{
				//	System.out.println("The Cast Details has been deleted");
				//}


		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

    }
    public void printDatabase()
    {
    	createDatabaseConnection();
		try
		{
			String sql  = "SELECT * FROM  ContactInfo" ;
			statement = connection.createStatement();
			result = statement.executeQuery(sql);
			System.out.println("\tID\tFirst_Name\tLast_Name\tEmail\tContact_Number");

			while(result.next())
			{
			
			String id = result.getString(1);
			String fname = result.getString(2);	
			String lname = result.getString(3);
			String email = result.getString(4);
			String contactNumber = result.getString(5);
			
			System.out.println("\t"+id+"\t"+fname+"\t"+lname+"\t"+email+"\t\t"+contactNumber+"\t");
			}
			connection.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}	
    }
}


