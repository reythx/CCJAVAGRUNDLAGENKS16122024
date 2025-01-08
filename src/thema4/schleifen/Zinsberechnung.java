package thema4.schleifen;
import java.util.Scanner;

public class Zinsberechnung {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte Startkapital, Zinssatz und Laufzeit der Geldanlage in Jahren angeben: \nStartkapital in Euro:");
		double kapital = scanner.nextDouble();
		System.out.println("Zinssatz: ");
		double zinsen = scanner.nextDouble();
		System.out.println("Laufzeit in Jahren: ");
		double laufzeit = scanner.nextDouble();
		
		for(int i = 0; i<=laufzeit; i++) {
			System.out.println("Jahr: "+i+ " | Kapitalstand: "+(Math.round(kapital*100)/100.0+" Euro"));
			kapital = kapital + kapital*(zinsen*0.01);
		}
		
		scanner.close();
	}

}
