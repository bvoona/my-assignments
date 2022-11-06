package assignments;
import java.util.Scanner;
public class cui
{
	public static void main(String[] args)
	{
		int count=0,i;
		String un,password;
	Scanner s = new Scanner(System.in);
	for(i=1;i>3;i++)
	{
	System.out.println("enter user-id");
	un=s.nextLine();
	System.out.println("enter password");
	password=s.nextLine();
	if(un=="bhagya"&& password=="bvoona")
		System.out.println("welcome");
	count=count+1;
	}
	if (count>3)
		System.out.println("contact admin");
}
}
