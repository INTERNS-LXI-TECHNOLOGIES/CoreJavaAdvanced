package com.lxisoft.view;
//import com.lxisoft.model.movies;
import com.lxisoft.view.Theater;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
enum Seats{
	DUAL,VIP,NORMAL;   		
}
public class Theater{
	int ticketCharge;
	String theaterName;
	String place;
	int[] viewerAge;
	Seats sets;
	public Theater(){
		theaterName = "PRIYA THEATERS";
		place = "Palakkad";
	}
	public void seatSelection(){
		Scanner scan = new Scanner(System.in);
		System.out.println("+-----------------------------------------------------------------------+");
		System.out.println("                 "+theaterName+"                        ");
		System.out.println("                 "+place+"                        ");
		System.out.println("\n This movie is certified by the Censor Board as strictly an 18+ movie \n People should follow the age rules properly.");
		System.out.println(" The seats are limitted due to COVID-19 situation.                     ");
		System.out.println(" Every should wear masks ,sanitize hands and follow social distancing    ");
		System.out.println("+-----------------------------------------------------------------------+");
		
		System.out.println("Select the type of seat \n1.Dual  \t150/- \n2.VIP   \t200/-\n3.Normal\t120/-\n");
		int seat = scan.nextInt();
		
		if(seat == 1){
			sets = Seats.DUAL;
		}
		else if(seat == 2){
			sets = Seats.VIP;
		}
		else if(seat == 3){
			sets = Seats.NORMAL;
		}
		
		switch (sets) {
			case DUAL:
			ticketCharge = 150;
			this.booking(ticketCharge);
			break;
			case VIP:
			ticketCharge = 200;
			this.booking(ticketCharge);
			break;
			case NORMAL:
			ticketCharge = 120;
			this.booking(ticketCharge);			
		}
	}
	public void booking(int rate){
		Scanner s = new Scanner(System.in);
		viewerAge = new int[5];
		System.out.println("Number of Tickets needed (4seats can only be booked by one person) ");
		int num = s.nextInt();
		System.out.println("This movie is rated 18+ So enter the age ");
		for(int i=0; i<num; i++){
			System.out.println("Person "+(i+1));
			viewerAge[i] = s.nextInt();
			assert(viewerAge[i] >18);
			System.out.println("Person "+(i+1)+" is "+viewerAge[i]+" years old");
			if(viewerAge[i]<18){
				System.out.println("Person "+(i+1)+" is not allowed to watch the movie");
				return;
			}
			else{
				System.out.println("Person "+(i+1)+" can have the Tickets");
			}
		}
		System.out.println("+------------------------------------+");
		System.out.println("| Number of tickets booked : "+num+"       |\n| Total amount for tickets : "+(num*rate)+"     |");
		System.out.println("+------------------------------------+");
		System.out.println("\n Thank you for the booking ");
		this.review();
	}
	public void review(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Would you like to give feedbacks \na. Yes b.No");
		String feed = sc.nextLine();
		Pattern pattern=Pattern.compile(feed);
		Matcher matcher=pattern.matcher("a");
		if(matcher.matches())
		{
			System.out.println(" Type your feedbacks");
			String feeds = sc.nextLine();
			System.out.println("\nThank you for your Review");
			System.out.println("\n---------------------------------");
		}
		else{
			return;
		}
	}
}