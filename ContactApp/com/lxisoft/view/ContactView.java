package com.lxisoft.view;
import com.lxisoft.model.*;
import com.lxisoft.controller.*;
import java.util.*;
import java.io.*;
public class ContactView
{
	Scanner sc = new Scanner(System.in);


	public ContactModel contactAppMenu(ContactModel model)
	{
		try{
		System.out.println("*******ContactApp********");
		System.out.println("---------------------");
		System.out.println("1.Add Contacts");
		System.out.println("2.View Contacts");
		System.out.println("3.Search Contacts");
		System.out.println("4.Edit Contacts");
		System.out.println("Select An Option");
		int choice = sc.nextInt();
			if(choice>4)
			{
				throw new  MyException("Not Valid Option!!!");
			}
			switch(choice)
			{
			case 1:addContact(model);break;
			// case 2:viewContact();break;
			// case 3:searchContact();break;
			// case 4:editContact();break;
			default:System.out.println("Enter Valid Option");
			}
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
		return model;
	}
	public ContactModel addContact(ContactModel model)
	{
		System.out.println("*******ADD CONTACT******");
		System.out.println("---------------------");
		System.out.println("Enter Name::");
		String name = sc.nextLine();
		name = sc.nextLine();
		model.setName(name);
		System.out.println("Enter Phone Number::");
		String phno = sc.nextLine();
		phno = (phno.equals(""))?sc.nextLine():phno;
		model.setPhoneNum(phno);
		System.out.println("Enter Email::");
		String email = sc.nextLine();
		email = (email.equals(""))?sc.nextLine():email;
		model.setEmail(email);
		System.out.println("Enter Address::");
		String adress = sc.nextLine();
		adress = (adress.equals(""))?sc.nextLine():adress;
		model.setAddress(adress);
		return model;
	}
}