package com.lxisoft.view;
import com.lxisoft.model.*;
//import com.lxisoft.movie.*;
public class Vikraman extends Script implements Actors,Comedian{
	public void actorBrief(){
		System.out.println("+----------------------------------------------------------------+");
		System.out.println("|                       Cochin Haneefa                           |");
		System.out.println("|                    -------------------                         |");
		System.out.println("| Cochin Haneefa is a well known actor of MoLLywood industry. He |");
		System.out.println("| is best for Comedy,Villain charectors. He was one of the main  |");
		System.out.println("| Villain charector at the begening of his filim carrers and then|");
		System.out.println("| became a comedian and then to main supporting artist.          |");
		System.out.println("+----------------------------------------------------------------+");
	}
	public void charectorBrief(){
		System.out.println("+----------------------------------------------------------------+");
		System.out.println("|                      Vikraman Police                           |");
		System.out.println("|                    -------------------                         |");
		System.out.println("| Vikraman is a lazy and unmatured Police officer who gets often |");
		System.out.println("| suspended for his lazy charector and letting the people escape |");
		System.out.println("|from the prison.He is a close friend of Sahadevan and his father|");
		System.out.println("| and when he losses his job he joins with Moosa.                |");
		System.out.println("+----------------------------------------------------------------+");
	}
	String cName;
	String dialogue1;
	String dialogue2;
	String dialogue3;
	String dialogue4;
	String dialogue5;
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
}