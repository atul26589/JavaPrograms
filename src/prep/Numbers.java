package prep;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner s=new Scanner(System.in);
				System.out.println("Enter Number");
				
				int n=s.nextInt();
				if (n>0) { 
				System.out.println("Positive number");	
				   if(n%2==0)
					   System.out.println("Even Number");
				   else
					   System.out.println("Odd number");
				   
					  
				   }
				else if (n<0) {
					System.out.println("Number is negative");
					  if(n%2==0)
						  System.out.println("Negative Even Number");
					  else
						  System.out.println("Negative odd number");
				}
				else
					System.out.println("number is zero");
				
	}

}
