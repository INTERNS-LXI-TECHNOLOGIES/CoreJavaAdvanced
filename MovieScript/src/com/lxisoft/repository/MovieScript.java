package com.lxisoft.repository;
import com.lxisoft.repository.*;
import com.lxisoft.controller.*;
import com.lxisoft.model.*;
import com.lxisoft.view.*;
import java.util.*;
import java.sql.*;
public class MovieScript{
	Connection con = null;
    Statement stmnt = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	int row;

	public void databaseConnection(){
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			try{
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MovieScript","root","abi@1003"); 
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}

	public void addToDatabase(ArrayList<Script> script){
		this.databaseConnection();
		try{
			ps = con.prepareStatement("insert into script1(actor,dialogues) values('"+script.get(1).getName()+"','"+script.get(1).getDialogue0()+"','"+script.get(2).getName()+"','"+script.get(2).getDialogue0()+"','"+script.get(1).getName()+"','"+script.get(1).getDialogue1()+"','"+script.get(0).getName()+"','"+script,get(0).getDialogue0()+"','"+script.get(1).getName()+"','"+script.get(1).getDialogue2()+"','"+script.get(2).getName()+"','"+script.get(2).getDialogue1()+"','"+script.get(0).getName()+"','"+script.get(0).getDialogue1()+"','"+script.get(2).getName()+"','"+script.get(2).getDialogue2()+"','"+script.get(0).getName()+"','"+script.get(0).getDialogue2()+"','"+script.get(1).getName()+"','"+script.get(1).getDialogue3()+"','"+script.get(0).getName()+"','"+script.get(0).getDialogue3()+"','"+script.get(0).getName()+"','"+script.get(0).getDialogue4()+"','"+script.get(1).getName()+"','"+script.get(1).getDialogue4()+"','"+script.get(2).getName()+"','"+script.get(2).getDialogue3()+"','"+script.get(0).getName()+"','"+script.get(0).getDialogue5()+"','"+script.get(0).getName()+"','"+script.get(0).getDialogue6()+"','"+script.get(1).getName()+"','"+script.get(1).getDialogue5()+"','"+script.get(2).getName()+"','"+script.get(2).getDialogue4()+"','"+script.get(0).getName()+"','"+script.get(0).getDialogue7()+"','"+script.get(1).getName()+"','"+script.get(1).getDialogue6()+"','"+script.get(3).getName()+"','"+script.get(3).getDialogue0()+"','"+script.get(3).getName()+"','"+script.get(3).getDialogue1()+"','"+script.get(2).getName()+"','"+script.get(2).getDialogue5()+"','"+script.get(0).getName()+"','"+script.get(0).getDialogue8()+"','"+script.get(3).getName()+"','"+script.get(3).getDialogue2()+"','"+script.get(0).getName()+"','"+script.get(0).getDialogue9()+"','"+script.get(3).getName()+"','"+script.get(3).getDialogue3()+"','"+script.get(0).getName()+"','"+script.get(0).getDialogue10()+"','"+script.get(3).getName()+"','"+script.get(3).getDialogue4()+"','"+script.get(2).getName()+"','"+script.get(2).getDialogue6()+"','"+script.get(3).getName()+"','"+script.get(3).getDialogue5()+")");
            row = ps.executeUpdate();
            ps.close();
            con.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
}