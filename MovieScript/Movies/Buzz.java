package com.lxisoft.Movies;
public class Buzz extends Script implements Comedian
{
		public void scriptDisplay()
	{
		System.out.println("\t  \t  \u001b[37m\033[1mBuzz Lightyear - Tim Allen\033[0m");
        String message = "Buzz Lightyear is a fictional character in the Toy Story franchise.\nHe is a toy Space Ranger superhero according to the movies and an action figure in the franchise. Along with Sheriff Woody,\nhe is one of the two lead characters in all four Toy Story movies.\n\n";
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