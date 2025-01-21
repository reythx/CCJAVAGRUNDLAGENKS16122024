package aufgabenChatGPT.fahrzeugsystem;

public class Auto extends Fahrzeug implements Umweltfreundlich {

	public Auto(String marke, int baujahr, double geschwindigkeit) {
		super(marke, baujahr, geschwindigkeit);
	}

	int anzahlSitze;

	public int getAnzahlSitze() {
		return anzahlSitze;
	}

	public void setAnzahlSitze(int anzahlSitze) {
		this.anzahlSitze = anzahlSitze;
	}

	public String getKraftstoffTyp() {
		return kraftstoffTyp;
	}

	public void setKraftstoffTyp(String kraftstoffTyp) {
		if (kraftstoffTyp == null || kraftstoffTyp.isEmpty()) {
			throw new IllegalArgumentException("Kraftstofftyp darf nicht null oder leer sein.");
		}
		this.kraftstoffTyp = kraftstoffTyp;

	}

	String kraftstoffTyp;

	@Override
	void berechneSteuer() {
		if (emissionsKlasse().equals("Zero Emission")) {
			System.out.println("Steuern sind: 0€");
		} else if (emissionsKlasse().equals("Euro 6")) {
			System.out.println("Steuern sind: 5€");
		} else if (emissionsKlasse().equals("Euro 5")) {
			System.out.println("Steuern sind: 10€");
		} else if (emissionsKlasse().equals("Euro 4")) {
			System.out.println("Steuern sind: 15€");
		} else if (emissionsKlasse().equals("Euro 2")) {
			System.out.println("Steuern sind: 25€");
		} else
			System.out.println("Ungültige Eingabe, Steuern können nicht berechnet werden");
	}

	@Override
	public String emissionsKlasse() {
		if (kraftstoffTyp.equals("Elektro")) {
			return "Zero Emission";
		} else if (kraftstoffTyp.equals("Diesel") && baujahr < 2008) {
			return "Euro 2";
		} else if (kraftstoffTyp.equals("Diesel") && baujahr >= 2008) {
			return "Euro 5";
		} else if (kraftstoffTyp.equals("Benzin") && baujahr < 2008) {
			return "Euro 4";
		} else if (kraftstoffTyp.equals("Benzin") && baujahr >= 2008) {
			return "Euro 6";
		} else
			return "Ungültige Eingabe, Emissionsklasse kann nicht berechnet werden";
	}

	@Override
	public void ladebatterie() {
		System.out.println("Batterie wird geladen...");
	}

}
