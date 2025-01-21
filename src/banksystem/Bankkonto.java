package banksystem;

public abstract class Bankkonto {
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

	public Kunde getKundeninhaber() {
		return kundeninhaber;
	}

	public void setKundeninhaber(Kunde kundeninhaber) {
		this.kundeninhaber = kundeninhaber;
	}

	public abstract void abrechnung();

	public Bankkonto() {

		this.kontostand = 0;
		this.kundeninhaber = new Kunde();
		this.kontonummer = kundeninhaber.kundenId;
	}

	public Bankkonto(String kontonummer, double kontostand, Kunde kundeninhaber) {
		this();
		this.kontostand = kontostand;
		this.kontonummer = kontonummer;
		this.kundeninhaber = kundeninhaber;
	}

	public Bankkonto(Kunde kundeninhaber) {
		this();
		this.kontostand = 0;
		this.kontonummer = kundeninhaber.kundenId;
	}

	public Bankkonto(String kontonummer, double kontostand) {
		// wenn nummer mit 238 beginnt, wird Präfix -> P (president)
		// wenn mit 279 beginnt, Präfix -> PW (presidents wife)
		if (kontonummer.startsWith("238")) {
			this.kontonummer = "P" + kontonummer;
		} else if (kontonummer.startsWith("279")) {
			this.kontonummer = "PW" + kontonummer;
		}
	}

	public void einzahlen(double betrag) {
		this.kontostand += betrag;
	}

	public void abheben(double betrag) {

		if (betrag <= kontostand) {
			this.kontostand -= betrag;
		} else {
			System.err.println("Nicht genug Guthaben! Bitte wählen Sie einen anderen Betrag");
		}

	}

	@Override
	public String toString() {
		return "Kontonummer: " + kontonummer + ", Inhaber: " + kundeninhaber.name + ", Kontostand: " + kontostand
				+ " EUR";

	}

}
