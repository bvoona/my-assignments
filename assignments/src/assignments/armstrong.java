package assignments;

public class armstrong
{

	public static void main(String[] args) 
	{
       int num,sum=0,rem,temp=0;
       for(num=100;num<=999;num++) 
       {
      temp=num;
       while(num>0)
       {
    	   rem=num%10;
    	   sum = sum + (rem*rem*rem);
    	   num=num/10;
       }
       if(temp==sum)
       System.out.println("armstrong number:"+sum);
      }
}
}

