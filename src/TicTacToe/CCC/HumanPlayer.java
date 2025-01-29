package TicTacToe.CCC;

import java.util.Scanner;

public class HumanPlayer extends AbstractPlayer {
	
	public HumanPlayer(String name, Symbol symbol) {
		super(name, symbol);
	}

	private Scanner scanner = new Scanner(System.in);

	@Override
	public boolean isHuman() {
		return true;
	}

	@Override
	public void makeMove(Board board) {
		System.out.println(name +", gib deine Bewegung ein");
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		
		while(!board.makeMove(row, col, symbol)) {
			System.out.println("Ungültiger Zug. Versuche es erneut.");
			row = scanner.nextInt();
			col = scanner.nextInt();
		}
		
	}

}
