package thema6.zweidimensionaleArrays;

import java.util.Scanner;
import java.util.Arrays;

public class TicTacToe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int player1row = -1;
		int player1column = -1;
		int player2row = -1;
		int player2column = -1;
		String[][] ttt = new String[3][3];
		System.out.println("Spieler 1, in welcher Zeile X setzen?");
		player1row = scanner.nextInt();
		System.out.print("Spieler 1, in welcher Spalte das X setzen?");
		player1column = scanner.nextInt();
		for (int i = 0; i < ttt.length; i++) { // Zeilen durchlaufen
			
			ttt[i][i] = player1row;
			for (int j = 0; j < ttt[i].length; j++) { // Spalten jeder Zeile durchlaufen
				
				ttt[i][j] = player1;
			}
		}
		for (int i = 0; i < ttt.length; i++) {
			for (int j = 0; j < ttt[i].length; j++) {
				System.out.println();
			}
		}
	}

}
