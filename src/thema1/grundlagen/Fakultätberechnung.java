package thema1.grundlagen;

import java.util.Scanner;

public class Fakultätberechnung {

	public static void main(String[] args) {
		int numb;
		Scanner scanner = new Scanner(System.in);
		System.out.println("*** Willkommen bei der Fakultätsberechnung! ***");
		System.out.println("Bitte eine Zahl zur iterativen Berechnung angeben");
		numb = scanner.nextInt();
		
		faculty(numb);
		
	}
	public static void faculty(int n) {
		int erg = 1;
		for(int i = n; i > 0; i--) {	//i = n setzen, dann ab n bis 1 runtergehen
			erg *= i;					//das Ergebnis mal der invertierten Rundenanzahl rechnen, um rekursiv die Fakultät herauszubekommen
		}
		System.out.println("Ihre Fakultät beträgt: " + erg);
	}

}
