package patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();

int st=1,sp=n-1;
for (int i=1;i<=n;i++) {
	for(int j=1;j<=sp;j++) {
		System.out.print(" ");
	}
	
	for (int j=1;j<=st;j++) {
		System.out.print("*");
	}
	sp--;
	st++;
	System.out.println();
}
	}

}
