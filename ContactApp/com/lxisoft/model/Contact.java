package com.lxisoft.model;
import java.io.*;  
import java.util.*;  

public class Contact                        
{
private String firstname,lastname;
private int number;

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
public void setnumber(int number)                       
    {                          
        this.number=number;
    }
public int getnumber()
    {
        return number;
    }   

}
