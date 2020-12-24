package com.lxisoft.Control;
import com.lxisoft.repository.*;
import com.lxisoft.View.*;
import com.lxisoft.Model.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Controler
{
	ArrayList<Contact> contact = new ArrayList<Contact>();
	ContactRepository contactrepo = new ContactRepository();
	  public void contactinformation()
    {
    	ContactAppView view = new ContactAppView();
        view.contactinfo(contact);
    }
    public void delete(int deleteId)
     {
      contactrepo.deleteRecord(deleteId);  
     }
     public void search(String name)
     {
      contactrepo.searchDatabase(name);
     }
     public void add()
     {
      for(int i =0;i<contact.size();i++)
      {
         contactrepo.addToDatabase(contact.get(i)); 
      }  
     }
     public void view()
     {
      contactrepo.viewDatabase(contact);
     }
     public void updateContactView(String fname)
     {
     	ContactAppView view = new ContactAppView();
     	Scanner scanner = new Scanner(System.in);
     	for(int i=0;i<contact.size();i++)
        {
        	if(fname.equals(contact.get(i).getFirstName()))
        	{
        		System.out.print("\n");
        		System.out.println("           UPDATE OPTION          ");
        		System.out.println(" --------------------------------- ");
        			System.out.println(" ENTER THE FIRST NAME :");
        			String firstname = scanner.next();
        			contact.get(i).setFirstName(firstname);
        			System.out.println(" ENTER THE LAST NAME :");
        			String lastname = scanner.next();
        			contact.get(i).setLastName(lastname);
        			System.out.println(" ENTER THE EMAIL ID :");
        			String id = scanner.next();
        			contact.get(i).setMailId(id);
        			System.out.println(" ENTER THE CONTACT NUMBER :");
        			int number = scanner.nextInt();
        			contact.get(i).setNumber(number);
        	}
        }
     view.updateContact(contact);
    }
    public void searchContactView(String name)
    {
    	ContactAppView view = new ContactAppView();
      for(int i=0;i<contact.size();i++)
        {
        	if(name.equals(contact.get(i).getFirstName()))
        	{
               view.searchContact(contact,i);
        	}
        }
    }
    public void addContactView(int index)
    {
    	ContactAppView view = new ContactAppView();
    	Scanner sca = new Scanner(System.in);
    	 index = index + contact.size();
    	for(int i=contact.size();i<index;i++)
		 {
			contact.add(new Contact());
			System.out.print("\n Enter the FIRST NAME :");
			contact.get(i).setFirstName(sca.next());
			System.out.print("\n Enter the LAST NAME :  ");
			contact.get(i).setLastName(sca.next());
            System.out.print("\n Enter the EMAIL Id  :  ");
			contact.get(i).setMailId(sca.next());
			System.out.print("\n Enter the PHONE NUMBER :  ");
			contact.get(i).setNumber(sca.nextInt(10));
			System.out.print("\n"); 
		 }
		 view.addContact(contact);
    }
    public void deleteContactView(int j)
    {
    	ContactAppView view = new ContactAppView();
    		contact.remove(j-1);

    	view.deleteContact(contact);
    }
}