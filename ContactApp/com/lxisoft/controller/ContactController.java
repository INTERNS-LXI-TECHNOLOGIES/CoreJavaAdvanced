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
			System.out.println("Do You Eant To Continue?\nYES(Press 1)\nNO(Press 0)");
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
		view.viewContact(contactList);
	}
	public void searchContactt()
	{
		contactList.clear();
		String searchId = view.searchContact();
		idList = db.getIdFromDatabase(idList);
		boolean b = idList.contains(searchId);
		if(b == true)
		{
			 contactList = db.searchDatabaseByName(contactList,searchId);
			 view.viewContact(contactList);
		}
		else
		{
			System.out.println("No Record Found For this Phone Number");
		}
	}
	public void deleteContactt()
	{
		contactList.clear();
		idList.clear();
		String deleteId = view.deleteContact();
		idList = db.getIdFromDatabase(idList);
		System.out.println(idList);
		if(idList.size()>1)
		{
			contactList = db.searchDatabaseByName(contactList,deleteId);
			view.viewContact(contactList);
			view.deletePopup();
			int id = sc.nextInt();
			db.deleteRecordById(id);
			view.deleteMessage();
			contactList.clear();
			contactList = db.viewDatabase(contactList);
			view.viewContact(contactList);	 
		}
		else 
		{
			deleteCondition(deleteId);	
		}
	}
	public void deleteCondition(String deleteId)
	{
		boolean b = idList.contains(deleteId);
		if(b == true)
		{
			db.deleteRecord(deleteId);
			view.deleteMessage();
			contactList = db.viewDatabase(contactList);
			view.viewContact(contactList);
		}
		else
		{
			System.out.println("No Record Found For this Phone number");
		}
	}
	public void updateContactt()
	{
		contactList.clear();
		idList.clear();
		String	updateId = view.updateContact();
		idList = db.searchByName(idList);
		if(idList.size()>1)
		{
			contactList = db.searchDatabaseByName(contactList,updateId);
			view.viewContact(contactList);
			view.updatePopup();
			int id = sc.nextInt();
			model = view.updateConsole(model);
			db.updateRecordById(model,id);
			view.updateMessage();
			contactList.clear();
			contactList = db.viewDatabase(contactList);
			view.viewContact(contactList);	 
		}
		else 
		{
			updateCondition(updateId);	
		}
	}	
	public void updateCondition(String updateId)
	{
		boolean b = idList.contains(updateId);
		if(b == true)
		{
			contactList = db.searchDatabaseByName(contactList,updateId);
			view.viewContact(contactList);
			model = view.updateConsole(model);
			db.updateRecord(model);
			view.updateMessage();
			viewAllContacts();
		}
		else
		{
			System.out.println("No Record Found For this name number");
		}
	}

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