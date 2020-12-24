package com.lxisoft.repository;
import com.lxisoft.View.*;
import com.lxisoft.Control.Controler;
import com.lxisoft.Model.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
public class ContactRepository
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
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","password"); 
      }catch(SQLException e)
      {
        e.printStackTrace();    
      }
      
    }catch(ClassNotFoundException e)
    {
      e.printStackTrace();
    }
  }
  public void addToDatabase(Contact contact)
  {
    createDatabaseConnection();
    try
    {
      
      ps = con.prepareStatement("insert into contactapp(FirstName,LastName,MailId,Number) values('"+contact.getFirstName()+"','"+contact.getLastName()+"','"+contact.getMailId()+"','"+contact.getNumber()+"')");
      row = ps.executeUpdate();
      ps.close();
      con.close();
    }
    catch(SQLException e)
    {
      e.printStackTrace();
    }
  }

  public void viewDatabase(ArrayList<Contact> contact)
  {
    createDatabaseConnection();
    try
    {
      String sql  = "select * from contactapp";
      stmt = con.createStatement();
      rs = stmt.executeQuery(sql);
      while (rs.next()) 
       {
                int id = rs.getInt("id");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String mailid = rs.getString("mailid");
                int number = rs.getInt("number");
                System.out.println(id+") "+firstname+":"+"\n"+"    "+lastname+"\n"+"    "+mailid+"\n"+"    "+number);
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
      String sql = "select * from contactapp where FirstName = '"+name+"'";
      stmt = con.createStatement();
      rs = stmt.executeQuery(sql);
       while (rs.next()) 
       {
                int id = rs.getInt("id");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String mailid = rs.getString("mailid");
                int number = rs.getInt("number");
                System.out.println(id+") "+firstname+":"+"\n"+"    "+lastname+"\n"+"    "+mailid+"\n"+"    "+number);
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
      String sql = "delete from contactapp where id ='"+deleteId+"'";
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
