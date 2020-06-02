package com.lxisoft.view;
import com.lxisoft.model.*;
import com.lxisoft.controller.*;
import com.lxisoft.repository.*;
import java.util.*;
import java.io.*;
public class ContactList
{
	Scanner sc = new Scanner(System.in);
	public int contactAppMenu(ContactModel model,ContactAppDatabase db)
	{
		int choice = 0;
		try{
		System.out.println("*******ContactApp********");
		System.out.println("---------------------");
		System.out.println("1.Add Contacts");
		System.out.println("2.View Contacts");
		// System.out.println("3.Search Contacts");
		// System.out.println("4.Edit Contacts");
		System.out.println("Select An Option");
		choice = sc.nextInt();
			if(choice>4)
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

}