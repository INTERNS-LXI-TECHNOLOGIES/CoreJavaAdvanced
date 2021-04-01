package com.lxisoft.model;
import com.lxisoft.model.*;
import com.lxisoft.view.*;
import java.util.*;

public class Dialogues{
	public Dialogues(){
		this.setActionSequence();
		this.setComediSequence();
	}
	ArrayList<AliyanSI> si = new ArrayList<AliyanSI>();
	ArrayList<Moosa> moosa = new ArrayList<Moosa>();
	ArrayList<Vikraman> vik = new ArrayList<Vikraman>();
	ArrayList<Kochunni> koch = new ArrayList<Kochunni>();
	public void setActionSequence(){
		si.add(new AliyanSI());
		si.get(0).setName(" S.I");
		si.get(0).setDialogue1(si.get(0).getName()+"       : Nee innu jailil kedakk\n");
		si.get(0).setDialogue2(si.get(0).getName()+"       : Ivdennu poyalalle nee police aavullu ennalalle nee stalam mattullu\n");
		si.get(0).setDialogue3(si.get(0).getName()+"       : Sthreedanam therathe pengale kettich thannu patichitt.....\n");
		si.get(0).setDialogue4(si.get(0).getName()+"       : Pha mindathey kedakada patty\n");
		moosa.add(new Moosa());
		moosa.get(0).setName(" Sahadevan");
		moosa.get(0).setDialogue1(moosa.get(0).getName()+" : Sir enne onnu thurannu vidanam enk police selection ullathanu\n");
		moosa.get(0).setDialogue2(moosa.get(0).getName()+" : Sir ippo enne vittilel njan selectionu sesham joli kitti thanne ivdennu transfer cheyyikkum\n");
		moosa.get(0).setDialogue3(moosa.get(0).getName()+" : Njan ningalod enth thettu cheythu \n");
		moosa.get(0).setDialogue4(moosa.get(0).getName()+" : Sir Pleasee...\n");

	}
	public void setComediSequence(){
		moosa.add(new Moosa());
		moosa.get(1).setName(" Sahadevan");
		moosa.get(1).setDialogue1(moosa.get(1).getName()+" : Mamante kadam veetyathum Detective agency thodangyathokke valare pettannayirunnu\n");
		moosa.get(1).setDialogue2(moosa.get(1).getName()+" : Dhe nee aa costume azhichu veche....njan apale paranjatha ivanu onnum kodkanda nnu\n");
		moosa.get(1).setDialogue3(moosa.get(1).getName()+" : korachu veriety aayale aalukal sredhikkullu....\n");
		moosa.get(1).setDialogue4(moosa.get(1).getName()+" : Moolamkuzhi lu  thott kalikaruth...!!\n");
		moosa.get(1).setDialogue5(moosa.get(1).getName()+" : IDEA...!!! Moolamkuzhuiyile \"MOOyum\" Sahadevanle \"SAAyum\" \n");
		moosa.get(1).setDialogue6(moosa.get(1).getName()+" : Eda ninne..!!! Poyke nee poyke...");
		moosa.get(1).setDialogue7(moosa.get(1).getName()+" : Vikrametta... Moolamkuzhuiyile \"MOOyum\" Sahadevanle \"SAAyum\" \n");
		moosa.get(1).setDialogue8(moosa.get(1).getName()+" : MOOSA!!!... C.I.D MOOSA\n");
		koch.add(new Kochunni());
		koch.get(0).setName(" Kochunni ");
		koch.get(0).setDialogue1(koch.get(0).getName()+" : Aa athey...Ennit ee kolam vechu enthelum nadakuoo...\n");
		koch.get(0).setDialogue2(koch.get(0).getName()+" : Athey ningakk njan oru sahayam aayirikkum\n");
		koch.get(0).setDialogue3(koch.get(0).getName()+" : haa C.I.D.SAAMUU\n");
		koch.get(0).setDialogue4(koch.get(0).getName()+" : AAHH...!!! MOO ID SA SAA\n");
	    vik.add(new Vikraman());
		vik.get(0).setName(" Vikraman ");
		vik.get(0).setDialogue1(vik.get(0).getName()+" : Sheyy...ath vittu kalaa avan namakk oru sahayam aayirikkum\n");
		vik.get(0).setDialogue2(vik.get(0).getName()+" : Ennalum avan paranjathilum karyam ind ee coatum kalasom okke ithiri over alley...\n");
		vik.get(0).setDialogue3(vik.get(0).getName()+" : Athum ok pakshey ee peru oru Gumm illa C.I.D.Moolamkuzhiyil Sahadevan\n");
		vik.get(0).setDialogue4(vik.get(0).getName()+" : Venda enna C.I.D.Moolam ennu mathy....\n");
		vik.get(0).setDialogue5(vik.get(0).getName()+" : MOOSA ath kollam oru Resam okke ind\n");
	}
	public void getActionSequence(){
		Map<Integer,String> map = new LinkedHashMap<>();
		map.put(0,moosa.get(0).getDialogue1());
		map.put(1,si.get(0).getDialogue1());
		map.put(2,moosa.get(0).getDialogue2());
		map.put(3,si.get(0).getDialogue2());
		map.put(4,moosa.get(0).getDialogue3());
		map.put(5,si.get(0).getDialogue3());
		map.put(6,moosa.get(0).getDialogue4());
		map.put(7,si.get(0).getDialogue4());
		for(int i=0; i<map.size(); i++){
			System.out.println(map.get(i));
		}
	}
	public void getComediSequence(){
		Map<Integer,String> map2 = new LinkedHashMap<>();
		map2.put(0,moosa.get(1).getDialogue1());
		map2.put(1,koch.get(0).getDialogue1());
		map2.put(2,moosa.get(1).getDialogue2());
		map2.put(3,vik.get(0).getDialogue1());
		map2.put(4,koch.get(0).getDialogue2());
		map2.put(5,vik.get(0).getDialogue2());
		map2.put(6,moosa.get(1).getDialogue3());
		map2.put(7,vik.get(0).getDialogue3());
		map2.put(8,moosa.get(0).getDialogue4());
		map2.put(9,vik.get(0).getDialogue4());
		map2.put(10,moosa.get(1).getDialogue5());
		map2.put(11,koch.get(0).getDialogue3());
		map2.put(12,moosa.get(1).getDialogue6());
		map2.put(13,moosa.get(1).getDialogue7());
		map2.put(14,koch.get(0).getDialogue4());
		map2.put(15,moosa.get(1).getDialogue8());
		map2.put(16,vik.get(0).getDialogue5());
		for(int i=0; i<map2.size(); i++){
			System.out.println(map2.get(i));
		}
	}
}