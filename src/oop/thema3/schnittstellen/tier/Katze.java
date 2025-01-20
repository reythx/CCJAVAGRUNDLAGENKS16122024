package oop.thema3.schnittstellen.tier;

public class Katze implements Tier {

	@Override
	public void bewegen() {
		System.out.println("Die Katze schleicht.");
	}

	@Override
	public void fressen() {
		System.out.println("Die Katze frisst eine Maus.");

	}
	
	public void klettern() {
		System.out.println("Die Katze klettert den Baum hinauf.");
	}
}
