package com.lxisoft.model;
import java.io.*;  
import java.util.*;  

public class Contact                        
{
private String firstname,lastname,number;
private int id;

public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }

public void setfirstname(String firstname)                               
    { 
        this.firstname = firstname; 
    } 

public String getfirstname()  
    { 
        return firstname; 
    }                          
public void setlastname(String lastname)
    {
    	this.lastname=lastname;
	}
public String getlastname()
	{
		return lastname;
	}	
public void setnumber(String number)                       
    {                          
        this.number=number;
    }
public String getnumber()
    {
        return number;
    }   

}
