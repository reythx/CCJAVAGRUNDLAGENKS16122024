package banksystem;

public class Sparkonto extends Bankkonto implements Zinsberechnung {
	private final double zinssatz = 0.5 / 100;

	@Override
	public void berechneZinsen() {
		System.out.println("Zinsen: " + kontostand * zinssatz + " EUR");
		einzahlen(kontostand * zinssatz);
	}

	public Sparkonto(String kontonummer, double kontostand, Kunde kundeninhaber) {
		super(kontonummer, kontostand, kundeninhaber);
	}
	
	public Sparkonto(String kontonummer, double kontostand) {
		super(kontonummer, kontostand);
	}

	public Sparkonto(Kunde kundeninhaber) {
		super(kundeninhaber);
	}

	public Sparkonto() {
		super();
	}

	@Override
	public String toString() {
		return super.toString() + ", Zinssatz: " + zinssatz * 100 + " %";
	}

	@Override
	public void abrechnung() {
		System.out.println("Zinsen: " + kontostand * zinssatz + " EUR");
		einzahlen(kontostand * zinssatz);
	}

}
