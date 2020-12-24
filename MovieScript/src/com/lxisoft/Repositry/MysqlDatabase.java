package com.Lxisoft.Repositry;
import com.Lxisoft.MovieScriptApp.Control.*;
import com.Lxisoft.MovieScriptApp.Model.CastDetails;
import java.sql.*;
import java.util.*;

public class MysqlDatabase
{
	ArrayList<CastDetails> cast = new ArrayList<CastDetails>();
	CastDetails cs = new CastDetails();
	Connection con = null;
	ResultSet rs= null;
	Statement stmt = null;
	PreparedStatement ps = null;;
	int row;
	
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
  int row;
  
  public void createDatabaseConnection()
  {
    try
    
{
      Class.forName("com.mysql.cj.jdbc.Driver");
      try{
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MovieScript","root","98467691"); 
      }catch(SQLException e)
      {
        e.printStackTrace();    
      }
      
    }catch(ClassNotFoundException e)
    {
      e.printStackTrace();
    }
  }
  public void addToDatabase(CastDetails cs)
  {
    createDatabaseConnection();
    try
    {
      
      ps = con.prepareStatement("INSERT INTO MovieScript (actor,dialogue1,dialogue2,dialogue3,dialogue4,dialogue5,dialogue6,dialogue7) values('"+script.getName()+"','"+script.getDialogue1()+"','"+script.getDialogue2()+"','"+script.getDialogue3()+"','"+script.getDialogue4()+"','"+script.getDialogue5()+"','"+script.getDialogue6()+"','"+script.getDialogue7()+"')");
      row = ps.executeUpdate();
      ps.close();
      con.close();
    }
    catch(SQLException e)
    {
      e.printStackTrace();
    }
  }

  public void viewDatabase(ArrayList<Script> script)
  {
    createDatabaseConnection();
    try
    {
      String sql  = "select * from Moviee" ;
      stmt = con.createStatement();
      rs = stmt.executeQuery(sql);
      while (rs.next()) 
       {
                int id = rs.getInt("id");
                String actor = rs.getString("actor");
                String dialogue1 = rs.getString("dialogue1");
                String dialogue2 = rs.getString("dialogue2");
                String dialogue3 = rs.getString("dialogue3");
                String dialogue4 = rs.getString("dialogue4");
                String dialogue5 = rs.getString("dialogue5");
                String dialogue6 = rs.getString("dialogue6");
                String dialogue7 = rs.getString("dialogue7");
                System.out.println(id+") "+actor+":"+"\n"+"    "+dialogue1+"\n"+"    "+dialogue2+"\n"+"    "+dialogue3+"\n"+"    "+dialogue4+"\n"+ "    "+dialogue5+"\n"+ "    "+dialogue6+"\n"+ "    "+dialogue7);
        }
      stmt.close();
      con.close();
    }
    catch(SQLException e)
    {
      e.printStackTrace();
    }
  }

  public void searchDatabase(String name)
  {
    createDatabaseConnection();
    try
    {
      String sql = "select * from moviee where actor = '"+name+"'";
      stmt = con.createStatement();
      rs = stmt.executeQuery(sql);
       while (rs.next()) 
       {
                int id = rs.getInt("id");
                String actor = rs.getString("actor");
                String dialogue1 = rs.getString("dialogue1");
                String dialogue2 = rs.getString("dialogue2");
                String dialogue3 = rs.getString("dialogue3");
                String dialogue4 = rs.getString("dialogue4");
                String dialogue5 = rs.getString("dialogue5");
                String dialogue6 = rs.getString("dialogue6");
                String dialogue7 = rs.getString("dialogue7");
                System.out.println(id+") "+actor+":"+"\n"+"    "+dialogue1+"\n"+"    "+dialogue2+"\n"+"    "+dialogue3+"\n"+"    "+dialogue4+"\n"+ "    "+dialogue5+"\n"+ "    "+dialogue6+"\n"+ "    "+dialogue7);
        }
      stmt.close();
      con.close();
      System.out.println(name+" is there in the table ");
    }
    catch(SQLException e)
    {
      System.out.println(e);
    }
  }