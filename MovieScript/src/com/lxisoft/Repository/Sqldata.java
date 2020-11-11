package com.lxisoft.Repository;
import com.lxisoft.Control.*;
import com.lxisoft.Modal.*;
import java.sql.*;
import java.util.Collections;
import java.util.ArrayList;


public class Sqldata 
{
	
	Connection con = null;
	ResultSet rs= null;
	Statement stmt = null;
	PreparedStatement ps = null;
	int row;
			ArrayList<Script> script=new ArrayList<Script>();

	public void databaseConnection() 
	{

	
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			try{
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scriptwriter","root","root");	
			}catch(SQLException e)
			{
				e.printStackTrace();		
			}
			
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}//this.addToDatabase();
	}

	public void addToDatabase(Script script)
	{
		databaseConnection();
		try
		{
						//ArrayList<Script> script=new ArrayList<Script>();

			ps = con.prepareStatement("insert into scriptwriter(ActorName,Dialogue) values('"+script.getName()+"','"+script.getDialogue()+"')");
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
		databaseConnection();
		try
		{
			String sql  = "select * from scriptwriter" ;
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			int i = 0;
			while(rs.next())
			{
				script.add(i,new Script());
				script.get(i).setName(rs.getString("ActorName"));
				script.get(i).setDialogue(rs.getString("Dialogues"));
				i++;		
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		//return script;
	}

	
	
	
}
