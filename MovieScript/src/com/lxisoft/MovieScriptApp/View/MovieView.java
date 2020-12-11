package com.Lxisoft.MovieScriptApp.View;
import com.Lxisoft.MovieScriptApp.Control.*;
import com.Lxisoft.MovieScriptApp.Model.*;
import java.util.*;

public class MovieView
{
  Cast hero = new Hero();
  Cast heroine = new Heroine();
  Cast antiHero = new Anti_Hero();
  Cast comedian = new Comedian();
  public void intro()
    {
    	System.out.println("\n\t\t-------------------------------------------\t");
   		System.out.println("\t\t-------------------------------------------\t");
   		System.out.println("\t\t------------------ Marvels ----------------\t");
   		System.out.println("\t\t-------------   The Avengers  -------------\t");
   		System.out.println("\t\t--------------  THE END GAME --------------\t");
   		System.out.println("\t\t-------------------------------------------\t");
   		System.out.println("\t\t-------------------------------------------\t");
   		System.out.println("\t\t------- Scripted by -----------------------\t");
   		System.out.println("\t\t---------------- Faris --------------------\t");
   		System.out.println("\t\t-------------------------------------------\t");
   	  System.out.println(" ")
      }
    public void mainMenu()
    {
      System.out.println("\n________________________");
      System.out.println("\n\n1. Director  \n\n2. Movie Script \n\n3. Casts \n\n Press 0 for Exit \n");
    }

  public void directorActions()
  {
    System.out.println(" ");
    System.out.println("Welcome Mr.Director");
    System.out.println("\n________________________");
    System.out.println("\n\n1. Add Hero \n\n2. Add Heroine \n\n3. Add Anti_Hero\n\n4. Add Comedian\n\n5. Export Details of Casts to File \n\n6. Import From File \n\n Press 0 for Exit \n");
    
  }


  public void viewMovieScript(ArrayList<Hero> heroList, ArrayList<Heroine> heroineList, ArrayList<Anti_Hero> antiHeroList, ArrayList<Comedian> comedianList )
  {
    System.out.println("Scene -1 begning of Fight between hero and antiHero with Comedian");
    System.out.println("-----------------------------------------");
    System.out.println(antiHeroList.get(0).getCharacterName()+"- Okay, hold on, don't shoot");
    System.out.println(comedianList.get(0).getCharacterName()+"- You see where you're going?");
    System.out.println(comedianList.get(0).getCharacterName()+"- Okay. Now, let's worry about how you get there. ");
    System.out.println(heroList.get(0).getCharacterName()+"- Gotta move your foot here.");
    System.out.println(heroList.get(0).getCharacterName()+"- Point your toe this way.");
    System.out.println(comedianList.get(0).getCharacterName()+"- Your hips here. Okay?");
    System.out.println(antiHeroList.get(0).getCharacterName()+"- How about now? Can you see now?");
    System.out.println(heroList.get(0).getCharacterName()+"- - No. How about now?");
    System.out.println(antiHeroList.get(0).getCharacterName()+"- All right. Ready? Three fingers.");
    System.out.println(heroList.get(0).getCharacterName()+"- Nice! Nice throw, kiddo.");
    System.out.println(comedianList.get(0).getCharacterName()+"- Hey, you guys want mayo? Or mustard?");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Scene -2 Sentimental scene of Hero With Heroine");
    System.out.println("-----------------------------------------");
    System.out.println(heroineList.get(0).getCharacterName()+"- where is he ? ");
    System.out.println(comedianList.get(0).getCharacterName()+"- He Is there ? ");
    System.out.println(heroineList.get(0).getCharacterName()+"- where ? ");
    System.out.println(comedianList.get(0).getCharacterName()+"- In my pockets !...");
    System.out.println(heroineList.get(0).getCharacterName()+"- Oh god! Stop it..");
    System.out.println("Hero is now eentering from upstair");
    System.out.println(comedianList.get(0).getCharacterName()+"- there is he is");
    System.out.println(heroineList.get(0).getCharacterName()+"- Are you ? you wanna do this to me?");
    System.out.println(heroList.get(0).getCharacterName()+"- - I have to .... ");
    System.out.println(heroineList.get(0).getCharacterName()+"- Really....");
    System.out.println(heroList.get(0).getCharacterName()+"- I have no choice babe. forgive me...... I can't ");
    System.out.println("Suddenly....");

  }

  public void importFile()
  {
    System.out.println("Successfully Imported from File");
  }
  public void exportFile()
  {
    System.out.println("Successfully Exported to File");
  }

  public void credits()
  {
    System.out.println("-------Credits-----------");
    System.out.println("-------------------------");
    System.out.println("Designed and Scripted By ");
    System.out.println("--------  Faris  --------");
    System.out.println("-------------------------");
    

  }
  public void addHero(ArrayList<Hero> heroList)
  {
    Scanner castInputs = new Scanner(System.in);
    heroList.add(new Hero());
    System.out.println("Enter the Name Of Actor : ");
    String name=castInputs.nextLine();
    heroList.get(0).setName(name);
    System.out.println("Enter the Character Type Of Actor : ");
    String characterType=castInputs.nextLine();
    heroList.get(0).setCharacterType(characterType);
    System.out.println("Enter the Character Name of Hero");
    String characterName=castInputs.nextLine();
    heroList.get(0).setCharacterName(characterName);
        
  }
  public void addHeroine(ArrayList<Heroine> heroineList)
  {
    Scanner heroineInput=new Scanner(System.in);
    heroineList.add(new Heroine());
    System.out.println("Enter the Name Of Actor : ");
    String name=heroineInput.nextLine();
    heroineList.get(0).setName(name);
    System.out.println("Enter the Character Type Of Actor : ");
    String characterType=heroineInput.nextLine();
    heroineList.get(0).setCharacterType(characterType);
    System.out.println("Enter the Character Name of Heroine");
    String characterName=heroineInput.nextLine();
    heroineList.get(0).setCharacterName(characterName);
        
  }
  public void addAntiHero(ArrayList<Anti_Hero> antiHeroList)
  {Scanner antiheroInput=new Scanner(System.in);
    antiHeroList.add(new Anti_Hero());
    System.out.println("Enter the Name Of Actor : ");
        String name=antiheroInput.nextLine();
        antiHeroList.get(0).setName(name);
        System.out.println("Enter the Character Type Of Actor : ");
        String characterType=antiheroInput.nextLine();
        antiHeroList.get(0).setCharacterType(characterType);
    System.out.println("Enter the Character Name of Heroine");
        String characterName=antiheroInput.nextLine();
        antiHeroList.get(0).setCharacterName(characterName);}



public void addComedian(ArrayList<Comedian> comedianList)
{
  Scanner comedianInput=new Scanner(System.in);
    comedianList.add(new Comedian());
    System.out.println("Enter the Name Of Actor : ");
    String name=comedianInput.nextLine();
    comedianList.get(0).setName(name);
    System.out.println("Enter the Character Type Of Actor : ");
    String characterType=comedianInput.nextLine();
    comedianList.get(0).setCharacterType(characterType);
    System.out.println("Enter the Character Name of Heroine");
    String characterName=comedianInput.nextLine();
    comedianList.get(0).setCharacterName(characterName);
}
}