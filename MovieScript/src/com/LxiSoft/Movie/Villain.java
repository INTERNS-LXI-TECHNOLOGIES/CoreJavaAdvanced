package com.LxiSoft.Movie;
import java.util.*;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
public class Villain extends Actors 

{
	File villainFile = new File("C:\\home\\Desktop\\lxi_works1\\EEJavaFoundational\\MovieScript\\Files\\villainFile.txt");

	public void villainFileMake()
	{
		try
		{
	
	if(villainFile.createNewFile())
	{
		System.out.println("File created"+villainFile.getName());
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
   this.VillainFileInfo();
  }
  public void VillanFileInfo()
  {
  	if(villainFile.exists())
  	{
  		System.out.println("File name: "+villainFile.getName());
  		System.out.println("File path: "+villainFile.getAbsolutePath());
  			System.out.println("File Writable: "+villainFile.canWrite());
  		System.out.println("File readable: "+villainFile.canRead());
  		System.out.println("File size in bytes: "+villainFile.length());
  		
  	}
  	else
{
	System.out.println("File Doesnt excist;");  		
}
  }
	public void writeHarshDialogue()
	{
		this.villainFileMake();
		try
		{

FileWriter myWriter= new FileWriter("C:\\home\\Desktop\\lxi_works1\\EEJavaFoundational\\MovieScript\\Files\\villainFile.txt"); 

		myWriter.write("Are you the Villain?");
		myWriter.close();
}

catch(IOException e)
{
	System.out.println("An error occured");
   e.printStackTrace();
   }
	
	
	this.readHarshDialogue();
	
	}

	public void readHarshDialogue()
	{

		
			File myDialogue= new File ("C:\\home\\Desktop\\lxi_works1\\EEJavaFoundational\\MovieScript\\Files\\dialogues.txt");

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

