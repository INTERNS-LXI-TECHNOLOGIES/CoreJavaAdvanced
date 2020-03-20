package com.lxisoft.repository;
import java.io.*;  
import java.util.*;  

public class FileReppo
{

public void createDatabaseConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactdb","root","root")
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}


public void creatFile(File file)
{
	// File file =new File(name);
		try
		{
			
			file.createNewFile();
			}
	   	catch(Exception ex)
	   	{	System.out.println("* "+ex); }
}

public void writeTofile(String name,String write)
{
	 try {
      FileWriter myWriter = new FileWriter(name,true);
      myWriter.write(write+",");
      myWriter.close();
      } catch (IOException e) {
      System.out.println("An error occurred."+e);
      e.printStackTrace();    }
}
public void writeTofile(String name,int write)
{
	 try {
      FileWriter myWriter = new FileWriter(name,true);
      myWriter.write(write+",");
      myWriter.close();
      } catch (IOException e) {
      System.out.println("An error occurred."+e);
      e.printStackTrace();    }
}

public void readDialogue(String name,ArrayList<Contact>contacts)
{
String line = null; 

	try  
	{  
	
	BufferedReader br = new BufferedReader(new FileReader(name));  
		while ((line = br.readLine()) != null)
			{
			
				String[] name = line.split(",");
				for(int i=0;i<name.length;i+3)
				{
					if(name[i]!=null)
					{ 
						contacts.add(new Dialogue());
					 contacts.get(i).setfirstname(name[i]);
 					 contacts.get(i).setlastname(name[i+1]);
 					 contacts.get(i).setnumber(i+2);
						
					}
				}
			} 
			
			
	} catch(IOException e)  
		{  e.printStackTrace();  }  
}


}