package com.Lxisoft.Control;
import com.Lxisoft.View.*;
import com.Lxisoft.Model.*;
import com.Lxisoft.Repositry.*;
import java.util.*;

public class ContactAppController
{
	ContactAppView contactView = new ContactAppView();
	Contact contact = new Contact();
	ArrayList<Contact> addContact= new ArrayList<Contact>();
	Database database = new Database();
	
	public void mainMenu()
	{
		Scanner mainMenuInput = new Scanner(System.in);
		int choice=0;
		contactView.intro();
		do
		{
			contactView.mainMenuIntro();
			choice= mainMenuInput.nextInt();
			if(choice==1)
			{
				this.addContacts(addContact);
			}
			if(choice==2)
			{
				this.updateContacts(addContact);
			}
			if(choice==3)
			{
				this.deleteContact();

			}
			if (choice==4)
			{
				this.printDatabase();
			}
			else if(choice==0)
			{
				System.out.println(" ");
			}
		}
		while(choice>0);
	}
	public void addContacts(ArrayList<Contact> addContact)
	{
		database.addContacts(addContact);
	}
	public void deleteContact()
	{
		database.deleteContact();
	}
	public void updateContacts(ArrayList<Contact> addContact)
	{
		database.updateContact(addContact);
	}
	public void printDatabase()
	{
		database.printDatabase();
	}
}