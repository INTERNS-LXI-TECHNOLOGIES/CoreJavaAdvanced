package com.lxisoft.repository;
import com.lxisoft.View.Movie;
import com.lxisoft.Control.Controler;
import com.lxisoft.Model.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
public class Movierepository
{
  Connection con = null;
  ResultSet rs= null;
  Statement stmt = null;
  PreparedStatement ps = null;;
  int row;
  
  public void createDatabaseConnection()
  {
    try
    {
      Class.forName("com.mysql.cj.jdbc.Driver");
      try{
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/moviee","root","password"); 
      }catch(SQLException e)
      {
        e.printStackTrace();    
      }
      
    }catch(ClassNotFoundException e)
    {
      e.printStackTrace();
    }
  }
  public void addToDatabase(Script script)
  {
    createDatabaseConnection();
    try
    {
      
      ps = con.prepareStatement("insert into moviee(actor,dialogue1,dialogue2,dialogue3,dialogue4,dialogue5,dialogue6,dialogue7) values('"+script.getName()+"','"+script.getDialogue1()+"','"+script.getDialogue2()+"','"+script.getDialogue3()+"','"+script.getDialogue4()+"','"+script.getDialogue5()+"','"+script.getDialogue6()+"','"+script.getDialogue7()+"')");
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

  public void deleteRecord(int deleteId)
  {
    createDatabaseConnection();
    try
    {
      String sql = "delete from moviee where id ='"+deleteId+"'";
      stmt = con.createStatement();
      stmt.executeUpdate(sql);
      stmt.close();
      con.close();
      System.out.println(deleteId+" is deleted from the table ");
    }catch(SQLException e)
    {
      System.out.println(e);
    }
  }
}
