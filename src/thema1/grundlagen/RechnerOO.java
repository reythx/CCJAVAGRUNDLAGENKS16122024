package thema1.grundlagen;

import utils.IO;

public class RechnerOO {
	
	public static void main(String[] args) {
		additionUndAusgabe(23, 24);
		substraktionUndAusgabe(2,5);
		multiplizierenUndAusgeben(3, 7);
		dividierenUndAusgeben(3, 6);
	}
	
	public static void additionUndAusgabe(double z1, double z2) {
		double ergebnis = z1 + z2;
		System.out.println("Addition von " + z1 + " und " + z2 + " ergibt = " + String.format("%.2f", ergebnis));
		
	}

	public static void substraktionUndAusgabe(double z1, double z2) {
		double ergebnis = z1 - z2;
		System.out.println("Substraktion von "+ z1 +" und " + z2 + " ergibt = " + String.format("%.2f", ergebnis));
		
	}
	
	public static void multiplizierenUndAusgeben(double z1, double z2) {
		double ergebnis = z1 * z2;
		System.out.println("Multiplikation von "+ z1 +" und " + z2 + " ergibt = " + String.format("%.2f", ergebnis));
	}
	
	public static void dividierenUndAusgeben(double z1, double z2) {
		if(z2 != 0) {
			double ergebnis = z1 / z2;
			System.out.println("Division von " + z1 + " und " + z2 + " ergibt = " + String.format("%.2f", ergebnis));
		}else {
			System.out.println("Division durch 0 ist nicht erlaubt");
		}
	
	}
	public static void moduloUndAusgeben(double z1, double z2) {
		double ergebnis = z1 % z2;
		System.out.println("Modulo von " + z1 + " und " + z2 + " ergibt = " + String.format("%.2f", ergebnis));
	}
	
	public static void wurzelzugUndAusgeben(double z1) {
		double ergebnis = Math.sqrt(z1);
		System.out.println("Die Wurzel von " + z1 + " ist: " + ergebnis);
	}
	
	public static void quadrierenUndAusgeben(double z1) {
		double ergebnis = z1*z1;
		System.out.println("Das Quadrat von " + z1 + " beträgt: " + ergebnis);
	}
	
	
}	
	

