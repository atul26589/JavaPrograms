package programs;

import java.util.ArrayList;

public class ArrayListConcept {
	
	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList(20);
		System.out.println(ar.size());
		ar.add(10);
		System.out.println(ar.size());
		ar.add(30);
		ar.add(40);
		ar.add(50);
		ar.add(60);
		
		System.out.println(ar.size());
		ar.add(30);
		ar.add(40);
		ar.add(50);
		ar.add(60);
		ar.add(30);
		
	}

}
