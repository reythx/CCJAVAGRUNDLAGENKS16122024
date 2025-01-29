package TicTacToe.CCC;

public abstract class AbstractPlayer implements Player{
	
	protected Symbol symbol;
	
	protected String name;
	
	public AbstractPlayer(String name, Symbol symbol) {
		this.name = name;
		this.symbol = symbol;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public Symbol getSymbol() {
		return this.symbol;
	}
	
	@Override
	public abstract boolean isHuman();
}
