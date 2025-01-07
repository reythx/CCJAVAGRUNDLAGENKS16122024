package thema2.datentypen;

public class ImplicitTypeConversion {

	public static void main(String[] args) {
		byte b1 = 10, b2 = 20;
		short p = 200;
		int n = 500;
		long q = 100;
		float x = 2.5f;
		double y = 5.25;
		
		//a
		int b3 = b1 + b2; 		
		System.out.println(b3); // Wert = 30, Typ = int, da arithmetische Operatoren von kleineren Datentypen automatisch zu int wird
		//b
		int s = p+b1;
		System.out.println(s); // Wert = 210, Typ = int, siehe oben, byte, short und char sind kleinere Datentypen
		//c
		int b4 = b1*b2;
		System.out.println(b4); // Wert = 200, Typ = int
		//d
		long o = q+p*(b1+b2);
		System.out.println(o); // Wert = 6100, Typ = long
		
	}

}
