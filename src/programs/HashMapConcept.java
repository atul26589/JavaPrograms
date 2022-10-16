package programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer,String> map=new HashMap<Integer,String> ();
		map.put(101, "Atul");
		map.put(102, "Anand");
		map.put(103, "Abhi");
		map.put(104, "Gul");
		map.put(105, "Tom");
		System.out.println(map);
		System.out.println(map.get(105));
		map.remove(102);
		map.put(103, "Harry");
		System.out.println(map);
		System.out.println(map.containsKey(102));
		System.out.println(map.containsKey(106));
		System.out.println(map.containsValue("Atul"));
		System.out.println(map.containsValue("Gul"));
		System.out.println(map.isEmpty());
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		System.out.println(map.values());
		
		for (Integer i:map.keySet()){
			System.out.println(i);
		}
		
		for (Object i:map.values()){
			System.out.println(i);
		}
		
		for (Object i:map.keySet()) {
			System.out.println(i+"  "+map.get(i));
		}
		for(Map.Entry entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	Set s=	map.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Map.Entry entry=(Entry) itr.next();
			
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
	}

}
