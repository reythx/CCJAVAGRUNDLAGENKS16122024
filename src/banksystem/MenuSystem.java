package banksystem;

import java.util.Scanner;

public class MenuSystem {
	public static Bank menu(Scanner scanner, Bank bank) {
		int repeat = -1;
		String kontonummer;
		double betrag;
		while (repeat == -1) { // schleife zum wiederholen des menüs
			System.out.println("*** Willkommen im Menü! ***\n Was wollen sie tun?");
			System.out.println("1. Konto hinzufügen (Kontonummer, Betrag).");
			System.out.println("2. Konto anzeigen (Kontonummer).");
			System.out.println("3. Alle Konten anzeigen.");
			System.out.println("4. Konto löschen (Kontonummer)");
			System.out.println("5. Programm beenden.");
			System.out.println("Bitte eine Auswahl 1-5 treffen.");
			int auswahl = scanner.nextInt();
			switch (auswahl) {
			case 1:
				System.out.println("Bitte Kontonummer angeben: ");
				kontonummer = scanner.next();
				scanner.nextLine();
				System.out.println("Bitte Kontostand angeben: ");
				betrag = scanner.nextDouble();
				scanner.nextLine(); // nach Zeilenumbruch wieder leeren
				System.out.println("Welche Art an Konto wollen Sie hinzufügen? (Sparkonto / Girokonto)");
				String kontoart = scanner.nextLine();
				
				int loop = -1;
				while (loop == -1) { // schleife zum wiederholen der eingabe
					if (kontoart.equalsIgnoreCase("Sparkonto")) {
						Bankkonto konto = new Sparkonto(kontonummer, betrag);
						bank.addKonto(konto);
						System.out.println("Das Sparkonto mit der Kontonummer: " + kontonummer
								+ " und dem Startguthaben: " + betrag + " erfolgreich angelegt.");
						loop = 0;
						break;
					} else if (kontoart.equalsIgnoreCase("Girokonto")) {
						Bankkonto konto = new Girokonto(kontonummer, betrag);
						bank.addKonto(konto);
						System.out.println("Das Girokonto mit der Kontonummer: " + kontonummer
								+ " und dem Startguthaben: " + betrag + " erfolgreich angelegt.");
						loop = 0;
						break;
					} else {
						System.out.println("Bitte 'Sparkonto' oder 'Girokonto' angeben!");
						kontoart = scanner.nextLine();
					}
				}
				break;

			case 2:
				System.out.println("Bitte Kontonummer angeben: ");
				scanner.nextLine();
				kontonummer = scanner.next();
				Bankkonto gefunden = bank.getKonto(kontonummer);
				if (gefunden != null) {
					System.out.println("Konto gefunden: " + gefunden + ".");
				} else {
					System.out.println("Kein Konto mit der Kontonummer: " + kontonummer + " gefunden.");
				}
				break;

			case 3:
				System.out.println("Alle Konten: ");
				bank.zeigeAlleKonten();
				break;
				
			case 4:
				System.out.println("Bitte Kontonummer des zu löschenden Kontos angeben: ");
				String delete = scanner.next();
				bank.removeKonto(delete);
				break;
				
			case 5:
				System.out.println("Programm beendet.");
				repeat = 0;
				break;
				
			default:
				System.out.println("Weitere Eingabe?");
			}
		}
		return bank;
	}
}
