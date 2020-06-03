package com.lxisoft.control;
import com.lxisoft.model.*;
import com.lxisoft.view.*;
import com.lxisoft.repository.*;
import java.util.*;
public class Control
{
	Scanner sc = new Scanner(System.in);
	private Contact model = new Contact();
	private ContactList view = new ContactList();
	private ContactDatabase db = new ContactDatabase();
	ArrayList<Contact> contactList = new ArrayList<Contact>();
	ArrayList<Integer> idList = new ArrayList<Integer>();
	int choice;
	int start;
	public void start()
	{
		do{
			choice= view.contactAppMenu(model,db);
			switch(choice)
			{
			case 1:	model = view.addContact(model);
					db.addToDatabase(model);
					break;
			case 2:	contactList.clear();
					contactList = db.viewDatabase(contactList);
					view.viewContact(contactList);
					break;
			// case 3: contactList.clear();
			// 		int searchId = view.searchContact();
			// 		idList = db.getIdFromDatabase(idList);
			// 		boolean b = search(idList,searchId);
			// 		if(b == true)
			// 		{
			// 		 contactList = db.searchDatabase(contactList,searchId);
			// 		}
			// 		else
			// 		{
			// 			System.out.println("No Record Found For this ID");
			// 			break;
			// 		}
			// 		view.viewContact(contactList);
			// 	    break;
			// case 4: int editId = view.editContact();
			// 		switch(editId)
			// 		{
			// 			case 1: updateId = view.updateContact();

			// 			 		break;
			// 			case 2: contactList.clear();
			// 					int deleteId = view.deleteContact();
			// 					idList = db.getIdFromDatabase(idList);
			// 					b = search(idList,deleteId );
			// 					if(b == true)
			// 					{
			// 						db.deletRecord(deleteId);
			// 						view.viewContact(contactList);
			// 						System.out.println("Contact Deleted Secussfully");
			// 					}
			// 					else
			// 					{
			// 					System.out.println("No Record Found For this ID");
			// 					break;
			// 					}
			// 					break;
			// 			case 3:start();break;
			// 			default:System.out.println("Enter Valid Option");break;
			// 		}
			// 		break;
			default:System.out.println("Enter Valid Option");break;
			}
			System.out.println("Do You Eant To Continue?\nYES(Press 1)\nNO(Press 0)");
			start = sc.nextInt();
		}while(start == 1);
	}
	
}