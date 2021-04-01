package com.lxisoft.view;
import com.lxisoft.model.*;
//import com.lxisoft.actors.*;
public class Moosa extends Script implements Actors,Hero{
	public void actorBrief(){
		System.out.println("+----------------------------------------------------------------+");
		System.out.println("|                          Dileep                                |");
		System.out.println("|                    -------------------                         |");
		System.out.println("| Dileep is a well known Malayalam actor who has got the tittle  |");
		System.out.println("| Janapriya Nayakan becouse of charectors in the movies he appear|");
		System.out.println("| He choses a common charector which every people can relate them|");
		System.out.println("| to that charector.He started his carrer as a mimic artist and  |");
		System.out.println("| now he has reached lots of heights with his acting carrer.     |");
		System.out.println("+----------------------------------------------------------------+");
	}
	public void charectorBrief(){
		System.out.println("+----------------------------------------------------------------+");
		System.out.println("|                      Sahadevan(Moosa)                          |");
		System.out.println("|                    -------------------                         |");
		System.out.println("| Sahadevan is young ambitious person who wish to become a Police|");
		System.out.println("| officer.But he get expelled by some of the police officers for |");
		System.out.println("| their personal vengence.So he decided to change himself into a |");
		System.out.println("| detective and starts a private detective agency.               |");
		System.out.println("+----------------------------------------------------------------+");
	}
	String cName;
	String dialogue1;
	String dialogue2;
	String dialogue3;
	String dialogue4;
	String dialogue5;
	String dialogue6;
	String dialogue7;
	String dialogue8;
	public void setName(String name){
		this.cName = name;
	}
	public String getName(){
		return cName;
	}
	public void setDialogue1(String dialogue){
		this.dialogue1 = dialogue;
	}
	public String getDialogue1(){
		return dialogue1;
	}
	public void setDialogue2(String dialogue){
		this.dialogue2 = dialogue;
	}
	public String getDialogue2(){
		return dialogue2;
	}
	public void setDialogue3(String dialogue){
		this.dialogue3 = dialogue;
	}
	public String getDialogue3(){
		return dialogue3;
	}
	public void setDialogue4(String dialogue){
		this.dialogue4 = dialogue;
	}
	public String getDialogue4(){
		return dialogue4;
	}
	public void setDialogue5(String dialogue){
		this.dialogue5 = dialogue;
	}
	public String getDialogue5(){
		return dialogue5;
	}
	public void setDialogue6(String dialogue){
		this.dialogue6 = dialogue;
	}
	public String getDialogue6(){
		return dialogue6;
	}
	public void setDialogue7(String dialogue){
		this.dialogue7 = dialogue;
	}
	public String getDialogue7(){
		return dialogue7;
	}
	public void setDialogue8(String dialogue){
		this.dialogue8 = dialogue;
	}
	public String getDialogue8(){
		return dialogue8;
	}
}