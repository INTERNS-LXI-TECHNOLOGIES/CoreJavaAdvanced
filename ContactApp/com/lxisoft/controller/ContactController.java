package com.lxisoft.controller;
import com.lxisoft.model.*;
import com.lxisoft.view.*;
import com.lxisoft.repository.*;
public class ContactController
{
	private ContactModel model = new ContactModel();
	private ContactView view = new ContactView();
	private ContactAppDatabase db = new ContactAppDatabase();
	public void start()
	{
		model = view.contactAppMenu(model);
		db.addToDatabase(model);	
	}
}