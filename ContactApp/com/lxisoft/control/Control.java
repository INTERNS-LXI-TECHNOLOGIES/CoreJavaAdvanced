package com.lxisoft.control;
import com.lxisoft.model.*;
import com.lxisoft.repository.*;
//import com.lxisoft.
import java.io.*;  
import java.util.*;  
public class Control
{ 
static Scanner input =new Scanner(System.in);	
ArrayList<Contact> contacts = new ArrayList<Contact>();	
FileReppo file =new FileReppo();
File data=new File("Contacts.csv");
public void createContact()
{
 for(int i=0;i<3;i++){
 contacts.add(new Contact());}
 setDetail();
 saveContact();
}

public void setDetail()
{
 contacts.get(0).setfirstname("ashik");
 contacts.get(0).setlastname("hussain");
 contacts.get(0).setnumber(1234);
 contacts.get(1).setfirstname("rahul");
 contacts.get(1).setlastname("mp");
 contacts.get(1).setnumber(5634);
 contacts.get(2).setfirstname("ajay");
 contacts.get(2).setlastname("kumar");
 contacts.get(2).setnumber(1984);
}

public void saveContact()
{
	file.creatFile(data);
	for (int i=0;i<contacts.size();i++)
	{
	 String fname=contacts.get(i).getfirstname();
 	 String lname=contacts.get(i).getlastname();
 	 int number=contacts.get(i).getnumber();
    file.writeTofile("Contacts.csv",fname);    
	file.writeTofile("Contacts.csv",lname);   	
	file.writeTofile("Contacts.csv",number);   	
	}
} 

public void displayContacts()
{
	for (int i=0;i<contacts.size();i++) 
	{
		System.out.println(i+1+" "+contacts.get(i).getfirstname()+" "+contacts.get(i).getlastname());	
	}

}
public void viewConatct()
{
	System.out.print("Select the Contact :");
	int choise=input.nextInt();
	System.out.println("Name\t:\t"+contacts.get(choise-1).getfirstname()+" "+contacts.get(choise-1).getlastname());
	System.out.println("Number\t:\t"+contacts.get(choise-1).getnumber());
}
}	