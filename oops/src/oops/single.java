package oops;

public class single {	
	    static single st=new single();
	    private single()
	    {
	        System.out.println("this is singleton class");
	    }
	    static single getInstance()
	    {
	        return st;

	    }
	}
	class Test
	{
	    public static void main(String args[])
	    {
	        single st1=single.getInstance();
	        single st2=single.getInstance();
	        System.out.println(st1);
	        System.out.println(st2);
	    }
	}
