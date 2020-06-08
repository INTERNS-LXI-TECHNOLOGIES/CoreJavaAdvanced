package com.lxisoft.controller ;

import java.util.* ;
import com.lxisoft.model.ContactModel ;
import com.lxisoft.fileoperations.ContactManager ; 
import com.lxisoft.view.* ;

public class Controller
{

	private View view = new View() ;
	private ContactManager contactManager = new ContactManager() ;
	private ArrayList<ContactModel> contactList = contactManager.readDataFromFile() ;

	private Scanner input = new Scanner(System.in) ;

	public void startApp()
	{
		char again ;

		do
		{
			char menuChoice = view.showMainMenu(contactList) ;

			chooseMenuOption(menuChoice) ;

			again = view.printGoBackToMainPrompt() ;

		} while(again == 'y' || again == 'Y') ;
	}

	private void chooseMenuOption(char menuChoice)
	{
		switch(menuChoice)
		{
			case 'S'  :
			case 's'  :	searchContacts() ; 
						return ;

			case 'A'  :
			case 'a'  :	addNewContact() ;
						return ;

			case 'E'  :
			case 'e'  :	view.printThankYouMessage() ;
						System.exit(0) ;
		}

		if(Character.isDigit(menuChoice))
		{
			selectContact(Character.getNumericValue(menuChoice)) ;
		}
		else
		{
			System.out.print("\n\n\t INVALID OPTION CHOSEN!") ;
		}
	}

// ----------------------------------- SEARCH CONTACT --------------------------------------------//

	private void searchContacts()
	{
		String partialName ;

		ArrayList<ContactModel> searchList = new ArrayList<ContactModel>() ;

		view.showSearchTermInputPrompt() ;
		partialName = input.nextLine() ;

		view.printTitleBar() ;
		view.showSearchTerm(partialName) ;

		int numberOfResults = 0 ;
			
			for(ContactModel c : contactList)
			{
				if(c.getFirstName().contains(partialName))
				{
					numberOfResults++;
					view.showSearchInfo(c) ;
				}
			}

		view.printResultInfo(numberOfResults) ;

		if(numberOfResults==0)
		{
			view.printNameNotFoundMessage(partialName) ;
		}
	}


// ----------------------------------- SELECT CONTACT --------------------------------------------//

	private void selectContact(int index)
	{
		view.showContactInfo(contactList.get(index-1)) ;
		char menuChoice = view.showContactOptions() ;

		switch(menuChoice)
		{
			case 'E'  :
			case 'e'  : editContactInfo(contactList.get(index-1)) ; 
						return ;

			case 'D'  :
			case 'd'  :	deleteContact(contactList.get(index-1)) ;
						return ;

			case 'B'  :
			case 'b'  :	return ;

			default   : System.out.print("\n\n\t INVALID CHOICE! ");
		}
	}

// ----------------------------------- SHOW ALL CONTACTS ------------------------------------------//

	private void showAllContacts()
	{
		contactList = contactManager.readDataFromFile() ;

		view.displayAllContacts(contactList) ;
	}

// ---------------------------------- ADD NEW CONTACT ---------------------------------------------//

	private void addNewContact()
	{
		contactList.add(view.showAddNewContactMenu(new ContactModel())) ;
		contactManager.writeDataToFile(contactList) ;
	}

//-------------------------------- EDIT CONTACT ---------------------------------------------//

	private void editContactInfo(ContactModel c)
	{
		view.showContactInfo(c) ;
		char menuChoice = view.showEditContactOptions() ;

			switch(menuChoice)
			{
				case '1'  :	editContactName(c) ;
							break ;

				case '2'  :	editContactPhoneNumber(c) ;
							break ;

				case '3'  :	return ;

				default :	System.out.print("\n\n\t Invalid Choice!\n") ;
			}

		contactManager.writeDataToFile(contactList) ;
	}

	private void editContactName(ContactModel c)
	{
		view.showContactInfo(c) ;

		String newFirstName = view.showNewFirstNamePrompt() ;
		c.setFirstName(newFirstName) ;
		String newLastName = view.showNewLastNamePrompt() ;
		c.setLastName(newLastName) ;

		view.showNameEditSuccessMessage() ;
	}

	private void editContactPhoneNumber(ContactModel c)
	{
		long newPhoneNumber = view.showNewPhoneNumberPrompt() ;
		c.setPhoneNumber(newPhoneNumber) ;

		view.showPhoneNumberEditSuccessMessage() ;
	}

//--------------------------------------------- DELETE CONTACT ------------------------------------------//

	private void deleteContact(ContactModel c)
	{
		char delete = view.showDeleteContactPrompt() ;
		
		if(delete=='Y' || delete=='y')
		{
			Iterator<ContactModel> iterator = contactList.iterator() ;

			while(iterator.hasNext())
			{
				ContactModel contactModel = iterator.next() ;

				if(contactModel==c)
				{
					iterator.remove() ;
					view.showContactDeleteSuccessMessage() ;
					contactManager.writeDataToFile(contactList) ;
				}
			}
		}
	}

//--------------------------------------------- SORT CONTACT ------------------------------------------//

	public static ArrayList<ContactModel> sortContactList(ArrayList<ContactModel> contactList)
	{
		Collections.sort(contactList, new Comparator<ContactModel>()
		{
			public int compare(ContactModel c1,ContactModel c2)
			{
				return c1.getFirstName().compareTo(c2.getFirstName()) ;
			}

		}) ;

		return contactList ;
	}	



}