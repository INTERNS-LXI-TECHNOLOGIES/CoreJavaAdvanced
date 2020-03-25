package com.lxisoft.view;
import com.lxisoft.model.*;
import com.lxisoft.controller.*;
import com.lxisoft.repository.*;
import java.util.*;
import java.io.*;
public class ContactApp
{
	Scanner sc = new Scanner(System.in);
	public int contactMenu(ArrayList<Contact> contactList)
	{
		int choice = 0;
		try{
		
		 viewContact(contactList);
		System.out.println("\n1.Add Contacts\n2.Search Contacts\n3.Edit Contacts");

		System.out.print("Select An Option  :  ");
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
	public Contact addContact(Contact model)
	{
		System.out.println("\n\n*******ADD CONTACT******");
		System.out.println("______________________________\n");
		System.out.print("Enter First Name : ");
		String fname = sc.nextLine();
		//fname = sc.nextLine();
		model.setfirstname(fname);
		System.out.print("Enter Last Name :");
		String lname = sc.nextLine();
		//lname = sc.nextLine();
		model.setlastname(lname);
		System.out.print("Enter Phone Number :");
		String phno = sc.nextLine();
		phno = (phno.equals(""))?sc.nextLine():phno;
		model. setnumber(phno);
		
		return model;
	}
	public void viewContact(ArrayList<Contact> contactList)
	{
		System.out.println("\n\t\t\t*******Contact  App*********");
		System.out.println("\t\t\t_________________________________\n");

		System.out.println("\tID\tFirst NAME\tLast Name\tPhone Number");
		System.out.println("-----------------------------------------------------------------------");
		for (int i=0;i<contactList.size();i++) 
		{
			System.out.println("\t"+contactList.get(i).getId()+"\t"+contactList.get(i).getfirstname()+"\t"+contactList.get(i).getlastname()+"\t"+contactList.get(i).getnumber());		
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
		System.out.println("\n\n\tEdit Menu\t");
		System.out.println("---------------------");
		System.out.println("1.Update Contact\n2.Delete Contact\n3.Back");
		System.out.print("\nSelect An Option  : ");
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
		System.out.print("\nEnter The Contact ID To Update  :  ");
		int updateId = sc.nextInt();

		return updateId;
	}
	public void updateDetail()
	{
		int choice = 0;
		try{
		System.out.println("\n\t\tUpdate Menu");
		System.out.println("---------------------\n");
		System.out.println("How Many Attribute Do You Want To Update");
		int attributeNo = sc.nextInt();
		System.out.println("Which Attribute You Want To Edit");
		System.out.println("1.ID\n2.First NAME\n3.Last Name\n4.Ph Number");
		System.out.print("\nSelect Any Of The Option   :  ");
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
		
	}
	public int deleteContact()
	{
		System.out.print("Enter The Contact ID To delete : ");
		int deleteId = sc.nextInt();
		return deleteId;
	}
}