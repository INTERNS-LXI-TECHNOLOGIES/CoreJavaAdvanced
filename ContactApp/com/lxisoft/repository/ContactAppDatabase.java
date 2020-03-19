package com.lxisoft.repository;
import com.lxisoft.model.*;
import java.io.*;
import java.sql.*;
public class ContactAppDatabase
{
	Connection con = null;
	ResultSet rs= null;
	Statement stmt = null;
	PreparedStatement ps = null;;
	int row;
	public void createDatabaseConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			try{
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactApp","root","root");	
			}catch(SQLException e)
			{
				e.printStackTrace();		
			}
			
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	public void addToDatabase(ContactModel model)
	{
		createDatabaseConnection();
		try
		{
			ps = con.prepareStatement("insert into contactdb(name,email,address,phoneno) values('"+model.getName()+"','"+model.getEmail()+"','"+model.getAddress()+"','"+model.getPhoneNum()+"')");
			row = ps.executeUpdate();
			ps.close();
			con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	// public void viewDatabase(model)
	// {
	// 	createDatabaseConnection();
	// 	try
	// 	{
	// 		String sql  = select * from contactdb;
	// 		stmt = con.createStatement();
	// 		rs = stmt.executeQuery(sql);
	// 		while(rs.next())
	// 		{
	// 			model.	
	// 		}

	// 	}
	// 	catch(SQLException e)
	// 	{
	// 		e.printStackTrace();
	// 	}
	// }
	// public void deleteFromDatabase()
	// {
	// 	createDatabaseConnection();
	// }
}