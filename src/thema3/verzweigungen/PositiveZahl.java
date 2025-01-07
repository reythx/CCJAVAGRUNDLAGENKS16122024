package thema3.verzweigungen;
import java.util.Scanner;

public class PositiveZahl {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*** Willkommen zum Ermitteln von Positiven Zahlen! ***");
		System.out.println("Bitte geben Sie eine Zahl an:");
		int zahl = scanner.nextInt();
		
		if(zahl % 2 == 0) {
			System.out.println("Ihre Zahl ist gerade!");
		}else {
			System.out.println("Ihre Zahl ist ungerade!");
		}

	}

}
