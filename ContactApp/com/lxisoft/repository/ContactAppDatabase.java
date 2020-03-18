package com.lxisoft.repository;
import com.lxisoft.model;
import java.io.*;
import java.sql.*;
public class ContactAppDatabase
{
	Connection con = null;
	ResultSet rs= null;
	Statement stmt = null;
	PreparedStatement ps;
	int row;
	public void createDatabaseConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactApp","root","root")
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void addToDatabase(model)
	{
		createDatabaseConnection();
		try
		{
			ps = con.prepareStatement("insert into contactdb(name,email,address,phoneno) values('"+model.getName()+"','"+model.getEmail()+"','"+model.getAddress()+"','"+model.getPhoneNum()+"')");
			row = ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			ps.close();
			con.close();
		}

	}
	public void viewDatabase(model)
	{
		createDatabaseConnection();
		try
		{
			String sql  = select * from contactdb;
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				System.out.println("\tID\t\tNAME\t\tPHONE_NO\t\tEMAIL\t\tADDRESS");
			}

		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void deleteFromDatabase()
	{
		createDatabaseConnection();
	}
}