package thema2.datentypen;

public class AusdruckTypen {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int z = 3;
		boolean a = true;
		boolean b = false;
		//a
		boolean c = a && b; //typ boolean, ergebnis "false",	 da für "true" beide werte true sein müssen
		System.out.println(c);
		
		//b
		int erg = 10 / 3;
		System.out.println(erg); //typ int, ergebnis = 3,	 da abgerundet
		
		//c
		double ergebnis = 10 / 3.; //typ double, 3.33,	 da im Ergebnis typenkonvertierung stattfinden kann
		System.out.println(ergebnis);
		
		//d
		boolean ergs = (x == y) ? x > y : y < z; //typ boolean, true,	 ergebnis y<z wird überprüft --> true
		System.out.println(ergs);
	
		//e 
		x = 127;
		x = (byte) (127 + 1); //Overflow, 128 zu groß für byte und wird negativ, typ byte, Wert = -128
		System.out.println(x);
		
		//f
		x = 120;
		String g = x + y + "z"; //Typ = String, Wert = 3z
		System.out.println(g);
		
		//g
		// 1 || 0			Typ ist nicht korrekt, da || boolean erwartet, 1 und 0 jedoch int sind
		
		// Aufgabe 2
		
		//a
		int i = 2147483647 + 1;	// typ long, zu lang für int, Stackoverflow
		System.out.println(i);
		

		//b
		// (byte) 256 * i;  (byte) converts 256 to 0 (only takes lowest 8 bit of 256 in binary), so its 0 * 2147483647
		
		//c 
		System.out.println("x "+ y + z); // typenfehler, dies ist String + int, da "x" zu String wird
		
		//d
		i = 1;
		if(x<y && true) {	// Typ boolean, ergebnis = true, da x<y. falls x>y, dann wäre das ergebnis false
			System.out.println();
		}
		
		//e
		// 9f / 3d; typenfehler, von float kann nicht in double umgewandelt werden
		
		//f
		System.out.println(x + "y" + - z); // typ: String, wert: 1y-3
		
		//g
		// 1+3f; typenfehler, int ist zu klein um in float umgewandelt zu werden
	
		//h
		// boolean j = (x != 'x') ? 2f : 1; typenfehler, 2f kann nicht in boolean umgewandelt werden
		
		//2.4 implizierte Typenkonversion
		byte b1 = 10, b2 = 20;
		short p = 200;
		int n = 500;
		long q = 100;
		float xz = 2.5f;
		double yz = 5.25;
		
		//a
		int berg = b1 + b2; //Wert 30, in typ Int umgewandelt sobald arithmetische operation mit kleinen typen (Byte, Short) durchgeführt wird
		//b
		int inert = p + b1; //wert 210, typ int
		//c
		int erg3 = b1 * b2;
		//d
		long erg4 = q+p*(b1+b2); //Wert 6100, Typ = long
		//e
		float erg5 = xz+q*n; // Wert = 50002.5, Typ = float
		//f
		float erg6 = b1 + q/xz;
		//g
		double erg7 = b1*q*2./xz; // Double
}
	
	
}
