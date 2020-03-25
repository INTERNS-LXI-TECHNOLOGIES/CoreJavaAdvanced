package com.lxisoft.controller;
import com.lxisoft.model.*;
import com.lxisoft.view.*;
import com.lxisoft.repository.*;
import java.util.*;
public class Control
{
	Scanner sc = new Scanner(System.in);
	private Contact details = new Contact();
	private ContactApp view = new ContactApp();
	private ContactDatabase db = new ContactDatabase();
	ArrayList<Contact> contactList = new ArrayList<Contact>();
	ArrayList<Integer> id = new ArrayList<Integer>();
	int choice;
	int start;
	public void start()
	{
		do{
			contactList.clear();
			contactList = db.viewDatabase(contactList);
			choice= view.contactMenu(contactList);
			switch(choice)
			{
			case 1:	details = view.addContact(details);
					db.addToDatabase(details);
			break;			
			case 2: contactList.clear();
					int searchId = view.searchContact();
					id = db.getIdFromDatabase(id);
					boolean b = search(id,searchId);
					if(b == true)
					{
					 contactList = db.searchDatabase(contactList,searchId);
					}
					else
					{	System.out.println("No Record Found For this ID");
			break;	}

					view.viewContact(contactList);
				    break;
			case 3: int editId = view.editContact();
					switch(editId)
					{
					case 1:int updateId = view.updateContact();
			 		break;

					case 2: contactList.clear();
						int deleteId = view.deleteContact();
						id = db.getIdFromDatabase(id);
						b = search(id,deleteId);
						if(b == true)
						 {	db.deletRecord(deleteId);
							view.viewContact(contactList);
						 }
						else
						 {	System.out.println("No Record Found For this ID");
					     break;	}
  					break;
					
					case 3:start();break;
					
						default:System.out.println("Enter Valid Option");break;
					}
			break;
			default:System.out.println("Enter Valid Option");break;
			}
			System.out.println("\nPress 1 to continue)\nPress 0 to Exit");
			start = sc.nextInt();
		}while(start == 1);
	}
	public boolean search(ArrayList<Integer> id,int searchId)
	{
		boolean b = false;
		for (int i=0;i<id.size();i++) 
		{
			if(id.get(i) == searchId)
			{
				b = true;	
			}
			else 
			{
				b = false;		
			}	
		}
		return b;
	}
		
}