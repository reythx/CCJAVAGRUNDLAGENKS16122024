package aufgabenChatGPT;

public class ZweidimensionaleArrays {

	public static void main(String[] args) {
		int[][] array = { { 12, 8, 9 }, { 98, 100, 3 }, { 100, 5, 12 } };
		TwoDPrint(array);
		SumRowPrint(array, 2);
	}

	public static void TwoDPrint(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void SumRowPrint(int[][] a, int b) {
		int summe = 0;
		for (int i = 0; i < a.length; i++) {
			if (i == b) {		// Überprüfe richtige Zeile
				for (int j = 0; j < a[i].length; j++) {
					summe += a[i][j];
				}
			}
		}
		System.out.println(summe);
	}
}
