package string;

import java.util.Arrays;
import java.util.Scanner;

public class ExtraCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String s2=s.nextLine();

System.out.println(findExtra(s1,s2));
	}
	
	public static char findExtra(String s1,String s2) {
		char a1[]=s1.toCharArray();
		Arrays.sort(a1);
		
		char a2[]=s2.toCharArray();
		Arrays.sort(a2);
		
		int n=s1.length();
		for(int i=0;i<n;i++) {
			if(a1[i]!=a2[i]) {
				return a2[i];
				
			}
			
		}
		return a2[n];
	}

}
