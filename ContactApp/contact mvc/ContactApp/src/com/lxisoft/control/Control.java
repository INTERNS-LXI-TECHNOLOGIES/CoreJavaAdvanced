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
					Collections.sort(contactList, new Sortbyname());
					view.viewContact(contactList);
					break;
			case 3: contactList.clear();
					String searchname = view.searchContact();
					contactList = db.searchDatabase(contactList,searchname);
					view.viewContact(contactList);
				    break;
			case 4: contactList.clear();
					contactList = db.viewDatabase(contactList);
					Collections.sort(contactList, new Sortbyname());
					view.viewContact(contactList);
			 		edit();
			  break;
			default:System.out.println("Enter Valid Option");break;
			}
			System.out.println("Do You Eant To Continue?\nYES(Press 1)\nNO(Press 0)");
			start = sc.nextInt();
		}while(start == 1);
	}
	

	public void edit()
		{
			int editId = view.editContact();
					switch(editId)
					{
						case 1:
								int updateId = view.updateContact();
								db.deletRecord(updateId);
								model = view.addContact(model);
								db.addToDatabase(model);

						break;
						case 2:	
							int deleteid =view.deleteContact()
							db.deletRecord(deleteid);
							System.out.println("Record Sucessfully Deleted");											
						break;
						case 3:start();break;
						default:System.out.println("Enter Valid Option");break;
					}

		}
}