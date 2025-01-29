package TicTacToe;

public interface Player {
	
	Symbol getSymbol();
	
	void makeMove(Board board);
	
	boolean isHuman();
}
