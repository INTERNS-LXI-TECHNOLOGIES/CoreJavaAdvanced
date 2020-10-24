package com.LxiSoft.Movie;
import java.io.File;
import java.io.*;
import java.io.IOException;

public class CreateFile
{
	File comedyFile = new File("C:\\home\\Desktop\\lxi_works1\\EEJavaFoundational\\MovieScript\\classes\\comedydialogues.txt");
File villainFile = new File("C:\\home\\Desktop\\lxi_works1\\EEJavaFoundational\\MovieScript\\classes\\villaindialogues.txt");
File heroFile = new File("C:\\home\\Desktop\\lxi_works1\\EEJavaFoundational\\MovieScript\\classes\\herodialogues.txt");

	public void comdeyFileMake()
	{
		try
		{
	
	if(comedyFile.createNewFile())
	{
		System.out.println("File created"+comedyFile.getName());
	}
	else
	{
		System.out.println("File Already Created");
	}

}
catch(IOException e)
{
	System.out.println("An error occured");
   e.printStackTrace();
   }
   this.comedyFileInfo();
  }
  public void comedyFileInfo()
  {
  	if(comedyFile.exists())
  	{
  		System.out.println("File name: "+comedyFile.getName());
  		//System.out.println("File path: "+comedyFile.getAbsolutePath());
  			//System.out.println("File Writable: "+comedyFile.canWrite());
  		//System.out.println("File readable: "+comedyFile.canRead());
  		System.out.println("File size in bytes: "+comedyFile.length());
  		
  	}
  	else
{
	System.out.println("File Doesnt excist;");  		
}
  }


  	public void villainFileMake()
	{
		try
		{
	
	if(villainFile.createNewFile())
	{
		System.out.println("File created"+villainFile.getName());
	}
	else
	{
		System.out.println("File Already Created");
	}

}
catch(IOException e)
{
	System.out.println("An error occured");
   e.printStackTrace();
   }
   this.villainFileInfo();
  }
  public void villainFileInfo()
  {
  	if(villainFile.exists())
  	{
  		System.out.println("File name: "+villainFile.getName());
  		//System.out.println("File path: "+comedyFile.getAbsolutePath());
  			//System.out.println("File Writable: "+comedyFile.canWrite());
  		//System.out.println("File readable: "+comedyFile.canRead());
  		System.out.println("File size in bytes: "+villainFile.length());
  		
  	}
  	else
{
	System.out.println("File Doesnt excist;");  		
}
  }

  
  	public void heroFileMake()
	{
		try
		{
	
	if(heroFile.createNewFile())
	{
		System.out.println("File created"+heroFile.getName());
	}
	else
	{
		System.out.println("File Already Created");
	}

}
catch(IOException e)
{
	System.out.println("An error occured");
   e.printStackTrace();
   }
   this.heroFileInfo();
  }
  public void heroFileInfo()
  {
  	if(heroFile.exists())
  	{
  		System.out.println("File name: "+heroFile.getName());
  		//System.out.println("File path: "+comedyFile.getAbsolutePath());
  			//System.out.println("File Writable: "+comedyFile.canWrite());
  		//System.out.println("File readable: "+comedyFile.canRead());
  		System.out.println("File size in bytes: "+heroFile.length());
  		
  	}
  	else
{
	System.out.println("File Doesnt excist;");  		
}
  }
  }