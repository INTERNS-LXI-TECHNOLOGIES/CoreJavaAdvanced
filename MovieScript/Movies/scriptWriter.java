package com.lxisoft.Movies;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.Serializable;


public  class scriptWriter implements Serializable
{
	public String name;

	 scriptWriter(){
    
    }
    
    scriptWriter(String name){
    
        setName(name);
    }

	//public abstract  void scriptDisplay();
	
	 public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}