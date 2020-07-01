package com.lxisoft.controller;
import com.lxisoft.view.*;
import com.lxisoft.model.*;
import java.util.*;
public class Controller
{
	private View view = new View();
	private ContactModel contact = new ContactModel();
	private ArrayList<ContactModel> mycontacts = new ArrayList<ContactModel>();
	public void runApp()
	{
		int choice=0;
		Scanner in = new Scanner(System.in);
		view.printMainMenu();
		choice = in.nextInt();
		switch(choice)
		{
			case 1 : view.displayAllContact(mycontacts);
					 break;
			case 2 : addNewContact();
					 break;
			case 3 : searchContact();
					 break;
			case 4 : break;
		}

	}

	public void addNewContact()
	{
		contact = view.showAddMenu(contact);
		mycontacts.add(contact);
		runApp();
	}

	public void searchContact()
	{


	}

	

}