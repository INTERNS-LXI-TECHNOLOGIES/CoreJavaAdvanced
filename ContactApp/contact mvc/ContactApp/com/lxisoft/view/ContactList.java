package com.lxisoft.view;
import com.lxisoft.model.*;
import com.lxisoft.controller.*;
import com.lxisoft.repository.*;
import java.util.*;
import java.io.*;
public class ContactList
{
	Scanner sc = new Scanner(System.in);
	public int contactMenu(ArrayList<Contact> contactList)
	{
		int choice = 0;
		try{
		
		 viewContact(contactList);
		System.out.println("\n1.Add Contacts\n2.Search Contacts\n3.Edit Contacts");

		System.out.print("Enter Your Option\t:\t");
		choice = sc.nextInt();
			if(choice>3)
			{
				throw new  MyException("Not Valid Option!!!");
			}
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
		return choice;
	}