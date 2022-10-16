package string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String s2=s.nextLine();

System.out.println(areAnagram(s1,s2));
	}


public static boolean areAnagram(String s1,String s2) {
	if(s1.length()!=s2.length())
		return false;
	
	char a1[]=s1.toCharArray();
	Arrays.sort(a1);
	s1=new String(a1);
	char a2[]=s2.toCharArray();
	Arrays.sort(a2);
	s2=new String(a2);
	return s1.equals(s2);
}
}