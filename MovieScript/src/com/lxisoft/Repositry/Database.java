package com.Lxisoft.Repositry;
import com.Lxisoft.Control.*;
import com.Lxisoft.Model.*;
import com.Lxisoft.View.*;
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
	MovieView movie = new MovieView();
	//ArrayList updateInfo = new ArrayList();
	
	public void createDatabaseConnection()
	{
		String jdbcURL = "jdbc:mysql://localhost:3306/MovieScript";
  		String userName = "root";
  		String password = "root";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			try
			{
				connection = DriverManager.getConnection(jdbcURL,userName,password);	
				if (connection != null)
  				{
  					System.out.println("Connected to Database");
  					//connection.close();

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

	public void addToDatabase(ArrayList<Hero> heroList, ArrayList<Heroine> heroineList, ArrayList<Anti_Hero> antiHeroList, ArrayList<Comedian> comedianList)
	{
		createDatabaseConnection();
		try
		{
			int i=0;
			preparedstatement = connection.prepareStatement("INSERT INTO CastDetails(Name,Role,CharacterName) VALUES('"+heroList.get(i).getName()+"','Hero','"+heroList.get(i).getCharacterName()+"')");
			row = preparedstatement.executeUpdate();
			preparedstatement = connection.prepareStatement("INSERT INTO CastDetails(Name,Role,CharacterName) VALUES('"+heroineList.get(i).getName()+"','Heroine','"+heroineList.get(i).getCharacterName()+"')");
			row = preparedstatement.executeUpdate();
			preparedstatement = connection.prepareStatement("INSERT INTO CastDetails(Name,Role,CharacterName) VALUES('"+antiHeroList.get(i).getName()+"','Anti_Hero','"+antiHeroList.get(i).getCharacterName()+"')");
			row = preparedstatement.executeUpdate();
			preparedstatement = connection.prepareStatement("INSERT INTO CastDetails(Name,Role,CharacterName) VALUES('"+comedianList.get(i).getName()+"','Comedian','"+comedianList.get(i).getCharacterName()+"')");
			row = preparedstatement.executeUpdate();
			preparedstatement.close();
			connection.close();
			
			if(row>1)
			{
				System.out.println(" New Actors Has Been Added");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}

	public void updateDatabase(ArrayList<Hero> heroList, ArrayList<Heroine> heroineList, ArrayList<Anti_Hero> antiHeroList, ArrayList<Comedian> comedianList)
	{
		createDatabaseConnection();
		try
		{
			Scanner updateDatabaseInput = new Scanner(System.in);
			System.out.println("Enter the Role of cast is to be updated");
			String input=updateDatabaseInput.nextLine();
			//int i=0;
			if(input .equals("Hero"))
			{
			
			movie.updatedbHero(heroList); 
			String sql  = "UPDATE CastDetails SET Name='"+heroList.get(0).getName()+"', WHERE Role ='Hero'";
			statement = connection.createStatement();
			row = statement.executeUpdate(sql);
				if(row>0)
				{
					System.out.println("The Cast Details has been updated");
				}
			}

			if(input .equals("Heroine"))
			{
			 movie.updatedbHeroine(heroineList);
			String sql  = "UPDATE CastDetails SET Name='"+heroineList.get(0).getName()+"' WHERE Role ='Heroine'";
			statement = connection.createStatement();
			row = statement.executeUpdate(sql);
				if(row>0)
				{
					System.out.println("The Cast Details has been updated");
				}
			}
			if(input .equals("AntiHero"))
			{
			movie.updatedbAntiHero(antiHeroList);
			String sql  = "UPDATE CastDetails SET Name='"+antiHeroList.get(0).getName()+"' WHERE Role ='AntiHero'";
			statement = connection.createStatement();
			row = statement.executeUpdate(sql);
				if(row>0)
				{
					System.out.println("The Cast Details has been updated");
				}
			}
			if(input .equals("Comedian"))
			{
			 movie.updatedbComedian(comedianList);
			String sql  = "UPDATE CastDetails SET Name='"+comedianList.get(0).getName()+"' WHERE Role ='comedian'";
			statement = connection.createStatement();
			row = statement.executeUpdate(sql);
				if(row>0)
				{
					System.out.println("The Cast Details has been updated");
				}
			}
			else if (input !=null)
			{
				System.out.println("There is no kind of character found in the database");
			}

		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

	public void deletefromDatabase()
	{
		createDatabaseConnection();
		try
		{
			Scanner deleteDatabaseInput = new Scanner(System.in);
			System.out.println("Enter the Name Actor to be deleted");
			String delete= deleteDatabaseInput.nextLine();
			//dele
			
			String sql  = "DELETE FROM CastDetails WHERE Name='"+delete+"'";

			preparedstatement = connection.prepareStatement(sql);
		
			if(row>0)
				{
					System.out.println("The Cast Details has been deleted");
				}


		}
		catch(SQLException e)
		{

		}
	}
	public void printDatabase()
	{
		createDatabaseConnection();
		try
		{
			String sql  = "SELECT * FROM  CastDetails" ;
			statement = connection.createStatement();
			result = statement.executeQuery(sql);
			System.out.println("\tname\trole\tcharacterName");

			while(result.next())
			{
			
			//String castID = result.getString(1);
			String name = result.getString("Name");	
			String role = result.getString("Role");
			String characterName = result.getString("CharacterName");
			
			
			//for(int i=1; i>10; i++)
			System.out.println("\t"+name+"\t"+role+"\t"+characterName);
			//System.out.println(name);
			//System.out.println(role);
			//System.out.println(characterName);
			
			}
			connection.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}


}
