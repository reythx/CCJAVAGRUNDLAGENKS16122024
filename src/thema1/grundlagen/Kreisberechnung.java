package thema1.grundlagen;
import java.util.Scanner;

public class Kreisberechnung {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Zur Kreisberechnung bitte den Radius in cm angeben: ");
		double radius = scanner.nextDouble();
		
		double umfang = (2*Math.PI) * radius;
		double fläche = Math.PI * (radius*radius);
		System.out.println("Ihr Kreisumfang beträgt: " + Math.round(umfang*100.0)/100.0 + "cm und ihre Kreisfläche beträgt: " + Math.round(fläche*100.0)/100.0 + "cm²");

	}

}
