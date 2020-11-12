package com.Lxisoft.CarRacing;
import com.Lxisoft.CarRacing.*;
import java.util.*;
public class Game
{
	ArrayList<String>  cars= new ArrayList<>();
	public void startGame()
	{
    int choice=0;
    do
    {
      System.out.println("\nPress 1 to StartGame");
        
        choice=scanner.nextInt();
        if(choice==1)
        {
      	  this.carRacing   
        }
	}
	}
	

	public void CarRacing()
	{
		
		

	}
	public void gameDetails()
	{
	
			cars.add(new car());
		cars.get(0).setEngineCC("1500 ");
		cars.get(0).setFuelType("petrol");
		cars.get(0).setPower(425);

		cars.add(new car());
		cars.get(1).setEngineCC("1300 ");
		cars.get(1).setFuelType("petrol");
		cars.get(1).setPower(512);
		
		cars.add(new car());
		cars.get(2).setEngineCC("1550 ");
		cars.get(2).setFuelType("petrol");
		cars.get(2).setPower(465);
		
		cars.add(new car());
		cars.get(3).setEngineCC("1400 ");
		cars.get(3).setFuelType("petrol");
		cars.get(3).setPower(405);


		cars.add(new car());
		cars.get(4).setEngineCC("1490 ");
		cars.get(4).setFuelType("petrol");
		cars.get(4).setPower(400);
		

		cars.add(new car());
		cars.get(5).setEngineCC("1520 ");
		cars.get(5).setFuelType("petrol");
		cars.get(5).setPower(429);
		

		cars.add(new car());
		cars.get(6).setEngineCC("1610 ");
		cars.get(6).setFuelType("petrol");
		cars.get(6).setPower(501);		
		

		cars.add(new car());
		cars.get(7).setEngineCC("1600 ");
		cars.get(7).setFuelType("petrol");
		cars.get(7).setPower(490);
		

		cars.add(new car());
		cars.get(8).setEngineCC("1560 ");
		cars.get(8).setFuelType("petrol");
		cars.get(8).setPower(470);

	
		cars.add(new car());
		cars.get(9).setEngineCC("1509 ");
		cars.get(9).setFuelType("petrol");
		cars.get(9).setPower(488);
	}


public void File() 
 	{
	try{
            FileOutputStream writeData = new FileOutputStream("RaceData.txt");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(cars);
            writeStream.flush();
            writeStream.close();

        }catch (IOException e) 
        {
            e.printStackTrace();
        }

    }
    public void gameResult()
    {

    }
}