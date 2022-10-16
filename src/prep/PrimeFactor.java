package prep;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
primeFactors(n);
	}
	
public static boolean isPrime(int n) {
	for(int i=2;i<n;i++) {
		if (n%i==0) {
			return false;
		}
		
	}
	return true;
}

public static void primeFactors(int n) {
	
	for (int i=2;i<n;i++) {
		if (isPrime(i)) {
			int x=i;
			while(n%x==0) {
				
				System.out.println(i);
				x=x*i;
			}
		}
	}
}
}
