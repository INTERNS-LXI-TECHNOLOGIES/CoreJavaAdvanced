package com.lxisoft.Racing;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;
import com.lxisoft.Repository.*;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner; 
import java.io.*;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.nio.file.Path;
import java.io.FileReader; 
import java.nio.charset.StandardCharsets;
import java.nio.file.Files; 
import java.nio.file.Paths; 
import java.util.List;


import com.lxisoft.Racing.*;

public class Race implements Serializable 
{
	
	ArrayList<Car> cars=new ArrayList<Car>();
	public void startRace()
	{
		cars.add(new Sportscar());
		cars.get(0).setName("citroen ");
		cars.get(0).setType("petrol");
		cars.get(0).setTyre("Rally");
				cars.get(0).setTime(2.9);

		cars.get(0).setEngine(1500);

		cars.add(new Sportscar());
		cars.get(1).setName("subaru   ");
		cars.get(1).setType("diesel");
				cars.get(1).setTyre("Rally");

				cars.get(1).setTime(1.29);

		cars.get(1).setEngine(1600);

		cars.add(new Sportscar());
		cars.get(2).setName("mitsubushi");
		cars.get(2).setType("petrol");
				cars.get(2).setTyre("Rally");

				cars.get(2).setTime(1.19);

		cars.get(2).setEngine(1000);

		cars.add(new Sportscar());
		cars.get(3).setName("kia       ");
		cars.get(3).setType("petrol");
				cars.get(3).setTyre("Rally");

				cars.get(3).setTime(1.39);

		cars.get(3).setEngine(1200);

		cars.add(new Sportscar());  
		cars.get(4).setName("ford      ");
		cars.get(4).setType("petrol");
				cars.get(4).setTyre("Rally");

				cars.get(4).setTime(1.9);

		cars.get(4).setEngine(1800);

		cars.add(new Sportscar());
		cars.get(5).setName("porsche  ");
		cars.get(5).setType("petrol");
				cars.get(5).setTyre("Sports");

				cars.get(5).setTime(1.19);

		cars.get(5).setEngine(4000);

		cars.add(new Sportscar());
		cars.get(6).setName("lexus   ");
		cars.get(6).setType("diesel");
						cars.get(6).setTyre("Sports");

				cars.get(6).setTime(1.3);

		cars.get(6).setEngine(2500);

		cars.add(new Sportscar());
		cars.get(7).setName("Ferrari  ");
		cars.get(7).setType("petrol");
						cars.get(7).setTyre("Sports");

				cars.get(7).setTime(0.7);

		cars.get(7).setEngine(2800);

		cars.add(new Sportscar());
		cars.get(8).setName("alfa      ");
		cars.get(8).setType("diesel");
						cars.get(8).setTyre("Sports");

				cars.get(8).setTime(0.9);

		cars.get(8).setEngine(2900);

		cars.add(new Sportscar());
		cars.get(9).setName("lamborghini");
		cars.get(9).setType("petrol");
						cars.get(9).setTyre("Sports");

		cars.get(9).setTime(0.2);
		cars.get(9).setEngine(4000);
		
		//this.sqlquery(); 

		this.menu();		
	
	}

