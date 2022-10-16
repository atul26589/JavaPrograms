package programs;

import java.util.Scanner;

public class RemoveSpaceFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String inputString=sc.nextLine();
		
		char c[]=inputString.toCharArray();
		String stringWithoutSpaces="";
		for (int i=0;i<c.length;i++) {
			if((c[i]!=' ')&&(c[i]!='\t')) {
				stringWithoutSpaces=stringWithoutSpaces+c[i];
			}
		}
System.out.println("Original String:"+inputString);
System.out.println("String without whitespaces:" +stringWithoutSpaces);
sc.close();
	}

}
//String input=s1.replaceAll("\\s+", "");