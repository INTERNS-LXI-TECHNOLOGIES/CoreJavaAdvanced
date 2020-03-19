package com.lxisoft.view;
import com.lxisoft.control.*;
import com.lxisoft.model.*;
import java.io.*;  
import java.util.*;  
public class ContactApp
{ 
Control control=new Control();
static Scanner input =new Scanner(System.in);
public void createApp()
{
	int value=0;
control.createContact();
System.out.println("\tContact App");
System.out.println("*********************");
control.displayContacts();
System.out.println("\n\nSelect Contact To View Details");
do{value=editContactList();}while(value!=0);

}

public int editContactList()
{
	System.out.println("1.View the Contact Details\n2.Add New Contact\n3.Edit Contact\n Press 0 to Exit");
	int choise=input.nextInt();
	switch(choise)
	{
		case 1:
		control.viewConatct();
		break;
		case 2:
		control.addContact();
		break;
		case 3:
		control.editContact();
		break;
		default:
		if(choise!=0)
			{	System.out.println("Please Select A Valid Choise.....!!!");}
		break;
	}
	return choise;
} 
}	