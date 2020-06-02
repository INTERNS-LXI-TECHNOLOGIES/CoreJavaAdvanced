package com.lxisoft.model ;

public class ContactModel
{

	private String name ;
	private String[] address = new String[3]() ;
	private double phoneNumber ;
	private String emailId ;
	
	public String getName()
	{
		return name ;
	}
	public void setName(String n)
	{
		name = n ;
	}

	public String[] getAddress()
	{
		return address ;
	}
	public void setAddress(String[] a)
	{
		address = a ;
	}

	public double getPhoneNumber()
	{
		return phoneNumber ;
	}
	public void setPhoneNumber(double pNo)
	{
		phoneNumber = pNo ;
	}

	public String getEmailId()
	{
		return emailId ; 
	}
	public void setEmailId(String eId)
	{
		emailId = eId ;
	}



}