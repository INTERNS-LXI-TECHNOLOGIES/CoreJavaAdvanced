package com.Lxisoft.Files;
import java.util.Random;
import java.util.Scanner;

public class Quizview {
Controller controller = new Controller();
Scanner scan = new Scanner(System.in);
int a1, a2;

public void showIntro(){  
    System.out.println("WELCOME TO THE QUIZ GAME\n");
    System.out.println("You will have "+controller.loadQuestions().size()+ " questions\n");
    System.out.println("You need to score minimum 50% to pass the Quiz\n");
    System.out.println("Press 1 to start the game OR press any other number to exit the game");
    a2 = scan.nextInt();
    if(a2 != 1){
    System.exit(0);
     }
    }



    public void showQuestions(){
      for(int i=0; i<10; i++){
      System.out.println("qustion "+(1+i)+" "+ controller.loadQuestions().get(i));

      System.out.println("Your answer: choose 1 or 2 or 3");

      a1 =scan.nextInt();

      controller.perform(this);
      }
    }


    
    public void scoreDetails(){
      System.out.println("you got "+ controller.userscore+" out of "+ controller.loadQuestions().size() +" Right answers\n");
      System.out.println("you have "+ controller.percent+"% right answers\n");
      controller.passOrFail();
     }
    
    }

