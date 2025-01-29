package TicTacToe.CCC;

public interface Player {

	Symbol getSymbol();		//gibt Symbol des Spielers zurück
	void makeMove(Board board);
	boolean isHuman();
}
