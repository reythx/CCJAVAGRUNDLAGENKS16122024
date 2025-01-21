package aufgabenChatGPT.fahrzeugsystem;

public abstract class Fahrzeug {
	String marke;
	int baujahr;
	double geschwindigkeit;
	
	public Fahrzeug(String marke, int baujahr, double geschwindigkeit) {
		super();
		this.marke = marke;
		this.baujahr = baujahr;
		this.geschwindigkeit = geschwindigkeit;
	}

	void beschleunigen(double acc) {
		this.geschwindigkeit += acc;
	}

	void bremsen(double wert) {
		this.geschwindigkeit -= wert;
	}

	@Override
	public String toString() {
		return "Fahrzeug = Marke: " + marke + ", Baujahr: " + baujahr + ", Geschwindigkeit: " + geschwindigkeit;
	}

	void zeigeInfo() {
		System.out.println("Marke: " + marke + ", Baujahr: " + baujahr + ", Geschwindigkeit: " + geschwindigkeit);
	}

	abstract void berechneSteuer();

}
