
package com.Lxisoft.Files;
import java.util.ArrayList;
import java.util.List;

public class Controller {
  int userscore ;
  int gett;
  int percent;
  private ArrayList<Question> questions = new ArrayList<Question>();
  
  public void perform(Quizview quizView){

    if(quizView.a1 == questions.get(gett).getrightAnswer()){
      userscore++;
    }
   else{
    
    }
    
    gett++;
    percent = (userscore*100)/questions.size();
}

public ArrayList loadQuestions(){
  return questions;
}
public void passOrFail(){
  
  if(percent>=50){
    System.out.println("You have passed the Quiz");
  }
  else{
    System.out.println("Sorry you Failed!");
  }
  
}

public Controller(){
    
     questions.add(new Question("Goat of Football?", "C.Ronaldo", "Z.Zidane", "L.messi",1));
     questions.add (new Question("Best Footall Club", "Real Madrid", "Bayern", "Liverpool",3));
     questions.add (new Question("Fastest Animal?", "Lion", "Puma", "Cheetah",3));
     questions.add(new Question("Goat of Midfielder?", "Zidane", "Ozil", "Modric",1));
     questions.add (new Question("Footall Club with Most Champions League", "Real Madrid", "Bayern", "AC Milan",3));
     questions.add (new Question("what kind of liquid is water?", "H20", "its kind of a gel", "coffee",1));
     questions.add(new Question("Which club has most trophies?", "Real Madrid", "Bayern", "Man.Utd",1));
     questions.add(new Question("Player with most Goals in History?", "C.Ronaldo", "Pele", "L.messi",1));
     questions.add(new Question("what is java?", "its a car", "its an oop Language", "its a coffee", 2));
     questions.add (new Question("what is football", "its a ball", "its an oop", "its a Game",3));

  
 } 
}