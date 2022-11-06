package StringAssignments;

public class StringCommands
{
   public static void main(String[] args)
	{	
		String str="Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.println("String in lower case :"+str);
		String str1=str.toLowerCase();
		System.out.println("String in lower case :"+str1);
		String str2=str.toUpperCase();
		System.out.println("String in upper case :"+str2);
		String str3=str.replace('a','$');
		System.out.println("replaced string is :"+str3);
		if(str.contains("collection"))
		{
		System.out.println("found collection in the string");
	}
		else
		{System.out.println("word collections not found");
		}
		}
}

