package com.lxisoft.view;
import java.util.*;
import com.lxisoft.controller.*;
import com.lxisoft.model.*;
public class View
{
	public void printMainMenu()
	{
		
		System.out.println("\n\t1 : My Contacts \n\t2 : Add Contact\n\t3 : Search Contact \n\t4 : Exit ");


	}
	public void displayAllContact(ArrayList<ContactModel> mycontacts)
	{
		for (ContactModel c : mycontacts)
			printContactDetails(c);

	}

	public void printContactDetails(ContactModel c)
	{
		System.out.println("=> First Name => "+ c.getFirstName());
		System.out.println("=> Last Name => "+ c.getLastName());
		System.out.println("=> Phone Number => "+ c.getPhoneNumber()+ "\n\n");
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
}
