package com.lxisoft.View;
import com.lxisoft.Modal.*;
import com.lxisoft.Control.*;

public class Sheriff implements Hero
{
	public void scriptDisplay()
	{
                Director director=new Director();

		System.out.println("\t  \t  \u001b[35m\033[1mSherrif a.k.a Woody - Tom Hanks\033[0m");
        String message = "Sheriff Woody Pride, commonly known simply as Woody, is the main character in the Toy Story franchise created by Pixar.\nHe is a pullstring cowboy rag doll and one of the two leaders of the toys in the movies.\nHis facial features are based on Tone Thyne, a former Disney animator.\n\n";
        director.slowPrint(message, 40);
    }
    
}