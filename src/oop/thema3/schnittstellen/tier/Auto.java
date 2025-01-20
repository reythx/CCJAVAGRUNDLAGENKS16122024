package oop.thema3.schnittstellen.tier;

public class Auto implements Tier {
	
	@Override
	public void bewegen() {
		System.out.println("Das Auto fährt.");
	}

	@Override
	public void fressen() {
		System.out.println("Das Auto tankt Diesel.");

	}
}
