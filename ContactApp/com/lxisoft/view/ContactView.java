package com.lxisoft.view;
import com.lxisoft.model.*;
import com.lxisoft.controller.*;
import com.lxisoft.repository.*;
import java.util.*;
import java.io.*;
public class ContactView
{
	Scanner sc = new Scanner(System.in);
	public int contactAppMenu(ContactModel model)
	{
		int choice = 0;
		try{
		System.out.println("*******ContactApp********");
		System.out.println("---------------------");
		System.out.println("1.Add Contacts");
		System.out.println("2.View Contacts");
		System.out.println("3.Search Contacts");
		System.out.println("4.Edit Contacts");
		System.out.println("Select An Option");
		choice = sc.nextInt();
			if(choice>4)
			{
				throw new  MyException("Not Valid Option!!!");
			}
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
		return choice;
	}
	public ContactModel addContact(ContactModel model)
	{
		System.out.println("*******ADD CONTACT******");
		System.out.println("---------------------");
		System.out.println("Enter Name::");
		String name = sc.nextLine();
		name = (name.equals(""))?sc.nextLine():name;
		model.setName(name);
		System.out.println("Enter Phone Number::");
		String phno = sc.nextLine();
		phno = (phno.equals(""))?sc.nextLine():phno;
		model.setPhoneNum(phno);
		System.out.println("Enter Email::");
		String email = sc.nextLine();
		email = (email.equals(""))?sc.nextLine():email;
		model.setEmail(email);
		System.out.println("Enter Address::");
		String adress = sc.nextLine();
		adress = (adress.equals(""))?sc.nextLine():adress;
		model.setAddress(adress);
		return model;
	}
	public void viewContact(ArrayList<ContactModel> contactList)
	{
		System.out.println("\t\t\t*******CONTACT APP*********");
		System.out.println("\t\t\t-----------------------------\n");
		System.out.println("\t+---------------+---------------------+----------------+---------------+----------------+");
		System.out.println("\t| ID            |	 NAME         |  PHONENO       | EMAIL         | ADDRESS        |");
		System.out.println("\t+---------------+---------------------+----------------+---------------+----------------+");
		for (int i=0;i<contactList.size();i++) 
		{
			System.out.println("\t\t"+contactList.get(i).getId()+"\t\t"+contactList.get(i).getName()+"\t\t"+contactList.get(i).getPhoneNum()+"\t\t"+contactList.get(i).getEmail()+"\t\t"+contactList.get(i).getAddress());		
		}
	}
	public String searchContact()
	{
		System.out.println("Enter The Name Of Contact To Search:: ");
		String searchId = sc.nextLine();
		searchId = sc.nextLine();
		return searchId;
	}
	public int editContact()
	{
		int choice = 0;
		try{
		System.out.println("*******EDIT MENU********");
		System.out.println("---------------------");
		System.out.println("1.Update Contact");
		System.out.println("2.Delete Contact");
		System.out.println("3.Back");
		System.out.println("Select An Option");
		choice = sc.nextInt();
			if(choice>3)
			{
				throw new  MyException("Not Valid Option!!!");
			}
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
		return choice;
	}
	public String updateContact()
	{
		System.out.println("Enter The Name of person whose Contact To Update:: ");
		String updateId = sc.nextLine();
		updateId = sc.nextLine();
		return updateId;
	}
	public ContactModel updateConsole(ContactModel model )
	{
		System.out.println("*******UPDATE CONTACT******");
		System.out.println("---------------------");
		System.out.println("Enter Name::");
		String name = sc.nextLine();
		name = (name.equals(""))?sc.nextLine():name;
		model.setName(name);
		System.out.println("Enter Phone Number::");
		String phno = sc.nextLine();
		phno = (phno.equals(""))?sc.nextLine():phno;
		model.setPhoneNum(phno);
		System.out.println("Enter Email::");
		String email = sc.nextLine();
		email = (email.equals(""))?sc.nextLine():email;
		model.setEmail(email);
		System.out.println("Enter Address::");
		String adress = sc.nextLine();
		adress = (adress.equals(""))?sc.nextLine():adress;
		model.setAddress(adress);
		return model;
	}
	public String deleteContact()
	{
		System.out.println("Enter The Name Of Contact To delete:: ");
		String deleteId = sc.nextLine();
		deleteId = sc.nextLine();
		return deleteId;
	}
	public void deleteMessage()
	{
		System.out.println("Record Deleted Successfully......");
	}
	public void updateMessage()
	{
		System.out.println("Record Updated Successfully......");	
	}
	public void duplicateRecordMsg()
	{
		System.out.println("The Given Record Is already In the Database,Please avoid Duplication .....");
	}
	public void deletePopup()
	{
		System.out.println("Enter The Id Of Contact To be Deleted ");	
	}
	public void updatePopup()
	{
		System.out.println("Enter The Id Of Contact To be Updated ");	
	}

}
