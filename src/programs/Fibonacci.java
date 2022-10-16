package programs;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("Enter Number till Fibonacci Series needs to be printed");
int num=scanner.nextInt();
scanner.close();
int a=1;
int b=1;
int f=0;
System.out.print(a+"  ");
System.out.print(b+"  ");
while(f<=num) {
	f=a+b;
	if(f>num)
		break;
	System.out.print(f+"  ");
	a=b;
	b=f;
	
}

	}

}
