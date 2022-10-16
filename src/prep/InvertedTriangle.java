package prep;

import java.util.Scanner;

public class InvertedTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
		Scanner s=new Scanner(System.in);
System.out.println("Enter no of rows to be printed");
int n=s.nextInt();
i=1;
while(i<=n) {
	j=1;
	while(j<=(n-i)) {
		System.out.print(" ");
		j++;
	}
	while(j<=n) {
		System.out.print("*");
		j++;
		
	}
	i++;
	System.out.println();
}

	}

}
