package thema6.zweidimensionaleArrays;

import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] b = initializeNewBoard();
		String winCondition = null;
		do {
			printBoard(b);
			player1Turn(b, scanner);
			winCondition = checkWin(b);
			if (winCondition != null) { // chatGPT
				break; // spiel beenden, wenn Spieler1 gewinnt, ohne dass spieler2 noch eine runde
						// bekommt ChatGPT
			}
			printBoard(b);
			player2Turn(b, scanner);
			winCondition = checkWin(b);

		} while (winCondition == null); // logischer fehler, ich hatte != null, chatgpt

		printBoard(b);
		System.out.println("***Herzlichen Glückwunsch!***\nSpieler " + winCondition + " hat gewonnen!");
		scanner.close();
	}

	public static String[][] initializeNewBoard() {
		String[][] board = new String[3][3];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = " ";
			}
		}
		return board;
	}

	public static void printBoard(String[][] board) {
		for (String[] x : board) {
			System.out.print("|"); // beginne Zeile mit |
			for (String y : x) {
				System.out.print(" " + y + " |"); // füge | nach jedem spielfeldelement hinzu
			}
			System.out.println();
		}
	}

	public static String[][] player1Turn(String[][] board, Scanner scanner) {
		boolean noX = true;
		while (noX == true) { // wiederhole, bis X gesetzt ist
			System.out.println("Spieler X, in welcher Zeile ein X setzen?");
			int player1row = scanner.nextInt();
			System.out.print("Spieler X, in welcher Spalte das X setzen?");
			int player1column = scanner.nextInt();
			if (board[player1row][player1column].equals(" ")) { // setze X, falls
																// noch nicht
																// belegt
				board[player1row][player1column] = "X";
				noX = false; // wenn X gesetzt wird, beende schleife
			} else {
				System.out.println("Das Feld ist bereits besetzt, bitte erneut setzen");	//ansonsten gebe text aus und wiederhole schleife
			}
		}
		return board;
	}

	public static String[][] player2Turn(String[][] board, Scanner scanner) {
		boolean noX = true;
		while (noX == true) { // wiederhole, bis O gesetzt ist
			System.out.println("Spieler O, in welcher Zeile ein O setzen?");
			int player1row = scanner.nextInt();
			System.out.print("Spieler O, in welcher Spalte das O setzen?");
			int player1column = scanner.nextInt();
			if (board[player1row][player1column].equals(" ")) { // setze O, falls
																										// noch nicht
																										// belegt
				board[player1row][player1column] = "O";
				noX = false; // wenn O gesetzt wird, beende schleife
			} else {
				System.out.println("Das Feld ist bereits besetzt, bitte erneut setzen");
			}
		}
		return board;

	}

	public static String checkWin(String[][] board) {
		// check if player1 won
		if ((board[0][0] == "X" && board[0][1] == "X" && board[0][2] == "X")
				|| (board[1][0].equals("X") && board[1][1].equals("X") && board[1][2].equals("X")) // ich hatte ==
																									// ("X"), chatGPT
																									// aht mich gelehrt,
																									// immer .equals bei
																									// strings in java
																									// verwenden!
				|| (board[2][0].equals("X") && board[2][1].equals("X") && board[2][2].equals("X"))
				|| (board[0][0].equals("X") && board[1][0].equals("X") && board[2][0].equals("X"))
				|| (board[0][1].equals("X") && board[1][1].equals("X") && board[2][1].equals("X"))
				|| (board[0][2].equals("X") && board[2][1].equals("X") && board[2][2].equals("X"))
				|| (board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X"))
				|| (board[2][2].equals("X") && board[2][1].equals("X") && board[2][0].equals("X"))) {
			return "X";
		}
		// check if player2 won
		if ((board[0][0] == "O" && board[0][1] == "O" && board[0][2] == "O")
				|| (board[1][0].equals("O") && board[1][1].equals("O") && board[1][2].equals("O"))
				|| (board[2][0].equals("O") && board[2][1].equals("O") && board[2][2].equals("O"))
				|| (board[0][0].equals("O") && board[1][0].equals("O") && board[2][0].equals("O"))
				|| (board[0][1].equals("O") && board[1][1].equals("O") && board[2][1].equals("O"))
				|| (board[0][2].equals("O") && board[2][1].equals("O") && board[2][2].equals("O"))
				|| (board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("O"))
				|| (board[2][2].equals("O") && board[2][1].equals("O") && board[2][0].equals("O"))) {
			return "O";
		}
		// return null if nobody won
		return null;
	}
}
