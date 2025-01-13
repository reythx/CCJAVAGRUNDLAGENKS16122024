package oop.thema1.grundlagen;

public class Hund {
	String name;
	String rasse;
	int alter;
	String farbe;
	String geschlecht;

	// Default-Konstruktor, gleicher name wie die Klasse!	Sollte public sein (Für Lesbarkeit, ansonsten wird automatisch mit public initialisiert)
	public Hund() {
		this.name = "Unbekannt";
		this.rasse = "Straßenhund";
		this.alter = 1;
	}
	//Konstruktor mit einem String
	public Hund(String name){
		super(); 	//Aufruf vom Deafault-Konstruktors
		this.name = name;
	}
	
	public void bellen() {
		System.out.println(name + ": wuff");
	}
	
	public void familienstand() {
		if (alter > 1) {
			System.out.println("verheiratet");
		}else {
			System.out.println("Ich bin noch ein lediges Puppy");
		}
	}
	
	public void fressen() {
		System.out.println(name + ": NomNomNom");
	}
}
