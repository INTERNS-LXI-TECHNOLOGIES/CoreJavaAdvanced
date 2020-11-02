package com.lxisoft.Movies;
import com.lxisoft.Test.TDD;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import javax.swing.*;  


public class Movie
{
	JFrame f;  

	private int choice=0;
	public void movieDetails()
	{

	//	scene.scenePrint();
		do
		{
		Scanner scn=new Scanner(System.in);
		 f=new JFrame();   
    JOptionPane.showMessageDialog(f,"Insert the Index No:\n1.Statutary Notice  2.Start the movie  3.Character sketch  4.Actors Info  5.Update Dialogues");  
		choice=scn.nextInt();
		if(choice==1)
		{
	    String message = "This is a modified scene from the original movie \u001b[33m\033[1mToy Story\033[0m by \u001b[31m\033[1mPIXAR\033[0m.\nThe scene depicts a emotional scene where buzz inorder to rescue,\nhis girlfriend he cuts tie from his own evil brother.\n";
        this.slowPrint(message, 40);
       
    	}
		else if (choice==2)
		{
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("--------                                                             --------");
			System.out.println("--------                                                             --------");
			System.out.println("--------                                                             --------");
			System.out.println("--------                                                             --------");
			System.out.println("--------         \t  \t  \u001b[33m\033[1mToy Story\033[0m                          --------");
			System.out.println("--------                                                             --------");
			System.out.println("--------                                                             --------");
			System.out.println("--------                                                             --------");
			System.out.println("--------                                                             --------");
			System.out.println("--------                                                             --------");
			System.out.println("-------- \u001b[31m\033[1mDirector-John Lasseter\033[0m                                      --------");
			System.out.println("-------- \u001b[31m\033[1mProducer-PIXAR\033[0m                                              --------");
			System.out.println("-------- \u001b[31m\033[1mCinematographer-Sharon Calahhan\033[0m                             --------");
			System.out.println("--------     		         \u001b[36m\033[1m--Artists--\033[0m                         --------");
			System.out.println("--------                                                             --------");
			System.out.println("--------\u001b[36m\033[1mTom Hanks\033[0m 	\u001b[36m\033[1mJoan Cusack\033[0m 	\u001b[36m\033[1mTim Allen\033[0m    \u001b[36m\033[1mErik Von Detten\033[0m --------");
			System.out.println("--------                                                             --------");
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("-----------------------------------------------------------------------------"+"\n");
			
			System.out.println("----------------------------\u001b[36m\033[1mScene Begins\033[0m-------------------------------------");
			System.out.println("-----------------------------\u001b[36m\033[1mScene One\033[0m---------------------------------------");
			String message1="First Scene:\nJessie has been kidnapped by Sid and took her to a shady hide out,\nwoodie and Buzz travels to Sid's secret hideout\nHere,we see a shady rusty place wherer Sid is about to torture Jessie\n\n";
				        this.slowPrint(message1, 20);
				        System.out.println("* __*****************");
				        System.out.println("*|__|*|***|^^|**|**|*");
				        System.out.println("*|__|*|'|*|^^|**|**|*");
				        						Scene scene=new Scene();

		scene.scenePrint();
		//scene.createFile();

		}
		else if (choice==3)
		{
			Sheriff woodie=new Sheriff();
			Buzz buzz=new Buzz();
			Jessie jessie=new Jessie();
			Sid sid=new Sid();
		woodie.scriptDisplay();
		jessie.scriptDisplay();
		buzz.scriptDisplay();
		sid.scriptDisplay();
		}
		else if (choice==4)
		{
			Info info=new Info();
			info.infoPrint();
		}
		else if (choice==5)
		{
							        						Scene scene=new Scene();

			scene.menu();
		}
	}while(choice<6);
	}
		public static void slowPrint(String message, long millisPerChar)
    {
        for (int i = 0; i < message.length(); i++)
        {
            System.out.print(message.charAt(i));

            try
            {
                Thread.sleep(millisPerChar);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
	}
	public void villain1()
	{
		String message3="\t  \u001b[31m\033[1mThe Villain Enters.\033[0m\n";
		this.slowPrint(message3, 40);

	}
	public void villain2()
	{
		String message4="\t  \u001b[31m\033[1mSid is trying to manipulate his brothers mind.\033[0m\n";
				this.slowPrint(message4, 40);
	}
	public void villain3()
	{
		String message5="\t  \u001b[31m\033[1mSid is loosing all hope.\033[0m\n";
				this.slowPrint(message5, 40);
	}
	public void villain4()
	{
		System.out.println("-----------------------------\u001b[36m\033[1mScene Two\033[0m---------------------------------------");
		String message6="Second Scene:\nIn this scene we see Sid dead and Buzz weeps\nThen they both unties Jessie and unites.\n\n";
				        this.slowPrint(message6, 40);
	}
	public void villain5()
	{
		System.out.println("-----------------------------\u001b[36m\033[1mEnd\033[0m---------------------------------------");
		String message7="Final Scene:\nHere,woodie buzz and jessie heads towrds their home,\nBuzz is a little sad over his brother,but he now has a family to cheer him up\nJessie now knows no matter wat her friends are always there for her.\n";
				        this.slowPrint(message7, 40);
	}

}