	public void sqlquery()
	{	
					Sql sql=new Sql();
			
		int choice=0;

		do
		{
			for(int i=0;i<10;i++)
		{
		sql.addToDatabase(cars.get(i));
			}
		System.out.println("Press\n1.Add Dialogues to the database\n2.Delete a row");
		Scanner scn =new Scanner(System.in);
		choice=scn.nextInt();
		if(choice==1)
		{
			//sql.viewDatabase(cars);
					sql.update();

		}
		if(choice==2)
		{
			System.out.println("\nEnter the id to be Deleted");
						choice=scn.nextInt();
						sql.deletRecord(choice);
		}
		

	}while(choice<4);
}
	  
public void menu() 
{
	int choice=0;
	
	System.out.println("\n\n\u001b[36m\033[1mPress the Index no:\n1.Get the Info\t2.add cars list to SQL database\033[0m");
	Scanner scanner=new Scanner(System.in);
	choice=scanner.nextInt();
	
	
		if(choice==1)
		{
			this.printCars();
			Sportscar sc=new Sportscar();
			sc.details();
			sc.detailsNormal();
			this.being();
			this.menu();
	
		}
		else if(choice==2)
		{
			this.sqlquery();
			this.menu();
		} 
		
		
}
public void being()
{
	int choice=0;
	
	System.out.println("\n\n\u001b[36m\033[1mPress the Index no:\t1.Start the Race\033[0m");
	Scanner scanner=new Scanner(System.in);
	choice=scanner.nextInt();
	if(choice==1)
		{
		this.startGame();
		this.race();
		this.createFile();
		}


}
	public void printCars() 
	{
		System.out.println("-----------------------------------------------------------------------------");
					System.out.println("-----------------------------------------------------------------------------");
					System.out.println("-----------------------------------------------------------------------------");
					System.out.println("--------                                                             --------");
					System.out.println("--------                                                             --------");
					System.out.println("--------                                                             --------");
					System.out.println("--------                                                             --------");
					System.out.println("--------        \t  \t  \u001b[33m\033[1mDAYTONA 500\033[0m                        --------");
					System.out.println("--------                                                             --------");
					System.out.println("--------                                                             --------");
					System.out.println("--------                                                             --------");
					System.out.println("--------                                                             --------");
					System.out.println("--------                                                             --------");
					System.out.println("-------- 			\u001b[31m\033[1mVenue-Budh Circuit\033[0m                   --------");
					System.out.println("--------                    				             --------");
					System.out.println("--------                  			                     --------");
					System.out.println("--------                       					     --------");
					System.out.println("--------                                                             --------");
					System.out.println("--------\u001b[36m\033[1m5 Lap\033[0m 	\t\u001b[36m\033[1m4 Hours\033[0m 	\u001b[36m\033[1mTrack - Dry\033[0m    \t\u001b[36m\033[1m15:00\033[0m        --------");
					System.out.println("--------                                                             --------");
					System.out.println("-----------------------------------------------------------------------------");
					System.out.println("-----------------------------------------------------------------------------");
					System.out.println("-----------------------------------------------------------------------------"+"\n");
					System.out.	println("\u001b[36m\033[1mCar Name\033[0m"+"\t\t"+"\u001b[36m\033[1mCar Power\033[0m"+"\t"+"\u001b[36m\033[1mCar Type\033[0m"+"\t"+"\u001b[36m\033[1mCar Tyre\033[0m");
											System.out.println("---------------------------------------------------------------");

					for(int i=0;i<10;i++)
		{
			System.out.println(cars.get(i).getName()+"\t\t"+cars.get(i).getEngine()+"\t\t"+cars.get(i).getType()+"\t\t"+cars.get(i).getTyre());
		}
								System.out.println("----------------------------------------------------------------");
								System.out.println("--------------------------\u001b[33m\033[1mCar details\033[0m---------------------------\n");

		

		
		//this.randomSelection();
	}
	public void startGame()
	{
		System.out.println("\n"+"--------------Winners in the last round are--------------");
			for(int i=0;i<10;i++)
			{				if(cars.get(i).getTyre()=="Sports")	
			{	
				if (cars.get(i).getEngine()>2000)
						{
							System.out.println("The winners are\t"+cars.get(i).getName());
							cars.get(i).setTime(i-0.2);
							System.out.println("Time taken by each car\t"+cars.get(i).getTime());

						}
					}

						
			}
						System.out.println("--------------------------------------------------------");

		     				
   	}
   	public void race()
   	{
   				System.out.println("\n"+"----------------------Final Winner----------------------");

   			for(int i=0;i<10;i++)
			{
				if(cars.get(i).getEngine()>2000)
				{
				if(cars.get(i).getTime()<5.0)
				{
					System.out.println("The winner is"+cars.get(i).getName()+"\t"+cars.get(i).getTime()+"Seconds");
				}
			}
			}
			System.out.println("--------------------------------------------------------");

 	}
 	public void createFile() 
 	{
	try{
            FileOutputStream writeData = new FileOutputStream("/home/karthik/MyJavaDirectory/src/com/lxisoft/Repository/data.txt");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(cars);
            writeStream.flush();
            writeStream.close();

        }catch (IOException e) {
            e.printStackTrace();
        }
        		//this.readFile();

}
 
/*public void readFile() {

List<String> lines = Collections.emptyList(); 
try {
lines = Files.readAllLines(Paths.get(""), StandardCharsets.UTF_8); 
} 
catch (IOException e) {
 // TODO Auto-generated catch block
  e.printStackTrace();
  } System.out.println("Content of List:"); 
  System.out.println(lines);



}*/
 }