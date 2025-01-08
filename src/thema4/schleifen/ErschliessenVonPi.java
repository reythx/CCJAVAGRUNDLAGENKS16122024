package thema4.schleifen;

public class ErschliessenVonPi {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		double x;
		double y;
		int count = 0;
		long n = 10000;		// Anzahl Versuche
		for (int i = 1; i <= n; i++) {
			x = Math.random();
			y = Math.random();

			double dist = x * x + y * y;	// Berechnung von Abstand zwischen x,y von 0,0 (Satz des Pythagoras, ohne Wurzelzeihung)
			if (dist <= 1.0) {
				count++;					// wie viele Punkte im kreis?
			}

		}
		// Berechnung von PI
		System.out.println((4.0 * count) / n);
	}

}
