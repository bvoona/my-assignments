package StringAssignments;
//import java.lang.String;
public class StringDemo 
{
	public static void main(String[] args)
	{
	String str1="Bhagya";
	String str2="Bhagya";
	if(str1 == str2)
	{
		System.out.println("str1==str2");
	}
	else 
	{
		System.out.println("str1!=str2");
	}
	
	String str3=new String("Bhagya");
	String str4=new String("Bhagya");
	if(str3 == str4)
	{
		System.out.println("str3==str4");
	}
	else 
	{
		System.out.println("str3!=str4");
	}
	
       if(str3.equals(str4))
       {
    	   System.out.println("str3==str4");
       }
       else
       {
    	 System.out.println("str3!=str4");
        }
    } 
  }

