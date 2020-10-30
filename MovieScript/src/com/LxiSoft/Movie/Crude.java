package com.LxiSoft.Movie;
import java.util.Scanner;
public class Crude
{
	Comedian comedy=new Comedian();
	Scanner scnr=new Scanner(System.in);
        public void crudeFunctions(){
        
        boolean quit=false;

         int choice=0;
        do
        {

            System.out.println("\n \n ***ENTER THE NUMBER OF YOUR DESIRED OPERATION TO PERFORM***");
            System.out.println("1.  ADD");
            System.out.println("2.  DELETE");
            System.out.println("3.  UPDATE");
            
            System.out.println("0.  TO EXIT");

            System.out.println("Enter your choice");
             choice=scnr.nextInt();


            
            
        
                if(choice==1)
                {
              comedy.addComedyDialogue();
                }
                if(choice==2)
                {
                //this.removeDynamically();
                }
                if(choice==3)
                {
                //this.modifyNameDynamically();
                }
                
                else if (choice==0)
                {
                System.out.println(" ");
                }
            }
            while(choice>0);
      
                
            

            
            }

}