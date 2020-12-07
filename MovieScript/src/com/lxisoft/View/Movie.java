package com.lxisoft.View;
import com.lxisoft.Control.Controler;
import com.lxisoft.Model.SeatDetails;
import com.lxisoft.Model.Script;
import com.lxisoft.Model.Tintumone;
import com.lxisoft.Model.Katakadarajan;
import com.lxisoft.Model.Dundumole;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Movie
{

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
      this.playList();
  }
      public boolean ticket()
     {
     	Scanner scanner = new Scanner(System.in);
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
		Controler control = new Controler();
		Scanner scanner = new Scanner(System.in);
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
				control.seatDetails();
				this.playList(); 
			}
		else if(num==3)
		{
			System.out.print("           MOVIE STARTS           ");
            System.out.print("\n");
            System.out.print("          --------------          ");
            System.out.print("\n");
            System.out.print("\n");
            System.out.print("\n");
            System.out.print("\n");
	      control.sceneDialogue();
	      this.creatFilesSceneDialogue1();
          this.creatFilesSceneDialogue2();
          this.creatFilesSceneDialogue3();
          this.playList();
		}
        else if (num==4)
        {
           this.regux();
           this.playList();
        }
	    	else 
			{
				System.out.print("invalid choice ");
			}
    }
    public void regux()
       {
       	    Scanner scanner = new Scanner(System.in);
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
        }
    
	public void detailsofSeatDetails(ArrayList<SeatDetails> seatD)
	{
        
          
        for(SeatDetails movie : seatD)
        {
           System.out.print("\n"+" NAME OF THE PERSON IS "+movie.getName()+"\n"+" BLOCK IS "+movie.getBlock()+"\n"+" SEAT NUMBER IS "+movie.getseatNumber());
           System.out.print("\n");
      	   System.out.print("\n");
      	   System.out.print("\n");
      	   System.out.print("\n");
        }   
	} 
		
	public void creatFilesSceneDialogue1()
	{
      try
      {
       File file = new File("D:\\javaworks\\CoreJavaAdvanced\\MovieScript\\src\\com\\lxisoft\\File\\file.txt");
       FileWriter filewriter = new FileWriter(file);
       BufferedWriter writer = new BufferedWriter(filewriter);
       writer.write("\n Tintumone : njna tintu sneham ulavar tintumoneen vilikum");
       writer.write("\n Dundumole : ano!,njan dundumole");
       writer.write("\n Tintumone : evidayan vide kutiyude");
       writer.write("\n Dundumole : vide evide aduth tane ane");
       writer.write("\n Tintumone : eth arane ?");
       writer.write("\n Dundumole : arayila kore neram ayii enthe penale ane");
       writer.write("\n Tintumone : arayile pene enthina kutiye nokunath");
       writer.write("\n Dundumole : arayila....... ! ");
       writer.flush();
       writer.close();
      } 
      catch(IOException e)
      {
      	e.printStackTrace();
      }
      this.readFileSceneDialogue1();
	}
	public void readFileSceneDialogue1()
	{
		try
		{
			Scanner scanner = new Scanner(System.in);
			BufferedReader buffer = new BufferedReader(new FileReader("D:\\javaworks\\CoreJavaAdvanced\\MovieScript\\src\\com\\lxisoft\\File\\file.txt"));
			String a = scanner.next();
			while((a=buffer.readLine()) != null)
			{
				System.out.print("\n"+a+"\n");
			} 
			buffer.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
		public void creatFilesSceneDialogue2()
	{
      try
      {
      	File file = new File("D:\\javaworks\\CoreJavaAdvanced\\MovieScript\\src\\com\\lxisoft\\File\\file.txt");
       FileWriter filewriter = new FileWriter(file);
       BufferedWriter writer = new BufferedWriter(filewriter);
       writer.write("\n Tintumone : ninamk enthada vendath");
       writer.write("\n Katakadarajan : enik vendathe ok ne tharuvoo ne ara divama onu poda sondum pani nokii poko ninak rajane seric arayilaa over kalicha petile  avum pokunam evidun ketoda kilunth cheka Haa ha ha .....");
       writer.write("\n Tintumone : edaaaa.........");
       writer.write("\n Katakadarajan : enthada vadanaaa..............");
       writer.write("\n Dundumole : ayooo vendaa adii onumm undakanda...........");
       writer.flush();
       writer.close();
      } 
      catch(IOException e)
      {
      	e.printStackTrace();
      }
      this.readFileSceneDialogue2();
	}
	public void readFileSceneDialogue2()
	{
		try
		{
			Scanner scanner = new Scanner(System.in);
			BufferedReader buffer = new BufferedReader(new FileReader("D:\\javaworks\\CoreJavaAdvanced\\MovieScript\\src\\com\\lxisoft\\File\\file.txt"));
			String a=scanner.next();
			while((a=buffer.readLine()) != null)
			{
				System.out.print("\n"+a+"\n");
			} 
			buffer.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void creatFilesSceneDialogue3()
	{
      try
      {
      	File file = new File("D:\\javaworks\\CoreJavaAdvanced\\MovieScript\\src\\com\\lxisoft\\File\\file.txt");
       FileWriter filewriter = new FileWriter(file);
       BufferedWriter writer = new BufferedWriter(filewriter);
       writer.write("\n Tintumone : eni melal evide kandupokaruth ketodaaa");
       writer.write("\n Katakadarajan : nine njan pene edutolada..........");
       writer.write("\n Dundumole : va pokam vitekee namak pokam tintuuu");
       writer.flush();
       writer.close();
      } 
      catch(IOException e)
      {
      	e.printStackTrace();
      }
      this.readFileSceneDialogue3();
	}
	public void readFileSceneDialogue3()
	{
		try
		{
			Scanner scanner = new Scanner(System.in);
			BufferedReader buffer = new BufferedReader(new FileReader("D:\\javaworks\\CoreJavaAdvanced\\MovieScript\\src\\com\\lxisoft\\File\\file.txt"));
			String a=scanner.next();
			while((a=buffer.readLine()) != null)
			{
				System.out.print("\n"+a+"\n");
			} 
			buffer.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
   public void scenes(ArrayList<Script> script)
   {
   	    
   	    System.out.print("\n");
		System.out.print("           SCENCE 1 : TINTU AND DUNDU MEETING FOR FIRST TIME           ");
		System.out.print("\n");
		System.out.print("          ---------------------------------------------------          ");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("Tintumone : "+script.get(0).getDialogue1()+"\n"+"\n"+"Dundumole : "+script.get(1).getDialogue1());
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("Tintumone : "+script.get(0).getDialogue2()+"\n"+"\n"+"Dundumole : "+script.get(1).getDialogue2());
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("Tintumone : "+script.get(0).getDialogue3()+"\n"+"\n"+"Dundumole : "+script.get(1).getDialogue3());
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("Tintumone : "+script.get(0).getDialogue4()+"\n"+"\n"+"Dundumole : "+script.get(1).getDialogue4());
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("           SCENCE 2 : TINTU AND RAJAN MEETING AND ARJUMENT SCENE           ");
		System.out.print("\n");
		System.out.print("          -------------------------------------------------------          ");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("Tintumone : "+script.get(0).getDialogue5()+"\n"+"\n"+"Katakadarajan : "+script.get(2).getDialogue1());
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("Tintumone : "+script.get(0).getDialogue6()+"\n"+"\n"+"Dundumole : "+script.get(1).getDialogue5()+"\n"+"\n"+"Katakadarajan : "+script.get(2).getDialogue2());
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("           SCENCE 3 : END SCENE FIGHT OVER           ");
		System.out.print("\n");
		System.out.print("          ---------------------------------          ");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("Tintumone : "+script.get(0).getDialogue7()+"\n"+"\n"+"Dundumole : "+script.get(1).getDialogue6()+"\n"+"\n"+"Katakadarajan : "+script.get(2).getDialogue3());
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("             END \n            SUBAM           ");
		System.out.print("\n");
		System.out.print("          ---------          ");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
	  System.out.print("----------------------------------------------------------------------------------------------------------------------------------");
      System.out.print("\n");
      System.out.print("-                                                   ARUMELATHA LOGATHE RAJAV                                                     -");
      System.out.print("\n");
      System.out.print("-                                                  --------------------------                                                    -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-       DIRECTED BY  : ADDICTES                                                                                                  -");
      System.out.print("\n");
      System.out.print("-       PRODUCED BY  : ROBO                                                                                                      -");
      System.out.print("\n");
      System.out.print("-       SCRIPT WRITTEN BY : GOPALAN(ETHAPETU EDUKUNU GOPALAN)                                                                    -");
      System.out.print("\n");
      System.out.print("-       HERO OF THE FILM : SUPER STAR SAROJ KUMAR AS TINTUMONE                                                                   -");
      System.out.print("\n");
      System.out.print("-       HEROINE OF THE FILM : BEAUTY QUEEN SARASAMA ANDARJANUM AS DUNDUMOLE                                                      -");
      System.out.print("\n");
      System.out.print("-       VILLAN OF THE FILM : SUGUNAN P.P AS KATAKADARAJAN                                                                        -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("----------------------------------------------------------------------------------------------------------------------------------");
      System.out.print("\n"); 

	}
}