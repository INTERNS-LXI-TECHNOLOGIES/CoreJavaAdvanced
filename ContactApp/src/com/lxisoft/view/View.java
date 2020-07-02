package com.lxisoft.view;
import java.util.*;
import com.lxisoft.controller.*;
import com.lxisoft.model.*;
import java.lang.*;
public class View
{
	public void printMainMenu()
	{
		
		System.out.println("\t1 : My Contacts \n\t2 : Add Contact\n\t3 : Search Contact \n\t4 : Exit ");


	}
	public void displayAllContact(ArrayList<ContactModel> mycontacts)
	{
		System.out.println("----------------------------------------------------------------------\n");
		System.out.println("\t    First Name \t\t   Last Name \t\tPhone Number ");
		System.out.println("\n----------------------------------------------------------------------\n");
		for (ContactModel c : mycontacts)
			printContactDetails(c);


	}

	public void printContactDetails(ContactModel c)
	{
		System.out.format("%20s %25s %20d\n" ,c.getFirstName(),c.getLastName(),c.getPhoneNumber() );
	}

	public ContactModel showAddMenu( ContactModel contact)
	{
		String fn,ln;
		long phnNo;
		Scanner in = new Scanner(System.in);
		System.out.println("First Name : ");
		fn = in.nextLine();
		System.out.println("Last Name : ");
		ln = in.nextLine();
		System.out.println("Phone Number :");
		phnNo = in.nextLong();
		contact.setFirstName(fn);
		contact.setLastName(ln);
		contact.setPhoneNumber(phnNo);
		return contact;

	}

	public boolean printGoBack()
	{
		String ch;
		Scanner in = new Scanner(System.in);
		System.out.print(" \n\n\t\t => Go Back(y/n) : ");
		ch = in.nextLine();
		Clear.cls();
		if(ch.equals("y") ||ch.equals("Y"))
			return true;
		else
			return false;

	}

	public void printTitle(String s)
	{
		Clear.cls();
		System.out.println("\t ***********************************");
		System.out.println("\t\t "+ s );
		System.out.println("\t ***********************************\n\n\n");
	}

	public String printSearchMenu()
	{
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the name to search : ");
		String search = in.nextLine();
		return search;

	}

	public int displaySearchOption()
	{
		Scanner in =new Scanner(System.in);
		int choice;
		System.out.println(" =>Contact present ");
		System.out.println("=> What action did you need to perform \n\t=> 1. Edit Contact \n\t=> 2.Delete Contact => 3.Go Back ");
		choice = in.nextInt();
		return choice;

	}
}
