package oop.thema5.hashset;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		
		Person p1 = new Person("Oumarou", "Ousman", "oo@gmail.con", 20);
		Person p2 = new Person("Bob", "Mann", "bm@yahoo.com", 30);
		Person p3 = new Person("Max", "Muster", "mm@gmax.com", 15);
		Person p4 = new Person("Juliane", "Hartmann", "jh@gmail.com", 34);
		people.add(p1);
		people.add(p2);
		people.add(p4);
		people.add(p3);
		
		
		Collections.sort(people, new NachnameComparator());
		System.out.println(people);
		Collections.sort(people, new VornameComparator());
		System.out.println(people);
	}
}
