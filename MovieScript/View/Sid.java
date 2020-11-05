package com.lxisoft.View;
import com.lxisoft.Modal.*;
import com.lxisoft.Control.*;


public class Sid implements Heroine
{
			public void scriptDisplay()
	{
                        Director director=new Director();

		System.out.println("\t  \t  \u001b[31m\033[1mSid Philips - Erik Von Detten\033[0m");
        String message = "Sidney sid Phillips is the main antagonist of the 1995 Disney•Pixar animated film Toy Story. \nHe was the evil neighbor kid of Andy who broke all his own toys,\nand is the only known person who knows that toys are alive.\n\n";
        director.slowPrint(message, 40);
    }
    
}