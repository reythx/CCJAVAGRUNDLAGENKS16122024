package thema1.grundlagen;

import java.util.Scanner;

public class Notendurchschnitt {
	static public void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numb;
		double average = 0;

		System.out.println("Bitte geben Sie die Anzahl der zu berechenden Noten an: ");
		numb = scanner.nextInt();

		for(int x = 1; x <= numb; x++) {
			System.out.println("Bitte geben Sie nacheinander ihre Note an: ");
			average = (average + scanner.nextDouble()) / x;
		}
	
		System.out.println("Ihr Notendurchschnitt beträgt: " + average);
	}
}
