package com.Lxisoft.CarRacing;
import  com.Lxisoft.CarRacing.*;
import java.util.*;

public class Car
{
	private int engineCC;
	private String fuelType;
	private int power;
	private String brand;
	private int efficiency;
	private String name;

	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setEngineCC(int engineCC)
	{
		this.engineCC=engineCC;	
	}
	public int getEngineCC()
	{
		return engineCC;
	}


	public void setFuelType(String fuelType)
	{
		this.fuelType=fuelType;
	}
	public String getFuelType()
	{
		return fuelType;
	}

	
	public void setPower(int power)
	{
		this.power=power;
	}
	public int getPower()
	{
		return power;
	}


    
    public void setBrand(String brand)
    {
    	this.brand=brand;	
    }
    public String getBrand()
    {
    	return this.brand;
    }
    public void setEfficiency(int efficiency)
    {
    	this.efficiency=efficiency;
    }
    public int getEfficiency()
    {
    	return this.efficiency;
    }
}





	


