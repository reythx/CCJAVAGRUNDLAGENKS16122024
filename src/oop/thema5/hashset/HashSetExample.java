package oop.thema5.hashset;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> fruits = new HashSet<>();

		fruits.add("Apfel");
		fruits.add("Birne");
		fruits.add("Kirsche");
		fruits.add("Banane");
		fruits.add("Apfel");	//Duplikate werden ignoriert

		System.out.println("Früchte: " + fruits);

		if (fruits.contains("Banane")) {
			System.out.println("Banane ist in der Menge enthalten");
		}

		fruits.remove("Apfel");

		System.out.println("Früchte nach Entfernung: " + fruits);
	}
}
