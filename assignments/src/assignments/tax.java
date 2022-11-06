package assignments;
import java.util.Scanner;
public class tax 
{
	public static void main(String[] args)
	{ 
		int ctc;
		double tax;
		Scanner s = new Scanner(System.in);
		System.out.println("enter CTC");
		ctc=s.nextInt();
		if (ctc>0 && ctc <=180000)
			{
			System.out.println("Tax Payable is nil");
			}
			else if(ctc>=181001 &&  ctc<=300000)
			{
				tax=(ctc*10)/100;	
				System.out.println("tax is:"+tax);
			}
				else if(ctc>=300001 &&  ctc<=500000)
				{
					tax=(ctc*20)/100;	
						System.out.println("tax is:"+tax);
				}
						else if(ctc>=500001 &&  ctc<=1000000)
						{
							tax=(ctc*30)/100;	
								System.out.println("tax is:"+tax);
						}
									
	}
}
