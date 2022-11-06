package assignments;

public class marks
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int s1=70,s2=80,s3=50;
		if(s1>60 && s2>60 && s3>60)
			System.out.println("passed");
		else if(s1>60 && s2>60 || s2>60 && s3>60 || s3>60 &&s1>60)
			System.out.println("promoted");
		else if(s1>60 || s2>60 || s3>60 || (s1<60 && s2<60 && s3<60))
		System.out.println("failed");
	}
}
