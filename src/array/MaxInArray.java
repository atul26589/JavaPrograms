package array;

import java.util.Scanner;

public class MaxInArray {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(maximum(arr));
		
	}
	
	public static int maximum(int[] arr) {
		int max=Integer.MIN_VALUE;
		for (int i=0;i<arr.length;i++) {
			if (max<arr[i]) {
				max=arr[i];
			}
			
		}
		return max;
	}

}
