package TicTacToe;

public abstract class AbstractPlayer implements Player {
	protected Symbol symbol;
	protected String name;
	
	public Symbol getSymbol() {
		return this.symbol;
	}
	
	public abstract boolean isHuman();
	
	public AbstractPlayer(Symbol symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}
}
