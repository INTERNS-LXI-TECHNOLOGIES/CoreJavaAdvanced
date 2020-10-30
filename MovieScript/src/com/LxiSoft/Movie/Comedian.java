package com.LxiSoft.Movie;
import java.util.*;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
public class Comedian extends Actors 
{
	//try
	//{
public ArrayList<String> comediDialogue= new ArrayList<String>(/*Files.readAllLines(Paths.get(comedydialogues.txt))*/);
//}
//catch (IOException e) {
    // Handle a potential exception
//}
	Random random=new Random();

private String comedianDialogue;

public void setComedianDialogue(String a)
{
	this.comedianDialogue=a;
}	
public String getComedianDialogue()
{
	return comedianDialogue;
}


public void writeComedyDialogue()
	{
		try
		{

FileWriter myWriter= new FileWriter("C:\\home\\Desktop\\lxi_works1\\EEJavaFoundational\\MovieScript\\classes\\comedydialogues.txt"); 

		myWriter.write("comedian: haha i am so funny");
		
	myWriter.write("Comedian: yaya me tooo.");	
	myWriter.write("Comedian: what are the new jokes you have");							
	myWriter.close();
}

catch(IOException e)
{
	System.out.println("An error occured");
   e.printStackTrace();
   }
	
	System.out.println(comediDialogue.get(random.nextInt(comediDialogue.size())));
	this.readComedyDialogue();
	}


public void readComedyDialogue()
	{

		
			File myDialogue= new File ("C:\\home\\Desktop\\lxi_works1\\EEJavaFoundational\\MovieScript\\classes\\comedydialogues.txt");

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
public void addComedianDialogue(FileWriter myWriter)
{
	 comediDialogue.add("SCENE 1");
   comediDialogue.add(" comedian: WOW");

   comediDialogue.add("SCENE 1 :CORAL Mmm.");

 comediDialogue.add("SCENE 1:MARLIN Wow.");

 comediDialogue.add("SCENE 1:CORAL Mmm-hmm.");

 comediDialogue.add("SCENE 1:MARLIN Wow.");

}
}
