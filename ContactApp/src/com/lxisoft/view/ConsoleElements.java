package com.lxisoft.view ;

public class ConsoleElements
{
	public static void clearScreen()
	{
		try
		{	
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}

		catch(Exception E)
		{
			System.out.println(E);
		}	
	}
}