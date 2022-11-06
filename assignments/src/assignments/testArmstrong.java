package assignments;

import java.util.Scanner;

public class testArmstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int num = testArm(input);
		if(input==num) {
			System.out.println("it is an armstrong number "+ input);
		}else {
			System.out.println("not an armstrong num");
		}
	}

	private static int testArm(int input) {
		int sum = 0;
		while(input>0) {
			int rem = input%10; //153 3 5
			int quo = input/10; //1
			int cubeOfNum =cube(rem);
			sum = sum+cubeOfNum;
			input = quo;
		}
		return sum;
		
	}

	private static int cube(int rem) {
		return rem*rem*rem;
		
	}

}
