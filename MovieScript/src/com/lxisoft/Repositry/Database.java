package com.Lxisoft.Repositry;
import com.Lxisoft.Control.*;
import com.Lxisoft.Model.*;
import java.sql.*;
import java.util.*;
import java.io.*;

public class Database
{
	Connection connection = null;
	ResultSet result= null;
	Statement statement = null;
	PreparedStatement preparedstatement = null;;
	int row;
	Cast cast = new Cast();
	
	public void createDatabaseConnection()
	{
		String jdbcURL = "jdbc:mysql://localhost:3306/MovieScript";
  		String userName = "root";
  		String password = "98467691";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			try
			{
				connection = DriverManager.getConnection(jdbcURL,userName,password);	
				if (connection != null)
  				{
  					System.out.println("Connected to Database");
  					connection.close();

  				}
			}
			catch(SQLException e)
			{
				System.out.println("Database is not Connected Due to SQLException");
			}
			
		}catch(ClassNotFoundException e)
		{
			System.out.println("Database is not Connected Due to ClassNotFoundException");
		}

	}

	public int addToDatabase(Cast cast)
	{
		createDatabaseConnection();
		try
		{
			preparedstatement = connection.prepareStatement("INSERT INTO CastDetails(Name,Role) VALUES('"+cast.getName()+"','"+cast.getCharacterType()+"')");
			row = preparedstatement.executeUpdate();
			preparedstatement.close();
			connection.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return row;
	}
	public void printDatabase(ArrayList<Hero> heroList, Cast cast)
	{
		createDatabaseConnection();
		try
		{
			String sql  = "SELECT * FROM  CastDetails" ;
			statement = connection.createStatement();
			result = statement.executeQuery(sql);
			int i = 0;
			while(result.next())
			{
			String name = result.getString("Name");	
			String role = result.getString("Role");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}


}
