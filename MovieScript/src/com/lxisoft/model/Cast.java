package com.lxisoft.model;
import com.lxisoft.model.*;
public class Cast implements Comparable<Cast>{
	String name;
	String charectorName;
	int age;
	public void setName(String n){
		this.name = n;
	}
	public String getName(){
		return name;
	}
	public void setCharectorName(String cn){
		this.charectorName = cn;
	}
	public String getCharectorName(){
		return charectorName;
	}
	public void setAge(int a){
		this.age = a;
	}	
	public int getAge(){
		return age;
	}
	public int compareTo(Cast c){
		return this.age - c.age;
	}
} 