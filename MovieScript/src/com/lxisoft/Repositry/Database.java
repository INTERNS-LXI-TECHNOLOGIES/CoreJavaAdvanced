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
	ArrayList updateInfo = new ArrayList();
	
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
			
			Scanner heroInput = new Scanner(System.in);
			System.out.println("Enter the Name Hero to be updated");
			String heroName = heroInput.nextLine();
			heroList.get(0).setName(heroName);
			System.out.println("Enter the CharacterName of Hero In the Movie");
			String herocharName = heroInput.nextLine();
			heroList.get(0).setCharacterName(herocharName); 
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
			Scanner heroineInput = new Scanner(System.in);
			System.out.println("Enter the Name of Heroine to be updated");
			String heroineName = heroineInput.nextLine();
			heroineList.get(0).setName(heroineName);
			System.out.println("Enter the CharacterName of Hero In the Movie");
			String heroinecharName = heroineInput.nextLine();
			heroineList.get(0).setCharacterName(heroinecharName); 
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
			Scanner antiheroInput = new Scanner(System.in);
			System.out.println("Enter the Name of Ant_Hero to be updated");
			String antiheroName = antiheroInput.nextLine();
			antiHeroList.get(0).setName(antiheroName);
			System.out.println("Enter the CharacterName of Anti_Hero In the Movie");
			String antiherocharName = antiheroInput.nextLine();
			antiHeroList.get(0).setCharacterName(antiherocharName); 
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
			Scanner comedianInput = new Scanner(System.in);
			System.out.println("Enter the Name of Comedian to be updated");
			String comedianName = comedianInput.nextLine();
			comedianList.get(0).setName(comedianName);
			System.out.println("Enter the CharacterName of Hero In the Movie");
			String comediancharName = comedianInput.nextLine();
			comedianList.get(0).setCharacterName(comediancharName); 
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
