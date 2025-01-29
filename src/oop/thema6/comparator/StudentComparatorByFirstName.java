package oop.thema6.comparator;
import java.util.Comparator;

public class StudentComparatorByFirstName implements Comparator<Student> {
	
	@Override
	public int compare(Student s1, Student s2) {
		return s1.getVorname().compareTo(s2.getVorname());
	}
}
