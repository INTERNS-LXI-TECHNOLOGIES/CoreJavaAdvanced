package com.Lxisoft.View;
import com.Lxisoft.Model.*;
import com.Lxisoft.Repositry.*;
import java.util.*;
import java.sql.*;

public class ContactAppView
{
	
	Contact contact = new Contact();
	public void intro()
	{
    	System.out.println("\n\t\t-------------------------------------------\t");
   		System.out.println("\t\t-------------------------------------------\t");
   		System.out.println("\t\t----------------   Contact   --------------\t");
   		System.out.println("\t\t-------------   collection    -------------\t");
   		System.out.println("\t\t--------------      APP      --------------\t");
   		System.out.println("\t\t-------------------------------------------\t");
   		System.out.println("\t\t-------------------------------------------\t");
   		System.out.println("\t\t------- Scripted by -----------------------\t");
   		System.out.println("\t\t---------------- Faris --------------------\t");
   		System.out.println("\t\t-------------------------------------------\t");
   	  	System.out.println(" ");
    }
    public void mainMenuIntro()
    {
      System.out.println("\n________________________");
      System.out.println("\n\n1. Add Contacts  \n\n2. Update Contacts \n\n3. Delete Contacts \n\n4. PrintDatabase \n\n Press 0 for Exit \n");

    }
    public void addContacts()
    {
    	Scanner addInput = new Scanner(System.in);
    	//System.out.println("Enter Number of contacts to be Added");
    	//int input=addInput.nextInt();
    		//for(int i=0; i<input; i++)
    	//{
    		//addContact.add(new Contact());
    		//Scanner add_contact = new Scanner(System.in);
    		System.out.println("Enter First Name ");
    		String fname=addInput.nextLine();
    		//addContact.get(0).setFirstName(fname);
    		
    		System.out.println("Enter Last Name");
    		String lName=addInput.nextLine();
    		//addContact.get(0).setLastName(lName);
    		
    		System.out.println("Enter Email");
    		String email = 	addInput.nextLine();
    		//addContact.get(0).setEmail(email);

    		System.out.println("Enter Contact Number");
    		String phNo=addInput.nextLine();
    		//addContact.get(0).setContactNumber(phNo);

    		//}
    	
    }
    


	/*public void updateContact(ArrayList<Contact> addContact)
	{
		Scanner update = new Scanner(System.in);
		int i=0;
		System.out.println("Enter First Name to be updated");
    	String fname=update.nextLine();
    	addContact.get(i).setFirstName(fname);
    		
    	System.out.println("Enter Last Name");
    	String lName=update.nextLine();
    	addContact.get(i).setLastName(lName);
    		
    	System.out.println("Enter Email");
    	String email = update.nextLine();
    	addContact.get(i).setEmail(email);

    	System.out.println("Enter Contact Number");
    	String phNo=update.nextLine();
    	addContact.get(i).setContactNumber(phNo);		 

	}*/
}