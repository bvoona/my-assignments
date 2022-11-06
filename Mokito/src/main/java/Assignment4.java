
public class Assignment4 {
	public static void main(String[] args) {
		int a=5,b=10;
		int r=sum(a,b);
		System.out.println(r);
		int q=multiply(a,b);
		System.out.println(q);
	}

    public static int sum(int a, int b)
    {
        return a+b;

    }
    public static int multiply(int a, int b)
    {
        return a*b;
    }
}