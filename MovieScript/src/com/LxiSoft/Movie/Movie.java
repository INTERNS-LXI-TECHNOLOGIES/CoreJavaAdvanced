package com.LxiSoft.Movie;
import java.util.Scanner;
public class Movie
{
	Comedian comedy=new Comedian();
 	Villain villan=new Villain();
   Hero actor=new Hero();
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
  // files.fileMake();
    this.dialoguSelection();
	}
	public void dialoguSelection()
	{

 int choice=0;
    do
    {
      System.out.println("\n________________________");
      System.out.println("\nChoose Dialogues to display ");
      
        System.out.println("\n\n1.Villain  \n\n2. Comedian \n\n 3. Main Actor \n");
        choice=scnr.nextInt();
        if(choice==1)
        {
           villan.writeHarshDialogue();
        }
        if(choice==2)
        {
             
          comedy.writeComedyDialogue();

         
        }
        if (choice==3)
		{
			actor.writeMainDialogue();

		}
	        else if(choice==0)
        {
            System.out.println(" ");
        }
    }
    while(choice>0);
      
}

	
}