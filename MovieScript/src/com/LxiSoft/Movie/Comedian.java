package com.LxiSoft.Movie;
import java.util.*;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
public class Comedian extends Actors 
{
	try
	{
public ArrayList<String> comediDialogue= new ArrayList<String>(Files.readAllLines(Paths.get(comedydialoguestxt)));
}
catch (IOException e) {
    // Handle a potential exception
}
	Random random=new Random();

private String comedianDialogue;

public void setComedyDialogue(String a)
{
	this.comedianDialogue=a;
}	
public String getComedyDialogue()
{
	return comedyDialogue;
}


public void writeComedyDialogue()
	{
		/*try
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
	
	//System.out.println(comediDialogue.get(random.nextInt(comediDialogue.size())));
*/	this.readComedyDialogue();
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
}
