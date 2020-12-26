//package com.Lxisoft.Repositry;
//import com.Lxisoft.Control.*;
//import com.Lxisoft.Model.CastDetails;
import java.sql.*;
import java.util.*;
import java.io.*;

public class MysqlDatabase
{
	//ArrayList<CastDetails> cast = new ArrayList<CastDetails>();
	//CastDetails cs = new CastDetails();
	//Connection con = null;
	//ResultSet rs= null;
	//Statement stmt = null;
	//PreparedStatement ps = null;;
	//int row;
	
	/*public void createDatabaseConnection() throws SQLException
	{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MovieScript","root","98467691");
			String sql = "INSERT INTO CastDetails (Name, Role)VALUES('Faris','Hero')";
			Statement statement = connection.createStatement();
			int rows = statement.executeUpdate(sql);


		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			try{
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MovieScript","root","98467691");	
				String sqlQuery="SELECT * FROM CastDetails";
				stmt = con.createStatement();
				rs = stmt.executeQuery(sqlQuery);
				
				while(rs.next()){
				
					String name= rs.getString("Name");
					String role= rs.getString("Role");
					System.out.println(name+","+role);
			}
			}catch(SQLException e)
			{
				e.printStackTrace();		
			}
			
		}
		catch(ClassNotFoundException e)
		{
			//System.out.println("Database Connected");
			e.printStackTrace();
		}

	}

	/*public int addToDatabase()
	{
		
		createDatabaseConnection();
		try
		{
			ps = con.prepareStatement("INSERT into CastDetails(Name,Role) VALUES('Faris','Hero'");
			row = ps.executeUpdate();
			ps.close();
			con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return row;
	}*/

	/*public void printDatabase() throws SQLException
	{
			this.createDatabaseConnection();
		try
		{
			String sql  = "select * from CastDetails" ;
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			int i = 0;
			while(rs.next())
			{
				cast.add(i,new CastDetails());
				cast.get(i).setName(rs.getString("Name"));
				cast.get(i).setRole(rs.getString("Role"));
				i++;
				String name=rs.getString("Name");
				String role=rs.getString("Role"); 		
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	
	}
}*/
  /*public void createDatabaseConnection()
  {
  	String jdbcURL = "jdbc:mysql://localhost:3306/MovieScript";
  	String userName = "root";
  	String password = "98467691";
  	try
  	{
  		Class.forName("com.mysql.jdbc.Driver");
  		try{
  		Connection connection = DriverManager.getConnection(jdbcURL, userName, password);
  		if (connection != null)
  		{
  			System.out.println("Connected to Database");
  			connection.close();

  		}

  		}
  	catch (SQLException ex)
  	{
  		ex.printStackTrace();
  	}

  }
  catch(ClassNotFoundException e)
  {
  	e.printStackTrace();
  }
}*/
	public void createDatabaseConnection()
	{
	String jdbcURL = "jdbc:mysql://localhost:3306/MovieScript";
  	String userName = "root";
  	String password = "98467691";
  	try
  	{
  		Class.forName("com.mysql.cj.jdbc.Driver");
  		try
  		{
  			Connection connection = DriverManager.getConnection(jdbcURL, userName, password);
  		if (connection != null)
  		{
  			System.out.println("Connected to Database");
  			connection.close();

  		}
  		}
  		catch (SQLException ex)
  		{
  			ex.printStackTrace();
  		}
  		
  	}
  	catch(ClassNotFoundException e)
  	{
  		e.printStackTrace();
  	}
	}
}

		