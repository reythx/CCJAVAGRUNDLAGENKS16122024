package thema4.schleifen;

public class FloatUngenauigkeit {

	public static void main(String[] args) {
		
		//1
		float numb = 0.0f;
		float hold = 0.0f;
		for (int i = 1; i <= 10000; i++) {
			numb += (1.0f / i);
		}
		for (int j = 10000; j >= 1; j--) {
			hold += (1.0f / j);
		}
		System.out.println(
				"Harmonische Reihe mit float-Werten\nVon unten nach oben: " + numb + "\nVon oben nach unten: " + hold);
		// minimaler Unterschied in der Summe

		
		//2
		double dumb = 0.0f;
		double dold = 0.0f;
		for (int i = 1; i <= 10000; i++) {
			dumb += (1.0f / i);
		}
		for (int j = 10000; j >= 1; j--) {
			dold += (1.0f / j);
		}
		System.out.println(
				"Harmonische Reihe mit double-Werten\nVon unten nach oben: " + dumb + "\nVon oben nach unten: " + dold);
		// kein Unterschied in der Summe
		
		
		//3 bei größer werdenden Werten wird der Unterschied bei den zwei float-schleifen größer und größer (Ungenauigkeit), während die double werte gleich bleiben!
	}

}
