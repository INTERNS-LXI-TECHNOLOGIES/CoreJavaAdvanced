package com.lxisoft.src;
public class  ContactModel
{
	private String name;
	private String email;
	private String address;
	private String phoneNum;
	ArrayList<String> contactList = new ArrayList<String>(); 
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getEmail()
	{
		return email;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getAddress()
	{
		return address;
	}
	public void setPhoneNum(String phoneNum)
	{
		this.phoneNum = phoneNum;
	}
	public String getPhoneNum()
	{
		return phoneNum;
	}
	

}