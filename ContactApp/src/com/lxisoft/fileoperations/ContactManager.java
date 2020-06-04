package com.lxisoft.fileoperations ;

import java.util.* ;
import java.io.* ;
import com.lxisoft.model.ContactModel ;

public class ContactManager
{
	public static String filePath = "C:\\Users\\mradw\\Documents\\Internship-Lxi\\Java\\Projects\\ContactApp\\src\\com\\lxisoft\\fileoperations\\ContactData.csv" ;	

	public static File fetchFile()
	{
		
		File file = new File(filePath) ;

		try
		{
			if(!file.exists())
			{
				file.createNewFile() ;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace() ;
		}

		return file ;
	}

	public static ArrayList<ContactModel> readDataFromFile()
	{

		File contactData = fetchFile() ;

		ContactModel contactModel ;
		ArrayList<ContactModel> contactList = new ArrayList<ContactModel>() ;

		boolean isTitleRow = true ;

		try
		{
			
			String rowDetails="" ;

			FileReader fr = new FileReader(contactData);
			BufferedReader br = new BufferedReader(fr);
			
			while((rowDetails = br.readLine())!=null)
			{
			   if(isTitleRow)
			   {
			   		rowDetails = br.readLine() ;
			   		isTitleRow = false ;
			   }

			    String[] rowDetailsSplit = rowDetails.split(",") ;
				contactModel = new ContactModel(rowDetailsSplit[0],(Long.parseLong(rowDetailsSplit[1]))) ;
				contactList.add(contactModel) ;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace() ;
		}

		return contactList ;
	}

	public static void writeDataToFile(ArrayList<ContactModel> contactList)
	{
		File contactData = fetchFile() ;

		boolean isTitleRow = true ;

		String titleRowData = "NAME,PH.NO" ;

		try
		{
			FileWriter fw = new FileWriter(contactData,false);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.flush();
			bw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
				
		for(ContactModel contactModel : contactList)
		{
			
			String rowData = contactModel.getName() + "," + Long.toString(contactModel.getPhoneNumber()) ;
	
			try
			{

				FileWriter fW = new FileWriter(contactData,true);
				BufferedWriter bW = new BufferedWriter(fW);
				PrintWriter pW = new PrintWriter(bW) ;
			
				if(isTitleRow)
				{
					pW.println(titleRowData) ;
					isTitleRow = false ;	
				}

				pW.println(rowData) ;
				pW.flush() ;
				pW.close() ;
	
			}
			catch(Exception e)
			{
				e.printStackTrace();			
			}
		}

	}
}