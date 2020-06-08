package com.lxisoft.view ;

import java.util.* ;
import com.lxisoft.model.ContactModel ;
import com.lxisoft.controller.Controller ;

public class View
{
	private Scanner input = new Scanner(System.in) ;
	
//-------------------------------- MAIN MENU ---------------------------------------------//

	public void printTitleBar()
	{

		ConsoleElements.clearScreen() ;

		System.out.print("\n\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n\t\t     CONTACT APP\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n") ;
	}	

	public char showMainMenu(ArrayList<ContactModel> contactList)
	{
		printTitleBar() ;

		System.out.print("\n\t    [S] SEARCH CONTACTS\n\n\t    [A] ADD CONTACT") ;

		displayAllContacts(contactList) ;

		System.out.print("\n\t     [E] EXIT\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+   \n\t  : " );
	

		char menuChoice = input.next().charAt(0) ;
		input.nextLine() ;

		return menuChoice ;
	}

//------------------------------ CONTACTS & OPTIONS ----------------------------------------//

	public void displayAllContacts(ArrayList<ContactModel> contactList)
	{
		System.out.print("\n\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n\t\t    ALL CONTACTS\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n") ;

		contactList = Controller.sortContactList(contactList) ;

		int index = 0 ;
		for(ContactModel contactModel : contactList)
		{
			index++ ;
			System.out.format("\n\t\t [%d]\t%-20s",index,contactModel.getFirstName()) ;
		}

		System.out.print("\n\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+") ;
	}

	public void showContactInfo(ContactModel c)
	{
		printTitleBar() ;
		System.out.print("\n\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n\t\tFIRST NAME : " + c.getFirstName() + "\n\t\tLAST  NAME : " + c.getLastName() + "\n\t\tPHONE NUM : " + c.getPhoneNumber() + "\n\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
	}

	public char showContactOptions()
	{
		System.out.print("\n\n\t    [E] EDIT CONTACT\n\n\t    [D] DELETE CONTACT\n\n\t    [B] GO BACK\n\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n\n\t     :") ;
	
		char menuChoice = input.next().charAt(0) ;
		input.nextLine() ;

		return menuChoice ;
	}

//-------------------------------- EDIT CONTACTS ---------------------------------------------//
	

	public char showEditContactOptions() 
	{	
		System.out.print("\n\n\t    [1] EDIT NAME\n\n\t    [2] EDIT PHONE NUMBER\n\n\t    [3] GO BACK\n\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+   \n\t  : ") ;

		char menuChoice = input.next().charAt(0) ;
		input.nextLine() ;

		return menuChoice ;
	}	

	public String showNewFirstNamePrompt()
	{
		System.out.print("\n\n\t      FIRST NAME : ");

		String name = input.nextLine() ;

		return name ;
	}
	public String showNewLastNamePrompt()
	{
		System.out.print("\n\n\t      LAST NAME : ");

		String name = input.nextLine() ;

		return name ;
	}
	public void showNameEditSuccessMessage()
	{
		System.out.print("\n\n\t\t NAME SUCCESSFULLY CHANGED!") ;
	}

	public long showNewPhoneNumberPrompt()
	{
		System.out.print("\n\t     PHONE NUMBER : ");

		long phoneNumber = input.nextLong() ;

		return phoneNumber ;
	}
	public void showPhoneNumberEditSuccessMessage()
	{
		System.out.print("\n\n\t   PHONE NUMBER SUCCESSFULLY CHANGED!") ;
	}

//-------------------------------- DELETE CONTACT ---------------------------------------------//


	public char showDeleteContactPrompt()
	{
		System.out.print("\n\t     DELETE CONTACT? (Y/N) : ") ;
		char confirmation = input.next().charAt(0) ;
		return confirmation ;
	}

	public void showContactDeleteSuccessMessage()
	{
		System.out.print("\n\n\t CONTACT SUCCESSFULLY DELETED.") ;
	}

//-------------------------------- SEARCH CONTACTS ---------------------------------------------//

	public void showSearchTermInputPrompt()
	{
		ConsoleElements.clearScreen() ;

		System.out.print("\n\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n\t\t  SEARCH CONTACT\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n") ;

		System.out.print("\n\n\t SEARCH TERM : ");
	}

	public void showSearchTerm(String searchTerm)
	{
		System.out.print("\n\t\t SEARCH TERM : '" + searchTerm + "'");
	}

	public void showSearchInfo(ContactModel c)
	{
		System.out.print("\n\n\t\tFIRST NAME : " + c.getFirstName() + "\n\t\tLAST  NAME : " + c.getLastName() + "\n\t\tPHONE NUM : " + c.getPhoneNumber() + "\n\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
	}

	public void printResultInfo(int numberOfResults)
	{
		System.out.print("\n\t\t\t" + numberOfResults + " RESULTS.");
	}

	public void printNameNotFoundMessage(String name)
	{
		System.out.print("\n\n\t '" + name + "' NOT FOUND IN CONTACT DATABASE.\n") ;
	}
	
//-------------------------------- ADD CONTACT ---------------------------------------------//

	public ContactModel showAddNewContactMenu(ContactModel contactModel)
	{
		ConsoleElements.clearScreen() ;

		System.out.print("\n\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n\t\t    NEW CONTACT\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n") ;

		String firstName = showNewFirstNamePrompt() ;
		contactModel.setFirstName(firstName) ;
		String lastName = showNewLastNamePrompt() ;
		contactModel.setLastName(lastName) ;
		
		long phoneNumber = showNewPhoneNumberPrompt() ;
		contactModel.setPhoneNumber(phoneNumber) ;
		
		System.out.print("\n\n\t CONTACT SUCCESSFULLY ADDED.") ;

		return contactModel ;
	}

//-------------------------------- OTHERS  ---------------------------------------------//

	public void printThankYouMessage()
	{
		System.out.print("\n\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n\t\t     THANK YOU!\n\t+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n\n");
	}

	public char printGoBackToMainPrompt()
	{
		System.out.print("\n\n\t GO BACK TO MAIN MENU? (Y/N) : ");

		char again = input.next().charAt(0) ;

		return again ;
	}

}