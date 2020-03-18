package com.lxisoft.src;
public class ContactController
{
	Scanner sc = new Scanner(System.in);
	ContactModel model = new ContactModel();
	ContactView view = new ContactView();
	public void contactApp()
	{
		view.contactAppMenu();
	}
}