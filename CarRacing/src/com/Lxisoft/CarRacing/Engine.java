package com.Lxisoft.CarRacing;
import com.Lxisoft.CarRacing.*;

public class Engine
{
	private float engineCC;
	private String fuelType;
	private int power;

	public void setEngineCC(float engineCC)
	{
		this.engineCC=engineCC;	
	}
	public float getEngineCC()
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
}