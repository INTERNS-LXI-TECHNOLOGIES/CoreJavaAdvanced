package com.lxisoft.controller;
import com.lxisoft.controller.Controller;
import com.lxisoft.model.*;
import com.lxisoft.view.*;
import com.lxisoft.repository.*;
import java.util.*;
public class Controller{
	Moosa moosa = new Moosa();
   	Meena meena = new Meena();
    Kochunni kochu = new Kochunni();
   	Vikraman vikram = new Vikraman();
   	AliyanSI si = new AliyanSI();
   	MovieScript ms = new MovieScript();
   	
	public void setCast(ArrayList<Cast> cast){
		cast.add(new Cast());
		cast.get(0).setName("Dileep");
		cast.get(0).setAge(38);
		cast.add(new Cast());
		cast.get(1).setName("Jagathy Sreekumar");
		cast.get(1).setAge(53);
		cast.add(new Cast());
		cast.get(2).setName("Harisree Asokan");
		cast.get(2).setAge(41);
		cast.add(new Cast());
		cast.get(3).setName("Cochin Haneefa");
		cast.get(3).setAge(56);
		cast.add(new Cast());
		cast.get(4).setName("Bhavana");
		cast.get(4).setAge(24);
	}
	
	public void viewCast(){
		Scanner s = new Scanner(System.in);	
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
  	    	System.out.println("Wrong Option");
   	   	}
    }
    public void addData(){
    	Scenes scenes = new Scenes();
    	scenes.addDatabase();
    } 
}
