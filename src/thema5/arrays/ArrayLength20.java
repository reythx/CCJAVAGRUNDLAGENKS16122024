package thema5.arrays;

import java.util.Arrays;

public class ArrayLength20 {

	public static void main(String[] args) {
		double even[] = new double[20];
		int ganz[] = new int[20];

		for (int i = 0; i < even.length; i++) {
			even[i] = (int) (Math.random() * 100) * 2;	// *100 um zahlen zwischen 0-99 zu erhalten, *2 um nur gerade zahlen zu erhalten, damit bereich 0-198
		}
		for (int i = 0; i < ganz.length; i++) {
			ganz[i] = (int) (Math.random() * 100);	// (int) um ganze zahlen zu erhalten, *100 um 0-99 zu erhalten ( (int) schneidet nachkommastelle ab
		}
		Arrays.sort(ganz);							// ganz sortieren
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(ganz));

	}

}
