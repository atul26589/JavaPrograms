package programs;

import java.util.Scanner;

public class IsVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter Alphabet");
char c=sc.next().charAt(0);
boolean Isvowel=false;
switch(c) {

case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
case 'A':
case 'E':
case 'I':
case 'O':
case 'U':Isvowel=true;

}
	if(Isvowel==true) {
		System.out.println(c+" is a vowel");
	}else {
		System.out.println(c+" is not a vowel");
		
	}
sc.close();

	}

}
