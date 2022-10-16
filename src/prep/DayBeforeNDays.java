package prep;

import java.util.Scanner;

public class DayBeforeNDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner s=new Scanner(System.in);
		int x=0;
		int ans=0;
		int d=s.nextInt();
		int n=s.nextInt();
		 x=n%7;
	
		 ans=d-x;
		
		if (ans>0) {
			System.out.println(ans);
		}else {
			System.out.println(ans+7);
		}
	}

}
