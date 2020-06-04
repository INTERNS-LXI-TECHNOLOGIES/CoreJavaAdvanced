package com.lxisoft.controller ;

import java.util.* ;
import com.lxisoft.model.ContactModel ;
import com.lxisoft.fileoperations.ContactManager ; 
import com.lxisoft.view.* ;

public class Controller
{

	private ArrayList<ContactModel> contactList = ContactManager.readDataFromFile() ;

	private static Scanner input = new Scanner(System.in) ;

	public void startApp()
	{
		char again ;

		do
		{
			int menuChoice = View.showMainMenu() ;

			chooseMenuOption(menuChoice) ;

			again = View.printGoBackToMainPrompt() ;

		} while(again == 'y' || again == 'Y') ;
	}

	private void chooseMenuOption(int menuChoice)
	{
		switch(menuChoice)
		{
			case 1 :	showAllContacts() ; 
						break ;

			case 2 :	addNewContact() ;
						break ;

			case 3 :	editContactInfo() ;
						break ;

			case 4 :	deleteContact() ;
						break ;

			case 5 :	View.printThankYouMessage() ;
						System.exit(0) ;

			default :	System.out.print("\n\n\t Invalid Choice!\n") ;
		}
	}

// ----------------------------------- SHOW ALL CONTACTS ------------------------------------------//

	private void showAllContacts()
	{
		contactList = ContactManager.readDataFromFile() ;

		View.displayAllContacts(contactList) ;
	}

// ---------------------------------- ADD NEW CONTACT ---------------------------------------------//

	private void addNewContact()
	{
		contactList.add(View.showAddNewContactMenu(new ContactModel())) ;
		ContactManager.writeDataToFile(contactList) ;
	}

	public static ContactModel getNewContactName(ContactModel contactModel)
	{
		String name = input.nextLine() ;

		contactModel.setName(name) ;

		return contactModel ;
	}

	public static ContactModel getNewContactPhoneNumber(ContactModel contactModel)
	{
		long phoneNumber = input.nextLong() ;
		input.nextLine() ;

		contactModel.setPhoneNumber(phoneNumber) ;

		return contactModel ;
	}


//-------------------------------- EDIT CONTACT ---------------------------------------------//

	private void editContactInfo()
	{
		int menuChoice = View.showEditContactInfoMenu() ;

			switch(menuChoice)
			{
				case 1 :	editContactName() ;
							break ;

				case 2 :	editContactPhoneNumber() ;
							break ;

				default :	System.out.print("\n\n\t Invalid Choice!\n") ;
			}

		ContactManager.writeDataToFile(contactList) ;
	}

	private void editContactName()
	{
		String name = View.showSearchNameEditPrompt() ;

			for(ContactModel contactModel : contactList)
			{
				if(name.equals(contactModel.getName()))
				{
					String newName = View.showNewNamePrompt() ;
					contactModel.setName(newName) ;

					View.showNameEditSuccessMessage(name,contactModel.getName()) ;
					
					return ;
				}
			}

		View.printNameNotFoundMessage(name) ;
	}

	private void editContactPhoneNumber()
	{
		long phoneNumber = View.showSearchPhoneNumberPrompt() ;

			for(ContactModel contactModel : contactList)
			{
				if(phoneNumber == contactModel.getPhoneNumber())
				{
					long newPhoneNumber = View.showNewPhoneNumberPrompt() ;
					contactModel.setPhoneNumber(newPhoneNumber) ;

					View.showPhoneNumberEditSuccessMessage(phoneNumber,contactModel.getPhoneNumber()) ;
				
					return ;
				}
			}

		View.printPhoneNumberNotFoundMessage(phoneNumber) ;
	}

//--------------------------------------------- DELETE CONTACT ------------------------------------------//

	private void deleteContact()
	{
		String name = View.showSearchNameDeletePrompt() ;
		Iterator<ContactModel> iterator = contactList.iterator() ;

			while(iterator.hasNext())
			{
				ContactModel contactModel = iterator.next() ;

				if(name.equals(contactModel.getName()))
				{
					iterator.remove() ;
					View.showContactDeleteSuccessMessage() ;
					ContactManager.writeDataToFile(contactList) ;
					return ;
				}
			}

		View.printNameNotFoundMessage(name) ;
	}
	



}