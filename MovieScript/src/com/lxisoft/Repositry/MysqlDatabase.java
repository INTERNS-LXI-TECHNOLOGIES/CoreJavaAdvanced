package com.Lxisoft.Repositry;
import com.Lxisoft.MovieScriptApp.Control.*;
import com.Lxisoft.MovieScriptApp.Model.*;
import java.sql.*;
import java.util.*;

public class MysqlDatabase
{
	Cast cast = new Cast();
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
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactdb","root","98467691");	
			}catch(SQLException e)
			{
				e.printStackTrace();		
			}
			
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	public int addToDatabase()
	{
		
		createDatabaseConnection();
		try
		{
			ps = con.prepareStatement("insert into MovieScript(Name,CharacterType) values('"+cast.getName()+"','"+cast.getCharacterType());
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

	public ArrayList<Cast> printDatabase(ArrayList<Cast> cast)
	{
			createDatabaseConnection();
		try
		{
			String sql  = "select * from MovieScript" ;
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			int i = 0;
			while(rs.next())
			{
				cast.add(i,new Cast());
				cast.get(i).setName(rs.getString("Name"));
				cast.get(i).setCharacterType(rs.getString("CharacterType"));
				i++;		
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	return cast;
	}
}