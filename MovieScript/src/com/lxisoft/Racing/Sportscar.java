package com.lxisoft.Racing;
import com.lxisoft.Racing.*;

public class Sportscar extends Car{
	public void details()
	{
		//System.out.println("Sports car like porsche ,lamborgini,lexus -have a speed of 100kmph they are super lightweight and can go with lightning fast speed");
		String message ="1.Sports car like porsche ,lamborgini,lexus -have a speed of 100kmph they are\n super lightweight and can go with lightning fast speed\n";
		this.slowPrint(message, 40);
	}
	public void detailsNormal()
	{
				//System.out.println("car like ford ,Citreon,kia -have a speed of 80kmph they are heavy but are stable and can go with speed of max 90kmph");
		String message1 ="\n2.car like ford ,Citreon,kia -have a speed of 80kmph they are heavy but are\n stable and can go with speed of max 90kmph";
		this.slowPrint(message1, 40);

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