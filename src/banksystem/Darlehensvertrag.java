package banksystem;

public class Darlehensvertrag {
	public String vertragId;
	public Kunde kreditnehmer;
	public double kreditbetrag;
	public double zinssatz;
	public int laufzeit;
	private static int count = 0;

	public Kunde getKreditnehmer() {
		return kreditnehmer;
	}

	public void setKreditnehmer(Kunde kreditnehmer) {
		this.kreditnehmer = kreditnehmer;
	}

	public double getKreditbetrag() {
		return kreditbetrag;
	}

	public void setKreditbetrag(double kreditbetrag) {
		this.kreditbetrag = kreditbetrag;
	}

	public double getZinssatz() {
		return zinssatz;
	}

	public void setZinssatz(double zinssatz) {
		this.zinssatz = zinssatz;
	}

	public int getLaufzeit() {
		return laufzeit;
	}

	public void setLaufzeit(int laufzeit) {
		this.laufzeit = laufzeit;
	}

	public Darlehensvertrag() {
		this.kreditnehmer = new Kunde("Default Kreditnehmer", "Unbekannte Adresse");
		this.vertragId = "D00" + (++count);
		this.kreditbetrag = 0;
		this.zinssatz = 7;
		this.laufzeit = 12;
	}
	public Darlehensvertrag(Kunde kreditnehmer) {
		this.vertragId = "I" + (++count);
		this.kreditbetrag = 0;
		this.zinssatz = 7;
		this.laufzeit = 12;
		this.kreditnehmer = kreditnehmer;
	}

	public Darlehensvertrag(String vertragID, Kunde kreditnehmer, double kreditbetrag, double zinssatz, int laufzeit) {
		super();
		this.vertragId = vertragID;
		this.kreditnehmer = kreditnehmer;
		this.kreditbetrag = kreditbetrag;
		this.zinssatz = zinssatz;
		this.laufzeit = laufzeit;
	}

	public void berechneMonatlicheRate() {
		double monatlicherZins = zinssatz/(100*12);
		double rate = (kreditbetrag*monatlicherZins)/(1-(Math.pow(1+monatlicherZins, -laufzeit)));
		for (int i = 0; i < laufzeit; i++) {
			kreditbetrag = kreditbetrag + kreditbetrag * (zinssatz / 100);
		}
		System.out.println("Monatliche Rate: " + Math.round(rate*100)/100.0);
	}

	@Override
	public String toString() {
		return "Darlehensvertrag:\nVertragsID: " + vertragId + ", Kreditnehmer: " + kreditnehmer.getName()
				+ "\nKreditbetrag: " + kreditbetrag + "EUR, Zinssatz: " + zinssatz + "%, Laufzeit: " + laufzeit;
	}

}
