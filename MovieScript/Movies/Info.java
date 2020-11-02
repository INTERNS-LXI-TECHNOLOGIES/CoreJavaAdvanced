package com.lxisoft.Movies;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Info
{
	ArrayList<movieInfo> mo =new ArrayList<movieInfo>();

	public void infoPrint()
	{
		mo.add(new movieInfo("Tom Hanks",64,200,"Best Actor "));
					mo.add(new movieInfo("Joan Cusack",57,75,"Best Actress"));
					mo.add(new movieInfo("Tim Allen",67,170,"Best Debut "));	
					mo.add(new movieInfo("Errik Deten",38,20,"Best Villain"));
		int choice=0;int i=0;
		do
		{					
			System.out.println("\u001b[36m\033[1mInsert the index No:\033[0m\n1.Age of Actors\t\t2.Awards Won\t\t3.Fact Check.");
			Scanner scn=new Scanner(System.in);
			choice=scn.nextInt();
				if(choice==1)
				{
					
					Collections.sort(mo);
					System.out.println("|-Sl No:-"+"|------Name------|"+"------Age------|");
	 				for (movieInfo movie: mo) 
	 				{
	 					System.out.println("|"+(i+1)+"\t"+" "+"|"+movie.getName()+"\t  |"+"\t "+movie.getAge()+"\t "+" "+"|");
	 					i++;
	 				}
	 									System.out.println("|-----------------------------------------|");


				}
				else if(choice==2)
				{
	 				Ageinfo agei=new Ageinfo(); 
	 				Collections.sort(mo,agei);
	 				System.out.println("|-Sl No:-"+"|------Name------|"+"------Awards Won-----|");

	 				for (movieInfo movie: mo) 
					{
	 					System.out.println("|"+(i+1)+"\t"+" "+"|"+movie.getName()+"\t  |"+movie.getawardName()+"   \t"+"|");
	 					i++;

					}
					System.out.println("|-----------------------------------------------|");

				}
				else if (choice==3)
				{
					System.out.println("\u001b[36m\033[1m------------How well do you know your Actors------------\033[0m\n");
					System.out.println("\u001b[33m\033[1mQn.1.Which year did Tom Hanks started his acting career\033[0m\n");
					//Scanner scn=new Scanner(System.in);
					System.out.println("a.1977\nb.1989\nc.2003.");
					String choic=scn.next();
					Pattern pattern=Pattern.compile(choic);
					Matcher matcher=pattern.matcher("a");
					//System.out.println(Pattern.matches("[abc]",choic));
					boolean a=Pattern.matches("[abc]",choic);
					//System.out.println(a);
					//Boolean found =false;
					//if (matcher.find())
					if (matcher.matches())
					{
						System.out.println("\nRight answer");
						//found =true;
					}
					else
					{
						System.out.println("\n\u001b[31m\033[1mWrong answer,1977 is the right answer\033[0m\n");
					}
					System.out.println("\u001b[33m\033[1mQn.2.Which year did Joan Cusack won award for best individual performanc his acting career\033[0m\n");
					System.out.println("a.1997\nb.2003\nc.2000.");
						String choicee=scn.next();

					 pattern=Pattern.compile(choicee);
					 matcher=pattern.matcher("c");
					//System.out.println(Pattern.matches("[abc]",choic));
					boolean c=Pattern.matches("c",choicee);
					if (c==true)
					{
						System.out.println("\nRight answer");
						//found =true;
					}
					else
					{
						System.out.println("\n\u001b[31m\033[1mWrong answer,2000 is the right answer\033[0m\n");
					}
					System.out.println("\u001b[33m\033[1mQn.3.Who acted in the movie The Santa Clause\033[0m\n");
					System.out.println("a.Tom Hanks\nb.Tim Allen\nc.Errick Detten.");
						String choiceee=scn.next();

					 pattern=Pattern.compile(choiceee);
					matcher=pattern.matcher("[TimAllen&&[^ac]]");
					//System.out.println(Pattern.matches("[abc]",choic));
					boolean b=Pattern.matches("[TimAllen&&[^ac]]",choiceee);
					if (b==true)
					{
System.out.println("\nRight answer");
						//found =true;
					}
					else
					{
						System.out.println("\n\u001b[31m\033[1mWrong answer,Tim Allen is the right answer\033[0m\n");

					}

				}

		}while(choice<4);
	}
}