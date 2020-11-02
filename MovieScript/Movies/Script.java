package com.lxisoft.Movies;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.Serializable;


public  class Script implements Serializable
{
	public String name;

	 Script(){
    
    }
    
    Script(String name){
    
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