package com.lxisoft.repository;
import com.lxisoft.repository.*;
import com.lxisoft.controller.*;
import com.lxisoft.model.*;
import com.lxisoft.view.*;
import java.util.*;
import java.sql.*;
public class CastList{
	Connection con = null;
    Statement stmnt = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	int row;

	public void databaseConnection(){
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			try{
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/castslist","root","abi@1003"); 
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}

	public void addToDatabase(ArrayList<Cast> cast){
		this.databaseConnection();
		try{
		
			for(int i=0;i<cast.size();i++){
				ps = con.prepareStatement("insert into actors(name,charector) values('"+cast.get(i).getName()+"','"+cast.get(i).getCharectorName()+"'')");
                row = ps.executeUpdate();
                ps.close();
                con.close();
			}
           // if(row > 1){
            //	System.out.println("New item added");
           // }
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
	public void deleteFromDatabase(){
		this.databaseConnection();
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the name of the actor to be deleted ");
			String delete = sc.nextLine();

			String command = "DELETE FROM actors WHERE name='"+delete+"'";
			ps = con.prepareStatement(command);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
}