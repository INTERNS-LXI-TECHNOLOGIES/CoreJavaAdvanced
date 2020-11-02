package com.lxisoft.Movies;
public class Jessie extends Script implements Heroine
{
				public void scriptDisplay()
	{
		System.out.println("\t  \t  \u001b[33m\033[1mJessie - Joan Cusack\033[0m");
        String message = "Jessie the doll is excitable, brave, and very athletic. \nShe carries a great deal of sadness,/as she was abandoned by her original owner,\nthroughout the film, she appears to be more loyal and helpful to others,\nin the process developing a romantic relationship with Buzz Lightyear.\n\n";
        slowPrint(message, 40);
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