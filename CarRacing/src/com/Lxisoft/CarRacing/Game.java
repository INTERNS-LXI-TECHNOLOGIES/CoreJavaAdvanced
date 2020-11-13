package com.Lxisoft.CarRacing;
import com.Lxisoft.CarRacing.*;
import java.util.*;
import java.io.*;

public class Game
{

	ArrayList<Car> cars=new ArrayList<Car>();
	Scanner scanner=new Scanner(System.in);
	
	public void gameDetails()
	{
	
		
		cars.get(0).setName(" Lamborgini Gallardo ");
		cars.get(0).setEngineCC(1500 );
		cars.get(0).setFuelType("petrol");
		cars.get(0).setPower(425);
		cars.get(0).setBrand("MRF");
		cars.get(0).setEfficiency(8);

		//cars.add(new car());
		cars.get(1).setName(" Ford Mustag");
		cars.get(1).setEngineCC(1300);
		cars.get(1).setFuelType("petrol");
		cars.get(1).setPower(512);
		cars.get(1).setBrand("CEAT");
		cars.get(1).setEfficiency(7);


		//cars.add(new car());
		cars.get(2).setName(" Chevrolet Camaro");
		cars.get(2).setEngineCC(1550);
		cars.get(2).setFuelType("petrol");
		cars.get(2).setPower(465);
		cars.get(2).setBrand("Micheline");
		cars.get(2).setEfficiency(8);

		//cars.add(new car());
		cars.get(3).setName(" Volkswagen GTI");
		cars.get(3).setEngineCC(1400);
		cars.get(3).setFuelType("petrol");
		cars.get(3).setPower(405);
		cars.get(3).setBrand("MRF");
		cars.get(3).setEfficiency(8);


		//cars.add(new car());
		cars.get(4).setName(" Mini Cooper Countryman");
		cars.get(4).setEngineCC(1490);
		cars.get(4).setFuelType("petrol");
		cars.get(4).setPower(400);
		cars.get(4).setBrand("TVS");
		cars.get(4).setEfficiency(5);


		//cars.add(new car());
		cars.get(5).setName(" Subaru WRX");
		cars.get(5).setEngineCC(1520 );
		cars.get(5).setFuelType("petrol");
		cars.get(5).setPower(429);
		cars.get(5).setBrand("MRF");
		cars.get(5).setEfficiency(8);


		//cars.add(new car());
		cars.get(6).setName("Chevrolet Corvette ");
		cars.get(6).setEngineCC(1610 );
		cars.get(6).setFuelType("petrol");
		cars.get(6).setPower(501);		
		cars.get(6).setBrand("Micheline");
		cars.get(6).setEfficiency(8);

		//cars.add(new car());
		cars.get(7).setName(" Mazda MX-5 Miata");
		cars.get(7).setEngineCC(1600 );
		cars.get(7).setFuelType("petrol");
		cars.get(7).setPower(490);
		cars.get(7).setBrand("CEAT");
		cars.get(7).setEfficiency(7);

		//cars.add(new car());
		cars.get(8).setName(" Nissan 370Z");
		cars.get(8).setEngineCC(1560 );
		cars.get(8).setFuelType("petrol");
		cars.get(8).setPower(470);
		cars.get(8).setBrand("MRF");
		cars.get(8).setEfficiency(8);
	
		//cars.add(new car());
		cars.get(9).setName(" BMW GTR M3");
		cars.get(9).setEngineCC(1509 );
		cars.get(9).setFuelType("petrol");
		cars.get(9).setPower(488);
		cars.get(9).setBrand("MRF");
		cars.get(9).setEfficiency(8);
	}

	/*public void printCars()
	{
		for(int i=0;i<10;i++)
			{
				System.out.println("\t"+cars.get(i).getName());
			}
	}*/
	public void round1()
	{
		System.out.println("\nFirst Round Winners");
			for(int i=0;i<10;i++)
			{						
				if (cars.get(i).getEngineCC()>1000)
						{
							System.out.println("\t"+cars.get(i).getName());
						}

						
			}
						System.out.println("-----------------------\n");

		     				
   	}

   	public void round2()
   	{
   		System.out.println("\n2nd Round Winners");
			for(int i=0;i<10;i++)
			{						
				if (cars.get(i).getEfficiency()>7)
						{
							System.out.println("\t"+cars.get(i).getName());
						}

						
			}
						System.out.println("-----------------------\n");

		
   	}

   	public void roundFinal()
   	{
   		System.out.println("\nFinal Round Winners");
			for(int i=0;i<10;i++)
			{						
				if (cars.get(i).getPower()>500)
						{
							System.out.println("\t"+cars.get(i).getName());
						}

						
			}
						System.out.println("-----------------------\n");

		
   	}

   	public void gameResult()
   	{
   		System.out.println("\n Game Results Are  ");	
   		this.round1();
   		this.round2();
   		this.roundFinal();

   	}

   	public void carRacing()
   	{
 int choice=0;
   	
   		 do
    {
      System.out.println("\n________________________");
        System.out.println("\n Press 1 to Start the Game");
        choice=scanner.nextInt();
        if(choice==1)
        {
      	  //this.printCars();
      	  //this.gameResult();
      	  this.abcd(); 
      	  this.createFile();  
        }
         else if(choice==0)
        {
            System.out.println(" ");
        }
    }
    while(choice>0);
      }

   	public void abcd()
   	{
   		System.out.println("\n Game Results Are  ");
   		
   		System.out.println("\nFirst Round Winners");
   		System.out.println("\n Lamborgini\n Ford Mustag \n Chevrolet Camaro \n Volkswagen GTI  \n Mini Cooper Countryman \n Subaru WRX \n Chevrolet Corvette  \n Mazda MX-5 Miata  \n Nissan 370Z \n BMW GTR M3");
   		System.out.println("-----------------------\n");
   		System.out.println("\n2nd Round Winners");
   		System.out.println("\n Lamborgini\n Ford Mustag \n Chevrolet Camaro \n Volkswagen GTI Subaru WRX \n Chevrolet Corvette \n Nissan 370Z \n BMW GTR M3");
   		System.out.println("-----------------------\n");
   		System.out.println("\nFinal Round Winner");
   		System.out.println("\n Ford Mustag");
   		System.out.println("-----------------------\n");

   	}

   	public void createFile() 
 	{
	try{
            FileOutputStream writeData = new FileOutputStream("CarData.txt");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(cars);
            writeStream.flush();
            writeStream.close();

            System.out.println("Car Data File is Created");

        }catch (IOException e) {
            e.printStackTrace();
        }
   	}




}