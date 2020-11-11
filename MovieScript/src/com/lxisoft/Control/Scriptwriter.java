package com.lxisoft.Control;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import com.lxisoft.Modal.*;
import com.lxisoft.Repository.*;
import java.sql.*;

import java.util.*;

public class Scriptwriter
{
	

		ArrayList<Script> script=new ArrayList<Script>();


	public void scenePrint() 
	{

		script.add(new Script());
		script.get(0).setName("Woodie");
		script.get(0).setDialogue("Stop right there sid you have no where to go.");

		script.add(new Script());
		script.get(1).setName("Buzz");
		script.get(1).setDialogue("Hang on there jessie	we will rescue you.");
				
		script.add(new Script());
		script.get(2).setName("jessie");
		script.get(2).setDialogue("Help ME guys kill this scumbag!!!.");
				
		script.add(new Script());
		script.get(3).setName("sid");
		script.get(3).setDialogue("HAHAHA!!!! you are wrong you imbeciles you guys are no...match for me.");
				
		script.add(new Script());
		script.get(4).setName("Woodie");
		script.get(4).setDialogue("Buzz kill him with your laser shot.");
				
		script.add(new Script());
		script.get(5).setName("sid");
		script.get(5).setDialogue("He wont	");

		script.add(new Script());
		script.get(6).setName("sid");
		script.get(6).setDialogue("Before you strike me think for a mt im your family and do u wish to take words frm ur frnds.");

		script.add(new Script());
		script.get(7).setName("jessie");
		script.get(7).setDialogue("Do it Buzz..");

		script.add(new Script());
		script.get(8).setName("sid");
		script.get(8).setDialogue("Just think how they treated you being a soldier they never gave you the pstn.");

		script.add(new Script());
		script.get(9).setName("Woodie");
		script.get(9).setDialogue("Buzz!!! Dont listen to him.");
				
		script.add(new Script());
		script.get(10).setName("sid");
		script.get(10).setDialogue("I cant its my brother after all");
				
		script.add(new Script());
		script.get(11).setName("Woodie");
		script.get(11).setDialogue("kill him Buzz.");

		script.add(new Script());
		script.get(12).setName("sid");
		script.get(12).setDialogue("Think!!! do wou want to kill me.	");

		script.add(new Script());
		script.get(13).setName("Woodie");
		script.get(13).setDialogue("Buzz remember all the fun we had together.");

		script.add(new Script());
		script.get(14).setName("Buzz");
		script.get(14).setDialogue("OK thats enough When i needed someone the most i had only my friends.");

		script.add(new Script());
		script.get(3).setName("Buzz");
		script.get(15).setDialogue("Sorry sid this has to end somehow.	");

		script.add(new Script());
		script.get(3).setName("sid");
		script.get(16).setDialogue("NO!!!!......");

		script.add(new Script());
		script.get(3).setName("sid");
		script.get(17).setDialogue("I am sorry BUzz i couldnt be a good brother for you	have a happy life.	");

		script.add(new Script());
		script.get(18).setName("Buzz");	
		script.get(18).setDialogue("weeps ----.");
				
		script.add(new Script());
		script.get(19).setName("Woodie");
		script.get(19).setDialogue("Its over buzz come buddy lets untie jessie.	");

				script.add(new Script());
		script.get(20).setName("jessie");
		script.get(20).setDialogue("I knew you would rescue me nd we are sorry for your brother.");
				
				script.add(new Script());
		script.get(21).setName("Buzz");
		script.get(21).setDialogue("hmm evil has to end somehow.");
				
				script.add(new Script());
		script.get(22).setName("Buzz");
		script.get(22).setDialogue("yea anyway im happy we got you in  (giggles).");
				
				script.add(new Script());
		script.get(23).setName("Woodie");
		script.get(23).setDialogue("yippe.");
				
				script.add(new Script());
		script.get(24).setName("Buzz");
		script.get(24).setDialogue("haha yeahh 	finally we r a family again.");
		//this.databaseConnection();
		//this.addToDatabase();
		this.sqlquery(); 
	}
	public void sqlquery()
	{	
					Sqldata sqldata=new Sqldata();
			
		int choice=0;

		do
		{
			for(int i=0;i<25;i++)
		{
		sqldata.addToDatabase(script.get(i));
			}
		System.out.println("Press\n1.Add Dialogues to the database\n2.Search\n3.Delete");
		Scanner scn =new Scanner(System.in);
		choice=scn.nextInt();
		if(choice==1)
		{
			sqldata.viewDatabase(script);
		}
		else if(choice==2)
		{

			System.out.println("Enter the actor to be searched");
			String name=scn.next();
			sqldata.searchDatabase(script,name);
		}
		else if(choice==3)
		{
						System.out.println("Enter the id to be Deleted");
						choice=scn.nextInt();
						sqldata.deletRecord(choice);	

		}

	}while(choice<4);
}
		
}