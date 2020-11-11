package com.lxisoft.View;
import com.lxisoft.Modal.*;
import com.lxisoft.Control.*;

public class Jessie implements Heroine
{
				public void scriptDisplay()
	{
        Director director=new Director();
		System.out.println("\t  \t  \u001b[33m\033[1mJessie - Joan Cusack\033[0m");
        String message = "Jessie the doll is excitable, brave, and very athletic. \nShe carries a great deal of sadness,/as she was abandoned by her original owner,\nthroughout the film, she appears to be more loyal and helpful to others,\nin the process developing a romantic relationship with Buzz Lightyear.\n\n";
        director.slowPrint(message, 40);
    }
    
}