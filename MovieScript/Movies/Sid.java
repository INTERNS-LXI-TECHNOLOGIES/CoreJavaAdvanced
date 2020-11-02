package com.lxisoft.Movies;
public class Sid extends Script implements Heroine
{
			public void scriptDisplay()
	{
		System.out.println("\t  \t  \u001b[31m\033[1mSid Philips - Erik Von Detten\033[0m");
        String message = "Sidney sid Phillips is the main antagonist of the 1995 Disney•Pixar animated film Toy Story. \nHe was the evil neighbor kid of Andy who broke all his own toys,\nand is the only known person who knows that toys are alive.\n\n";
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