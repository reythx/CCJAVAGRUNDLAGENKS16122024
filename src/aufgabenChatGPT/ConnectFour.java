package aufgabenChatGPT;

import java.util.Scanner;

public class ConnectFour {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean winCondition = false;
		String player1 = "X";
		String player2 = "O";
		String[][] b = initializeBoard();
		String winner = "";
		do {
			printBoard(b);
			player1Turn(b, scanner);
			winCondition = checkWin(b, player1);
			if (winCondition != false) {
				winner = player1;
				break; // spiel beenden, wenn spieler1 gewinnt, sodass spieler2 nichtmehr spielen kann

			}
			printBoard(b);
			player2Turn(b, scanner);
			if (checkWin(b, player2)) {
				winner = player2;
				break;
			}

		} while (winCondition == false);
		printBoard(b);
		System.out.println("***Herzlichen Glückwunsch!***\nSpieler " + winner + " hat gewonnen!");
		scanner.close();
	}

	public static String[][] initializeBoard() {
		String[][] board = new String[6][7];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = " ";
			}
		}
		System.out.print("");
		return board;

	}

	public static void printBoard(String[][] board) {
		for (String[] i : board) {
			System.out.print(" |");
			for (String j : i) {
				System.out.print(" " + j + " |");
			}
			System.out.println();
		}
	}

	public static String[][] player1Turn(String[][] board, Scanner scanner) {
		boolean played = false;
		while (!played) { // Wiederhole, bis ein Stein gesetzt wurde
			System.out.println("Spieler X, den Chip in welche Reihe stecken?");
			int playRow = scanner.nextInt() - 1; // Subtrahiere 1, um den Index zu erhalten

			if (playRow < 0 || playRow >= board[0].length) { // Prüfe, ob die Spaltennummer gültig ist
				System.out.println("Ungültige Reihe! Bitte eine andere Reihe wählen.");
				continue;
			}

			// Überprüfe die Spalte von unten nach oben
			for (int i = board.length - 1; i >= 0; i--) {
				if (board[i][playRow].equals(" ")) {
					board[i][playRow] = "X"; // Setze den Stein
					played = true; // Stein wurde erfolgreich gesetzt
					break; // Verlasse die Schleife
				}
			}

			// Wenn kein Stein gesetzt werden konnte (Spalte voll)
			if (!played) {
				System.out.println("Die Reihe ist bereits voll! Bitte eine andere Reihe auswählen.");
			}
		}
		return board;
	}

	public static String[][] player2Turn(String[][] board, Scanner scanner) {
		boolean played = false;
		while (!played) { // Wiederhole, bis ein Stein gesetzt wurde
			System.out.println("Spieler O, den Chip in welche Reihe stecken?");
			int playRow = scanner.nextInt() - 1; // Subtrahiere 1, um den Index zu erhalten

			if (playRow < 0 || playRow >= board[0].length) { // Prüfe, ob die Spaltennummer gültig ist
				System.out.println("Ungültige Reihe! Bitte eine gültige Reihe wählen.");
				continue;
			}

			// Überprüfe die Spalte von unten nach oben
			for (int i = board.length - 1; i >= 0; i--) {
				if (board[i][playRow].equals(" ")) {
					board[i][playRow] = "O"; // Setze den Stein
					played = true; // Stein wurde erfolgreich gesetzt
					break; // Verlasse die Schleife
				}
			}

			// Wenn kein Stein gesetzt werden konnte (Spalte voll)
			if (!played) {
				System.out.println("Die Reihe ist bereits voll! Bitte eine andere Reihe auswählen.");
			}
		}
		return board;
	}

	public static boolean checkDirection(String[][] board, int row, int column, int rowDirection, int columnDirection,
			String player) {
		int count = 0; // zähler, wenn zähler = 4, return true
		// prüfe die angegebene richtung 4x in weiterführenden schritten
		for (int i = 0; i < 4; i++) {
			int r = row + i * rowDirection;
			int c = column + i * columnDirection;
			// überprüfe, ob innerhalb der grenzen: zeile darf nicht negativ sein, oder
			// länger als spielfeld, gleiche mit spalte, board[0].length, da wir erste zeile
			// als referenz der spaltenlänge nehmen; alle zeilen haben gleiche
			// spaltenlänge
			if (r >= 0 && r < board.length && c >= 0 && c < board[0].length && board[r][c].equals(player)) {
				count++;
			} else {
				break;
			}
		}

		return count == 4; // returns true, wenn count == 4, sonst false
	}

	public static boolean checkWin(String[][] board, String player) {
		// jede Zelle des boards durchgehen
		for (int row = 0; row < board.length; row++) {
			for (int column = 0; column < board[row].length; column++) {
				// überprüfe, ob zelle dem player gehören
				if (board[row][column].equals(player)) {
					// Richtung überprüfen überprüfen
					if (checkDirection(board, row, column, 1, 0, player) || // check horizontal
							checkDirection(board, row, column, 0, 1, player) || // check vertikal
							checkDirection(board, row, column, 1, -1, player) || // check diagonal 1
							checkDirection(board, row, column, 1, 1, player)) // check diagonal 2
						return true; // viererreihe gefunden

				}
			}
		}

		return false;
	}
}
