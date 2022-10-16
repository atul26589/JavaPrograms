package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList l=new LinkedList();

l.add("Atul");
l.add(26589);
l.add(19.89);
l.add("java");
l.add("email");
System.out.println(l.size());
l.remove(2);
l.remove("email");
System.out.println(l.size());
System.out.println(l);
l.add(3, "atul.anand");
l.add(4, "email");
l.add(5, 898);
l.set(4,"QA");
l.add("gmail");
System.out.println(l.get(5));
System.out.println(l);

	
	
	for(Object e:l) {
		System.out.println(e);
	}
	for (int i=0;i<l.size();i++) {
		System.out.println(l.get(i));
	}
Iterator itr=l.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
LinkedList ll=new LinkedList();
ll.addAll(l);
System.out.println(ll);
ll.removeAll(l);
System.out.println(ll);
}
}