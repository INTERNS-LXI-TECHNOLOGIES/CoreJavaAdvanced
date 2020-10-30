package com.LxiSoft.Movie;
import java.util.Scanner;
public class Movie
{
	Comedian comedy=new Comedian();
 	Villain villan=new Villain();
   Hero actor=new Hero();
   Crude crude=new Crude();
 CreateFile files=new CreateFile();
	Scanner scnr=new Scanner(System.in);
	public void begining()
	{
		  
      
    System.out.println("       ************************************************************************");
    System.out.println("       *                                                                      *");
    System.out.println("       *                       Movie Script                                   *");   
    System.out.println("       *                      by Writer Koshy                                 *");
    System.out.println("       *                                                                      *");
    System.out.println("       ************************************************************************");
   
    this.dialoguSelection();
	}
	public void dialoguSelection()
	{

 int choice=0;
    do
    {
      System.out.println("\n________________________");
      System.out.println("\nChoose Dialogues to display ");
      
        System.out.println("\n\n1.Villain  \n\n2. Comedian \n\n 3. Main Actor \n \n 4. edit Dialogues");
        choice=scnr.nextInt();
        if(choice==1)
        {
        	files.villainFileMake();
           villan.writeHarshDialogue();
        }
        if(choice==2)
        {
        	
        	files.comdeyFileMake();
            comedy.writeComedyDialogue();

         
        }
        if (choice==3)
		{
			files.heroFileMake();
			actor.writeMainDialogue();

		}
		 if (choice==4)
		{
			crude.crudeFunctions();

		}
	        else if(choice==0)
        {
            System.out.println(" ");
        }
    }
    while(choice>0);
      
}

	
}