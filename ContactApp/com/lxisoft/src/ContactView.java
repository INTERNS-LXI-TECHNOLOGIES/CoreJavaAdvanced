package com.lxisoft.src;
public class ContactView
{
	public void contactAppMenu()
	{
		try{
		System.out.println("*******ContactApp********");
		System.out.println("---------------------");
		System.out.println("1.View Contacts");
		System.out.println("2.Add Contacts");
		System.out.println("3.Search Contacts");
		System.out.println("4.Edit Contacts");
		System.out.println("Select An Option");
		int choice = sc.nextInt();
			if(choice>4)
			{
				throw MyException("Not Valid Option!!!");
			}
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
		selectMenu(choice);
	}
	public void selectMenu(int choice)
	{
		switch(choice)
		{
			case 1:viewContact();break;
			case 2:addContact();break;
			case 3:searchContact();break;
			case 4:editContact();break;
			default:System.out.println("Enter Valid Option");
		}
	}
}