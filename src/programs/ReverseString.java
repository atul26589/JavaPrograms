package programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String org, rev="";
Scanner in=new Scanner(System.in);
System.out.println("Enter a String to reverse");
org=in.nextLine();

int length=org.length();
for(int i=length-1;i>=0;i--) {
	rev=rev+org.charAt(i);
}

System.out.println("Reverse of entered String:"+rev);
	}

}
