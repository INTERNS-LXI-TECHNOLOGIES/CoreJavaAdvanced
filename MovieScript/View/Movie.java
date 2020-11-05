package com.lxisoft.View;
import com.lxisoft.Test.TDD;
import com.lxisoft.Control.*;
import com.lxisoft.Modal.*;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import javax.swing.*;
import java.io.*; 
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;  
public class Movie
{
				JFrame f;
				Director director =new Director();
				private int choice=0;

	public void movieDetails()
							{
			Scanner scn=new Scanner(System.in);
		 	f=new JFrame();   
    		JOptionPane.showMessageDialog(f,"Insert the Index No:\n1.Statutary Notice  2.Start the movie  3.Character sketch  4.Actors Info  5.Update Dialogues");  
			choice=scn.nextInt();
			director.scene(choice);
							}
	public void title1()
						{
			String message = "This is a modified scene from the original movie \u001b[33m\033[1mToy Story\033[0m by \u001b[31m\033[1mPIXAR\033[0m.\nThe scene depicts a emotional scene where buzz inorder to rescue,\nhis girlfriend he cuts tie from his own evil brother.\n";
    		director.slowPrint(message, 40);
   						}
	public void title2()
						{
					System.out.println("-----------------------------------------------------------------------------");
					System.out.println("-----------------------------------------------------------------------------");
					System.out.println("-----------------------------------------------------------------------------");
					System.out.println("--------                                                             --------");
					System.out.println("--------                                                             --------");
					System.out.println("--------                                                             --------");
					System.out.println("--------                                                             --------");
					System.out.println("--------         \t  \t  \u001b[33m\033[1mToy Story\033[0m                          --------");
					System.out.println("--------                                                             --------");
					System.out.println("--------                                                             --------");
					System.out.println("--------                                                             --------");
					System.out.println("--------                                                             --------");
					System.out.println("--------                                                             --------");
					System.out.println("-------- \u001b[31m\033[1mDirector-John Lasseter\033[0m                                      --------");
					System.out.println("-------- \u001b[31m\033[1mProducer-PIXAR\033[0m                                              --------");
					System.out.println("-------- \u001b[31m\033[1mCinematographer-Sharon Calahhan\033[0m                             --------");
					System.out.println("--------     		         \u001b[36m\033[1m--Artists--\033[0m                         --------");
					System.out.println("--------                                                             --------");
					System.out.println("--------\u001b[36m\033[1mTom Hanks\033[0m 	\u001b[36m\033[1mJoan Cusack\033[0m 	\u001b[36m\033[1mTim Allen\033[0m    \u001b[36m\033[1mErik Von Detten\033[0m --------");
					System.out.println("--------                                                             --------");
					System.out.println("-----------------------------------------------------------------------------");
					System.out.println("-----------------------------------------------------------------------------");
					System.out.println("-----------------------------------------------------------------------------"+"\n");
			
					System.out.println("----------------------------\u001b[36m\033[1mScene Begins\033[0m-------------------------------------");
					System.out.println("-----------------------------\u001b[36m\033[1mScene One\033[0m---------------------------------------");
					String message1="First Scene:\nJessie has been kidnapped by Sid and took her to a shady hide out,\nwoodie and Buzz travels to Sid's secret hideout\nHere,we see a shady rusty place wherer Sid is about to torture Jessie\n\n";
				        director.slowPrint(message1, 20);
				        System.out.println("* __*****************");
				        System.out.println("*|__|*|***|^^|**|**|*");
				        System.out.println("*|__|*|'|*|^^|**|**|*");

						director.screenPlay();
						director.createFile();

						}
		public void title3()
						{
							System.out.println("\n---------------------------Actors FAQ's---------------------------");
							System.out.println("\u001b[36m\033[1mInsert the index No:\033[0m\n1.Age of Actors\t\t2.Awards Won\t\t3.Fact Check.");
							Scanner scn=new Scanner(System.in);
							choice=scn.nextInt();
							director.cast(choice);
						}
		public void cast1()
						{
							director.mi();
								ArrayList<movieInfo> movieinfo =new ArrayList<movieInfo>();
								int i=0;	
							System.out.println("|-Sl No:-"+"|------Name------|"+"------Age------|");
	 						for (movieInfo movie: movieinfo) 
	 						{
	 							System.out.println("|"+(i+1)+"\t"+" "+"|"+movie.getName()+"\t  |"+"\t "+movie.getAge()+"\t "+" "+"|");
	 							 i++;
	 						}
	 							System.out.println("|-----------------------------------------|");

						}
		public void cast2()
						{
							director.mi();
								ArrayList<movieInfo> movieinfo =new ArrayList<movieInfo>();
								int i=0;
							System.out.println("|-Sl No:-"+"|------Name------|"+"------Awards Won-----|");

	 						for (movieInfo movie: movieinfo) 
							{
	 							System.out.println("|"+(i+1)+"\t"+" "+"|"+movie.getName()+"\t  |"+movie.getawardName()+"   \t"+"|");
	 							i++;

							}
								System.out.println("|-----------------------------------------------|");

						}
		public void cast3()
						{
							director.mi();
								ArrayList<movieInfo> movieinfo =new ArrayList<movieInfo>();
															Scanner scn=new Scanner(System.in);


							System.out.println("\u001b[36m\033[1m------------How well do you know your Actors------------\033[0m\n");
							System.out.println("\u001b[33m\033[1mQn.1.Which year did Tom Hanks started his acting career\033[0m\n");
							System.out.println("a.1977\nb.1989\nc.2003.");
							String choic=scn.next();
							Pattern pattern=Pattern.compile(choic);
							Matcher matcher=pattern.matcher("a");
							boolean a=Pattern.matches("[abc]",choic);

							if (matcher.matches())
							{
								System.out.println("\nRight answer");
							}
							else
							{
								System.out.println("\n\u001b[31m\033[1mWrong answer,1977 is the right answer\033[0m\n");
							}
								System.out.println("\u001b[33m\033[1mQn.2.Which year did Joan Cusack won award for best individual performanc his acting career\033[0m\n");
								System.out.println("a.1997\nb.2003\nc.2000.");

								String choicee=scn.next();

					 			pattern=Pattern.compile(choicee);
					 			matcher=pattern.matcher("c");
								boolean c=Pattern.matches("c",choicee);
								if (c==true)
								{
									System.out.println("\nRight answer");
								}
								else
								{
									System.out.println("\n\u001b[31m\033[1mWrong answer,2000 is the right answer\033[0m\n");
								}
									System.out.println("\u001b[33m\033[1mQn.3.Who acted in the movie The Santa Clause\033[0m\n");
									System.out.println("a.Tom Hanks\nb.Tim Allen\nc.Errick Detten.");
									String choiceee=scn.next();
					 				pattern=Pattern.compile(choiceee);
									matcher=pattern.matcher("[TimAllen&&[^ac]]");
									boolean b=Pattern.matches("[TimAllen&&[^ac]]",choiceee);
								if (b==true)
								{
									System.out.println("\nRight answer");
								}
								else
								{
									System.out.println("\n\u001b[31m\033[1mWrong answer,Tim Allen is the right answer\033[0m\n");

								}

							}

			
	public void dialogue(ArrayList<String> script)
						{
							try{
        							System.out.println("\u001b[35m\033[1mWoodie:\033[0m"+script.get(1));
        							Thread.sleep(950);
        							System.out.println("\u001b[37m\033[1mBuzz  :\033[0m"+script.get(2));
        							Thread.sleep(950);
        							System.out.println("\u001b[33m\033[1mJessie:\033[0m"+script.get(3));
        							Thread.sleep(950);
        			this.villain1();

        							System.out.println("\u001b[31m\033[1mSid   :\033[0m"+script.get(4));
        							Thread.sleep(950);
        							System.out.println("\u001b[35m\033[1mWoodie:\033[0m"+script.get(5));
        							Thread.sleep(950);
        							System.out.println("\u001b[31m\033[1mSid   :\033[0m"+script.get(6));
        							Thread.sleep(950);
        							System.out.println("\u001b[33m\033[1mJessie:\033[0m"+script.get(7));
        							Thread.sleep(950);
        							System.out.println("\u001b[31m\033[1mSid   :\033[0m"+script.get(8));
       								Thread.sleep(950);
        			this.villain2();

        							System.out.println("\u001b[31m\033[1mSid   :\033[0m"+script.get(9));
        							Thread.sleep(950);
        							System.out.println("\u001b[33m\033[1mJessie:\033[0m"+script.get(10));
        							Thread.sleep(950);
        							System.out.println("\u001b[35m\033[1mWoodie:\033[0m"+script.get(11));
        							Thread.sleep(950);
        							System.out.println("\u001b[37m\033[1mBuzz  :\033[0m"+script.get(12));
        							Thread.sleep(950);
        							System.out.println("\u001b[33m\033[1mJessie:\033[0m"+script.get(13));
        							Thread.sleep(950);
        							System.out.println("\u001b[31m\033[1mSid   :\033[0m"+script.get(14));
        							Thread.sleep(950);
        							System.out.println("\u001b[35m\033[1mWoodie:\033[0m"+script.get(15));
       								 Thread.sleep(950);
       								 System.out.println("\u001b[37m\033[1mBuzz  :\033[0m"+script.get(16));
        							Thread.sleep(950);
        							System.out.println("\u001b[37m\033[1mBuzz  :\033[0m"+script.get(17));
        							Thread.sleep(950);
        			this.villain3();

        							System.out.println("\u001b[31m\033[1mSid   :\033[0m"+script.get(18));
        							Thread.sleep(950);
        							System.out.println("\u001b[31m\033[1mSid   :\033[0m"+script.get(19));
        							Thread.sleep(950);
        							System.out.println("\u001b[37m\033[1mBuzz  :\033[0m"+script.get(20));
        							Thread.sleep(950);
        			this.villain4();

        							System.out.println("\u001b[35m\033[1mWoodie:\033[0m"+script.get(21));
        							Thread.sleep(950);
        							System.out.println("\u001b[33m\033[1mJessie:\033[0m"+script.get(22));
        							Thread.sleep(950);
        							System.out.println("\u001b[37m\033[1mBuzz  :\033[0m"+script.get(23));
        							Thread.sleep(950);
        							System.out.println("\u001b[37m\033[1mBuzz  :\033[0m"+script.get(24));
        							Thread.sleep(950);
        							System.out.println("\u001b[33m\033[1mJessie:\033[0m"+script.get(25));
        							Thread.sleep(950);

        			this.villain5();
    							}
    							catch (InterruptedException e)
            												{
                												e.printStackTrace();
            												}
            			}
					public void villain1()
										{
										String message3="\t  \u001b[31m\033[1mThe Villain Enters.\033[0m\n";
										director.slowPrint(message3, 40);
										}
					public void villain2()
										{
										String message4="\t  \u001b[31m\033[1mSid is trying to manipulate his brothers mind.\033[0m\n";
										director.slowPrint(message4, 40);
										}
					public void villain3()
										{
										String message5="\t  \u001b[31m\033[1mSid is loosing all hope.\033[0m\n";
										director.slowPrint(message5, 40);
										}	
					public void villain4()
										{
										System.out.println("-----------------------------\u001b[36m\033[1mScene Two\033[0m---------------------------------------");
										String message6="Second Scene:\nIn this scene we see Sid dead and Buzz weeps\nThen they both unties Jessie and unites.\n\n";
				        				director.slowPrint(message6, 40);
										}
					public void villain5()
										{
										System.out.println("-----------------------------\u001b[36m\033[1mEnd\033[0m---------------------------------------");
										String message7="Final Scene:\nHere,woodie buzz and jessie heads towrds their home,\nBuzz is a little sad over his brother,but he now has a family to cheer him up\nJessie now knows no matter wat her friends are always there for her.\n";
				        				director.slowPrint(message7, 40);
										}
		}
