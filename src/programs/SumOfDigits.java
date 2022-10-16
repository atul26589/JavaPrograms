package programs;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int number=sc.nextInt();
		sc.close();
		int sum=0;
		if (number<0) {
			System.out.println("This is a Negative number");
			System.exit(0);
		
		}
		if (number<10) {
			System.out.println("Sum Of Digits="+number);
			System.exit(0);
		
		}
		while(number!=0) {
			
			int remainder=number%10;
			sum =sum+remainder;
			number=number/10;
		}
		
		System.out.println("Sum Of Digits="+sum);
	}
	

}
