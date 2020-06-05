package com.lxisoft.view;
import com.lxisoft.model.*;
import com.lxisoft.control.*;
import com.lxisoft.repository.*;
import java.util.*;
import java.io.*;
public class ContactList
{
	Scanner sc = new Scanner(System.in);
	public int contactAppMenu(Contact model,ContactDatabase db)
	{
		int choice = 0;
		try{
		System.out.println("*******ContactApp********");
		System.out.println("---------------------");
		System.out.println("1.Add Contacts");
		System.out.println("2.View Contacts");
		System.out.println("3.Search Contacts");
		System.out.println("4.Edit Contacts");
		System.out.println("\nSelect An Option");
		choice = sc.nextInt();
			if(choice>4)
			{
				throw new  MyException("\nNot Valid Option!!!");
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
		System.out.println("---------------------");
		System.out.println("Enter FirstName\t:");
		String name = sc.nextLine();
		name = sc.nextLine();
		model.setFirstname(name);
		System.out.println("Enter LastName\t:");
		String lname = sc.nextLine();
		lname = (lname.equals(""))?sc.nextLine():lname;
		model.setLastname(lname);
		System.out.println("Enter Phone Number :");
		String phno = sc.nextLine();
		phno = (phno.equals(""))?sc.nextLine():phno;
		model.setNumber(phno);
		
		
		return model;
	}

	public void viewContact(ArrayList<Contact> contactList)
	{
		System.out.println("\t\t\t*******CONTACT APP*********");
		System.out.println("\t\t\t-----------------------------\n");

		System.out.println("\tID\t\tNAME\t\tPhoneNumber");
		System.out.println("-------------------------------------------------------------------------------");
		for (int i=0;i<contactList.size();i++) 
		{
			System.out.println("\t"+contactList.get(i).getId()+"\t\t"+contactList.get(i).getFirstname()+" "+contactList.get(i).getLastname()+"\t\t"+contactList.get(i).getNumber());		
		}
	}

	public int searchContact()
	{
		System.out.print("Enter The Contact Name To Search\t: ");
		String searchname = sc.nextLine();
		return searchname;
	}

	public int editContact()
	{
		int choice = 0;
		try{
		System.out.println("\t\tEDIT MENU");
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
		System.out.println("Enter The Contact ID To Update\t: ");
		int updateId = sc.nextInt();

		return updateId;
	}

	public int deleteContact()
	{
		System.out.println("Enter The Contact ID To Delete\t: ");
		int updateId = sc.nextInt();

		return updateId;
	}
}