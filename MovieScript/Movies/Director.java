package com.lxisoft.Movies;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Director
{

ArrayList<String> script=new ArrayList<String>();
	public void script()
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
					this.createFile();
					this.outputFile();
}

public void createFile(){
	try{
            FileOutputStream writeData = new FileOutputStream(("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file.csv"));
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(script);
            writeStream.flush();
            writeStream.close();
            					//this.outputFile();


        }catch (IOException e) {
            e.printStackTrace();
        }
}
public void outputFile()
{
try{
	Movie movie =new Movie();
        System.out.println("\u001b[35m\033[1mWoodie:\033[0m"+script.get(1));
        Thread.sleep(950);
        System.out.println("\u001b[37m\033[1mBuzz  :\033[0m"+script.get(2));
        Thread.sleep(950);
        System.out.println("\u001b[33m\033[1mJessie:\033[0m"+script.get(3));
        Thread.sleep(950);
        			movie.villain1();

        System.out.println("\u001b[31m\033[1mSid   :\033[0m"+script.get(4));
        Thread.sleep(950);
        System.out.println("\u001b[35m\033[1mWoodie:\033[0m"+script.get(5));
        Thread.sleep(950);
        System.out.println("\u001b[31m\033[1mSid   :\033[0m"+script.get(6));
        Thread.sleep(950);
        System.out.println("\u001b[33m\033[1mJessie:\033[0m"+script.get(7));
        Thread.sleep(950);
        System.out.println("\u001b[31m\033[1mSid   :\033[0m"+script.get(8));
        Thread.sleep(950);
        			movie.villain2();

        System.out.println("\u001b[31m\033[1mSid   :\033[0m"+script.get(9));
        Thread.sleep(950);
        System.out.println("\u001b[33m\033[1mJessie:\033[0m"+script.get(10));
        Thread.sleep(950);
        System.out.println("\u001b[35m\033[1mWoodie:\033[0m"+script.get(11));
        Thread.sleep(950);
        System.out.println("\u001b[37m\033[1mBuzz  :\033[0m"+script.get(12));
        Thread.sleep(950);
        System.out.println("\u001b[33m\033[1mJessie:\033[0m"+script.get(13));
        Thread.sleep(950);
        System.out.println("\u001b[31m\033[1mSid   :\033[0m"+script.get(14));
        Thread.sleep(950);
        System.out.println("\u001b[35m\033[1mWoodie:\033[0m"+script.get(15));
        Thread.sleep(950);
        System.out.println("\u001b[37m\033[1mBuzz  :\033[0m"+script.get(16));
        Thread.sleep(950);
        System.out.println("\u001b[37m\033[1mBuzz  :\033[0m"+script.get(17));
        Thread.sleep(950);
        			movie.villain3();

        System.out.println("\u001b[31m\033[1mSid   :\033[0m"+script.get(18));
        Thread.sleep(950);
        System.out.println("\u001b[31m\033[1mSid   :\033[0m"+script.get(19));
        Thread.sleep(950);
        System.out.println("\u001b[37m\033[1mBuzz  :\033[0m"+script.get(20));
        Thread.sleep(950);
        			movie.villain4();

        System.out.println("\u001b[35m\033[1mWoodie:\033[0m"+script.get(21));
        Thread.sleep(950);
        System.out.println("\u001b[33m\033[1mJessie:\033[0m"+script.get(22));
        Thread.sleep(950);
        System.out.println("\u001b[37m\033[1mBuzz  :\033[0m"+script.get(23));
        Thread.sleep(950);
        System.out.println("\u001b[37m\033[1mBuzz  :\033[0m"+script.get(24));
        Thread.sleep(950);
        System.out.println("\u001b[33m\033[1mJessie:\033[0m"+script.get(25));
        Thread.sleep(950);
        //System.out.println("\u001b[35m\033[1mWoodie:\033[0m"+script.get(26));
        //Thread.sleep(950);
        			movie.villain5();
    }
    catch (InterruptedException e)
            {
                e.printStackTrace();
            }
}

public void menu()
{
	Scanner scanner=new Scanner(System.in);
         int choice=0;
        do
        {
            System.out.println("\n--------------------------Script Updation--------------------------");
            System.out.println("\u001b[35m\033[1mInsert the Index No:\033[0m\n\u001b[36m\033[1m1.Add a Dialogue\t2.Delete a dialogue\t3.Update a dialogue\033[0m");
        
            System.out.println("\nEnter your choice");
             choice=scanner.nextInt();
        
                if(choice==1)
                {
                this.addDialogue();
                }
                else if(choice==2)
                {
                this.removeDialogue();
                }
                else if(choice==3)
                {
                this.updateDialogue();
                }
                           }   while(choice<4);
      
                
            
        }

            public void addDialogue()
            {
	    	System.out.println("Enter the Dialogue" );
	    	Scanner scn=new Scanner(System.in);
            String dialogue=scn.next();
	          script.add(dialogue);
   

}
            public void removeDialogue(){
             		Scanner scn=new Scanner(System.in);

            System.out.println("Enter the index Number of item to be deleted");
            int choice=scn.nextInt();

         script.remove(choice);
            }

            
            
             public void  updateDialogue(){
             		Scanner scn=new Scanner(System.in);

                System.out.println("Enter the index number to be modified");
                int choice=scn.nextInt();
                System.out.println("Enter the new Dialogue");
                String newDialouge=scn.next();
            }
        }

	
	


					
					
					
					
					
					
					
					
					
					
					
					
					
					

		