package thema3.verzweigungen;
import java.util.Scanner;


public class BiggestNumberIfElse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*** Hier können Sie ihre größte Zahl ermitteln! ***");
		System.out.println("Bitte drei Zahlen angeben: ");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		if(n1 > n2 && n1 > n3) {				// mit if-else
			System.out.println(n1 + " ist ihre größte Zahl!");
		}else if(n2 > n1 && n2 > n3) {
			System.out.println(n2 + " ist ihre größte Zahl!");
		}else {
			System.out.println(n3 + " ist ihre größte Zahl!");
		}
		
	scanner.close();
	}

}
