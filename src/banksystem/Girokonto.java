package banksystem;

public class Girokonto extends Bankkonto{
	protected double dispoLimit;
	
	public void abheben(double betrag) {
		if(betrag <= kontostand+dispoLimit) {
			kontostand -= betrag;
		}else {
			System.out.println("Überziehungslimit überzogen");
		}
	}

	@Override
	public String toString() {
		return "Girokonto "+ kontonummer + " [DispoLimit:" + dispoLimit + ", Kontostand:" + kontostand + ", Kundeninhaber:" + kundeninhaber.name
				+ "]";
	}

	public double getDispoLimit() {
		return dispoLimit;
	}

	public void setDispoLimit(double dispoLimit) {
		this.dispoLimit = dispoLimit;
	}
	
	
}
