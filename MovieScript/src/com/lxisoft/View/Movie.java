package com.lxisoft.View;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Movie
{
	Scanner scanner = new Scanner(System.in);
	public void movieDetails()
	{
	  System.out.print("----------------------------------------------------------------------------------------------------------------------------------");
      System.out.print("\n");
      System.out.print("-                                                       SHANDAPAN THEATERS                                                       -");
      System.out.print("\n");
      System.out.print("----------------------------------------------------------------------------------------------------------------------------------");
      System.out.print("\n");
      System.out.print("\n");
      System.out.print("\n");
      System.out.print("\n");
      System.out.print("\n");
      System.out.print("\n");
      System.out.print("\n");
      System.out.print("\n");
      System.out.print("----------------------------------------------------------------------------------------------------------------------------------");
      System.out.print("\n");
      System.out.print("-                                                       MOVIE SHOW                                                               -");
      System.out.print("\n");
      System.out.print("-                                              ----------------------------                                                      -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-    SHOWS ARE : 1. ARUMELATHA LOGHATE RAJAV  (ONLY 1 SHOW AND 1 MOVIE BECAUSE OF COVID-19)                                      -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("----------------------------------------------------------------------------------------------------------------------------------");
      System.out.print("\n");
      System.out.print("\n");
      System.out.print("\n");
      System.out.print("\n"); 
  }
      public boolean ticket()
     {
      System.out.print("ENTER THE AGE : ( ABOVE 20 YEARS ONLY ) ");
      System.out.print("\n");
      int ag=scanner.nextInt();
      {
      	assert(ag>20 && ag<60);
      	System.out.print("AGE OF THE PERSON IS : "+ag);
      	System.out.print("\n");
      	if(ag>20)
      	{
      		System.out.print(" YOU CAN SEE THE MOVIE AND YOU WILL GET THE TICKET ");
      		System.out.print("\n");
      		System.out.print("\n");
      		System.out.print("\n");
      		return true;
      	}
      	else
      	{
      		System.out.print(" YOU CANT SEE THE MOVIE ");
      		System.out.print("\n");
      		System.out.print("\n");
      		System.out.print("\n");
      		return false;
      	}
      }
	}
	public void playList()
	{
		System.out.print("           DETAILS OF THE MOVIES           ");
		System.out.print("\n");
		System.out.print("          -----------------------          ");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print(" PRESS THE NUMBERS TO KNOW THE DETAILS ");
		System.out.print("\n");
		System.out.print("       -----------------------          ");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print(" 1. TICKET \n 2. SEAT NUMBER AND DETAILS \n 3. MOVIE START \n 4. Q AND A ");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("ENTER THE NUMBER : ");
		int num = scanner.nextInt();
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
        if(num==1)
        {
        	this.ticket();
        	this.playList(); 
        }
		else if(num==2)
			{
				SeatNumber seat = new SeatNumber();
				seat.Details();
				this.playList(); 
			}
		else if(num==3)
		{
	      seatD.dialoguAndScenes();
		}
        else if (num==4)
        {
           this.regux();
        }
	    	else 
			{
				System.out.print("invalid choice ");
			}
    }
    public void regux()
       {
            System.out.print("\n");
        	System.out.print("\n");
        	System.out.print("\n");
        	System.out.print("\n");
            System.out.print("           Q AND A SESSION           ");
            System.out.print("\n");
            System.out.print("          -----------------          ");
			System.out.print("\n");
			System.out.print("\n");
			System.out.print("\n");
			System.out.print("Qn 1 . arayila kore neram ayii enthe penale ane ==> Who said this LINES ");
			System.out.print("\n");
			System.out.print("\n");
			System.out.print(" a.Tintumone  \n b. Dundumole \n c. Katakadarajan");
			System.out.print("\n");
			System.out.print("(Ans) Enter the number : ");
			System.out.print("\n ");
			String ans= scanner.next();
			Pattern pattern=Pattern.compile(ans);
			Matcher matcher=pattern.matcher("b");
			boolean b = Pattern.matches("[abc]",ans);
			if(matcher.matches())
			{
				System.out.print(" it the RIGHT answer ");
				System.out.print("\n");
				System.out.print("\n");
				System.out.print("\n");
			} 
			else 
			{
				System.out.print(" it's the WORNG answer , b is the RIGHT answer ");
				System.out.print("\n");
				System.out.print("\n");
				System.out.print("\n");
			}	
			System.out.print("Qn 2 . nine njan pene edutolada.......... ==> Who said this LINES ");
			System.out.print("\n");
			System.out.print("\n");
			System.out.print(" a.Tintumone  \n b. Dundumole \n c. Katakadarajan");
			System.out.print("\n");
			System.out.print("(Ans) Enter the number : ");
			System.out.print("\n ");
			String answ= scanner.next();
			pattern=Pattern.compile(answ);
			matcher=pattern.matcher("c");
			boolean c = Pattern.matches("[abc]",answ);
			if(matcher.matches())
			{
				System.out.print(" it the RIGHT answer ");
				System.out.print("\n");
				System.out.print("\n");
				System.out.print("\n");
			} 
			else 
			{
				System.out.print(" it the WORNG answer , c is the RIGHT answer ");
				System.out.print("\n");
				System.out.print("\n");
				System.out.print("\n");
			}	
			System.out.print("Qn 3 .eni melal evide kandupokaruth ketodaaa ==> Who said this LINES ");
			System.out.print("\n");
			System.out.print("\n");
			System.out.print(" a.Tintumone  \n b. Dundumole \n c. Katakadarajan");
			System.out.print("\n");
			System.out.print("(Ans) Enter the number : ");
			System.out.print("\n ");
			String answer= scanner.next();
			pattern=Pattern.compile(answer);
			matcher=pattern.matcher("a");
			boolean a = Pattern.matches("[abc]",answer);
			if(matcher.matches())
			{
				System.out.print(" it the RIGHT answer ");
				System.out.print("\n");
				System.out.print("\n");
				System.out.print("\n");
			} 
			else 
			{
				System.out.print(" it the WORNG answer , a is the RIGHT answer ");
				System.out.print("\n");
				System.out.print("\n");
				System.out.print("\n");
			}
			this.playList();
        }
        
	
}