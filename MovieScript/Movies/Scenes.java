package com.lxisoft.Movies;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Scenes
{
ArrayList<Script> script=new ArrayList<Script>();

	public void file()
	{
		Movie movie=new Movie();
 	   // int n = 4; // The line number
		try
			{
				File f=new File("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv");
				Scanner scan=new Scanner(f);
			}
		catch (FileNotFoundException ex)
     		{
      			System.out.println("An error occurred.");
     			 ex.printStackTrace();
    		}
     	 try
     	 	{

        String line1 = Files.readAllLines(Paths.get("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv")).get(1);
        String line2 = Files.readAllLines(Paths.get("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv")).get(2);
        String line3 = Files.readAllLines(Paths.get("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv")).get(3);
        String line4 = Files.readAllLines(Paths.get("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv")).get(4);
        String line5 = Files.readAllLines(Paths.get("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv")).get(5);

        String line6 = Files.readAllLines(Paths.get("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv")).get(6);
        String line7 = Files.readAllLines(Paths.get("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv")).get(7);
        String line8 = Files.readAllLines(Paths.get("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv")).get(8);
        String line9 = Files.readAllLines(Paths.get("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv")).get(9);
        String line10 = Files.readAllLines(Paths.get("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv")).get(10);
        String line11 = Files.readAllLines(Paths.get("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv")).get(11);
        String line12 = Files.readAllLines(Paths.get("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv")).get(12);
        String line13 = Files.readAllLines(Paths.get("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv")).get(13);
        String line14 = Files.readAllLines(Paths.get("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv")).get(14);
        String line15 = Files.readAllLines(Paths.get("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv")).get(15);

        String line16 = Files.readAllLines(Paths.get("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv")).get(16);
        String line17 = Files.readAllLines(Paths.get("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv")).get(17);
        String line18 = Files.readAllLines(Paths.get("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv")).get(18);
        String line19 = Files.readAllLines(Paths.get("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv")).get(19);
        String line20 = Files.readAllLines(Paths.get("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv")).get(20);
        String line21 = Files.readAllLines(Paths.get("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv")).get(21);
        String line22 = Files.readAllLines(Paths.get("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv")).get(22);
        String line23 = Files.readAllLines(Paths.get("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv")).get(23);
        String line24 = Files.readAllLines(Paths.get("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv")).get(24);
        String line25 = Files.readAllLines(Paths.get("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv")).get(25);
	    String line26 = Files.readAllLines(Paths.get("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file1.csv")).get(26);

	script.delete(26);
		try
			{
  				System.out.println("\u001b[35m\033[1mWoodie:\033[0m"+line1);
			Thread.sleep(950);
				System.out.println("\u001b[37m\033[1mBuzz  :\033[0m"+line2);
			Thread.sleep(950);
  				System.out.println("\u001b[33m\033[1mJessie:\033[0m"+line3);
			movie.villain1();
				System.out.println("\u001b[31m\033[1mSid   :\033[0m"+line4);
  				System.out.println("\u001b[35m\033[1mWoodie:\033[0m"+line5);
				Thread.sleep(950);
				System.out.println("\u001b[31m\033[1mSid   :\033[0m"+line6);
				Thread.sleep(950);
  				System.out.println("\u001b[33m\033[1mJessie:\033[0m"+line7);
				Thread.sleep(950);
				System.out.println("\u001b[31m\033[1mSid   :\033[0m"+line8);
			movie.villain2();
  				System.out.println("\u001b[31m\033[1mSid   :\033[0m"+line9);
				Thread.sleep(950);
				System.out.println("\u001b[33m\033[1mJessie:\033[0m"+line10);
				Thread.sleep(950);
  				System.out.println("\u001b[35m\033[1mWoodie:\033[0m"+line11);
				Thread.sleep(950);
				System.out.println("\u001b[37m\033[1mBuzz  :\033[0m"+line12);
				Thread.sleep(950);
  				System.out.println("\u001b[33m\033[1mJessie:\033[0m"+line13);
				Thread.sleep(950);
				System.out.println("\u001b[31m\033[1mSid   :\033[0m"+line14);
				Thread.sleep(950);
  				System.out.println("\u001b[35m\033[1mWoodie:\033[0m"+line15);
				Thread.sleep(950);
				System.out.println("\u001b[37m\033[1mBuzz  :\033[0m"+line16);
				Thread.sleep(950);
  				System.out.println("\u001b[37m\033[1mBuzz  :\033[0m"+line17);
			movie.villain3();
				System.out.println("\u001b[31m\033[1mSid   :\033[0m"+line18);
				Thread.sleep(950);
  				System.out.println("\u001b[31m\033[1mSid   :\033[0m"+line19);
				Thread.sleep(950);
				System.out.println("\u001b[37m\033[1mBuzz  :\033[0m"+line20);
			movie.villain4();
  				System.out.println("\u001b[35m\033[1mWoodie:\033[0m"+line21);
				Thread.sleep(950);
				System.out.println("\u001b[33m\033[1mJessie:\033[0m"+line22);
				Thread.sleep(950);
  				System.out.println("\u001b[37m\033[1mBuzz  :\033[0m"+line23);
				Thread.sleep(950);
				System.out.println("\u001b[37m\033[1mBuzz  :\033[0m"+line24);
				Thread.sleep(950);
  				System.out.println("\u001b[33m\033[1mJessie:\033[0m"+line25);
				Thread.sleep(950);
				System.out.println("\u001b[35m\033[1mWoodie:\033[0m"+line26);
			movie.villain5();
										}
		catch (InterruptedException e)
            {
                e.printStackTrace();
            }   
			} 
      	catch(IOException e)
      		{
        		System.out.println(e);
              	e.printStackTrace();

      		}
    
        
    }
}

