package aufgabenChatGPT.fahrzeugsystem;

public class Motorrad extends Fahrzeug implements Umweltfreundlich {

	public Motorrad(String marke, int baujahr, double geschwindigkeit) {
		super(marke, baujahr, geschwindigkeit);
	}

	int hubraum;

	@Override
	void berechneSteuer() {
		if (emissionsKlasse().equals("Zero Emission")) {
			System.out.println("Steuern sind: 0€");
		} else if (emissionsKlasse().equals("Euro 6")) {
			System.out.println("Steuern sind: 5€");
		} else if (emissionsKlasse().equals("Euro 5")) {
			System.out.println("Steuern sind: 10€");
		} else if (emissionsKlasse().equals("Euro 4")) {
			System.out.println("Steuern sind: 15€");
		} else if (emissionsKlasse().equals("Euro 2")) {
			System.out.println("Steuern sind: 25€");
		}else System.out.println("Ungültige Eingabe, Steuern können nicht berechnet werden");

	}

	public int getHubraum() {
		return hubraum;
	}

	public void setHubraum(int hubraum) {
		if(hubraum <= 0) {
			throw new IllegalArgumentException("Der Hubraum muss größer als 0 sein.");
		}
		this.hubraum = hubraum;
	}

	@Override
	public String emissionsKlasse() {
		if (hubraum > 0 && hubraum < 50) {
			return "Euro 6";
		} else if (hubraum >= 50 && hubraum < 125) {
			return "Euro 5";
		} else if (hubraum >= 125 && hubraum < 450) {
			return "Euro 4";
		} else if (hubraum >= 450 && hubraum < 750) {
			return "Euro 3";
		} else if (hubraum >= 750 && hubraum < 1400) {
			return "Euro 2";
		} else if (hubraum >= 1400) {
			return "Euro 1";
		} else 
			return "Ungültige Eingabe, Emissionsklasse kann nicht berechnet werden";
	}

	@Override
	public void ladebatterie() {
		System.out.println("Es gibt noch keine elektrischen Motorräder...");
	}
}
