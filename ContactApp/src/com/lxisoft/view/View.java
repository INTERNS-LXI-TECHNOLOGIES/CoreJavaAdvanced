package com.lxisoft.view ;

import java.util.* ;
import com.lxisoft.model.ContactModel ;
import com.lxisoft.controller.Controller ;

public class View
{
	private static Scanner input = new Scanner(System.in) ;


	public static int showMainMenu()
	{
		ConsoleElements.clearScreen() ;

		System.out.print("\n\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n\t\t     CONTACT APP\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n") ;
		System.out.print("\n\t    [1] SHOW ALL CONTACTS\n\n\t    [2] ADD CONTACT\n\n\t    [3] EDIT CONTACT\n\n\t    [4] DELETE CONTACT\n\n\t    [5] EXIT\n\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+   \n\t  : ") ;

		int menuChoice = input.nextInt() ;
		input.nextLine() ;

		return menuChoice ;
	}

	public static void displayAllContacts(ArrayList<ContactModel> contactList)
	{
		ConsoleElements.clearScreen() ;

		System.out.print("\n\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n\t\t   ALL CONTACTS\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n") ;
		System.out.print("\n\t   NAME \t\t PH.NO\n\t   ~~~~ \t\t ~~~~~\n");

			for(ContactModel contactModel : contactList)
			{
				System.out.format("\n\t  %-20s%d%n",contactModel.getName(),contactModel.getPhoneNumber()) ;
			}

		System.out.print("\n\n\t Number of Contacts : " + contactList.get(0).getNumberOfContacts());	

		System.out.print("\n\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n") ;
	}

	public static ContactModel showAddNewContactMenu(ContactModel contactModel)
	{
		ConsoleElements.clearScreen() ;

		System.out.print("\n\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n\t\t    NEW CONTACT\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n") ;

		System.out.print("\n\t     NAME : ");
		contactModel = Controller.getNewContactName(contactModel) ;

		System.out.print("\n\t     PH.NO : ");
		contactModel = Controller.getNewContactPhoneNumber(contactModel) ;
		
		System.out.print("\n\n\t CONTACT SUCCESSFULLY ADDED.") ;

		return contactModel ;
	}

	public static int showEditContactInfoMenu() 
	{	
		ConsoleElements.clearScreen() ;

		System.out.print("\n\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n\t\t     EDIT CONTACT\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n") ;
		System.out.print("\n\t    [1] EDIT NAME\n\n\t    [2] EDIT PHONE NUMBER\n\n\t    [3] GO BACK\n\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+   \n\t  : ") ;

		int menuChoice = input.nextInt() ;
		input.nextLine() ;

		return menuChoice ;
	}

	public static String showSearchNameEditPrompt()
	{
		ConsoleElements.clearScreen() ;

		System.out.print("\n\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n\t\t     EDIT CONTACT\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n") ;
		System.out.print("\n\t     NAME TO BE EDITED : ");

		String name = input.nextLine() ;

		return name ;
	}

	public static String showNewNamePrompt()
	{
		System.out.print("\n\t     NEW NAME : ");

		String name = input.nextLine() ;

		return name ;
	}

	public static void showNameEditSuccessMessage(String oldName,String newName)
	{
		System.out.print("\n\n\t NAME SUCCESSFULLY CHANGED FROM '" + oldName + "' TO '" + newName + "' \n") ;
	}

	public static void printNameNotFoundMessage(String name)
	{
		System.out.print("\n\n\t '" + name + "' NOT FOUND IN CONTACT DATABASE.\n") ;
	}

	public static long showSearchPhoneNumberPrompt()
	{
		ConsoleElements.clearScreen() ;

		System.out.print("\n\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n\t\t     EDIT CONTACT\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n") ;
		System.out.print("\n\t     PHONE NUMBER TO BE EDITED : ");

		long phoneNumber = input.nextLong() ;

		return phoneNumber ;
	}

	public static long showNewPhoneNumberPrompt()
	{
		System.out.print("\n\t     NEW PHONE NUMBER : ");

		long phoneNumber = input.nextLong() ;

		return phoneNumber ;
	}

	public static void showPhoneNumberEditSuccessMessage(long oldPhoneNumber,long newPhoneNumber)
	{
		System.out.print("\n\n\t PHONE NUMBER SUCCESSFULLY CHANGED FROM '" + oldPhoneNumber + "' TO '" + newPhoneNumber + "' \n") ;
	}

	public static void printPhoneNumberNotFoundMessage(long phoneNumber)
	{
		System.out.print("\n\n\t '" + phoneNumber + "' NOT FOUND IN CONTACT DATABASE.\n") ;
	}

	public static String showSearchNameDeletePrompt()
	{
		ConsoleElements.clearScreen() ;

		System.out.print("\n\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n\t\t    DELETE CONTACT\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n") ;
		System.out.print("\n\t     NAME TO BE DELETED : ");

		String name = input.nextLine() ;

		return name ;
	}

	public static void showContactDeleteSuccessMessage()
	{
		System.out.print("\n\n\t CONTACT SUCCESSFULLY DELETED.") ;
	}

	public static void printThankYouMessage()
	{
		System.out.print("\n\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n\t\t     THANK YOU!\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n\n");
	}

	public static char printGoBackToMainPrompt()
	{
		System.out.print("\n\n\t GO BACK TO MAIN MENU? (Y/N) : ");

		char again = input.next().charAt(0) ;

		return again ;
	}

}