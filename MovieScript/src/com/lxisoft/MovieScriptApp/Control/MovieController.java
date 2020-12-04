package com.Lxisoft.MovieScriptApp.Control;
import com.Lxisoft.MovieScriptApp.View.*;
import com.Lxisoft.MovieScriptApp.Model.*;
import com.Lxisoft.Repositry.*;
import java.util.*;
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
	public void mainMenu()
	{
		movie.intro();
		Scanner scanner = new Scanner(System.in);
		int choice=0;
		do
		{
			System.out.println("\n________________________");
        	System.out.println("\n\n1. Director  \n\n2. Movie Script \n\n3. Casts \n\n Press 0 for Exit \n");
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
        		//this.credits();
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
        		this.addHero();
        	}
        	if(choice==2)
        	{
        		this.addHeroine();
        	}
        	if(choice==3)
        	{
        		this.addAntiHero();
        	}
        	if(choice==4)
        	{
        		this.addComedian();
        	}

        	if(choice==5)
        	{
        		this.exportToFile(heroList,heroineList,antiHeroList,comedianList );
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
	public void addHero()
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
	public void addHeroine()
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
	public void addAntiHero()
	{
		Scanner antiheroInput=new Scanner(System.in);
		antiHeroList.add(new Anti_Hero());
		System.out.println("Enter the Name Of Actor : ");
       	String name=antiheroInput.nextLine();
       	antiHeroList.get(0).setName(name);
       	System.out.println("Enter the Character Type Of Actor : ");
       	String characterType=antiheroInput.nextLine();
       	antiHeroList.get(0).setCharacterType(characterType);
		System.out.println("Enter the Character Name of Heroine");
       	String characterName=antiheroInput.nextLine();
       	antiHeroList.get(0).setCharacterName(characterName);
	}

	public void addComedian()
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
	public void movieScript(ArrayList<Hero> heroList, ArrayList<Heroine> heroineList, ArrayList<Anti_Hero> antiHeroList, ArrayList<Comedian> comedianList )
	{
		movie.viewMovieScript(heroList,heroineList,antiHeroList,comedianList);

	
	}

	public void exportToFile(ArrayList<Hero> heroList, ArrayList<Heroine> heroineList, ArrayList<Anti_Hero> antiHeroList, ArrayList<Comedian> comedianList )
	{
		file.createFile(heroList,heroineList,antiHeroList,comedianList);
	}

}