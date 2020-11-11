package com.lxisoft.Modal;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.io.*; 
import java.util.*;

public class movieInfo implements Comparable<movieInfo>
{
private String name;
private int age;
private int awards;
private String awardName;
public movieInfo(String a,int b,int c,String d)
{
this.name=a;
this.age=b;
this.awards=c;
this.awardName=d;
}
public String toString() 
    { 
        return name + " " + age + " " + awards+ " " + awardName; 
    } 
public int compareTo(movieInfo award)
{
	if(this.getAwards() > award.getAwards())

		return 1;
	else
		return -1;
}

  	public double getAwards()
    { 
  	return awards; 
  	} 
    public String getName() 
    { 
       return name; 
  	} 
    public int getAge()    
    { 
       return age; 
    }
    public String getawardName() 
    { 
       return awardName; 
  	}  
}