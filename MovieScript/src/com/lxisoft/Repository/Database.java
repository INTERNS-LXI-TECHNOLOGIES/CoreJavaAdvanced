package com.lxisoft.Repository;
import java.util.Scanner;
import java.util.Collections;
import com.lxisoft.View.*;
import com.lxisoft.Modal.*;
import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Database
{
	public void createFileScene1()
	{
		try{
            //FileOutputStream writeData = new FileOutputStream(("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file.csv"));
           // ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
				FileWriter writeData = new FileWriter(("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/scene1.csv"));
            writeData.write("\u001b[35m\033[1mWoodie:\033[0mStop right there sid you have no where to go.\n");			
			writeData.write("\u001b[37m\033[1mBuzz  :\033[0mHang on there jessie	we will rescue you.\n");		
			writeData.write("\u001b[33m\033[1mJessie:\033[0mHelp ME guys 	kill this scumbag!!!.\n");	
            writeData.flush();
            writeData.close();
        	}
        	catch (IOException e) 
        	{
            e.printStackTrace();
        	}

        	//movie.dialogue(script);
	}
	public void readFileScene1()
	{
				try{

		//File readData = new File(("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/file2.csv")); 
		BufferedReader br = new BufferedReader(new FileReader("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/scene1.csv"));
		//Scanner scn=new Scanner(readData);
		//readStream.nextLine();
		//System.out.println(readStream);
		//String s=br.readLine();
		//System.out.println(s);
		String s;
		while((s=br.readLine()) != null)
		{
			System.out.println(s);

		}
		br.close();
	}
	catch (IOException e) 
        	{
            e.printStackTrace();
        	}
	}
	public void createFileScene2()
	{
		try{
				FileWriter writeData = new FileWriter(("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/scene2.csv"));
            writeData.write("\u001b[31m\033[1mSid   :\033[0mHAHAHA!!!! you are wrong you imbeciles you guys are no...match for me.\n");			
		writeData.write("\u001b[35m\033[1mWoodie:\033[0mBuzz kill him with your laser shot.\n");			
		writeData.write("\u001b[31m\033[1mSid   :\033[0mHe wont\n");		
		writeData.write("\u001b[33m\033[1mJessie:\033[0mBefore you strike me think for a second im your family and do u wish to take words from ur friends who doesnt value you.\n");		
		writeData.write("\u001b[31m\033[1mSid   :\033[0mDo it Buzz..\n");
            writeData.flush();
            writeData.close();
        	}
        	catch (IOException e) 
        	{
            e.printStackTrace();
        	}
	}
	public void readFileScene2()
	{
				try{

		BufferedReader br = new BufferedReader(new FileReader("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/scene2.csv"));
				String s;
		while((s=br.readLine()) != null)
		{
			System.out.println(s);

		}
		br.close();
	}
	catch (IOException e) 
        	{
            e.printStackTrace();
        	}
	}
	public void createFileScene3()
	{
		try{
				FileWriter writeData = new FileWriter(("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/scene3.csv"));
            writeData.write("\u001b[31m\033[1mSid   :\033[0mJust think	how they treated you being a soldier they never gave you the position everyone needs only woodie even this jeesie.\n");
		writeData.write("\u001b[33m\033[1mJessie:\033[0mBuzz!!! Dont listen to him.\n");			
		writeData.write("\u001b[35m\033[1mWoodie:\033[0mDont listen to him	he is playing with your mind.\n");		
		writeData.write("\u001b[37m\033[1mBuzz  :\033[0mI can't its my brother after all\n");
		writeData.write("\u001b[33m\033[1mJessie:\033[0mkill him Buzz.\n");	
		writeData.write("\u001b[31m\033[1mSid   :\033[0mThink!!! do wou want to kill me.\n");		
		writeData.write("\u001b[35m\033[1mWoodie:\033[0mBuzz remember all the fun we had together.\n");		
		writeData.write("\u001b[37m\033[1mBuzz  :\033[0mOK thats enough When i needed someone the most i had only my friends.\n");	
		writeData.write("\u001b[37m\033[1mBuzz  :\033[0mSorry sid this has to end somehow.\n");
            writeData.close();
        	}
        	catch (IOException e) 
        	{
            e.printStackTrace();
        	}
	}
	public void readFileScene3()
	{
				try{

		BufferedReader br = new BufferedReader(new FileReader("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/scene3.csv"));
				String s;
		while((s=br.readLine()) != null)
		{
			System.out.println(s);

		}
		br.close();
	}
	catch (IOException e) 
        	{
            e.printStackTrace();
        	}
	}
	public void createFileScene4()
	{
		try{
				FileWriter writeData = new FileWriter(("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/scene4.csv"));
        writeData.write("\u001b[31m\033[1mSid   :\033[0mNO!!!!......\n");		
		writeData.write("\u001b[31m\033[1mSid   :\033[0mI am sorry BUzz i couldnt be a good brother for you	have a happy life.\n");	
		writeData.write("\u001b[37m\033[1mBuzz  :\033[0mweeps ----.\n");
            writeData.close();
        	}
        	catch (IOException e) 
        	{
            e.printStackTrace();
        	}
	}
	public void readFileScene4()
	{
				try{

		BufferedReader br = new BufferedReader(new FileReader("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/scene4.csv"));
				String s;
		while((s=br.readLine()) != null)
		{
			System.out.println(s);

		}
		br.close();
	}
		catch (IOException e) 
        	{
            e.printStackTrace();
        	}
	}
	public void createFileScene5()
	{
		try{
				FileWriter writeData = new FileWriter(("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/scene5.csv"));
        writeData.write("\u001b[35m\033[1mWoodie:\033[0mIts over buzz come buddy lets untie jessie.\n");		
		writeData.write("\u001b[33m\033[1mJessie:\033[0mI knew you would rescue me	nd we are sorry for your brother.\n");
		writeData.write("\u001b[37m\033[1mBuzz  :\033[0mhmm evil has to end somehow.\n");
		writeData.write("\u001b[37m\033[1mBuzz  :\033[0myea anyway im happy we got you in  (giggles).\n");
		writeData.write("\u001b[33m\033[1mJessie:\033[0mhaha yeahh 	finally we r a family again.\n");
            writeData.close();
        	}
        	catch (IOException e) 
        	{
            e.printStackTrace();
        	}
	}
	public void readFileScene5()
	{
				try{

		BufferedReader br = new BufferedReader(new FileReader("/home/karthik/MyJavaDirectory/src/com/lxisoft/Files/scene5.csv"));
				String s;
		while((s=br.readLine()) != null)
		{
			System.out.println(s);

		}
		br.close();
	}
		catch (IOException e) 
        	{
            e.printStackTrace();
        	}
	}
}