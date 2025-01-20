package oop.thema3.schnittstellen.tier;

public class TierProgramm {

	public static void main(String[] args) {
		
		Tier auto = new Auto();
		Tier katze = new Katze();
		Tier hund = new Hund();
		Katze katze2 = new Katze();
		
		katze.bewegen();
		auto.fressen();
		hund.bewegen();
		katze2.klettern();
		
	}

}
