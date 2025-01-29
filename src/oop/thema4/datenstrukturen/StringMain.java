package oop.thema4.datenstrukturen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class StringMain {
	public static void main (String[] args) {
//		List<String> meinArray = new ArrayList<>();
//		meinArray.addAll(Arrays.asList("A","B","Z","D","G","E"));
//		Collections.sort(meinArray);
//		System.out.println(meinArray);
		
		Map<String, Integer> meineMap = new HashMap<String, Integer>();
		meineMap.put("Max", 1000);
		meineMap.put("Bob", 125);
		meineMap.put("Oumarou", 300);
		
		System.out.println(meineMap);
		
//		Map<Integer, String> meineMop = new TreeMap<>();
//		meineMop.put("Max", 1000);
//		meineMop.put("Bob", 125);
//		meineMop.put("Oumarou", 300);
//		
		Map<Person, Integer> meineMap2 = new HashMap<Person, Integer>();
//		
//		Person p1 = new Person("Oumarou", "Ousman", "oo@gmail.con", 20);
//		Person p2 = new Person("Bob", "Mann", "bm@yahoo.com", 30);
//		Person p3 = new Person("Max", "Muster", "mm@gmax.com", 15);
//		Person p4 = new Person("Juliane", "Hartmann", "jh@gmail.com", 34);
////		
//		meineMap2.put(p1, 1000);
//		meineMap2.put(p2, 3000);
//		meineMap2.put(p3, 530);
//		meineMap2.put(p4, 2034);
		
		List<Person> people = new ArrayList<>();
		Person p1 = new Person("Bob", "Schmidt");
		Person p2 = new Person("Alice", "Schmidt");
		
		people.add(p1);
		people.add(p2);
		Collections.sort(people);
		
		if(p1.compareTo(p2) <0) {
			System.out.println("P1.Nachname kommt vor P2.Nachname");

		}else {
			System.out.println("P1.Nachname kommt nach P2.Nachname");
		}
		System.out.println(people);
	}
}
