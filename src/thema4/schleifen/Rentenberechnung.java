package thema4.schleifen;

import java.util.Scanner;

public class Rentenberechnung {

	public static void main(String[] args) {
		// Rente > Anfangskapital x Zinssatz, denn sonst ist der Zins höher als die Rente, das ist der Grund warum Millionäre immer reicher werden, auch wenn sie nichts tun (:
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Geben Sie ihr Startkapital, ihren Zinssatz und die jährlich abzuziehende Rente an: \nStartkapital: ");
		double kapital = scanner.nextDouble();
		System.out.println("Zinssatz: ");
		double zins = scanner.nextDouble();
		System.out.println("Jährliche Rente: ");
		double rente = scanner.nextDouble();
		int jahr = 0;
		do {
			// Berechnung der Zinsen und neues Kapital
			kapital = kapital + kapital * (zins * 0.01);
			
			// abbruch, wenn zinsen > rente
			if (kapital * zins * 0.01 >= rente) {
				System.out.println(
						"Die Zinsen sind höher als die Rente! Du kannst für den Rest deines Lebens von deinem Kapital leben und das restliche Geld vererben, oder eine höhere Rente genießen :)");
				break;
			}

			// Rentenabzug
			kapital = kapital - rente;
			jahr++;

			System.out.println("Restliches Kapital: " + Math.round(kapital * 100.0) / 100.0);
		} while (kapital > 0); // Schleife solange Kapital positiv

		// Ausgabe der Jahre
		if (kapital <= 0) {
			System.out.println("Sie können " + jahr + " Jahre von ihrem Kapital leben");
		}

		scanner.close();
	}

}
