package banksystem;

public class Sparkonto extends Bankkonto implements Zinsberechnung{
	private double zinssatz = 0.5/100;

	@Override
	public void berechneZinsen() {
		System.out.println("Zinsen: " + kontostand * zinssatz + " EUR");
		einzahlen(kontostand * zinssatz);
	}

	@Override
	public String toString() {
		return super.toString() + ", Zinssatz: " + zinssatz*100 +" %" ;
	}

}
