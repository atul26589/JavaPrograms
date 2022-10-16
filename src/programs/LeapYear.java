package programs;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Year");
		int year=scanner.nextInt();
		scanner.close();
		boolean IsLeapYear=false;
		if(year%4==0) {
			if(year%100==0) {
				if (year%400==0) {
					IsLeapYear=true;
				}else {
					IsLeapYear=false;
				}
			}else {
				IsLeapYear=true;
			}
		}else {
			IsLeapYear=false;
			
		}
	
if(IsLeapYear==true) {
	System.out.println("Given year is a leap year " +year);
}else {
	System.out.println("Given year is not a leap year" +year);
}
}
}