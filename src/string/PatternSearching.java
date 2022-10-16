package string;

import java.util.Scanner;

public class PatternSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.nextLine();
String pat=s.nextLine();

for (int i=0;i<str.length()-pat.length()+1;i++) {
	if (str.substring(i, i+pat.length()).equals(pat)) {
		System.out.println(i+" ");
	}
}
	}

}
