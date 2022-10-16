package programs;

import java.util.Scanner;

public class PallindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter String");
String str=sc.nextLine();
sc.close();
char c[]=str.toCharArray();
int len=c.length;
String revString="";
for(int i=len-1;i>=0;i--) {
	revString=revString+c[i];
}
if (str.equals(revString)) {
	System.out.println("Pallindrome string");
}else {
	System.out.println("Not a Pallindrome String");
}
	}

}
