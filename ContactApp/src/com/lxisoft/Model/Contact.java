package com.lxisoft.Model;
import com.lxisoft.View.*;
import com.lxisoft.Control.Controler;
public  class Contact
{
	private String firstname;
	private String lastname;
	private String mailid;
	private int number;
	
	public void setFirstName(String firstname)
	{
		this.firstname = firstname;
	}
	public String getFirstName()
	{
		return firstname;
	}
	public void setLastName(String lastname)
	{
		this.lastname = lastname;
	}
	public String getLastName()
	{
		return lastname;
	}
	public void setNumber(int number)
	{
		this.number = number;
	}
	public int getNumber()
	{
		return number;
	}
	public void setMailId(String mailid)
	{
		this.mailid = mailid;
	}
	public String getMailId()
	{
		return mailid;
	}
}