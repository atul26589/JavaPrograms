package collection;

import java.util.*;

public class ArrayListConcept {
	public static void main(String[] args) {

		// ArrayList<String> al=new ArrayList<String> ();

		ArrayList al = new ArrayList();

		al.add("Atul");
		al.add(678012);
		al.add(true);
		al.add(15.56);
		al.add("Python");
		System.out.println(al.size());
		System.out.println(al);
		al.add(3, "CSharp");
		System.out.println(al.size());
		System.out.println(al);
		al.remove(1);
		al.remove("Python");
		System.out.println(al.size());
		System.out.println(al);
		System.out.println(al.get(2));
		al.set(3, "Increment");
		System.out.println(al.size());
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.contains("Atul"));

		/*
		 * for (int i=0;i<al.size();i++) { System.out.println(al.get(i)); } for (Object
		 * e:al) { System.out.println(e); }
		 */

		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
Collections.shuffle(al);
System.out.println(al);
	}
}
