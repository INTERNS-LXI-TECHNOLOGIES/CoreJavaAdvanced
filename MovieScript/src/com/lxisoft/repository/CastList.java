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
				System.out.println("Name : "+cast.get(i).getName()+" Charector : "+cast.get(i).getCharectorName());
				ps = con.prepareStatement("insert into actors(id,name,charector) values('"+i+"','"+cast.get(i).getName()+"','"+cast.get(i).getCharectorName()+"')");
                row = ps.executeUpdate();  
			}
			ps.close();
            con.close();
            this.showDatabase();
           // if(row > 1){
            //	System.out.println("New item added");
           // }
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
	public void showDatabase(){
		this.databaseConnection();
		try{
			stmnt = con.createStatement();
			rs = stmnt.executeQuery("select * from actors");

			while(rs.next()){
				int id = rs.getInt("id");
				String rName = rs.getString("name");
				String cName = rs.getString("charector");

				System.out.println("  ID       : "+id+"\n  Name     : "+rName+"\n Character : "+cName);
			}
			rs.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
	public void deleteFromDatabase(){
		this.databaseConnection();
		try{
			stmnt = con.createStatement();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the S.No of the actor to be deleted ");
			int delete = sc.nextInt();

			stmnt.executeUpdate("delete from actors where id ='"+delete+"'");

			System.out.println("Deleted 1 row ");
			this.showDatabase();
			//String command = "delete from actors where name='"+delete+"'";
			//ps = con.prepareStatement("'delete from actors where id ='"+delete+"'");
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
}