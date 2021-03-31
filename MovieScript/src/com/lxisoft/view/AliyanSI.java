package com.lxisoft.view;
import com.lxisoft.model.*;
//import com.lxisoft.movie.*;
public class AliyanSI extends Script implements Actors,Villain{
	public void actorBrief(){
		System.out.println("+----------------------------------------------------------------+");
		System.out.println("|                     Jagathy SreeKumar                          |");
		System.out.println("|                    -------------------                         |");
		System.out.println("| Jagathy SreeKumar is an epic actor in Malayalam Filim industry.|");
		System.out.println("| He is well known for his vesatile mannerisms in comedy sequence|");
		System.out.println("| He has acted over 1400 Malayalam filims over the past 4 decades|");
		System.out.println("+----------------------------------------------------------------+");
	}
	public void charectorBrief(){
		System.out.println("+----------------------------------------------------------------+");
		System.out.println("|                     S.I.Peethambaran                           |");
		System.out.println("|                    -------------------                         |");
		System.out.println("| Jagathy SreeKumar has acted in this role. This charector id not|");
		System.out.println("| only the S.I but also the Aliyan of Sahadevan(Moosa). He is a  |");
		System.out.println("|greedy person has an enimity on Sahadevans family for not giving|");
		System.out.println("| enough dowry.He is also against Sahadevan becoming a Police.   |");
		System.out.println("+----------------------------------------------------------------+");
	}
	/*
	public void villainismDialogue(){
		String cName = "Aliyan SI";
		String dialogue1 = "Nee innu jailil kedakk";
		String dialogue2 = "Ivdennu poyalalle nee police aavullu ennalalle nee stalam mattullu";
		String dialogue3 = "Sthreedanam therathe pengale kettich thannu patichitt.....";
		String dialogue4 = "Pha mindathey kedakada patty";

	}*/
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