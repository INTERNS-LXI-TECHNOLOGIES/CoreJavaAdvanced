package com.lxisoft.controller;
import com.lxisoft.filerepo.*;
import com.lxisoft.view.*;
import com.lxisoft.model.*;
import java.util.*;
public class Controller
{
	private View view = new View();
	private ContactModel contact = new ContactModel();
	private ArrayList<ContactModel> mycontacts = new ArrayList<ContactModel>();
	private FileManager file = new FileManager();
	public void runApp()
	{
		mycontacts.clear();
		mycontacts=file.readFromFile();
		Clear.cls();
		view.printTitle("Contact App");
		int choice=0;
		Scanner in = new Scanner(System.in);
		view.printMainMenu();
		choice = in.nextInt();
		switch(choice)
		{
			case 1 : view.printTitle("Displaying All Contacts");
					 view.displayAllContact(mycontacts);
					 boolean ch = view.printGoBack();
					 if(ch)
						 runApp();
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
		Clear.cls();
		view.printTitle("Add New Contact");
		ContactModel c = new ContactModel();
		c = view.showAddMenu(c);
		mycontacts.add(c);
		file.storeToFile(mycontacts);
		boolean choice = view.printGoBack();
		if(choice)
			runApp();

	}

	public void searchContact()
	{
		int choice;
		String toSearch = view.printSearchMenu();
		for(ContactModel c : mycontacts)
		{
			if(c.getFirstName().equals(toSearch))
			{
				choice=view.displaySearchOption();
				
				//break;
			}
			else 
			{
				System.out.println(" =>Contact unavailable ");	
				runApp();
			}
		}

	}

	

}