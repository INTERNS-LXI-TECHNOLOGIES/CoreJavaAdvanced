package com.Lxisoft.Control;
import com.Lxisoft.View.*;
import com.Lxisoft.Model.*;
import com.Lxisoft.Repositry.*;
import java.util.*;
import java.sql.*;
public class MovieController
{
	Cast casting = new Cast();
	Cast hero = new Hero();
	Cast heroine = new Heroine();
	Cast antiHero = new Anti_Hero();
	Cast comedian = new Comedian();
	ArrayList<Cast> cast = new ArrayList<Cast>();
	ArrayList<Hero>heroList = new ArrayList<Hero>();
	ArrayList<Heroine>heroineList = new ArrayList<Heroine>();
	ArrayList<Anti_Hero>antiHeroList = new ArrayList<Anti_Hero>();
	ArrayList<Comedian>comedianList = new ArrayList<Comedian>();
	MovieView movie = new MovieView();
	File file= new File();
  Database database = new Database();
	public void mainMenu()
	{
		movie.intro();
		Scanner scanner = new Scanner(System.in);
		int choice=0;
		do
		{
			movie.mainMenu();
        	choice=scanner.nextInt();
        	if(choice==1)
        	{
        		this.directorMenu();
        	}
        	if(choice==2)
        	{
        		this.movieScript(heroList,heroineList,antiHeroList,comedianList );

        	}
        	if(choice==3)
        	{
        		movie.credits();
        	}
        	else if(choice==0)
        	{
        		System.out.println(" ");
        	}

		}
		while(choice>0);
	}
	
	public void directorMenu() 
	{

		Scanner directorInputs = new Scanner(System.in);
		int choice=0;
		do
		{
			movie.directorActions();
        	choice=directorInputs.nextInt();
        	if(choice==1)
        	{
        		this.addHero(heroList);
        	}
        	if(choice==2)
        	{
        		this.addHeroine(heroineList);
        	}
        	if(choice==3)
        	{
        		this.addAntiHero(antiHeroList);
        	}
        	if(choice==4)
        	{
        		this.addComedian(comedianList);
        	}

        	if(choice==5)
        	{
        		database.createDatabaseConnection();
        	}
          if(choice==6)
          {
            database.printDatabase(heroList,casting);
          }
        	else if(choice==0)
        	{
        		System.out.println(" ");
        	}

		}
		while(choice>0);
	}


	/*public void addCast()
	{
		Scanner castInputs = new Scanner(System.in);
		System.out.println("Number casts to be added : ");
		int userinput= castInputs.nextInt();
       	for(int i=0; i<=userinput; i++)
       	{
		cast.add(new Cast());
		System.out.println("Enter the Name Of Actor : ");
       	String name=castInputs.nextLine();
       	cast.get(i).setName(name);
       	System.out.println("Enter the Character Type Of Actor : ");
       	String characterType=castInputs.nextLine();
       	cast.get(i).setCharacterType(characterType);
       	if(cast.get(i).getCharacterType().equals("Hero"))
       	{
       		heroList.add(new Hero());
       		System.out.println("Enter the Character Name of Hero");
       		String characterName=castInputs.nextLine();
       		heroList.get(i).setHeroCharacterName(characterName);
       		//System.out.println(" ");
       		//System.out.println("Enter the number of Lines Dialogues Available for Hero");
       		//int index = castInputs.nextInt();
       		//for(int i=0; i<index; i++)
       		//{
       		//	
       		//	System.out.println("Enter the Dialogues for hero");
       		//	String heroDialogues=castInputs.nextLine();
       		//	heroList.get(i).setDialogues(heroDialogues);	
       		//}

       	} 

       	
       	else if(cast.get(i).getCharacterType().equals("Heroine"))
       	{
       		heroineList.add(new Heroine());
       		System.out.println("Enter the Character Name of Heroine");
       		String characterName=castInputs.nextLine();
       		heroineList.get(i).setCharacterName(characterName);
       		
       	}
       	else if(cast.get(i).getCharacterType().equals("Anti Hero"))
       	{
       		antiHeroList.add(new Anti_Hero());
       		System.out.println("Enter the Character Name of Anti_Hero");
       		String characterName=castInputs.nextLine();
       		antiHeroList.get(i).setCharacterName(characterName);
       	}
       	else if(cast.get(i).getCharacterType().equals("Comedian"))
       	{
       		comedianList.add(new Comedian());
       		System.out.println("Enter the Character Name of Hero");
       		String characterName=castInputs.nextLine();
       		comedianList.get(i).setCharacterName(characterName);
       	}

       	else{System.out.println("There is No Chracter Type found");}
       	
       }
}
	
	}*/
	public void addHero(ArrayList<Hero> heroList)
	{
		movie.addHero(heroList);		
	} 
	public void addHeroine(ArrayList<Heroine> heroineList)
	{
		movie.addHeroine(heroineList);	
	}
	public void addAntiHero(ArrayList<Anti_Hero> antiHeroList)
	{
		movie.addAntiHero(antiHeroList);
	}

	public void addComedian(ArrayList<Comedian> comedianList)
	{
		movie.addComedian(comedianList);
	}
	public void movieScript(ArrayList<Hero> heroList, ArrayList<Heroine> heroineList, ArrayList<Anti_Hero> antiHeroList, ArrayList<Comedian> comedianList )
	{
		movie.viewMovieScript(heroList,heroineList,antiHeroList,comedianList);

	
	}

	public void exportToFile(ArrayList<Hero> heroList, ArrayList<Heroine> heroineList, ArrayList<Anti_Hero> antiHeroList, ArrayList<Comedian> comedianList )
	{
		file.createFile(heroList,heroineList,antiHeroList,comedianList);
	}

}