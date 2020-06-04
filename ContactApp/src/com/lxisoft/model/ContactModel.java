package com.lxisoft.model ;

public class ContactModel
{

	private String name ;
	private String[] address = new String[3] ;
	private long phoneNumber ;
	private String emailId ;
	private static int numberOfContacts ;

	public ContactModel(String name,long phoneNumber)
	{
		numberOfContacts++ ;
		this.name = name ;
		this.phoneNumber = phoneNumber ;
	}

	public ContactModel()
	{
		
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

	public static int getNumberOfContacts()
	{ 
		return numberOfContacts ;
	}
	public static void setNumberOfContacts(int n)
	{
		numberOfContacts = n;
	}

}