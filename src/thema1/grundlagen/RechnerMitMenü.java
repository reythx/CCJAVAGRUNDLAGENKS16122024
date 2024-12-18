package thema1.grundlagen;

import java.util.Scanner;

public class RechnerMitMenü {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int option = -1;  //initiale Menüwahl
		System.out.println("*** Willkommen zum Rechner mit zwei Zahlen! ***");
		
		while(option != 0) { //schleife läuft, bis Benutzer 0 angibt
			System.out.println("\n1. Addition");
			System.out.println("2. Substraktion");
			System.out.println("3. Multiplikation");
			System.out.println("4. Division");
			System.out.println("5. Modulo");
			System.out.println("0. Beenden");
			System.out.println("Bitte wählen Sie eine Option");
			
			option = scanner.nextInt();	//für Benutzhereingabe der Schleife
			
			if(option >= 1 && option <= 5) {	//
				System.out.println("Bitte geben Sie ihre erste Zahl ein: ");
				double zahl1 = scanner.nextDouble();				//Zahl 1 an Scanner übergeben
				System.out.println("Bitte geben Sie ihre zweite Zahl ein: ");
				double zahl2 = scanner.nextDouble();				//Zahl 2 an Scanner übergeben
				System.out.println("\n");
				
				switch (option) {
				case 1: 
					RechnerOO.additionUndAusgabe(zahl1, zahl2);		//Methodenaufruf für addition
					break;
				case 2: 
					RechnerOO.substraktionUndAusgabe(zahl1, zahl2);
					break;
				case 3:
					RechnerOO.multiplizierenUndAusgeben(zahl1, zahl2);
					break;
				case 4:
					RechnerOO.moduloUndAusgeben(zahl1, zahl2);
					break;
				case 5:
					if(zahl2 != 0) {
					RechnerOO.dividierenUndAusgeben(zahl1, zahl2);
					break;
					}else{
						System.out.println("Division durch 0 ist nicht möglich!");
					}
				}
				
			}
			else {
				System.out.println("Ungültige Eingabe");
			}
		}
		scanner.close();
	}
}
