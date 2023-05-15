import java.util.Random;
import java.util.Scanner;

public class Quizview {
Controller controllers = new Controller();
Scanner scan = new Scanner(System.in);
int userscore;
int a1;
int a2;
int a3;

public void showIntro(){
    Random rand = new Random();
  
  int h = rand.nextInt(9);
  int m = rand.nextInt(5);
  int n = rand.nextInt(9);
    System.out.println("welcome to the quiz game press 1 to start the game");
    System.out.println("qustion 1 "+ controllers.loadQuestions().get(h));
    System.out.println("Answer for question 1 :");
     a1 = scan.nextInt();
    System.out.println("qustion 2 "+ controllers.loadQuestions().get(n));
    System.out.println("Answer for question 2 :");
    a2 =scan.nextInt();
    System.out.println("question 3 "+ controllers.loadQuestions().get(m));
    System.out.println("Answer for question 3 :");
     a3 =scan.nextInt();

    controllers.perform(this);
}

    public void scoreDetails(){
      System.out.println("you got 3 out of "+ controllers.userscore+" Right answers");
    

      System.out.println("your score is " + controllers.userscore);

      System.out.println("you have "+ controllers.percent+"% right answers");
     }
    
    }

