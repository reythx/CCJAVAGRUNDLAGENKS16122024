package aufgabenChatGPT;

import java.util.Arrays;

public class ArrayDeleteDuplicates {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 3, 4, 4, 5 };
		removeDuplicates(arr);

	}

	public static void removeDuplicates(int[] arr) {
		int elements = arr.length;
		boolean[] isDuplicate = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j] && !isDuplicate[j]) {
					isDuplicate[j] = true;
					elements--;
				}
			}
		}

		int[] newArray = new int[elements];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if(!isDuplicate[i]) {
				newArray[index++] = arr[i];
				
			}
		}

		System.out.println("Original: "+Arrays.toString(arr)+"\nOhne Duplikate: "+Arrays.toString(newArray));
	}
}
