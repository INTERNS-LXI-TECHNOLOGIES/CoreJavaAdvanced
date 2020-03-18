package com.lxisoft.repository;
import java.io.*;  
import java.util.*;  

public class FileReppo
{

public void creatFile(File file)
{
	// File file =new File(name);
		try
		{
			
			file.createNewFile();
			}
	   	catch(Exception ex)
	   	{	System.out.println("* "+ex); }
}


}