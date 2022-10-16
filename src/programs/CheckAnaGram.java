package programs;

import java.util.Arrays;

public class CheckAnaGram {
	
	public static void isAnagram(String s1,String s2) {
		
		String str1=s1.replaceAll("\\s", "");
		String str2=s2.replaceAll("\\s", "");
		
		boolean status=true;
		
		char c1[]=str1.toLowerCase().toCharArray();
		char c2[]=str2.toLowerCase().toCharArray();
		
		if (c1.length!=c2.length) {
			status =false;
			
		}else {
			Arrays.sort(c1);
			Arrays.sort(c2);
			status=Arrays.equals(c1,c2);
			
		}
		if(status) {
			 System.out.println(s1+" and "+s2+" are anagrams");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
		}
		
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isAnagram("AtuL","tula");
	}

}
