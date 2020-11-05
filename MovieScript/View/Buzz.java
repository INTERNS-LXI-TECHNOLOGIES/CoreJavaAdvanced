package com.lxisoft.View;
import com.lxisoft.Modal.*;
import com.lxisoft.Control.*;


public class Buzz implements Comedian
{
		public void scriptDisplay()
	{
                                Director director=new Director();

		System.out.println("\t  \t  \u001b[37m\033[1mBuzz Lightyear - Tim Allen\033[0m");
        String message = "Buzz Lightyear is a fictional character in the Toy Story franchise.\nHe is a toy Space Ranger superhero according to the movies and an action figure in the franchise. Along with Sheriff Woody,\nhe is one of the two lead characters in all four Toy Story movies.\n\n";
        director.slowPrint(message, 40);
    }
    
}