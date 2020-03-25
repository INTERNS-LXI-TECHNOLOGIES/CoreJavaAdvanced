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
	ArrayList<Integer> keyId = new ArrayList<Integer>();
	int choice;
	int start;
	public void start()
	{
		do{
			viewAllContacts();
			choice= view.contactAppMenu(model);
			switch(choice)
			{
				case 1:	newContact();break;
				case 2:	selectContact();break;
				case 3: searchContactt();break;
				default:System.out.println("Enter Valid Option");
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
			view.updateMessage();
			db.addToDatabase(model);
		}
	}
	public void selectContact()
	{
		contactList.clear();
		int id = view.contactSelect();
		keyId = db.selectIdFromDb(keyId);
		boolean b = keyId.contains(id);
		if(b == true)
		{
			contactList = db.viewDatabaseById(contactList,id);
			view.viewContact(contactList);	
			int choice  = view.selectMenu();
			switch(choice)
			{
				case 1:updateContactt(id);break;
				case 2:deleteContactt(id);break;
				case 3:start();break;
				default:System.out.println("Enter Valid Option");
			}
		}
		else
		{
			view.noContactIdPopup();
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
	public void deleteContactt(int id)
	{
		int ch = view.deletePopup();
		if(ch==1)
		{
			db.deleteRecordById(id);
			view.deleteContactPopup();	
		}
	}	
	public void updateContactt(int updateId)
	{
		model = view.updateConsole(model);
		db.updateRecordById(model,updateId);
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