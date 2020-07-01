package com.lxisoft.view;
import java.util.*;
import com.lxisoft.controller.*;
import com.lxisoft.model.*;
import java.lang.*;
public class View
{
	public void printMainMenu()
	{
		
		System.out.println("\n\t1 : My Contacts \n\t2 : Add Contact\n\t3 : Search Contact \n\t4 : Exit ");


	}
	public void displayAllContact(ArrayList<ContactModel> mycontacts)
	{
		System.out.println("\t    First Name \t\t   Last Name \t\tPhone Number ");
		for (ContactModel c : mycontacts)
			printContactDetails(c);


	}

	public void printContactDetails(ContactModel c)
	{
		System.out.format("%20s %25s %20d\n" ,c.getFirstName(),c.getFirstName(),c.getPhoneNumber() );
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
		System.out.println(" => Go Back(y/n) ");
		ch = in.nextLine();
		if(ch.equals("y") ||ch.equals("Y"))
			return true;
		else
			return false;

	}
}
