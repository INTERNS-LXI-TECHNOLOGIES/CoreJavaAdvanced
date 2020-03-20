package com.lxisoft.view;
import com.lxisoft.model.*;
import com.lxisoft.controller.*;
import com.lxisoft.repository.*;
import java.util.*;
import java.io.*;
public class ContactView
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
		System.out.println("3.Search Contacts");
		System.out.println("4.Edit Contacts");
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
	public void viewContact(ArrayList<ContactModel> contactList)
	{
		System.out.println("\t\t\t*******CONTACT APP*********");
		System.out.println("\t\t\t-----------------------------\n");

		System.out.println("\tID\t\tNAME\t\tPHONENO\t\tEMAIL\t\tADDRESS");
		System.out.println("----------------------------------------------------------------------------------");
		for (int i=0;i<contactList.size();i++) 
		{
			System.out.println("\t"+contactList.get(i).getId()+"\t\t"+contactList.get(i).getName()+"\t\t"+contactList.get(i).getPhoneNum()+"\t\t"+contactList.get(i).getEmail()+"\t\t"+contactList.get(i).getAddress());		
		}
	}
	public int searchContact()
	{
		System.out.println("Enter The Contact ID To Search:: ");
		int searchId = sc.nextInt();
		return searchId;
	}
	public int editContact()
	{
		int choice = 0;
		try{
		System.out.println("*******EDIT MENU********");
		System.out.println("---------------------");
		System.out.println("1.Update Contact");
		System.out.println("2.Delete Contact");
		System.out.println("3.Back");
		System.out.println("Select An Option");
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
	public int updateContact()
	{
		System.out.println("Enter The Contact ID To Update:: ");
		int updateId = sc.nextInt();

		return updateId;
	}
	public void updateConsole()
	{
		int choice = 0;
		try{
		System.out.println("*******UPDATE MENU********");
		System.out.println("---------------------");
		System.out.println("How Many Attribute Do You Want To Update");
		int attributeNo = sc.nextInt();
		System.out.println("Which Attribute You Want To Edit");
		System.out.println("1.ID");
		System.out.println("2.NAME");
		System.out.println("3.PHONENO");
		System.out.println("4.EMAIL");
		System.out.println("5.ADDRESS");
		System.out.println("Select Any Of The Option::");
		choice = sc.nextInt();
			if(choice>5)
			{
				throw new  MyException("Not Valid Option!!!");
			}
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
		
	}
	public int deleteContact()
	{
		System.out.println("Enter The Contact ID To delete:: ");
		int deleteId = sc.nextInt();
		return deleteId;
	}
}