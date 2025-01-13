package banksystem;

public class Bankkonto {
	String kontonummer;
	double kontostand;
	Kunde kundeninhaber;
	
	Bankkonto(){
		
		this.kontostand = 0;
		this.kundeninhaber = new Kunde();
		this.kontonummer = kundeninhaber.kundenId;
	}

	Bankkonto(String kontonummer, double kontostand, Kunde kundeninhaber){
		this();
		this.kontostand = kontostand;
		this.kontonummer = kontonummer;
		this.kundeninhaber = kundeninhaber;
	}
	
	public void einzahlen(double betrag) {
		kontostand += betrag;
	}

	public void abheben(double betrag) {
		kontostand -= betrag;
	}

	@Override
	public String toString() {
		return "Konto: " + kontonummer + ",\tInhaber: " + kundeninhaber.name + ",\t Kontostand: "
				+ kontostand + " EUR";

	}

}
