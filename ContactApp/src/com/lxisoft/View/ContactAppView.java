package com.lxisoft.View;
import com.lxisoft.Control.*;
import com.lxisoft.repository.*;
import com.lxisoft.Model.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class ContactAppView
{
	Controler control = new Controler();

	public void contactDetails()
	{
	  System.out.print("----------------------------------------------------------------------------------------------------------------------------------");
      System.out.print("\n");
      System.out.print("-                                                       CONTACT APP                                                              -");
      System.out.print("\n");
      System.out.print("----------------------------------------------------------------------------------------------------------------------------------");
      System.out.print("\n");
      System.out.print("\n");
      System.out.print("\n");
      System.out.print("\n");
      System.out.print("\n");
      System.out.print("\n");
      System.out.print("\n");
      System.out.print("\n");
    }
    public void menuList()
    {
      Scanner scanner = new Scanner(System.in);
      System.out.print("---------------------------------------------------------------------------------------------");
      System.out.print("\n");
      System.out.print("-                                       SETTINGS                                            -");
      System.out.print("\n");
      System.out.print("---------------------------------------------------------------------------------------------");
      System.out.print("\n");
      System.out.print("\n");
      System.out.print("\n");
      System.out.print(" 1. VIEW CONTACT \n 2. ADD CONTACT  \n 3. DELETE CONTACT \n 4. UPDATE CONTACT \n 5. SEARCH \n 6. SQLDATA ");
      System.out.print("\n"); 
      int choice = scanner.nextInt();
      if(choice==1)
      {
      	control.contactinformation();
      	control.add();
      	this.menuList();
      }
    	else if(choice==2)
    	{
    		System.out.print(" HOW MANY CONTACT YOU WANT ADD: ");
		    int index = scanner.nextInt();
            control.addContactView(index);
    		this.menuList();
    	}
    	else if(choice==3)
    	{
    		System.out.print(" WHICH NUMBER YOU WANT TO DELETE : ");
            int j = scanner.nextInt();
            control.deleteContactView(j);
    		this.menuList();
    	}
    	else if(choice==4)
    	{
    		System.out.println("           UPDATE OPTION           ");
		    System.out.println(" --------------------------------- ");
   		    System.out.println("ENTER THE FIRST NAME OF THE PERSON WHO YOU WANT UPDATE :");
            String fname = scanner.next();
    	   control.updateContactView(fname);
           this.menuList();
    	}
    	else if(choice==5)
    	{
    		
            System.out.println("           SEARCH CONTACT           ");
		    System.out.println(" --------------------------------- ");
   		    System.out.println("ENTER THE PERSONS FIRST NAME THAT YOU WANT TO SEARCH :");
            String name = scanner.next();
            control.searchContactView(name);

    		this.menuList();
    	}
    	else if(choice==6)
    	{
    		this.sqlData();
    		this.menuList();
    	}
    	else
    	{
    		System.out.print("\n"); 
    		System.out.print(" invalid choice ");
            System.out.print("\n"); 
    	}
    }
     public void sqlData()
    {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("\n 1. DELETE  \n 2. VIEW \n 3. SEARCH ");
        	System.out.print("\n");
		    System.out.print("\n");
		    System.out.print("\n");
		    System.out.print("ENTER THE NUMBER : ");
		    int choice = scanner.nextInt();
		    System.out.print("\n");
		    System.out.print("\n");
		    System.out.print("\n");
		    System.out.print("\n");
		    if(choice==1)
		    {
		    	System.out.println("Enter The CONTACT ID To Delete\t: ");
		        int deleteId = scanner.nextInt();
		        control.delete(deleteId); 
		        this.sqlData();
		    }
		    else if(choice==2)
		    {
		    	control.view();
		    	this.sqlData();
		    }
		    else if(choice==3)
		    {
		    	 System.out.print("Enter The Name Of The Person To Search : ");
                 String name = scanner.next();
		    	 control.search(name);
		    	 this.sqlData();
		    }
		    else 
			{
				System.out.print("invalid choice ");
				System.out.print("\n");
			}
    }
  
   public void contactinfo(ArrayList<Contact> contact)
   {
   	   for(int i=0;i<contact.size();i++)
		{
			System.out.print("\n");
			System.out.print((i+1)+" FIRST NAME : "+contact.get(i).getFirstName()+"\n"+" "+" LAST NAME : "+contact.get(i).getLastName()+"\n"+" "+" EMAIL ID : "+contact.get(i).getMailId()+"\n"+" "+" CONTACT NUMBER  : "+contact.get(i).getNumber()+"\n");
			System.out.print("\n");
		}

   }

	public void deleteContact(ArrayList<Contact> contact)
	{   
      System.out.print("\n            EDITED CONTACT DETAILS           ");
		System.out.print("\n");
		for(int i=0;i<contact.size();i++)
		{
			if(contact.get(i) instanceof Contact)
			{
				System.out.print((i+1)+" FIRST NAME : "+contact.get(i).getFirstName()+"\n"+" "+" LAST NAME : "+contact.get(i).getLastName()+"\n"+" "+" EMAIL ID : "+contact.get(i).getMailId()+"\n"+" "+" CONTACT NUMBER  : "+contact.get(i).getNumber()+"\n");
			    System.out.print("\n");
			}
		}
	}
	   public void addContact(ArrayList<Contact> contact)
	{ 	 
		    System.out.print("\n");
		    System.out.print("\n            EDITED CONTACT DETAILS           ");
		    System.out.print("\n");
		for(int i=0;i<contact.size();i++)
		{
			if(contact.get(i) instanceof Contact)
			{
				System.out.print((i+1)+" FIRST NAME : "+contact.get(i).getFirstName()+"\n"+" "+" LAST NAME : "+contact.get(i).getLastName()+"\n"+" "+" EMAIL ID : "+contact.get(i).getMailId()+"\n"+" "+" CONTACT NUMBER  : "+contact.get(i).getNumber()+"\n");
			    System.out.print("\n");
			}
		}
	}

     public void searchContact(ArrayList<Contact> contact,int i)
	{
                System.out.print((i+1)+" FIRST NAME : "+contact.get(i).getFirstName()+"\n"+" "+" LAST NAME : "+contact.get(i).getLastName()+"\n"+" "+" EMAIL ID : "+contact.get(i).getMailId()+"\n"+" "+" CONTACT NUMBER  : "+contact.get(i).getNumber()+"\n");
			    System.out.print("\n");
	}
	 public void updateContact(ArrayList<Contact> contact)
	{
        	 for(int j=0;j<contact.size();j++)
	             {
	    	        System.out.print((j+1)+" FIRST NAME : "+contact.get(j).getFirstName()+"\n"+" "+" LAST NAME : "+contact.get(j).getLastName()+"\n"+" "+" EMAIL ID : "+contact.get(j).getMailId()+"\n"+" "+" CONTACT NUMBER  : "+contact.get(j).getNumber()+"\n");
			        System.out.print("\n");
                    System.out.println(" -----------------------##############----------------------- ");
                    System.out.print("\n"); 
	             }
	}

}