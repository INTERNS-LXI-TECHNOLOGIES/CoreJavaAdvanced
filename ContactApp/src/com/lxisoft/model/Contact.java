package com.lxisoft.model;
import com.lxisoft.model.Contact;
import java.util.*;

public class Contact{
	String name;
	String email;
	long number;

	public void setName(String nme){
		this.name = nme;
	}
	public String getName(){
		return name;
	}
	public void setNumber(String no){
		this.number = no;
	}
	public String getNumber(){
		return number;
	}
	public void setEmail(String mail){
		this.email = mail;
	}
	public String getEmail(){
		return getEmail;
	}

}