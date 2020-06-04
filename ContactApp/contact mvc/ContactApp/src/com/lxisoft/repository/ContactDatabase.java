package com.lxisoft.repository;
import com.lxisoft.model.*;
import com.lxisoft.control.*;
import java.io.*;
import java.sql.*;
import java.util.*;
public class ContactDatabase
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
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactdb","root","root");	
			}catch(SQLException e)
			{
				e.printStackTrace();		
			}
			
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

	public int addToDatabase(Contact model)
	{
		createDatabaseConnection();
		try
		{
			ps = con.prepareStatement("insert into contactapp(FirstName,LastName,Number) values('"+model.getFirstname()+"','"+model.getLastname()+"','"+model.getNumber()+"')");
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

	public ArrayList<Contact> viewDatabase(ArrayList<Contact> contactList)
	{
		createDatabaseConnection();
		try
		{
			String sql  = "select * from contactapp" ;
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			int i = 0;
			while(rs.next())
			{
				contactList.add(i,new Contact());
				contactList.get(i).setId(rs.getInt("id"));
				contactList.get(i).setFirstname(rs.getString("FirstName"));
				contactList.get(i).setLastname(rs.getString("LastName"));
				contactList.get(i).setNumber(rs.getString("Number"));
				i++;		
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return contactList;
	}

	public ArrayList<ContactModel> searchDatabase(ArrayList<Contact> contactList,String searchname)
	{
		createDatabaseConnection();
		try
		{
			String sql = "select * from contactdb where FirstName = '"+searchname+"'";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			int i = 0;
			while(rs.next())
			{
				contactList.add(i,new ContactModel());
				contactList.get(i).setId(rs.getInt("id"));
				contactList.get(i).setName(rs.getString("name"));
				contactList.get(i).setEmail(rs.getString("email"));
				contactList.get(i).setAddress(rs.getString("address"));
				contactList.get(i).setPhoneNum(rs.getString("phoneno"));
			}
		}catch(SQLException e)
		{
			System.out.println(e);
		}
		return contactList;
	}
}