
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
    
     questions.add(new Question("what is java?", "its a car", "its an oop Language", "its a coffee", 1));
     questions.add (new Question("what is cat?", "its a car", "its a Language", "its an animal",2));
     questions.add(new Question("what is bmw?", "its a brand", "its a car", "its a bike",3));
     questions.add (new Question("what is football", "its a ball", "its an oop", "its a coffee",3));
     questions.add(new Question("what is java?", "its a car", "its an oop Language", "its a coffee",1));
     questions.add (new Question("what is water?", "its a H20", "its an oop rock", "its a coffee",2));
     questions.add(new Question("what is a car?", "its a car", "its an oop Language", "its a coffee",2));
     questions.add (new Question("what is pythin", "its a car", "its an oop Language", "its a coffee",3));
     questions.add(new Question("what is a book?", "its a car", "its an oop Language", "its a coffee",1));
     questions.add (new Question("what is what", "its a a", "its an oop a", "its a coffee",1));

  
 } 
}