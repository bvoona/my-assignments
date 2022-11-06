package com.Collections;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
class DOB
{
	int year;
	int month;
	int date;
	DOB(int year,int month,int date)
	{
		this.year = year;
		this.month=month;
		this.date=date;
	}
	public String toString()
	{
		return "DOB{"+
				"year=" + year +
				", month=" + month +
				", date=" + date +
				'}';
	}
}
public class LinkedListObject 
{
public static void main(String[] args)
{
	DOB b1=new DOB(2002,01,13);
	DOB b2=new DOB(2004,10, 28);
	DOB b3=new DOB(2008,12, 24);
	DOB b4=new DOB(2012,11, 8);
	LinkedList<DOB> l1 = new LinkedList();
	l1.add(b1);
	l1.add(b2);
	l1.add(b3);
	l1.add(b4);
	System.out.println(l1);
	Iterator<DOB> itr= l1.iterator();
	{
		while(itr.hasNext())
		{
			int i=itr.next().year;
			if(i%4==0)
			{
				System.out.println("your date of birth is "+i+"is a leap year");				
			}
			else 
			{
				System.out.println("your date of birth is "+i+" not a leap year");
				
			}
		}
	}
}
}
