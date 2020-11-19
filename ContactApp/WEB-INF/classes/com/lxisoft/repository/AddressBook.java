package com.lxisoft.repository;
import com.lxisoft.control.*;
import com.lxisoft.modal.*;
import com.lxisoft.view.*;
import java.sql.*;
import java.util.Collections;
import java.io.*;
import java.util.ArrayList;


public class AddressBook 
{
	
	Connection con = null;
	ResultSet rs= null;
	Statement stmt = null;
	PreparedStatement ps = null;
	int row;
			ArrayList<Contact> contact=new ArrayList<Contact>();

	public void databaseConnection() 
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
			try{
				 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact?useSSL=false&serverTimezone=Asia/Shanghai","root","Karthik1996$");

			}catch(SQLException e)
			{
				e.printStackTrace();		
			}
			
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

	public int addToDatabase(Contact contact)
	{
		databaseConnection();
		try
		{

			ps = con.prepareStatement("insert into contact(Name,Number,Email) values('"+contact.getName()+"','"+contact.getNumber()+"','"+contact.getEmail()+"')");
			row = ps.executeUpdate();
			ps.close();
			con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return row;
	}
		public void database(ArrayList<Contact> contact)
		{
					databaseConnection();
					try
					{
					stmt=con.createStatement();
					rs=stmt.executeQuery("select * from contact");
					while(rs.next())
					{
						System.out.println("Name"+rs.getString("Name")+""+rs.getInt("Number")+""+rs.getString("Email"));
					}
				}catch(Exception e)
				{
								e.printStackTrace();

				}
		}
		public void delete(String name)
		{
					databaseConnection();
					try
					{
					stmt=con.createStatement();

					rs=stmt.executeQuery("DELETE FROM contact WHERE name='"+name+"'");
					while(rs.next())
					{
						System.out.println("Name"+rs.getString("Name")+""+rs.getInt("Number")+""+rs.getString("Email"));
					}
				}catch(Exception e)
				{
								e.printStackTrace();

				}
		}

	
	
}