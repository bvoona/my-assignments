package assignments;

public class interest
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double p,t,r,si,ci;
		p=5000;
		t=3;
		r=5;
		si =(p*t*r)/100;
		System.out.println("Simple Interest is"+si);
		ci= (p*(Math.pow((1.0+(r/100.0)),t)))-p;
		 System.out.println("Compound Interest is"+ci);
	 	   }
	}
