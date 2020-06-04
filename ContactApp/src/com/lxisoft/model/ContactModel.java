package com.lxisoft.model ;

public class ContactModel
{

	private String name ;
	private String[] address = new String[3] ;
	private long phoneNumber ;
	private String emailId ;

	public ContactModel(String name,long phoneNumber)
	{
		this.name = name ;
		this.phoneNumber = phoneNumber ;
	}

	public ContactModel()
	{
		name = "" ;
		phoneNumber = 0 ;
	}
	
	public String getName()
	{
		return name ;
	}
	public void setName(String n)
	{
		name = n ;
	}

	public long getPhoneNumber()
	{
		return phoneNumber ;
	}
	public void setPhoneNumber(long pNo)
	{
		phoneNumber = pNo ;
	}
}