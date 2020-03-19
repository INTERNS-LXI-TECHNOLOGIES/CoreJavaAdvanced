package com.lxisoft.repository;
import java.io.*;  
import java.util.*;  

public class FileReppo
{

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


}