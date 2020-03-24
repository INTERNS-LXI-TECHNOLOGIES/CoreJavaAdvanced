package com.lxisoft.controller;
import com.lxisoft.model.*;
import com.lxisoft.view.*;
import com.lxisoft.repository.*;
import java.util.*;
public class ContactController
{
	Scanner sc = new Scanner(System.in);
	private ContactModel model = new ContactModel();
	private ContactView view = new ContactView();
	private ContactAppDatabase db = new ContactAppDatabase();
	ArrayList<ContactModel> contactList = new ArrayList<ContactModel>();
	ArrayList<String> idList = new ArrayList<String>();
	int choice;
	int start;
	public void start()
	{
		do{
			choice= view.contactAppMenu(model);
			switch(choice)
			{
			case 1:	newContact();break;
			case 2:	viewAllContacts();break;
			case 3: searchContactt();break;
			case 4: int editId = view.editContact();
					switch(editId)
					{
						case 1:updateContactt();break;
						case 2:deleteContactt();break;
						case 3:start();break;
						default:System.out.println("Enter Valid Option");break;
					}
					break;
			default:System.out.println("Enter Valid Option");break;
			}
			System.out.println("Do You Want To Continue?\nYES(Press 1)\nNO(Press 0)");
			start = sc.nextInt();
		}while(start == 1);
	}	
	public void newContact()
	{
		model = view.addContact(model);
		contactList = db.viewDatabase(contactList);
		if(contactList.size()==0)
		{
			db.addToDatabase(model);	
		}
		else 
		{
			model = controllDuplicateRecord(contactList,model);	
			db.addToDatabase(model);
		}
		
	}
	public void viewAllContacts()
	{
		contactList.clear();
		contactList = db.viewDatabase(contactList);
		if(contactList.size() == 0)
		{
			view.noContactPopup();
		}
		else
		{
			view.viewContact(contactList);	
		}
	}
	public void searchContactt()
	{
		contactList.clear();idList.clear();
		contactList = db.viewDatabase(contactList);
		if(contactList.size()==0)
		{
			view.noContactPopup();
		}
		else 
		{
			String searchId = view.searchContact();
			idList = db.searchByName(idList,searchId);
			System.out.println(idList);
			boolean b = idList.contains(searchId);
			contactList.clear();
			if(b == true)
			{
				contactList = db.searchDatabaseByName(contactList,searchId);
			 	view.viewContact(contactList);
			}
			else
			{
				System.out.println("No Record Found For this Name");
			}
		}
	}
	public void deleteContactt()
	{
		contactList.clear();idList.clear();
		contactList = db.viewDatabase(contactList);
		if(contactList.size() ==0)
		{
			view.noContactPopup();	
		}
		else
		{
			delete();
		}
	}
	public void delete()
	{
		idList.clear();
		String deleteId  = view.deleteContact();
		idList = db.searchByName(idList,deleteId);
		boolean b = idList.contains(deleteId);
		if(b == true){
		contactList.clear();
		contactList = db.searchDatabaseByName(contactList,deleteId);
		view.viewContact(contactList);
		view.deletePopup();
		String name = sc.next();
		db.deleteRecordByName(name);
		contactList.clear();
		contactList = db.viewDatabase(contactList);
		view.viewContact(contactList);
		}
	}	

	public void updateContactt()
	{
		contactList.clear();idList.clear();
		contactList = db.viewDatabase(contactList);
		if(contactList.size() ==0)
		{
			view.noContactPopup();	
		}
		else
		{
			update();
		}
	}
	public void update()
	{
		contactList.clear();idList.clear();
		String updateId  = view. updateContact();
		idList = db.searchByName(idList,updateId);
		boolean b = idList.contains(updateId);
		if(b == true){
		contactList = db.searchDatabaseByName(contactList,updateId);
		view.viewContact(contactList);
		view.updatePopup();
		String name = sc.next();
		model = view.updateConsole(model);
		db.updateRecordByName(model);
		contactList.clear();
		contactList = db.viewDatabase(contactList);
		view.viewContact(contactList);
		}
	}
	// public void updateCondition(String updateId)
	// {
	// 	boolean b = idList.contains(updateId);
	// 	if(b == true)
	// 	{
	// 		contactList = db.searchDatabaseByName(contactList,updateId);
	// 		view.viewContact(contactList);
	// 		model = view.updateConsole(model);
	// 		db.updateRecordByName(model);
	// 		view.updateMessage();
	// 		viewAllContacts();
	// 	}
	// 	else
	// 	{
	// 		view.updateMsg();
	// 	}
	// }
	public ContactModel controllDuplicateRecord(ArrayList<ContactModel> contactList,ContactModel model)
	{
		for (int i=0;i<contactList.size();i++) 
		{
			if(contactList.get(i).getName().equals(model.getName())&&contactList.get(i).getPhoneNum().equals(model.getPhoneNum())&&contactList.get(i).getEmail().equals(model. getEmail())&&contactList.get(i).getAddress().equals(model.getAddress()))
			{
				view.duplicateRecordMsg();
				model = view.addContact(model);	
			}	
		}
		return model;
	}
}