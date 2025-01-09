package aufgabenChatGPT;

import java.util.Scanner;

public class ArrayRepitition {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 2, 4, 2 };
		System.out.println("Von welcher Zahl soll die Anzahl ermittelt werden?");
		int check = scanner.nextInt();
		int count = 0;
		for(int i : arr) {
			if(i == check) {
				count++;
			}
		}
		
		System.out.println("Deine Zahl befindet sich " + count + " mal im Array");
		
		scanner.close();
	}
}