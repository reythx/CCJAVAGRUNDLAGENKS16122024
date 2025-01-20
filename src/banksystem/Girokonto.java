package banksystem;

public class Girokonto extends Bankkonto implements Ueberziehbar {
	protected double dispoLimit = 200;

	public void abheben(double betrag) {
		if (betrag <= kontostand + dispoLimit) {
			kontostand -= betrag;
		} else {
			System.out.println("Überziehungslimit überzogen");
		}
	}

	public Girokonto(String kontonummer, int kontostand, Kunde kundeninhaber) {
		super(kontonummer, kontostand, kundeninhaber);
	}

	public Girokonto(Kunde kundeninhaber) {
		super(kundeninhaber);
	}

	public Girokonto() {
		super();
	}

	@Override
	public String toString() {
		return "Kontonummer: " + kontonummer + ", Kontostand: " + kontostand + " EUR, Dispolimit: " + dispoLimit
				+ " EUR";
	}

	public double getDispoLimit() {
		return dispoLimit;
	}

	public void setDispoLimit(double dispoLimit) {
		this.dispoLimit = dispoLimit;
	}

	@Override
	public void abrechnung() {
		if (ueberziehungPruefen() == true) {
			System.out.println("Gebühren für die Überziehung: " + (dispoLimit / 100) + " EUR");
			this.kontostand -= (dispoLimit / 100);
		}else System.out.println("Keine Gebühren");
	}

	@Override
	public boolean ueberziehungPruefen() {
		if (kontostand < 0) {
			return true;
		} else
			return false;
	}

}
