package oop.thema5.hashset;

import java.util.Comparator;

public class VornameComparator implements Comparator<Person> {

	public int compare(Person s1, Person s2) {
		return s1.getVorname().compareTo(s2.getVorname());
	}
}
