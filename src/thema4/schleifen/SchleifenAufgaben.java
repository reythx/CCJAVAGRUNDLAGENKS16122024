package thema4.schleifen;

public class SchleifenAufgaben {

	public static void main(String[] args) {
		// 1
		int i = 0;
		while (i < 10) {
			i++;
			System.out.println("Wert = " + i); // wird 1-10 ausgeben, da vor dieser Ausgabe i erhöht wird, im letzten
												// durchlauf ist i=9, somit noch kleiner als 10, wird dann innerhalb der
												// schleife erhlöht
		}
		// 2
		double d = Double.MAX_VALUE;
		while (d == d + 1) {
			System.out.println("läufts"); // Dauerschleife kann erreicht werden, indem d = Double.MAX_VALUE genommen
			break; // wird, so kann d+1 nicht höher als d sein }
		}
		// 3
		double f = Double.NaN;
		while (f != f) {
			System.out.println("läuft"); // Dauerschleife wird erreicht, wenn f = Double.NaN ist, da Double.NaN einen
			break; // ungültigen double-Wert darstellt
		}

		// 4
		int n, a = 5; // 1
		// while (a < 10) {n = 1;a++;}	// kompiliert nicht, da n innerhalb der schleife initialisiert wird und außerhalb der schleife keinen Wert besitzt
		 do {n=1; a++;} while(a<10);	// kompiliert, da DO außerhalb der Schleife arbeitet, somit n initialisiert, und auch nach der Schleife gilt
		// for(int ve = 0; ve<10; i++) {n=10;}	//kompiliert nicht, da n innerhalb der Schleife initialisiert wird, somit nicht nach der schleife einen wert hat
		int b = n; // 5
		
		//5
		float dy = 1E-10f;	// wenn wir dy zu 1E-6f ändern, entweichen wir der endlosschleife, bei 1E-7f kommt es jedoch noch zu rundungsfehlern und yn übersteigt 2 nicht 
		float yn = 1f;
		int v = 0;
		
		while(yn<10.0f) {
			yn = yn+dy;
			v++;
			System.out.println("Iteration: "+v+" yn= "+yn);	// float hat eine Genauigkeit von 7Dezimalstellen, dy hat jedoch 10decimalstellen und übersteigt floats genauigkeit, daher kann dy nicht zu yn hinzugefügt werden und wir besitzen eine dauerschleife
			break;
		}
	}
}
