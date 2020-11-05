package com.lxisoft.Control;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import com.lxisoft.View.*;
import com.lxisoft.Modal.*;
import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Director
{
			ArrayList<String> script=new ArrayList<String>();
			    		ArrayList<movieInfo> movieinfo =new ArrayList<movieInfo>();


	public void scene(int choice)
	{
			Movie movie=new Movie();
			Sheriff woodie=new Sheriff();
			Buzz buzz=new Buzz();
			Jessie jessie=new Jessie();
			Sid sid=new Sid();

	do
		{
			if(choice==1)
			{
				movie.title1();
			}
			else if(choice==2)
			{
				movie.title2();	    			
			}
			else if(choice==3)
			{

				woodie.scriptDisplay();
				jessie.scriptDisplay();
				buzz.scriptDisplay();
				sid.scriptDisplay();			
			}
			else if(choice==4)
			{
				movie.title3();	    			
			}
		
		}while(choice<5);
	}

	public void screenPlay()
	{

		script.add("Stop right there sid you have no where to go.");			
		script.add("Hang on there jessie	we will rescue you.");		
		script.add("Help ME guys 	kill this scumbag!!!.");		
		script.add("HAHAHA!!!! you are wrong you imbeciles you guys are no...match for me.");			
		script.add("Buzz kill him with your laser shot.");			
		script.add("He wont	");		
		script.add("Before you strike me think for a second im your family and do u wish to take words from ur friends who doesnt value you.");		
		script.add("Do it Buzz..");			
		script.add("Just think	how they treated you being a soldier they never gave you the position everyone needs only woodie even this jeesie.");
		script.add("Buzz!!! Dont listen to him.");			
		script.add("Dont listen to him	he is playing with your mind.");		
		script.add("I can't its my brother after all");
		script.add("kill him Buzz.");	
		script.add("Think!!! do wou want to kill me.	");		
		script.add("Buzz remember all the fun we had together.");		
		script.add("OK thats enough When i needed someone the most i had only my friends.");	
		script.add("Sorry sid this has to end somehow.	");		
		script.add("NO!!!!......");		
		script.add("I am sorry BUzz i couldnt be a good brother for you	have a happy life.	");	
		script.add("weeps ----.");
		script.add("Its over buzz come buddy lets untie jessie.	");		
		script.add("I knew you would rescue me	nd we are sorry for your brother.		");
		script.add("hmm evil has to end somehow.");
		script.add("yea anyway im happy we got you in  (giggles).");
		script.add("yippe.");
		script.add("haha yeahh 	finally we r a family again.");
	}

	public void createFile()
	{
		try{
            FileOutputStream writeData = new FileOutputStream(("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file.csv"));
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(script);
            writeStream.flush();
            writeStream.close();
        	}
        	catch (IOException e) 
        	{
            e.printStackTrace();
        	}
        				Movie movie=new Movie();

        	movie.dialogue(script);
	}
    public void mi()
    {

					movieinfo.add(new movieInfo("Tom Hanks",64,200,"Best Actor "));
					movieinfo.add(new movieInfo("Joan Cusack",57,75,"Best Actress"));
					movieinfo.add(new movieInfo("Tim Allen",67,170,"Best Debut "));	
					movieinfo.add(new movieInfo("Errik Deten",38,20,"Best Villain"));
    } 
	public void cast(int choice)
	{
	
			
		Movie movie=new Movie();


		do
		{
		if(choice==1)
				{
					
					Collections.sort(movieinfo);
					movie.cast1();


				}
				else if(choice==2)
				{
	 				Actorage actorage=new Actorage(); 
	 				Collections.sort(movieinfo,actorage);
	 				movie.cast2();

				}
				else if (choice==3)
				{
					movie.cast3();

				}
		}while(choice<4);
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
	}