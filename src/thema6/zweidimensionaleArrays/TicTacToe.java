package thema6.zweidimensionaleArrays;

import java.util.Scanner;
import java.util.Arrays;

public class TicTacToe {
	public static void main(String[] args) {

		String[][] b = initializeNewBoard();
		String winCondition = checkWin(b);
		do {
			printBoard(b);
			player1Turn(b);
			checkWin(b);
			printBoard(b);
			player2Turn(b);
			checkWin(b);
			printBoard(b);
		} while (winCondition != null);
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

	public static String[][] player1Turn(String[][] board) {
		Scanner scanner = new Scanner(System.in);
		boolean noX = true;
		while (noX == true) { // wiederhole, bis X gesetzt ist
			System.out.println("Spieler 1, in welcher Zeile ein X setzen?");
			int player1row = scanner.nextInt();
			System.out.print("Spieler 1, in welcher Spalte das X setzen?");
			int player1column = scanner.nextInt();
			if (board[player1row][player1column] != "X" || board[player1row][player1column] != "O") { // setze X, falls
																										// noch nicht
																										// belegt
				board[player1row][player1column] = "X";
				noX = false; // wenn X gesetzt wird, beende schleife
			} else {
				System.out.println("Das Feld ist bereits besetzt, bitte erneut setzen");
			}
		}
		return board;
	}

	public static String[][] player2Turn(String[][] board) {
		Scanner scanner = new Scanner(System.in);
		boolean noX = true;
		while (noX == true) { // wiederhole, bis O gesetzt ist
			System.out.println("Spieler 2, in welcher Zeile ein O setzen?");
			int player1row = scanner.nextInt();
			System.out.print("Spieler 1, in welcher Spalte das O setzen?");
			int player1column = scanner.nextInt();
			if (board[player1row][player1column] != "X" || board[player1row][player1column] != "O") { // setze O, falls
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
				|| (board[1][0] == "X" && board[1][1] == "X" && board[1][2] == "X")
				|| (board[2][0] == "X" && board[2][1] == "X" && board[2][2] == "X")
				|| (board[0][0] == "X" && board[1][0] == "X" && board[2][0] == "X")
				|| (board[0][1] == "X" && board[1][1] == "X" && board[2][1] == "X")
				|| (board[0][2] == "X" && board[2][1] == "X" && board[2][2] == "X")
				|| (board[0][0] == "X" && board[1][1] == "X" && board[2][2] == "X")
				|| (board[2][2] == "X" && board[2][1] == "X" && board[2][0] == "X")) {
			return "X";
		}
		// check if player2 won
		if ((board[0][0] == "O" && board[0][1] == "O" && board[0][2] == "O")
				|| (board[1][0] == "O" && board[1][1] == "O" && board[1][2] == "O")
				|| (board[2][0] == "O" && board[2][1] == "O" && board[2][2] == "O")
				|| (board[0][0] == "O" && board[1][0] == "O" && board[2][0] == "O")
				|| (board[0][1] == "O" && board[1][1] == "O" && board[2][1] == "O")
				|| (board[0][2] == "O" && board[2][1] == "O" && board[2][2] == "O")
				|| (board[0][0] == "O" && board[1][1] == "O" && board[2][2] == "O")
				|| (board[2][2] == "O" && board[2][1] == "O" && board[2][0] == "O")) {
			return "O";
		}
		// return null of nobody won
		return null;
	}
}
