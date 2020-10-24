package com.LxiSoft.Movie;
import java.util.*;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
public class Villain extends Actors 
{
	public void writeHarshDialogue()
	{
		try
		{

FileWriter myWriter= new FileWriter("C:\\home\\Desktop\\lxi_works1\\EEJavaFoundational\\MovieScript\\classes\\villaindialogues.txt"); 

		myWriter.write("\nAre you the Villain?");

		myWriter.write("\n NO you made me the villain");
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

		
			File myDialogue= new File ("C:\\home\\Desktop\\lxi_works1\\EEJavaFoundational\\MovieScript\\classes\\villaindialogues.txt");

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

