package oop.thema5.hashset;
import java.util.Comparator;

public class NachnameComparator implements Comparator<Person> {
	
	@Override
	public int compare(Person s1, Person s2) {
		return s1.getNachname().compareTo(s2.getNachname());
	}

}
