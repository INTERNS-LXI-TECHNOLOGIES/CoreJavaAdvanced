package com.lxisoft.controller;
import com.lxisoft.view.*;
import com.lxisoft.model.*;
public class Controller
{
	private View view = new View();
	private ContactModel contact = new ContactModel();
	public void runApp()
	{
		view.printmsg();
	}

}