package array;

import java.util.Scanner;

public class CountDistinctDigitInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
for (int i=0;i<arr.length;i++) {
	arr[i]=s.nextInt();
}

System.out.println(countDigits(arr,n));
	}
	
	public static int countDigits(int arr[],int n) {
		int count =0;
		boolean isDistint=true;
		
		for (int i=0;i<n;i++) {
			for (int j=(i-1);j>=0;j--) {
				if(arr[i]==arr[j]) {
					isDistint=false;
					break;
				}
				if (isDistint==true) {
					count++;
				}
			}
		}
return count;
}
}
