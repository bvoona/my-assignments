package com.generics;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Employe {
	
static void displayDetails()
{       
	    Set<Integer> set1 = new HashSet<Integer>();

		set1.add(101);
        set1.add(102);
        set1.add(103);
        
        Set<String> set2 = new HashSet<String>();
        set2.add("Bhagya");
        set2.add("Karthik");
        set2.add("siri");
        
        Set<Double> set3 = new HashSet<Double>();
        set3.add(1000.00);
        set3.add(2000.00);
        set3.add(3000.00);
        
        Set<String> set4 = new HashSet<String>();
        set4.add("ElectronicsDept");
        set4.add("StatDept");
        set4.add("Physics-Dept");


       for (Integer a : set1) 
       {
            System.out.printf("Id  :%d\n", a);
       }
       Iterator<String> b = set2.iterator();
       
       while (b.hasNext())
       {
           System.out.printf("Name :%s\n", b.next());
       }
       for(Double c : set3 )
       {
    	   System.out.printf("Salary :%f\n",c);
       }
       Iterator<String> d = set4.iterator();
       while(d.hasNext()) 
       {
    	   System.out.printf("Department :%s\n",d.next());
       }
       
       
       
       
       
}

public static void main(String[] args)
{
 displayDetails();	
}
}
 

