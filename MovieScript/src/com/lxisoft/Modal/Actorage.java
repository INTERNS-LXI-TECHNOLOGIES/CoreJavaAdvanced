package com.lxisoft.Modal;

import com.lxisoft.View.*;
import com.lxisoft.Control.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.io.*; 
import java.util.*; 

public class Actorage implements Comparator<movieInfo>
{
 public int compare(movieInfo m1,movieInfo m2)
 {

            return m1.getawardName().compareTo(m2.getawardName()); 

    }
}