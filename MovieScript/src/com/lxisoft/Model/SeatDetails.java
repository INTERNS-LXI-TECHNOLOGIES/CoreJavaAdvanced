package com.lxisoft.Model;
import com.lxisoft.View.Doctor;
import java.util.List;
import java.util.Collections;
public class SeatDetails implements Comparable<SeatDetails>
{
	private int seatNumber;
	private String name;
	private String block;

	 public SeatDetails(String name ,String block , int seatNumber)
	 {
	 	this.name=name;
	 	this.block=block;
	 	this.seatNumber=seatNumber; 
	 }
	 public String toString()
	 {
	 	return this.name+" "+" "+this.block+" "+" "+this.seatNumber;
	 }
    public String getName()
    {
    	return name;
    }
    public String getBlock()
    {
    	return block;
    }
	public int getseatNumber()
	{
		return seatNumber;
	}
	 public int compareTo(SeatDetails  seatNumber)
	{
		if (this.getseatNumber()>seatNumber.getseatNumber())
		return 1;
	    return -1;
	}
	 public void dialoguAndScenes()
            {
                  System.out.print("           MOVIE STARTS           ");
                  System.out.print("\n");
                System.out.print("          --------------          ");
                System.out.print("\n");
                System.out.print("\n");
                System.out.print("\n");
                System.out.print("\n");
                  Director  director = new Director();
                  director.creatFilesSceneDialogue1();
                  director.creatFilesSceneDialogue2();
                  director.creatFilesSceneDialogue3();
              director.sceneDialogue(); 
              movie.playList();
            }
}
