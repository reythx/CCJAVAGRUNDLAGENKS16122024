package banksystem;

public class Sparkonto extends Bankkonto {
	private double zinssatz = 0.5/100;

	
	public void setSparkontostand(double kontostand) {
		this.kontostand = kontostand;
		System.out.println("kontostand gesetzt auf: "+this.kontostand);
	}
	public void zinsenBerechnen() {
		System.out.println(kontostand * zinssatz);
		einzahlen(kontostand * zinssatz);
	}

	@Override
	public String toString() {
		return "Sparkonto: " + getKontonummer() + ", Kundeninhaber: " + kundeninhaber.name + ", Kontostand: " + kontostand
				+ ", Zinssatz: " + zinssatz*100 +" %";
	}

}
