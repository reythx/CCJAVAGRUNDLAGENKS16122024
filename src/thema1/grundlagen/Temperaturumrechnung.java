package thema1.grundlagen;
import java.util.Scanner;

public class Temperaturumrechnung {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String temp = "n";
		System.out.println("Möchten Sie in Fahrenheit oder in Celsius umrechnen? F / C");
		temp = scanner.next();
		if(temp.equalsIgnoreCase("F")) {
			System.out.println("Bitte Temperatur in Celius angeben: ");
			double cels = scanner.nextDouble();
			double umrechnungF = cels * 9/5 + 32;
			System.out.println(cels + "°C in Fahrenheit beträgt: " + Math.round(umrechnungF*100.0)/100.0 + "°F");
		}else if(temp.equalsIgnoreCase("C")) {
			System.out.println("Bitte Temperatur in Fahrenheit angeben: ");
			double fahr = scanner.nextDouble();
			double umrechnungC = (fahr - 32) * 5/9;
			System.out.println(fahr + "°F in Celsius beträgt: " + Math.round(umrechnungC*100.0)/100.0 + "°F");
		}
	}
}
