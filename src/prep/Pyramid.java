package prep;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,k,n;
Scanner s=new Scanner(System.in);
System.out.println("Enter no of lines to be printed");
n=s.nextInt();

i=1;
while(i<=n) {
	j=1;
	while(j<(n-i)) {
		
		System.out.print(" ");
		j++;
	}
	k=1;
	while(k<=(2*i)-1) {
		System.out.print("*");
		k++;
		
	}
	i++;
	System.out.println();
}
	}

}
