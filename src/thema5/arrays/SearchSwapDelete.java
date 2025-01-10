package thema5.arrays;

import java.util.Arrays;

public class SearchSwapDelete {

	public static void main(String[] args) {
		// 1
		int[] arr = { 1, 3, 8, 7, -9, -2, 5, 8, 8, 7 };
		int max = arr[0];
		int count = 0;

		for (int i = 1; i < arr.length; i++) { // i=1, da max bereits arr[0]
			if (arr[i] > max) {
				max = arr[i];
				count = 1; // zähler für vorkommen des neuen Maximums
			} else if (arr[i] == max) {
				count++; // zähler für weitere Maximums
			}

		}
		// Array zur Indexspeicherung
		int[] index = new int[count];
		int indexCount = 0;

		// Schleife um Indizes der maximalen Werte ins Array zu speichern
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				index[indexCount++] = i;
			}
		}

		System.out.println("Max: " + max);
		System.out.println("Indizes der max-Werte: " + Arrays.toString(index));

		// swap(arr, 3, 6);
		delete(arr, 2);
	}

	public static void swap(int[] a, int i, int j) {
		System.out.println("Feld:\t\t " + Arrays.toString(a));
		System.out.println("Parameter 1: \t" + a[i]);
		System.out.println("Parameter 2: \t" + a[j]);

		//
		int hold = a[i]; // speichert den wert aus index i
		a[i] = a[j]; // tauscht wert aus index i mit wert aus index j
		a[j] = hold; // tauscht wert von index j mit dem gespeicherten wert aus index i
		System.out.println("neues Feld: \t" + Arrays.toString(a));

	}

	public static void delete(int[] a, int w) {

		// keep track of amount of values
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == w) {
				count++;
			}
		}
		// new array with correct length
		int[] fewer = new int[a.length - count];
		int indexFewer = 0;

		// copy values that don't match into new array
		// for (int i = 0; i < a.length; i++) { if (a[i] != w) { fewer[indexLess] =
		// a[i]; indexLess++; } }

		// with system.arraycopy();
		int start = 0; // startindex nächster abschnitt
		for (int i = 0; i < a.length; i++) {
			if (a[i] == w) { // wenn position i = w ist und
				if (i > start) { // wenn w nicht an position 0 ist
					System.arraycopy(a, start, fewer, indexFewer, i - start); // dann kopiere abschnitt von Start bis i
																				// (ohne w)
					indexFewer += i - start; // ziel-index aktualisieren
				}
				start = i + 1; // überspringe den wert i, da dieser w ist
			}
		}
		if (start < a.length) {
			System.arraycopy(a, start, fewer, indexFewer, a.length - start); // kopiere restlichen abschnitt nach
																				// letztem
																				// w

		}
		// return
		System.out.println("Original: " + Arrays.toString(a));
		System.out.println("Neu: " + Arrays.toString(fewer));

	}
}