package aufgabenChatGPT;
import java.util.Scanner;

public class ArrayInteraktion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie die Länge des Arrays ein: ");
		int laenge = scanner.nextInt();
		int[] arr = new int[laenge];
		System.out.println("Geben Sie nun die Elemente des Arrays ein: ");
		for(int i = 0; i<laenge; i++) {
			arr[i] = scanner.nextInt();
		}
		for(int i = arr.length; i>0; i--) {
			System.out.println(i);
		}
		scanner.close();
	}

}
