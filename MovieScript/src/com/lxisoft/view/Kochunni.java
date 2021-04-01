package com.lxisoft.view;
import com.lxisoft.model.*;
//import com.lxisoft.movie.*;
public class Kochunni extends Script implements Actors,Comedian{
	public void actorBrief(){
		System.out.println("+----------------------------------------------------------------+");
		System.out.println("|                      Harisree Asokan                           |");
		System.out.println("|                    -------------------                         |");
		System.out.println("| Harisree asokan is one of the best comedian MoLLywood industry.|");
		System.out.println("| He has done a lot of filim as main supporting artist and a best|");
		System.out.println("| comedy artist.Even now he is shining in all fields of acting he|");
		System.out.println("| has also reached main lead actor with a serious charector roles|");
		System.out.println("+----------------------------------------------------------------+");
	}
	public void charectorBrief(){
		System.out.println("+----------------------------------------------------------------+");
		System.out.println("|                     Thorappan Kochunni                         |");
		System.out.println("|                    --------------------                        |");
		System.out.println("| Thorappan kochunni is a thief who break in to locked houses and|");
		System.out.println("| steals every thing.He escapes from prison and is listed in wan-|");
		System.out.println("| -ted list.He is also a childhood friend of Sahadevan so he join|");
		System.out.println("| in C.I.D Moosa as Moosa's assistant.                           |");
		System.out.println("+----------------------------------------------------------------+");
	}
	String cName;
	String dialogue1;
	String dialogue2;
	String dialogue3;
	String dialogue4;
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
}