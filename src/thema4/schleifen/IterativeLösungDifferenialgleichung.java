package thema4.schleifen;

public class IterativeLösungDifferenialgleichung {

	public static void main(String[] args) {
		double t = 0; // zeit
		double dt = 1.0; // 1 tag
		double k = 0.05; // ansteckungsmaß
		double xn = 0.01; // Anfangswert infizierte
		double dx = 0;	
		while (t < 100) {
			t = t + dt;
			dx = k * xn * (1 - xn) * dt;
			xn = xn + dx;

			// Anzahl der Infizierten visuell darstellen
			int sterne = (int) (xn * 100); // xn skalieren, für jede 0.01% der Bevölkerung = ein Stern (0.01 *100 = 1
											// Stern, 0.25*100 = 25 Sterne)
											// type casting, weil wir für die sterne einen int-wert brauchen
			String visual = ""; // leerer string zur Sternspeicherung
			for (int i = 0; i < sterne; i++) { // wiederhole
				visual = visual + "*"; //
			}

			System.out.println("Tag: " + t + "\t Infizierte: " + visual);

		}

	}
}
