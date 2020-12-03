package com.Lxisoft.MovieScriptApp.Control;
import com.Lxisoft.MovieScriptApp.View.*;
import com.Lxisoft.MovieScriptApp.Model.*;
import java.util.*;
public class MovieController
{
	
	Cast hero = new Hero();
	Cast heroine = new Heroine();
	Cast antiHero = new Anti_Hero();
	Cast comedian = new Comedian();
	ArrayList<Cast>heroList = new ArrayList<Cast>();
	ArrayList<Cast>heroineList = new ArrayList<Cast>();
	ArrayList<Cast>antiHeroList = new ArrayList<Cast>();
	ArrayList<Cast>ComedianList = new ArrayList<Cast>();
	MovieView movie = new MovieView();
	public void mainMenu()
	{
		movie.intro();
		Scanner scanner = new Scanner(System.in);
		int choice=0;
		do
		{
			System.out.println("\n________________________");
        	System.out.println("\n\n1. Director  \n\n2. Movie Script \n\n3. Casts \n\n Press 0 for Exit \n");
        	choice=scanner.nextInt();
        	if(choice==1)
        	{
        		this.directorMenu();
        	}
        	if(choice==2)
        	{


        	}
        	if(choice==3)
        	{

        	}
        	else if(choice==0)
        	{
        		System.out.println(" ");
        	}

		}
		while(choice>0);
	}
	public void directorMenu()
	{

		Scanner directorInputs = new Scanner(System.in);
		int choice=0;
		do
		{
			movie.directorActions();
        	choice=directorInputs.nextInt();
        	if(choice==1)
        	{
        		this.addCast();
        	}
        	if(choice==2)
        	{

        		//this.removeCast();
        	}
        	if(choice==3)
        	{
        		//this.UpdateCast()
        	}
        	else if(choice==0)
        	{
        		System.out.println(" ");
        	}

		}
		while(choice>0);
	}

	public void addCast()
	{

	}
}
