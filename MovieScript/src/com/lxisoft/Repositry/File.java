package com.Lxisoft.Repositry;
import com.Lxisoft.MovieScriptApp.Control.*;
import com.Lxisoft.MovieScriptApp.View.*;
import com.Lxisoft.MovieScriptApp.Model.*;
import java.io.*;
import java.util.*;
public class File
{
  MovieView movie = new MovieView();
 public void createFile(ArrayList<Hero> heroList, ArrayList<Heroine> heroineList, ArrayList<Anti_Hero> antiHeroList, ArrayList<Comedian> comedianList ) 
  {
  try{
            FileWriter writeData = new FileWriter("MovieScript_Data.txt");
            Writer writeStream = new BufferedWriter(writeData);
            for(int i=0; i<heroList.size(); i++)
            {
              writeStream.write("Cast Details : \n-------------------\n1. Name : "+heroList.get(i).getName()+"Character Type :- "+heroList.get(i).getCharacterType()+"Character Name :- "+heroList.get(i).getCharacterName());}
              for(int i=0; i<heroineList.size(); i++)
            { 
              writeStream.write("2.Name : "+heroineList.get(i).getName()+"Character Type :- "+heroineList.get(i).getCharacterType()+"Character Name :- "+heroineList.get(i).getCharacterName());
             }
              for(int i=0; i<comedianList.size(); i++)
            {
             writeStream.write("3.Name : "+comedianList.get(i).getName()+"Character Type :- "+comedianList.get(i).getCharacterType()+"Character Name :- "+comedianList.get(i).getCharacterName());             
            }
             for(int i=0; i<heroList.size(); i++)
            {
              writeStream.write("4.Name : "+antiHeroList.get(i).getName()+"Character Type :- "+antiHeroList.get(i).getCharacterType()+"Character Name :- "+antiHeroList.get(i).getCharacterName());             
            }
            
            writeStream.flush();
            writeStream.close();
            System.out.println("Sucessfully Exported");

        }catch (IOException e) 
        {
            e.printStackTrace();
        }
      }

/*public void readFile(ArrayList<Cast> cast); 
  {
    
  try{
            FileReader readData = new FileReader("MovieScript_Data.txt");
            Scanner datareader= new Scanner (readData);
            int sz=cast.size();
            while (datareader.hasNextLine())
            {
              String data = datareader.nextLine();
              System.out.println(data);  
            }
            datareader.close();

        }catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }

    }*/
}
