package TicTacToe;
import java.util.HashMap;

public interface GameConfig {
	
	final int BOARD_SIZE = 3;
	
	HashMap<String, Symbol> spieler = new HashMap<String, Symbol>();
	
	
}