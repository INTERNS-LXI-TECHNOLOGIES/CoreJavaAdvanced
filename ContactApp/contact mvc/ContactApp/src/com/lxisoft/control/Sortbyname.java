package com.lxisoft.control;
import java.util.*;
import com.lxisoft.model.*;

public class Sortbyname implements Comparator<Contact>
{
	public int compare(Contact c1, Contact c2) {
		
		return c1.getFirstname().compareTo(c2.getFirstname());
	}


}