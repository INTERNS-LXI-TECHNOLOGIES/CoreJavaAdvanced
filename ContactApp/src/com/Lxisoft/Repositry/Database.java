package com.Lxisoft.Repositry;
import com.Lxisoft.Control.*;
import com.Lxisoft.Model.*;
import com.Lxisoft.View.*;
import java.sql.*;
import java.util.*;
import java.io.*;

public class Database
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
	public void addContacts(ArrayList<Contact> addContact)
    {
    	createDatabaseConnection();
    	contactview.addContacts(addContact);
    	int i=0;
    	try
    	{
    		preparedstatement = connection.prepareStatement("INSERT INTO ContactInfo (First_Name,Last_Name,Email, Contact_Number) VALUES ('"+addContact.get(i).getFirstName()+"','"+addContact.get(i).getLastName()+"','"+addContact.get(i).getEmail()+"','"+addContact.get(i).getContactNumber()+"')");
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
    		System.out.println("Database is not Connected Due to SQLException");
    	}

    }
    public void updateContact(ArrayList<Contact> addContact)
    {
    	createDatabaseConnection();

    	Scanner updateinfo = new Scanner(System.in);
		System.out.println("Enter the index number to update");
		int i=updateinfo.nextInt();
		contactview.updateContact(addContact);
		try
		{
			preparedstatement = connection.prepareStatement("UPDATE ContactInfo SET First_Name='"+addContact.get(0).getFirstName()+"',  Last_Name='"+addContact.get(0).getLastName()+"', Email='"+addContact.get(0).getFirstName()+"', Contact_Number='"+addContact.get(0).getFirstName()+"' WHERE id ='"+i+"'");
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


