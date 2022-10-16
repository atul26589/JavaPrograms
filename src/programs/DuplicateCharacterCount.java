package programs;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacterCount {
	
	public static void characterCount(String InputString) {
		 HashMap<Character,Integer> charcountMap=new HashMap<Character,Integer> ();
		 
		 char[] s=InputString.toCharArray();
		 for(char c:s) {
			 if (charcountMap.containsKey(c)) {
				 charcountMap.put(c, charcountMap.get(c)+1);
			 }else {
				 charcountMap.put(c, 1);
			 }
		 }
		 
		 Set<Character> sc=charcountMap.keySet();
		 System.out.println("Duplicate Characters:" +InputString);
		 for (char ch:sc) {
			 if(charcountMap.get(ch)>1){
				 System.out.println(ch +" : " +charcountMap.get(ch));
				 
			 }
		 }
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		characterCount("Java and J2ee is most widely used technology");
	}

}
