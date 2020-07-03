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
		sortContact(mycontacts);
		file.storeToFile(mycontacts);
		//Clear.cls();
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
		Scanner in = new Scanner(System.in);
		int choice,option,index=0;
		boolean contactPresent=false;
		String toSearch = view.printSearchMenu();
		for(ContactModel c : mycontacts)
		{
			if(c.getFirstName().contains(toSearch))
			{
				contactPresent=true;
				view.printContact(c);
				System.ou.println("Index = " + index);
				chooseOperation(index);
				break;
				// choice=view.displaySearchOption();
				//break;
				// switch(choice)
				// {
				// 	case 1 : option =view.printEditMenu();
				// 			 break;
				// 	case 2 : view.printDeleteMenu();
				// 			 break;
				// 	case 3 : runApp();
				// 			 break;
				// }
				
			}
			else
				contactPresent=false;
			index++;
		}
		if(!contactPresent)
		{
			System.out.println("\t\t => Contact Unavailable : Press Enter ");
			in.nextLine();
			runApp();
		}

	}

	public void sortContact(ArrayList<ContactModel> mycontacts)
	{
		Comparator<ContactModel> compareByFirstName = Comparator.comparing( ContactModel::getFirstName);
        Collections.sort(mycontacts, compareByFirstName);
	}
	public void deleteContact()
	{

	}
	public void chooseOperation(int index)
	{
		choice=view.displaySearchOption();
		switch(choice)
				{
					case 1 : option =view.printEditMenu();
							 chooseEditOperation(option,index);
							 break;
					case 2 : view.printDeleteMenu();
							 break;
					case 3 : runApp();
							 break;
				}

	}
	public void chooseEditOperation(int option , int index)
	{
		

	}

	

}