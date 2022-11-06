
public class Assignment3 {
//	public static void main(String[] args) {
//		int input=4000;
//		int ret=withdraw(input);
//		System.out.println(ret);
//	}

    public static int withdraw(int amount)
    {
        int balance = 5000;


        if (amount > balance)
        {
            throw new NotSufficientFundException(String.format("current balance is less than required"));

        }
        return balance;
    }
}
class NotSufficientFundException extends RuntimeException{
    String message;
    public NotSufficientFundException(String message)
    {
        this.message=message;

    }
    public String getMessage()
    {
        return message;
    }
}