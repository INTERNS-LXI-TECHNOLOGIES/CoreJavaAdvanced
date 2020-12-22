package com.lxisoft.Model;
import com.lxisoft.View.Movie;
import com.lxisoft.Control.Controler;
import com.lxisoft.Model.Hero;
import com.lxisoft.Model.Heroine;
import com.lxisoft.Model.Villan;
public abstract class Script
{
	private String name0;
	private String name1;
	private String name2;
	private String name3;
	private String name4;
	private String name5;
	private String name6;
	private String name7;

    public abstract void scriptPlay(); 
    public void setName(String name)
    {
    	this.name0 = name;
    }
    public String getName()
    {
    	return name0;
    }
	public void setDialogue1(String name)
	{
		this.name1= name;
	}
	public String getDialogue1()
	{
		return name1;
	}

	public void setDialogue2(String name)
	{
		this.name2= name;
	}
	public String getDialogue2()
	{
		return name2;
	}

	public void setDialogue3(String name)
	{
		this.name3= name;
	}
	public String getDialogue3()
	{
		return name3;
	}

	public void setDialogue4(String name)
	{
		this.name4= name;
	}
	public String getDialogue4()
	{
		return name4;
	}

	public void setDialogue5(String name)
	{
		this.name5= name;
	}
	public String getDialogue5()
	{
		return name5;
	}

	public void setDialogue6(String name)
	{
		this.name6= name;
	}
	public String getDialogue6()
	{
		return name6;
	}

	public void setDialogue7(String name)
	{
		this.name7= name;
	}
	public String getDialogue7()
	{
		return name7;
	}
}