package oop.thema3.schnittstellen.tier;

public class Hund implements Tier {

	@Override
	public void bewegen() {
		System.out.println("Der Hund läuft.");
	}

	@Override
	public void fressen() {
		System.out.println("Der Hund frisst Hundefutter.");
	}
}
