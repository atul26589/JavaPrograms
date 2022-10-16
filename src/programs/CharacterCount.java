package programs;

import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter String");
String str=sc.nextLine();
char ca[]=str.toCharArray();
int space=0;
int digit=0;
int letter=0;
int other=0;
for (Character c:ca ) {
	if(Character.isDigit(c)) {
		digit++;
	}else if (Character.isLetter(c)) {
		letter++;
	}else if(Character.isSpace(c)) {
		space++;
} 
else {
	other++;
}
}
System.out.println("digit count:" +digit);
System.out.println("letter count:" +letter);
System.out.println("space count:" +space);
System.out.println("other count" +other);
sc.close();
	}

}
