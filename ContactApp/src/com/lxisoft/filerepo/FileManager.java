package com.lxisoft.filerepo;
import com.lxisoft.controller.*;
import com.lxisoft.model.*;
import java.util.*;
import java.io.*;
public class FileManager
{
	public void storeToFile(ArrayList<ContactModel> myContacts)
	{
		//File file = loadFile();
		try
		{
			FileWriter f = new FileWriter("E:\\prgmfiles\\CoreJavaAdvanced\\ContactApp\\src\\com\\lxisoft\\filerepo\\data.csv",false);
			BufferedWriter b = new BufferedWriter(f);
			b.flush();
			b.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		for(ContactModel c : myContacts)
		{
			String fn = c.getFirstName();
			String ln = c.getLastName();
			long phn = c.getPhoneNumber();
			try
			{
				FileWriter fw = new FileWriter("E:\\prgmfiles\\CoreJavaAdvanced\\ContactApp\\src\\com\\lxisoft\\filerepo\\data.csv",true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(fn);bw.write(',');bw.write(ln);bw.write(',');bw.write(String.valueOf(phn));bw.newLine();
				bw.flush();
				bw.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
				
		}


	}

	public ArrayList<ContactModel> readFromFile()
	{
		int i;
		String details;
		ArrayList<ContactModel> mycontacts = new ArrayList<ContactModel>();
		try
    	{
    		FileReader fr = new FileReader("E:\\prgmfiles\\CoreJavaAdvanced\\ContactApp\\src\\com\\lxisoft\\filerepo\\data.csv");
			BufferedReader br = new BufferedReader(fr);
			i=0;
			while(( details= br.readLine())!=null)
			{
				mycontacts.add(new ContactModel());
				String[] st =details.split(",");
				mycontacts.get(i).setFirstName(st[0]);
				mycontacts.get(i).setLastName(st[1]);
				mycontacts.get(i).setPhoneNumber(Long.parseLong(st[2]));
				i++;
				
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();			
		}
		return mycontacts;
	}

	
	
}