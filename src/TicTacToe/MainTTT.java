package TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class MainTTT {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Board board = new Board();
		Random random = new Random();

		Symbol computerSymbol = Symbol.O;
		//Spiel-Scleife
		while (!board.checkWin(Symbol.X) && !board.checkWin(Symbol.O) && !board.isFull()) {
			board.printBoard();
			boolean playerMoveSuccessful = board.checkWin(Symbol.X);
			board.makeMove(scanner, Symbol.X);
			
			//Spielerzug
			if (playerMoveSuccessful && board.checkWin(Symbol.X)) {
				board.printBoard();
				System.out.println("Spieler hat gewonnen!"); // true?!
				break;
			}
			// überprüfe, ob spielfeld voll ist
			if (board.isFull()) {
				board.checkWin(Symbol.X);
				board.checkWin(computerSymbol);
				System.err.println("Unentschieden! Das Spielfeld ist voll");
				break;
			}

			//computerzug
			boolean success = board.makeMove(random, computerSymbol);
			if (success) {
				System.out.println("Spielfeld: ");
			} else {
				System.out.println("Computer sagt nein");
			}
		}
		board.printBoard();
		System.out.println("Spiel beendet! ");
	}
}
