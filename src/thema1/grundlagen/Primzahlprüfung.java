package thema1.grundlagen;

import java.util.Scanner;

public class Primzahlprüfung {

	public static void main(String[] args) {
		int numb;
		Scanner scanner = new Scanner(System.in);
		System.out.println("*** Willkommen bei der Primzahlüberprüfung! ***)");
		System.out.println("Bitte eine Zahl zur Überprüfung angeben");
		numb = scanner.nextInt();
		isPrimeUndAusgeben(numb);
		

	}
	public static void isPrimeUndAusgeben(int numb) {
		for(int i = 2; i<numb; i++) {
			if(numb % i == 0) {										//Primzahlüberprüfung, Test, ob durch Zahlen außer durch 1 und Selbst teilbar
				System.out.println("Nummer ist keine Primzahl");
				return;
			}
		}
			System.out.println("Nummer ist eine Primzahl!");
		}
	}


