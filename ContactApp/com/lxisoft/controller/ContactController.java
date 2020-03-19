package com.lxisoft.controller;
import com.lxisoft.model.*;
import com.lxisoft.view.*;
import com.lxisoft.repository.*;
import java.util.*;
public class ContactController
{
	private ContactModel model = new ContactModel();
	private ContactView view = new ContactView();
	private ContactAppDatabase db = new ContactAppDatabase();
	ArrayList<ContactModel> contactList = new ArrayList<ContactModel>();
	ArrayList<Integer> idList = new ArrayList<Integer>();
	public void start()
	{
		model = view.contactAppMenu(model);
		contactList.add(model);
		addingContact();
	}
	public void addingContact()
	{

		int noOfRecord = db.addToDatabase(model);
		int id = db.getIdFromDatabase();
		System.out.println(id +","+noOfRecord +"Record Added.....");
	}
}