package prep;

import java.util.Scanner;

public class FirstDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(firstDigit(n));
	}

	public static int firstDigit(int n) {
		double power=Math.log10(n);
		int p=(int)power;
		int a =(int) Math.pow(10,p);
		int ans =n/a;
		return ans;
	}
}
