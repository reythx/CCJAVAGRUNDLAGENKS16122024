package thema4.schleifen;
import java.util.Scanner;
public class DoWhileProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pin;
		do {System.out.println("Bitte PIN eingeben");
			pin = scanner.nextInt();
			System.out.println(pin);
		}while(pin != 7836);
		System.out.println("Correct!");
		scanner.close();
	}

}
