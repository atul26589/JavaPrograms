package prep;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to be checked");
		n=sc.nextInt();
		int i=2;
		
		while(i<n) {
			if(n%i==0) {
				System.out.println("Not Prime");
				return;
			}
			i++;
		}
		System.out.println( n + " is Prime Number");
		sc.close();
	}

}
