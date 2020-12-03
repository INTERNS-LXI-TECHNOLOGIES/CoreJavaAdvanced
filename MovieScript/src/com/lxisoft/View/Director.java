package com.lxisoft.View;
import com.lxisoft.Model.Script;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Director
{
	ArrayList<Script> script = new ArrayList<Script>();
	public void creatFilesSceneDialogue1()
	{
      try
      {
       File file = new File("D:\\javaworks\\CoreJavaAdvanced\\MovieScript\\scr\\com\\lxisoft\\File\\file.txt");
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
			BufferedReader buffer = new BufferedReader(new FileReader("D:\\javaworks\\CoreJavaAdvanced\\MovieScript\\scr\\com\\lxisoft\\File\\file.txt"));
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
      	File file = new File("D:\\javaworks\\CoreJavaAdvanced\\MovieScript\\scr\\com\\lxisoft\\File\\file.txt");
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
			BufferedReader buffer = new BufferedReader(new FileReader("D:\\javaworks\\CoreJavaAdvanced\\MovieScript\\scr\\com\\lxisoft\\File\\file.txt"));
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
      	File file = new File("D:\\javaworks\\CoreJavaAdvanced\\MovieScript\\scr\\com\\lxisoft\\File\\file.txt");
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
			BufferedReader buffer = new BufferedReader(new FileReader("D:\\javaworks\\CoreJavaAdvanced\\MovieScript\\scr\\com\\lxisoft\\File\\file.txt"));
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

	public void sceneDialogue()
	{
		script.add(new Tintumone());
		script.get(0).setDialogue1("njna tintu sneham ulavar tintumoneen vilikum");
		script.get(0).setDialogue2("evidayan vide kutiyude");
		script.get(0).setDialogue3("eth arane ?");
		script.get(0).setDialogue4("arayile pene enthina kutiye nokunath");
		script.get(0).setDialogue5("ninamk enthada vendath");
		script.get(0).setDialogue6("edaaaa.........");
		script.get(0).setDialogue7("eni melal evide kandupokaruth ketodaaa");



		script.add(new Dundumole());
		script.get(1).setDialogue1("ano!,njan dundumole");
		script.get(1).setDialogue2("vide evide aduth tane ane");
		script.get(1).setDialogue3("arayila kore neram ayii enthe penale ane");
		script.get(1).setDialogue4("arayila....... ! ");
		script.get(1).setDialogue5("ayooo vendaa adii onumm undakanda...........");
		script.get(1).setDialogue6("va pokam vitekee namak pokam tintuuu");


		script.add(new Katakadarajan());
		script.get(2).setDialogue1("enik vendathe ok ne tharuvoo ne ara divama onu poda sondum pani nokii poko ninak rajane seric arayilaa over kalicha petile  avum pokunam evidun ketoda kilunth cheka Haa ha ha .....");
		script.get(2).setDialogue2("enthada vadanaaa..............");
		script.get(2).setDialogue3("nine njan pene edutolada..........");
		this.scenes();
   }
   public void scenes()
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