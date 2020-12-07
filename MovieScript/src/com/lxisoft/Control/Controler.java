package com.lxisoft.Control;
import com.lxisoft.View.Movie;
import com.lxisoft.Model.SeatDetails;
import com.lxisoft.Model.Script;
import com.lxisoft.Model.Tintumone;
import com.lxisoft.Model.Katakadarajan;
import com.lxisoft.Model.Dundumole;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Controler
{
      Movie movie = new Movie();
     ArrayList<SeatDetails> seatD = new ArrayList<SeatDetails>();
     ArrayList<Script> script = new ArrayList<Script>();
      	
	public void seatDetails()
	{
       seatD.add(new SeatDetails(" ADARSH "," A BLOCK ",11));
       seatD.add(new SeatDetails(" SREEJITH "," A BLOCK ",10));
       seatD.add(new SeatDetails(" ABHINAVE "," A BLOCK ",7));
       seatD.add(new SeatDetails(" AJITH "," A BLOCK ",9));
       seatD.add(new SeatDetails(" ABHISHEK "," A BLOCK ",8));

       Collections.sort(seatD);
       	movie.detailsofSeatDetails(seatD);       
	} 
      public void sceneDialogue()
      {
            
            script.add(new Tintumone());
            script.get(0).setDialogue1("njna tintu sneham ulavar tintumoneen vilikum");
            script.get(0).setDialogue2("evidayan vide kutiyude");
            script.get(0).setDialogue3("eth arane ?");
            script.get(0).setDialogue4("arayile pene enthina kutiye nokunath");
            script.get(0).setDialogue5("ninamk enthada vendath");
            script.get(0).setDialogue6("edaaaa.........");
            script.get(0).setDialogue7("eni melal evide kandupokaruth ketodaaa");



            script.add(new Dundumole());
            script.get(1).setDialogue1("ano!,njan dundumole");
            script.get(1).setDialogue2("vide evide aduth tane ane");
            script.get(1).setDialogue3("arayila kore neram ayii enthe penale ane");
            script.get(1).setDialogue4("arayila....... ! ");
            script.get(1).setDialogue5("ayooo vendaa adii onumm undakanda...........");
            script.get(1).setDialogue6("va pokam vitekee namak pokam tintuuu");


            script.add(new Katakadarajan());
            script.get(2).setDialogue1("enik vendathe ok ne tharuvoo ne ara divama onu poda sondum pani nokii poko ninak rajane seric arayilaa over kalicha petile  avum pokunam evidun ketoda kilunth cheka Haa ha ha .....");
            script.get(2).setDialogue2("enthada vadanaaa..............");
            script.get(2).setDialogue3("nine njan pene edutolada..........");
            movie.scenes(script);
   }
   public void creatFilesSceneDialogue1()
      {
      try
      {
       File file = new File("D:\\javaworks\\CoreJavaAdvanced\\MovieScript\\src\\com\\lxisoft\\File\\file.txt");
       FileWriter writer = new FileWriter(file);
             writer.write("\n Tintumone : "+script.get(0).getDialogue1()+"\n"+"\n"+"Dundumole : "+script.get(1).getDialogue1());
             writer.write("\n Tintumone : "+script.get(0).getDialogue2()+"\n"+"\n"+"Dundumole : "+script.get(1).getDialogue2());
             writer.write("\n Tintumone : "+script.get(0).getDialogue3()+"\n"+"\n"+"Dundumole : "+script.get(1).getDialogue3());
             writer.write("\n Tintumone : "+script.get(0).getDialogue4()+"\n"+"\n"+"Dundumole : "+script.get(1).getDialogue4());
       writer.flush();
       writer.close();
      } 
      catch(IOException e)
      {
        e.printStackTrace();
      }
      this.readFileSceneDialogue1();
      }
      public void readFileSceneDialogue1()
      {
            try
            {
                  FileReader buffer = new FileReader("D:\\javaworks\\CoreJavaAdvanced\\MovieScript\\src\\com\\lxisoft\\File\\file.txt");
                  Scanner scanner = new Scanner(buffer);
                  while(scanner.hasNextLine())
                  {
                        System.out.print("\n"+scanner.nextLine()+"\n");
                  } 
                  buffer.close();
            }
            catch (IOException e)
            {
                  e.printStackTrace();
            }
      }
 public void creatFilesSceneDialogue2()
      {
      try
      {
       File file = new File("D:\\javaworks\\CoreJavaAdvanced\\MovieScript\\src\\com\\lxisoft\\File\\file.txt");
       FileWriter writer = new FileWriter(file);
             writer.write("\n Tintumone : "+script.get(0).getDialogue5()+"\n"+"\n"+"Katakadarajan : "+script.get(2).getDialogue1());
             writer.write("\n Tintumone : "+script.get(0).getDialogue6()+"\n"+"\n"+"Dundumole : "+script.get(1).getDialogue5()+"\n"+"\n"+"Katakadarajan : "+script.get(2).getDialogue2());
       writer.flush();
       writer.close();
      } 
      catch(IOException e)
      {
        e.printStackTrace();
      }   
         this.readFileSceneDialogue2();
      }
      public void readFileSceneDialogue2()
      {
            try
            {
                  FileReader buffer = new FileReader("D:\\javaworks\\CoreJavaAdvanced\\MovieScript\\src\\com\\lxisoft\\File\\file.txt");
                  Scanner scanner = new Scanner(buffer);
                  while(scanner.hasNextLine())
                  {
                     System.out.print("\n"+scanner.nextLine()+"\n");   
                  } 
                  buffer.close();
            }
            catch (IOException e)
            {
                  e.printStackTrace();
            }
      }

      public void creatFilesSceneDialogue3()
      {
      try
      {
       File file = new File("D:\\javaworks\\CoreJavaAdvanced\\MovieScript\\src\\com\\lxisoft\\File\\file.txt");
       FileWriter writer = new FileWriter(file);
            writer.write("\n Tintumone : "+script.get(0).getDialogue7()+"\n"+"\n"+"Dundumole : "+script.get(1).getDialogue6()+"\n"+"\n"+"Katakadarajan : "+script.get(2).getDialogue3());
       writer.flush();
       writer.close();
      } 
      catch(IOException e)
      {
        e.printStackTrace();
      }
      this.readFileSceneDialogue3();
      }
      public void readFileSceneDialogue3()
      {
            try
            {
                  FileReader buffer = new FileReader("D:\\javaworks\\CoreJavaAdvanced\\MovieScript\\src\\com\\lxisoft\\File\\file.txt");
                  Scanner scanner = new Scanner(buffer);
                  while(scanner.hasNextLine())
                  {
                         System.out.print("\n"+scanner.nextLine()+"\n");
                  } 
                  buffer.close();
            }
            catch (IOException e)
            {
                  e.printStackTrace();
            }
      }
}