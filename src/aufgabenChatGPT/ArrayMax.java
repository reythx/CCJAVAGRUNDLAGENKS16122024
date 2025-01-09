package aufgabenChatGPT;

public class ArrayMax {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, -6, 9, -4 };
		int max = arr[0];
		for (int i : arr) {
			if (i > max) {
				max = i;
			}
		}
		System.out.println(max);

	}

}
