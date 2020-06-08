package com.lxisoft.model ;

public class ContactModel
{

	private String firstName,lastName ;
	private String[] address = new String[3] ;
	private long phoneNumber ;
	private String emailId ;

	public ContactModel(String firstName,String lastName,long phoneNumber)
	{
		this.firstName = firstName ;
		this.lastName = lastName ;
		this.phoneNumber = phoneNumber ;
	}

	public ContactModel()
	{
		
	}
	
	public String getFirstName()
	{
		return firstName ;
	}
	public void setFirstName(String fn)
	{
		firstName = fn ;
	}

	public String getLastName()
	{
		return lastName ;
	}
	public void setLastName(String ln)
	{
		lastName = ln ;
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