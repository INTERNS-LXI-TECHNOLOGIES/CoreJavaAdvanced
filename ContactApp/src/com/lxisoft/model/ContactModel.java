package com.lxisoft.model ;

public class ContactModel
{

	private String firstName,lastName ;
	private long phoneNumber ;
	private String email ;
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
	public void setPhoneNumber(long phn)
	{
		phoneNumber = phn ;
	}

	public void setEmail(String id)
	{
		email=id;
	}
	public String getEmail()
	{
		return email;
	}
}