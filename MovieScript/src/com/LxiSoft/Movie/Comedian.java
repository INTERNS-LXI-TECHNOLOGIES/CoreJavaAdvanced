package com.LxiSoft.Movie;
import java.util.*;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
public class Comedian extends Actors 
{
//public ArrayList<String> comediDialogue= new ArrayList<String>();
	//Random random=new Random();


private String comedyDialogue;

/*public void setComedyDialogue(String a)
{
	this.comedyDialogue=a;
}	
public String getComedyDialogue()
{
	return comedyDialogue;
}
*/
File comedyFile = new comedyFile("C:\\home\\Desktop\\lxi_works1\\EEJavaFoundational\\MovieScript\\classes\\comedyFile.txt");

	public void comedyFileMake()
	{
		try
		{
	
	if(comedyFile.createNewFile())
	{
		System.out.println("File created"+comedyFile.getName());
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
   this.ComedyFileInfo();
  }
  public void comedyFileInfo()
  {
  	if(comedyFile.exists())
  	{
  		System.out.println("File name: "+comedyFile.getName());
  		System.out.println("File path: "+comedyFile.getAbsolutePath());
  			System.out.println("File Writable: "+comedyFile.canWrite());
  		System.out.println("File readable: "+comedyFile.canRead());
  		System.out.println("File size in bytes: "+comedyFile.length());
  		
  	}
  	else
{
	System.out.println("File Doesnt excist;");  		
}
  }
public void writeComedyDialogue()
	{
		this.comedyFileMake();
		try
		{

FileWriter myWriter= new FileWriter("C:\\home\\Desktop\\lxi_works1\\EEJavaFoundational\\MovieScript\\classes\\comedyFile.txt"); 

		myWriter.write("Trainer: If an old man and a child come near your car, what will you hit?\nGirl: Old man.\nTrainer: Idiot. You should hit the BRAKE.");
		myWriter.close();
		//myWriter.write("Boy: Hey, you look so beautiful\n\nGirl: Aww. Thank you. I don’t know what to say.\nBoy: Just lie something, like I did.");							
	
}

catch(IOException e)
{
	System.out.println("An error occured");
   e.printStackTrace();
   }
	
	//System.out.println(comediDialogue.get(random.nextInt(comediDialogue.size())));
	this.readComedyDialogue();
	}

	public void readComedyDialogue()
	{

		
			File myDialogue= new File ("C:\\home\\Desktop\\lxi_works1\\EEJavaFoundational\\MovieScript\\classes\\comedyFile.txt");

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
		System.out.println("An error happends");
		e.printStackTrace();
	}
}
}
