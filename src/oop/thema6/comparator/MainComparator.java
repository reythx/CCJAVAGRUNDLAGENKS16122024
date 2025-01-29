package oop.thema6.comparator;

import java.util.HashMap;
import java.util.TreeMap;

public class MainComparator {

	public static void main(String[] args) {

//		HashMap<Integer, String> map = new HashMap<>();
//		map.put(1, "Alice");
//		map.put(2, "Oliver");
//		map.put(3, "Georg");
//		System.out.println("HashMap: " + map);
//		System.out.println("Value for key '2': " + map.get(1));
//
//		TreeMap<String, Integer> mop = new TreeMap<>();
//		mop.put("Alice", 30);
//		mop.put("Kevin", 25);
//		mop.put("Ol", 55);
//		System.out.println("Value for Key 'Ol': " + mop.get("Ol"));
//		System.out.println("Natürliche Reihenfolge: " + mop.keySet());
//		for (Integer key : map.keySet()) {
//			System.out.println(key + " ->" + map.get(key));
//		}

		// Erstellen einer TreeMap mit einem Comparator für die E-Mail-Adressen
		// (Schlüssel)
		TreeMap<Student, String> studentMap = new TreeMap<>(new StudentComparatorByEmail());

		studentMap.put(new Student("Alice", "Weidel", 23, "xWei@gmail.com"), "Mathematik");
		studentMap.put(new Student("Bobby", "Ganja", 27, "gab@gmail.com"), "Biologie");
		studentMap.put(new Student("Kevin", "Schmidt", 28, "voliboom@gmail.com"), "Informatik");

		// Ausgabe nach E-Mail sortiert
		System.out.println("TreeMap mit Comparable (Sortierung nach E-Mail-Adressen): ");
		for (Student student : studentMap.keySet()) {
			System.out.println(student + "Email: " + student.getEmail());
		}

		// Erstellen neuer TreeMap für Name(Schlüssel)
		TreeMap<Student, String> studentAge = new TreeMap<>(new StudentComparatorByAge());

		studentAge.put(new Student("Alice", "Weidel", 23, "xWei@gmail.com"), "Mathematik");
		studentAge.put(new Student("Bobby", "Ganja", 27, "gab@gmail.com"), "Biologie");
		studentAge.put(new Student("Kevin", "Schmidt", 28, "voliboom@gmail.com"), "Informatik");

		System.out.println("TreeMap mit Comparable (Sortierung nach Alter): ");
		for (Student student : studentAge.keySet()) {
//			System.out.println(student.getVorname() + " " + student.getName() + " -> Studiengang: "
//					+ studentMap.get(student) + ", E-Mail: " + student.getEmail());
			System.out.println(student);
		}

		TreeMap<Student, String> studentSurname = new TreeMap<>(new StudentComparatorByName());

		studentSurname.put(new Student("Alice", "Weidel", 23, "xWei@gmail.com"), "Mathematik");
		studentSurname.put(new Student("Bobby", "Ganja", 27, "gab@gmail.com"), "Biologie");
		studentSurname.put(new Student("Kevin", "Schmidt", 28, "voliboom@gmail.com"), "Informatik");

		System.out.println("TreeMap mit Comparable (Sortierung nach Nachnamen): ");
		for (Student key : studentSurname.keySet()) {
			System.out.println(key);
		}
		
		TreeMap<Student, String> studentName = new TreeMap<>(new StudentComparatorByFirstName());

		studentName.put(new Student("Alice", "Weidel", 23, "xWei@gmail.com"), "Mathematik");
		studentName.put(new Student("Bobby", "Ganja", 27, "gab@gmail.com"), "Biologie");
		studentName.put(new Student("Kevin", "Schmidt", 28, "voliboom@gmail.com"), "Informatik");

		System.out.println("TreeMap mit Comparable (Sortierung nach Vorname): ");
		for (Student key : studentName.keySet()) {
			System.out.println(key.getVorname());
		}
	}
}
