package prep;

import java.util.Arrays;

public class Anagram {
	
	public static void isAnagram(String s1,String s2) {
		boolean status=true;
		s1=s1.replaceAll("//s","");
		s2=s2.replaceAll("//s","");
		if (s1.length()!=s2.length()) {
			status=false;
		}else {
			char[] ArrayS1=s1.toLowerCase().toCharArray();
			char[] ArrayS2=s2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status=Arrays.equals(ArrayS1, ArrayS2);
		}
		if (status) {
			System.out.println(s1 + " and " + s2 + " are anagrams ");
		}else {
			System.out.println(s1 +  " and " + s2 + " are not anagrams");
		}
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
isAnagram("mother in law","hitler woman");
isAnagram("keep","peek");
	}

}
