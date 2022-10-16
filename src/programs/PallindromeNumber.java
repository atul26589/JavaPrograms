package programs;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int num=sc.nextInt();
int temp=num;
sc.close();
int revnum=0;
while(num>0) {
	int rem=num%10;
	
	revnum=(revnum*10)+rem;
	num=num/10;
}
if (temp==revnum) {
	System.out.println("Pallindrome number");
}else {
	System.out.println("number is not Pallindrome");
}
	}

}
