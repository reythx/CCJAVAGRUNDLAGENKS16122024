package TicTacToe.CCC;

import java.util.Arrays;

public class Board {

	private Symbol[][] board;

	public Board() {
		board = new Symbol[GameConfig.BOARD_SIZE][GameConfig.BOARD_SIZE];
		for (int i = 0; i < GameConfig.BOARD_SIZE; i++) {
			Arrays.fill(board, null);
		}
	}

	public boolean makeMove(int row, int col, Symbol symbol) {

		if (row < 0 || row >= GameConfig.BOARD_SIZE || col < 0 || col >= GameConfig.BOARD_SIZE) {
			return false; // ungültiger Index
		}
		if (board[row][col] == null) {
			board[row][col] = symbol;
			return true;
		}
		return false;
	}

	public void printBoard() {
		for (int i = 0; i < GameConfig.BOARD_SIZE; i++) {
			for (int j = 0; j < GameConfig.BOARD_SIZE; j++) {
				System.out.print(board[i][j] == null ? "- " : board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public boolean isFull() {
		for (int i = 0; i < GameConfig.BOARD_SIZE; i++) {
			for (int j = 0; j < GameConfig.BOARD_SIZE; j++) {
				if (board[i][j] == null) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean checkWin(Symbol symbol) {
		// prüfe Reihen und Spalten
		for (int i = 0; i < GameConfig.BOARD_SIZE; i++) {
			if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol // horizontale prüfung
					|| board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) { // vertikale prüfung
				return true;
			}

			if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol
					|| board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
				return true;
			}

		}
		return false;
	}
}
