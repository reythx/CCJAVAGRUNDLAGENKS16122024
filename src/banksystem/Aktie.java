package banksystem;

public class Aktie {
	private String isin; // static wenn fachlich an Klasse gebunden!

	private String unternehemensName;

	private double preis;

	public void aktualisierePreis(double neuerPreis) {

		this.preis = neuerPreis;
	}

	public Aktie() {
		this.isin = "unbekannt";
		this.unternehemensName = "unbekannt";
		this.preis = -1;
	}

	public Aktie(String isin, String unternehemensName, double preis) {
		super();
		this.isin = isin;
		this.unternehemensName = unternehemensName;
		this.preis = preis;
	}

	@Override
	public String toString() {
		return "Aktie: " + isin + ", Unternehmen = " + unternehemensName + ", Preis = " + preis;
	}

}
