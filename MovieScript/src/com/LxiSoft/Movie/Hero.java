package com.LxiSoft.Movie;
import java.io.FileWriter;
import java.io.File;
import java.util.*;

import java.io.IOException;
public class Hero extends Actors
{
	File heroFile = new File("C:\\home\\Desktop\\lxi_works1\\EEJavaFoundational\\MovieScript\\classes\\heroFile.txt");

	public void heroFileMake()
	{
		try
		{
	
	if(heroFile.createNewFile())
	{
		System.out.println("File created"+heroFile.getName());
	}
	else
	{
		System.out.println("File Already Created");
	}

}
catch(IOException e)
{
	System.out.println("An error occured");
   e.printStackTrace();
   }
   this.heroFileInfo();
  }
  public void heroFileInfo()
  {
  	if(villainFile.exists())
  	{
  		System.out.println("File name: "+heroFile.getName());
  		System.out.println("File path: "+heroFile.getAbsolutePath());
  			System.out.println("File Writable: "+heroFile.canWrite());
  		System.out.println("File readable: "+heroFile.canRead());
  		System.out.println("File size in bytes: "+heroFile.length());
  		
  	}
  	else
{
	System.out.println("File Doesnt excist;");  		
}
  }
	public void writeMainDialogue()
	{
		this.heroFileMake();
		try
		{

FileWriter myWriter= new FileWriter("C:\\home\\Desktop\\lxi_works1\\EEJavaFoundational\\MovieScript\\classes\\heroFile.txt"); 

		myWriter.write("Are you the Main");
		myWriter.close();
}

catch(IOException e)
{
	System.out.println("An error occured");
   e.printStackTrace();
   }
	
	
	this.readMainDialogue();
	}

	public void readMainDialogue()
	{

		
			File myDialogue= new File ("C:\\home\\Desktop\\lxi_works1\\EEJavaFoundational\\MovieScript\\classes\\heroFile.txt");

	try
	{
			Scanner print=new Scanner (myDialogue);
			while(print.hasNextLine())
			{
				String data=print.nextLine();
				System.out.println(data);
			}
		print.close();
	}
	catch (Exception e)
	{
		System.out.println("An erroro happends");
		e.printStackTrace();
	}
}
}