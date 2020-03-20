package com.lxisoft.repository;
import com.lxisoft.model.*;
import com.lxisoft.controller.*;
import java.io.*;
import java.sql.*;
import java.util.*;
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
	public int addToDatabase(ContactModel model)
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
		return row;
	}
	public ArrayList<Integer> getIdFromDatabase(ArrayList<Integer> idList)
	{
		createDatabaseConnection();
		try
		{
			String sql = "select id from contactdb";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				idList.add(rs.getInt(1)); 
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return idList;
	}
	public ArrayList<ContactModel> viewDatabase(ArrayList<ContactModel> contactList)
	{
		createDatabaseConnection();
		try
		{
			String sql  = "select * from contactdb" ;
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
				i++;		
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return contactList;
	}
	public ArrayList<ContactModel> searchDatabase(ArrayList<ContactModel> contactList,int searchId)
	{
		createDatabaseConnection();
		try
		{
			String sql = "select * from contactdb where id = '"+searchId+"'";
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
	public void deletRecord(int deleteId)
	{
		try
		{
			String sql = "delete from contactdb where id ='"+deleteId+"'";
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Record Sucessfully Deleted");
			stmt.close();
			con.close();
		}catch(SQLException e)
		{
			System.out.println(e);
		}
	}
}