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
		view.printMyContacts(mycontacts);
		int contactId = view.printSelectContact();
		selectContact(contactId);
		int choice=0;
		Scanner in = new Scanner(System.in);
		view.printMainMenu();
		choice = in.nextInt();
		// switch(choice)
		// {
		// 	case 1 : view.printTitle("Displaying All Contacts");
		// 			 view.displayAllContact(mycontacts);
		// 			 boolean ch = view.printGoBack();
		// 			 if(ch)
		// 				 runApp();
		// 			 break;
		// 	case 2 : addNewContact();
		// 			 break;
		// 	case 3 : searchContact();
		// 			 break;
		// 	case 4 : break;
		// }

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
				view.printTitle("   SEARCH CONTACT  ");
				view.printContact(c);
				chooseOperation(index);
				break;
			}
			else
				contactPresent=false;
			index++;
		}
		if(!contactPresent)
		{
			System.out.println("\t\t => Contact Unavailable : Press Enter ");
			in.nextLine();
			in.nextLine();
			runApp();
		}

	}

	public void sortContact(ArrayList<ContactModel> mycontacts)
	{
		Comparator<ContactModel> compareByFirstName = Comparator.comparing( ContactModel::getFirstName);
        Collections.sort(mycontacts, compareByFirstName);
	}
	public void deleteContact(int index)
	{
		mycontacts.remove(index);
		file.storeToFile(mycontacts);
		runApp();

	}
	public void chooseOperation(int index)
	{
		int choice,option;
		choice=view.displaySearchOption();
		switch(choice)
				{
					case 1 : option =view.printEditMenu();
							 chooseEditOperation(option,index);
							 break;
					case 2 : view.printDeleteMenu();
							 deleteContact(index);
							 break;
					case 3 : runApp();
							 break;
				}

	}
	public void chooseEditOperation(int option , int index)
	{
		switch(option)
		{
			case 1: editContactName(index);
					runApp();
					break;
			case 2: editContactNumber(index);
					runApp();
					break;
			default : break;
		}

	}

	public void editContactName(int index)
	{
		Scanner in = new Scanner(System.in);
		String fName,lName;
		System.out.println("Before Editing : ");
		view.printContact(mycontacts.get(index));
		fName = view.printEditContactFirstName();
		lName = view.printEditContactLastName();
		mycontacts.get(index).setFirstName(fName);
		mycontacts.get(index).setLastName(lName);
		System.out.println("Successfull : ");
		System.out.println("After  Editing : ");
		view.printContact(mycontacts.get(index));
		file.storeToFile(mycontacts);
		System.out.println("\t\t  Press Enter to continue");
		in.nextLine();


	}
	public void editContactNumber(int index)
	{
		Scanner in = new Scanner(System.in);
		long num;
		System.out.println("Before Editing : ");
		view.printContact(mycontacts.get(index));
		num = view.printEditContactNumber();
		mycontacts.get(index).setPhoneNumber(num);
		System.out.println("Successfull : ");
		System.out.println("After  Editing : ");
		view.printContact(mycontacts.get(index));
		file.storeToFile(mycontacts);
		System.out.println("\t\t  Press Enter to continue");
		in.nextLine();


	}
	public void selectContact(int id)
	{Scanner in = new Scanner(System.in);
		System.out.println(mycontacts.get(id-1).getFirstName() + " "+ mycontacts.get(id-1).getLastName() + " Is SELECTED");
		in.nextLine();
		runApp();

	}

	

}