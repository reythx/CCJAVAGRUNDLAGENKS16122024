package TicTacToe;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Board {

	private ArrayList<ArrayList<Symbol>> grid;

	public Board() {
		grid = new ArrayList<>();
		for (int i = 0; i < GameConfig.BOARD_SIZE; i++) {
			ArrayList<Symbol> row = new ArrayList<>();
			for (int j = 0; j < GameConfig.BOARD_SIZE; j++) {
				row.add(null);
			}
			grid.add(row);
		}
	}

	public boolean makeMove(Object input, Symbol symbol) {
		int row;
		int col;

		// Spielerzug
		if (input instanceof Scanner scanner) {
			while (true) {
				System.out.println("Spieler, welche Zeile Stein setzen? (1-" + GameConfig.BOARD_SIZE + ")");
				row = scanner.nextInt();
				System.out.println("Und in welcher Spalte? (1-" + GameConfig.BOARD_SIZE + ")");
				col = scanner.nextInt();

				// überprüfe ob feld belegt
				if (row < 1 || row > GameConfig.BOARD_SIZE || col < 1 || col > GameConfig.BOARD_SIZE) {
					System.out.println("Ungültige Position!");
				} else if (grid.get(row - 1).get(col - 1) != null) {
					System.out.println("Feld ist bereits besetzt, versuche es erneut!");
				} else {
					grid.get(row - 1).set(col - 1, symbol);
					return true; // Erfolgreich gesetzt
				}
			}
		}
		// Computerzug
		else if (input instanceof Random random) {
			do {
				row = random.nextInt(1, 4);
				col = random.nextInt(1, 4);

			} while (grid.get(row - 1).get(col - 1) != null);
			System.out.println("Computer setzt " + symbol + " auf (" + row + ", " + col + ")");

		} else {
			throw new IllegalArgumentException("Ungültiger Eingabetyp: " + input.getClass().getName());
		}
		// Überprüfe, ob gültige Position
		if (row < 1 || row > GameConfig.BOARD_SIZE || col < 1 || col > GameConfig.BOARD_SIZE) {
			System.out.println("Ungültige Position!");
			return false;
		}

		// Überprüfe, ob gültiges Feld
		if (grid.get(row - 1).get(col - 1) != null) {
			System.out.println("Feld bereits belegt! Bitte erneut wählen.");
			return false;
		}

		grid.get(row - 1).set(col - 1, symbol);
		return true;
	}

	public void printBoard() {
		for (ArrayList<Symbol> row : grid) {
			for (Symbol cell : row) {
				System.out.print((cell == null ? "-" : cell) + " ");
			}

			System.out.println();
		}
		System.out.println("_____");
	}

	public boolean checkWin(Symbol symbol) {
		for (int i = 0; i < grid.size(); i++) {
			boolean rowWin = true;
			for (int j = 0; j < grid.size(); j++) {
				if (grid.get(i).get(j) != symbol) {
					rowWin = false;
					break;
				}
			}
			if (rowWin) {
				System.out.println("Gewonnen!");
				return true;
			}
		}

		for (int j = 0; j < grid.size(); j++) {
			boolean colWin = true;
			for (int i = 0; i < grid.size(); i++) {
				if (grid.get(i).get(j) != symbol) {
					colWin = false;
					break;
				}
			}
			if (colWin) {
				System.out.println("Gewonnen!");
				return true;

			}

		}

		boolean mainDiagonal = true;
		for (int i = 0; i < grid.size(); i++) {
			if (grid.get(i).get(i) != symbol) {
				mainDiagonal = false;
				break;
			}
		}
		if (mainDiagonal) {
			System.out.println("Gewonnen!");
			return true;
		}

		boolean antiDiagonal = true;
		for (int i = 0; i < grid.size(); i++) {
			if (grid.get(i).get(grid.size() - 1 - i) != symbol) {
				antiDiagonal = false;
				break;
			}
		}
		if (antiDiagonal) {
			System.out.println("Gewonnen!");
			return true;
		}
		return false; // kein gewinn gefunden
	}

	boolean isFull() {
		for (ArrayList<Symbol> row : grid) {
			if (row.contains(null)) {
				return false;
			}
		}
		return true;
	}

}
