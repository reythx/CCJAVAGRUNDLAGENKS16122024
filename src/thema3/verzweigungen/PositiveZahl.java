package thema3.verzweigungen;
import java.util.Scanner;

public class PositiveZahl {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*** Willkommen zum Ermitteln von Positiven Zahlen! ***");
		System.out.println("Bitte geben Sie eine Zahl an:");
		int zahl = scanner.nextInt();
		
		// String erg = (zahl % 2 == 0) ? "Zahl ist gerade" : "Zahl ist ungerade";
		// System.out.println(erg);
		
		System.out.println((zahl % 2 == 1 ? "Gerade" : "Ungerade"));
		/*if(zahl % 2 == 0) {
			System.out.println("Ihre Zahl ist gerade!");
		}else {
			System.out.println("Ihre Zahl ist ungerade!");
		}*/
scanner.close();
	}

}
