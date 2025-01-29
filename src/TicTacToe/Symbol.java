package TicTacToe;

public enum Symbol {
	
	X, O;
	
	private String stein;
	
	Symbol(String stein) {
		this.stein = stein;
	}
	Symbol(){
		this.stein = "-";
	}
	public String getStein() {
		return stein;
	}
}
