package com.lxisoft.controller;
import com.lxisoft.model.*;
import com.lxisoft.view.*;
//import com.lxisoft.theater.Theater;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Movies{
	String movieName;// = "C.I.D MOOSA";
	String director;// = "Jhony Antony";
	String genere;// = "Comedy";
	Scenes scene = new Scenes();
	Theater theatr = new Theater();
	ArrayList<Cast> cast = new ArrayList<Cast>();
	public Movies(){
		movieName = "C.I.D MOOSA";
	    director = "Jhony Antony";
	    genere = "Comedy";
	    this.setCast();
	}
	public void movieOptions(){
		Moosa moosa = new Moosa();
    	Meena meena = new Meena();
	    Kochunni kochu = new Kochunni();
    	Vikraman vikram = new Vikraman();
    	AliyanSI si = new AliyanSI();
		Scanner s = new Scanner(System.in);
		int option;
		do{
		    System.out.println("Press   1.View Script   2.View Cast   3.Book Tickets    0.Exit");
		    option = s.nextInt();
		    if(option == 1){
		    	this.setMovie();
		    }
		    else if(option == 2){
		    	//this.setCast();
		    	this.printCast();
		    	int yN;
		    	do{
		    		System.out.println("Do you like to read about charectors 1.Yes 0.No");
		    	    yN = s.nextInt();
		    		if(yN==1){
		    		    this.printActors();
		    		    System.out.println("\nSelect the serial number to view the descriptions");
		    		    int sno = s.nextInt();
		    		    switch(sno){
		    			    case 1:
		    			    System.out.println("Actor Brief : ");
		        			meena.actorBrief();
		    	    		System.out.println("Charactor Brief : ");
		         			meena.charectorBrief();
		        			break;
		    	    		case 2:
		         			System.out.println("Actor Brief : ");
		    		    	moosa.actorBrief();
		    	    		System.out.println("Charactor Brief : ");
		        			moosa.charectorBrief();
		    	    		break;
		    		    	case 3:
		         			System.out.println("Actor Brief : ");
		    		    	kochu.actorBrief();
		    	    		System.out.println("Charactor Brief : ");
		    			    kochu.charectorBrief();
		    		    	break;
		    			    case 4:
		    			    System.out.println("Actor Brief : ");
		    			    si.actorBrief();
		    			    System.out.println("Charactor Brief : ");
		    			    si.charectorBrief();
		    			    break;
		    	     		case 5:
		    		    	System.out.println("Actor Brief : ");
		    			    vikram.actorBrief();
		    	    		System.out.println("Charactor Brief : ");
		    		    	vikram.charectorBrief();
		    		    	break;
		    	    		default:
		    		    	System.out.println("Something went wrong");
		    	    	}
		        	}
		    	}while(yN != 0); 
		    }
		    else if(option == 3){
		    	theatr.seatSelection();
		    }
		}while(option != 0);
	}  
	public void setCast(){
		cast.add(new Cast());
		cast.get(0).setName("Dileep");
		cast.get(0).setAge(38);
		cast.add(new Cast());
		cast.get(1).setName("Jagathy_Sreekumar");
		cast.get(1).setAge(53);
		cast.add(new Cast());
		cast.get(2).setName("Harisree_Asokan");
		cast.get(2).setAge(41);
		cast.add(new Cast());
		cast.get(3).setName("Cochin_Haneefa");
		cast.get(3).setAge(56);
		cast.add(new Cast());
		cast.get(4).setName("Bhavana");
		cast.get(4).setAge(24);
	}
	public void printActors(){
		System.out.println("+------+-----------------------------------------------+");
		System.out.println("| SNo  |                   Name                        |");
		System.out.println("+------+-----------------------------------------------+");
		for(int j=0; j<cast.size(); j++){
			System.out.println("  "+(j+1)+"                "+cast.get(j).getName());
		}
	}
	public void printCast(){
		Collections.sort(cast);
 
        System.out.println("Movie Cast : ");
        
        for (Cast c: cast)
        {
            System.out.println("Name : "+c.getName()+"\nAge : "+c.getAge()+"\n");
        }
	}
	public void setMovie(){
		System.out.println("+--------------------------------------------------------------------------------------+");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("|                                   "+movieName+"                                         |");
		System.out.println("|                     Directed by :   "+director+"                                      |");
		System.out.println("|    Genere : "+genere+"                                             IMDb : 7.6/10          |");
		System.out.println("|    Plot   : The adventures of a private detective CID Moosa, who's luck and wit helps |");
		System.out.println("|             him to solve the cases.                                                   |");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("                                        Scene-1                                          ");
		System.out.println("                                       ---------                                         ");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println(" Moolam kuzhiyil Sahadevan get prepared for the police selection and leaves the home in \n the mid way he tries to stop Thorappan Kochunni from pickpoketting Meena but Shadevan\n too get arrested by S.I.Peethambaran");
		
		System.out.println("\n+---------------------------------------------------------------------------------------+\n Scene-1 Begins");
		this.slowPrint();
		scene.setScene1();
		scene.printScene1();
		System.out.println("\n+---------------------------------------------------------------------------------------+");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("                                        Scene-2                                          ");
		System.out.println("                                       ---------                                         ");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println(" Sahadevan has got expelled from the selection camp as he couldn't get there on Time.   \n So he decided to start his own Private Detective Company ");
		
		System.out.println("\n+---------------------------------------------------------------------------------------+\n Scene-2 Begins");
		this.slowPrint();
		scene.setScene2();
		scene.printScene2();
		System.out.println("\n+---------------------------------------------------------------------------------------+");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("                                        Scene-3                                          ");
		System.out.println("                                       ---------                                         ");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println(" Moosa and team chases an insane man and after long hardwork to capture him they came to\n know he is just a maniac.");
		
		System.out.println("\n+---------------------------------------------------------------------------------------+\n Scene-3 Begins");
		this.slowPrint();
		scene.setScene3();
		scene.printScene3();
		System.out.println("\n+---------------------------------------------------------------------------------------+");

		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("                                       The End                                           ");
		System.out.println("                                      ----------                                         ");
		System.out.println("+---------------------------------------------------------------------------------------+");
	}
	public void slowPrint(){
		try{
			Thread.sleep(1500);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}