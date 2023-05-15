
import java.util.ArrayList;
import java.util.List;

public class Controller {
  int userscore ;
  int percent;
  private ArrayList<Question> questions = new ArrayList<Question>();
  
  public void perform(Quizview quizView){
    
    if(quizView.a1 == 1){
      userscore = 1;
    }
   else{
 
    } 
  
   if(quizView.a2 == 3){
      userscore++;
    }
   else{
     
    }
      if(quizView.a3 == 2){
      userscore++;
    }
    else {
    
    }
    percent = (userscore*100)/3;
}

public ArrayList loadQuestions(){
  return questions;
}


public Controller(){
    
     questions.add(new Question("what is java?", "its a car", "its an oop Language", "its a coffee"));
     questions.add (new Question("what is cat?", "its a car", "its a Language", "its an animal"));
     questions.add(new Question("what is bmw?", "its a brand", "its a car", "its a bike"));
     questions.add (new Question("what is football", "its a ball", "its an oop cricket", "its a coffee"));
     questions.add(new Question("what is java?", "its a car", "its an oop Language", "its a coffee"));
     questions.add (new Question("what is water", "its a H20", "its an oop rock", "its a coffee"));
     questions.add(new Question("what is java?", "its a car", "its an oop Language", "its a coffee"));
     questions.add (new Question("what is pythin", "its a car", "its an oop Language", "its a coffee"));
     questions.add(new Question("what is java?", "its a car", "its an oop Language", "its a coffee"));
     questions.add (new Question("what is what", "its a a", "its an oop a", "its a coffee"));

  
 } 
}