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
	MysqlRepositry database = new MysqlRepositry();
	
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
				this.addContacts();
			}
			if(choice==2)
			{
				this.updateContacts();
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
	public void addContacts()
	{
		database.addContacts();
	}
	public void deleteContact()
	{
		database.deleteContact();
	}
	public void updateContacts()
	{
		database.updateContact();
	}
	public void printDatabase()
	{
		database.printDatabase();
	}
}