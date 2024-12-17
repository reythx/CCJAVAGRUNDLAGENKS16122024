package thema1.grundlagen;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		//Scanner deklarieren
		
		System.out.println("Wie schwer bist du? ");
		double wg = scanner.nextDouble();				// Wert für Gewicht einlesen
		
		System.out.println("Wie groß bist du in Metern? ");
		double hg = scanner.nextDouble();				// Wert für Größe einlesen
				
		double bmi = wg / (hg*hg);						// BMI berechnen
		System.out.println("Dein BMI beträgt " + bmi); 	// BMI ausgeben
	}

}
