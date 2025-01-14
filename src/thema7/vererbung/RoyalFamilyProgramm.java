package thema7.vererbung;

public class RoyalFamilyProgramm {

	public static void main(String[] args) {
		// Object von Prince George erstellen
		PrinceGeorge george = new PrinceGeorge();
		// methoden aufrufen
		george.displayInfo();
		// von superklasse
		george.displayResponsibilities();
		// von sub elizabeth
		george.displayFullname();
		// von sub prince charles
		george.displayGeneration();
		// von sub william
		george.displayAutos();

	}

}
