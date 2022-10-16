package programs;

import java.util.HashMap;
import java.util.Map;

public class EachCharCountInString {
	
	public static void characterCount(String InputString) {
		
		Map<Character,Integer> charcountmap=new HashMap<Character,Integer>();
		
		char [] ch=InputString.toCharArray();
		for (char c:ch) {
			if (charcountmap.containsKey(c)) {
				charcountmap.put(c, charcountmap.get(c)+1);
			} else {
				charcountmap.put(c,1);
			}
			
		}
		System.out.println(InputString +" : "+charcountmap );
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		characterCount("Target is March");
		characterCount("Only Happiness Matters");
	}

}
