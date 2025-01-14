package banksystem;

public class Bankkonto {
	protected String kontonummer;
	protected double kontostand;
	protected Kunde kundeninhaber;

	public String getKontonummer() {
		return kontonummer;
	}

	protected void setKontonummer(String kontonummer) {
		this.kontonummer = kontonummer;
	}

	public double getKontostand() {
		return kontostand;
	}

	protected void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}

	public Kunde getKundeninhaber() {
		return kundeninhaber;
	}

	public void setKundeninhaber(Kunde kundeninhaber) {
		this.kundeninhaber = kundeninhaber;
	}

	Bankkonto() {

		this.kontostand = 0;
		this.kundeninhaber = new Kunde();
		this.kontonummer = kundeninhaber.kundenId;
	}

	Bankkonto(String kontonummer, double kontostand, Kunde kundeninhaber) {
		this();
		this.kontostand = kontostand;
		this.kontonummer = kontonummer;
		this.kundeninhaber = kundeninhaber;
	}

	public void einzahlen(double betrag) {
		kontostand += betrag;
	}

	public void abheben(double betrag) {
		int i = -1;
		while (i == -1) {
			if (betrag <= kontostand) {
				kontostand -= betrag;
				break;
			} else {
				System.err.println("Nicht genug Guthaben! Bitte wählen Sie einen anderen Betrag");
			}
		}
	}

	@Override
	public String toString() {
		return "Konto: " + kontonummer + ",\tInhaber: " + kundeninhaber.name + ",\t Kontostand: " + kontostand + " EUR";

	}

}
