package com.lxisoft.repository;
import com.lxisoft.model.*;
import com.lxisoft.controller.*;
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
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactDatabase","root","root");	
			}catch(SQLException e)
			{
				e.printStackTrace();		
			}
			
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}