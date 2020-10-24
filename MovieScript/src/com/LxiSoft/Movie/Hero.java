package com.LxiSoft.Movie;
import java.util.*;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
public class Hero extends Actors
{
	public void writeMainDialogue()
	{
		try
		{

FileWriter myWriter= new FileWriter("C:\\home\\Desktop\\lxi_works1\\EEJavaFoundational\\MovieScript\\classes\\herodialogues.txt"); 

		myWriter.write("Are you the Main");

		myWriter.write("yaya You made me as the hero");
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

		
			File myDialogue= new File ("C:\\home\\Desktop\\lxi_works1\\EEJavaFoundational\\MovieScript\\classes\\herodialogues.txt");

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