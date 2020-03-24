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
	public void deleteRecordByName(String deleteId)
	{
		try
		{
			String sql = "delete from contactdb where name ='"+deleteId+"'";
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
			stmt.close();
			con.close();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void deleteRecordById(int id)
	{
		try
		{
			String sql = "delete from contactdb where id ='"+id+"'";
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
			stmt.close();
			con.close();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void updateRecordByName(ContactModel model)
	{
		createDatabaseConnection();
		try
		{
			ps = con.prepareStatement("update contactdb set name='"+model.getName()+"' , email = '"+model.getEmail()+"' , address ='"+model.getAddress()+"' , phoneno = '"+model.getPhoneNum()+"' where name = '"+model.getName()+"' ");
			row = ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void updateRecordById(ContactModel model,int id)
	{
		createDatabaseConnection();
		try
		{
			ps = con.prepareStatement("update contactdb set name='"+model.getName()+"' , email = '"+model.getEmail()+"' , address ='"+model.getAddress()+"' , phoneno = '"+model.getPhoneNum()+"' where id = '"+id+"' ");
			row = ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public ArrayList<ContactModel> searchDatabaseByName(ArrayList<ContactModel> contactList,String searchId)
	{
		createDatabaseConnection();
		try
		{

			String sql = "select * from contactdb where name like  '"+searchId.charAt(0)+"%'";
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
			e.printStackTrace();
		}
		return contactList;
	}
	public ArrayList<String> searchByName(ArrayList<String> idList,String searchId)
	{
		createDatabaseConnection();
		try
		{

			String sql = "select name from contactdb where name like  '"+searchId.charAt(0)+"%'";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			int i = 0;
			while(rs.next())
			{
				idList.add(rs.getString("name"));
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return idList;
	}
	// public ArrayList<String> searchByName(ArrayList<String> idList)
	// {
	// 	createDatabaseConnection();
	// 	try
	// 	{
	// 		String sql = "select name from contactdb";
	// 		stmt = con.createStatement();
	// 		rs = stmt.executeQuery(sql);
	// 		while(rs.next())
	// 		{
	// 			idList.add(rs.getString("name"));
	// 		}
	// 	}
	// 	catch(SQLException e)
	// 	{
	// 		e.printStackTrace();
	// 	}
	// 	return idList;
	// }
	public void searchById(String id)
	{
		createDatabaseConnection();
		try
		{
			String sql = "select * from contactdb where id = '"+ id+"' ";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				rs.getInt("id");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void searchByPhoneNo(String phoneno)
	{
		createDatabaseConnection();
		try
		{
			String sql = "select * from contactdb where phoneno = '"+phoneno+"'";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				rs.getString("phoneno");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	// public ArrayList<String> getNameFromDatabase(ArrayList<String> idList)
	// {
	// 	createDatabaseConnection();
	// 	try
	// 	{
	// 		String sql = "select name from contactdb";
	// 		stmt = con.createStatement();
	// 		rs = stmt.executeQuery(sql);
	// 		while(rs.next())
	// 		{
	// 			idList.add(rs.getString("name")); 
	// 		}
	// 	}
	// 	catch(SQLException e)
	// 	{
	// 		e.printStackTrace();
	// 	}
	// 	return idList;
	// }
	
	// public ArrayList<ContactModel> searchDatabase(ArrayList<ContactModel> contactList,String searchId)
	// {
	// 	createDatabaseConnection();
	// 	try
	// 	{
	// 		String sql = "select * from contactdb where phoneno = '"+searchId+"'";
	// 		stmt = con.createStatement();
	// 		rs = stmt.executeQuery(sql);
	// 		int i = 0;
	// 		while(rs.next())
	// 		{
	// 			contactList.add(i,new ContactModel());
	// 			contactList.get(i).setId(rs.getInt("id"));
	// 			contactList.get(i).setName(rs.getString("name"));
	// 			contactList.get(i).setEmail(rs.getString("email"));
	// 			contactList.get(i).setAddress(rs.getString("address"));
	// 			contactList.get(i).setPhoneNum(rs.getString("phoneno"));
	// 		}
	// 	}catch(SQLException e)
	// 	{
	// 		e.printStackTrace();
	// 	}
	// 	return contactList;
	// }

}