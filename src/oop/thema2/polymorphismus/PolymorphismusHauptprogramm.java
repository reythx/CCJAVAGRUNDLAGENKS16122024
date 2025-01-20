package oop.thema2.polymorphismus;

public class PolymorphismusHauptprogramm {
	public static void main(String[] args) {
		Fahrzeug fahrzeug = new Fahrzeug(); // new => adresse wird reserviert für ein objekt, variable zeigt also auf
											// objekt vom typ fahrzeug
		fahrzeug.starte();

		fahrzeug = new Auto(); // jetzt zeigt die gleiche variable fahrzeug auf ein anderes objekt, also auf
								// einen anderen platz im speicher
		fahrzeug.starte();
		((Auto) fahrzeug).klimaanlageEinschalten(); // Downcasting: fahrzeug hat zu kompilierungszeit typ Fahrzeug,
													// kompiler prüft
													// methoden auf Basis von statischem typ, also Fahrzeug -->
													// klimaEinschalten nicht möglich
													// (Auto)fahrzeug -> fahrzeug ist zur Luafzeig explizit vom typ
													// Auto, daher Auto-Methoden möglich
													// Cast überprüft zur Laufzeit, ob fahrzeug ein Objekt von Auto ist,
													// falls nicht --> ClassCastException

		// Der Cast (Auto) ist nötig, damit der Compiler erkennt, dass fahrzeug zur
		// Laufzeit ein Objekt der Klasse Auto ist.
		// Ohne den Cast kann der Compiler nicht wissen, dass die Methode
		// klimaanlageEinschalten() aufgerufen werden darf,
		// weil sie nicht im Typ Fahrzeug definiert ist.
		fahrzeug = new Motorrad();
		// ((Auto)fahrzeug).klimaanlageEinschalten();	//mit variable fahrzeug (nun vom typ Motorrad) kann keine klimaAnlage eingeschaltet werden
		if(fahrzeug instanceof Auto) {
			Auto auto = (Auto) fahrzeug;
			auto.klimaanlageEinschalten();
		}else {
			System.err.println("Das Fahrzeug ist kein Auto");
		}
	}
}