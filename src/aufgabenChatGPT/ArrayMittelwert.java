package aufgabenChatGPT;

public class ArrayMittelwert {

	public static void main(String[] args) {
		int[] arr = { 4, 8, 6, 10, 12, 9, 12, 100 };
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		double avrg = sum / arr.length;
		System.out.println("Mittelwert: " + avrg);
	}

}
