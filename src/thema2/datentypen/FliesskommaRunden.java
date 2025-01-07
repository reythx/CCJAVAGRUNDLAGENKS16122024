package thema2.datentypen;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class FliesskommaRunden {

	public static void main(String[] args) {
		//2.7
		Scanner scanner = new Scanner(System.in);
		System.out.println("Zahl angeben: ");
		double zahl = scanner.nextDouble();
		
		int zahlMal100 = (int) (zahl * 100.0 + 0.5);
		double ergGerundet = zahlMal100 / 100.0;
		System.out.println(Math.round(zahl*100.0)/100.0);
		
		BigDecimal number = new BigDecimal(zahl);
		
		System.out.println(number.setScale(2, RoundingMode.HALF_UP));
		scanner.close();
	}

}
