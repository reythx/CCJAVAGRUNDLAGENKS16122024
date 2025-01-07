package thema3.verzweigungen;
import java.util.Scanner;

public class Notenbewertung {

	public static void main(String[] args) {
		System.out.println("*** Hier können Sie ihre Noten in deutscher Bezeichnung bewerten lassen! ***");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte ihren Notenbereich angeben:");
		double note = scanner.nextDouble();
		
		if(note >= 1.0 && note <= 1.4) {
			System.out.println("Sehr gut");
		}else if (note > 1.4 && note <= 2.4) {
			System.out.println("Gut");
		}else if (note > 2.4 && note <= 3.4) {
			System.out.println("Befriedigend");
		}else if (note > 3.4 && note <= 4) {
			System.out.println("Ausreichend");
		}else if (note > 4 && note >= 5) {
			System.out.println("Nicht bestanden");
		}else {
			System.out.println("Ungültige Note");
		}
scanner.close();
	}

}
