package com.lxisoft.Racing;
import com.lxisoft.Racing.*;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner; 
import java.io.*;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.nio.file.Path;
import java.io.FileReader; 
import java.nio.charset.StandardCharsets;
import java.nio.file.Files; 
import java.nio.file.Paths; 

public abstract class  Car implements Serializable
{
	public abstract void details();
		public void detailsNormal()
		{
			System.out.println("Normal Car");
		}


	
	public String name;
	public String engine;
	public String winner;
	public int power;
	public Double time;


	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setType(String engine)
	{
		this.engine=engine;
	}
	public String getType()
	{
		return engine;
	}
	public void setEngine(int power)

	{
		this.power=power;
	}
	public int getEngine()
	{
		return power;
	}
	public void setWinner(String winner)
	{
		this.winner=winner;
	}
	public String getWinner()
	{
		return winner;
	}
	public void setTime(Double time)
	{
		this.time=time;
	}
	public Double getTime()
	{
		return time;
	}
	
}