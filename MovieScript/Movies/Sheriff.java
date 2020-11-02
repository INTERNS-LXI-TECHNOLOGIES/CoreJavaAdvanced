package com.lxisoft.Movies;
public class Sheriff extends Script implements Hero
{
	public void scriptDisplay()
	{
		System.out.println("\t  \t  \u001b[35m\033[1mSherrif a.k.a Woody - Tom Hanks\033[0m");
        String message = "Sheriff Woody Pride, commonly known simply as Woody, is the main character in the Toy Story franchise created by Pixar.\nHe is a pullstring cowboy rag doll and one of the two leaders of the toys in the movies.\nHis facial features are based on Tone Thyne, a former Disney animator.\n\n";
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