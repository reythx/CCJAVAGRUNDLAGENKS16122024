package thema3.verzweigungen;

import java.util.Scanner;

public class SwitchUndSchleife {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean repeat = true;

		while (repeat == true) {
			System.out.println("Bitte Zahl zwischen 0 und 9 eingeben: ");
			int hold = scanner.nextInt();
			switch (hold) {
			case 0, 1, 2, 3:
				System.out.println("Bereich Null bis Drei");
				break; // wird break; vergessen, so wird der text zwei mal ausgeführt und die nächsten cases werden mit berücksichtigt sobald der case
						// eingegeben wird
			case 4, 5, 6, 7:
				System.out.println("Bereich Vier bis Sieben");
				break;
			case 8, 9:
				System.out.println("Bereich Acht bis Neun");
				break;
			default:
				System.out.println("Der Bereich ist ungültig!");
			}
			System.out.println("Wollen Sie erneut eine Eingabe betätigen? Zum Abbruch 'N' angeben:");
			String neu = scanner.next();
			if (neu.equalsIgnoreCase("N")) {
				repeat = false;
			}

		}
		scanner.close();
	}

}
