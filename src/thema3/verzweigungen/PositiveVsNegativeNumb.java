package thema3.verzweigungen;
import java.util.Scanner;

public class PositiveVsNegativeNumb {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("*** Here you can check if a number is positive, negative or 0 ***\n Please enter a number: ");
	int num = scanner.nextInt();
	if(num > 0) {
		System.out.println("Your number is positive!");
	}else if (num < 0) {
		System.out.println("Your number is negative!");
	}else {
		System.out.println("Your number is equal to 0!");
	}
	scanner.close();
	}

}
