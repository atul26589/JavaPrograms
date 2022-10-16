package prep;

import java.util.Scanner;

public class IsArraySorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter size of the array");
int n=s.nextInt();
int a[]=new int [n];
for (int i=0;i<n;i++) {
	a[i]=s.nextInt();
}
	boolean ans=isSorted(a,n);

	if (ans==true){
		System.out.println("Yes!!Array is sorted");
	}else {
			System.out.println("Array is not sorted");
	}
	
}

		
		
	
	
	public static boolean isSorted(int []a,int n) {
		
		for (int i=1;i<n;i++) {
			if (a[i]<a[i-1]) {
				return false;
			}
		}
		
		return true;
	}

}
