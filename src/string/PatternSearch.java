package string;

import java.util.Scanner;

public class PatternSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String txt=s.nextLine();
String pat=s.nextLine();

System.out.println(patternSearch(txt,pat));
	}
	public static int patternSearch(String txt,String pat) {
int pos=txt.indexOf(pat);
	while(pos>=0) 
	{
		System.out.print(pos+ " ");
		pos=txt.indexOf(pat,pos+1);
		
		
	}
	
	return pos;
}
}