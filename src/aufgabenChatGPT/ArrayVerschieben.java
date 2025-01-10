package aufgabenChatGPT;

import java.util.Arrays;

public class ArrayVerschieben {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		shiftLeft(arr, 4);

	}

	public static void shiftLeft(int[] a, int n) {
		int[] arr = new int[a.length];
		System.arraycopy(a, n, arr, 0, a.length - n); // kopiere Elemente von n bis ende
		System.arraycopy(a, 0, arr, a.length - n, n); // kopiere die ersten n Elemente an das Ende
		System.out.println(Arrays.toString(arr));
	}

}
